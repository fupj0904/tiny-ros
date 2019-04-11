/*
 * File      : session.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-03     Pinkie.Fu    initial version
 */

#ifndef TINY_ROS_SERVER_SESSION_H
#define TINY_ROS_SERVER_SESSION_H

#include <map>
#include <boost/bind.hpp>
#include <boost/asio.hpp>
#include <boost/function.hpp>
#include <boost/log/trivial.hpp>
#include <boost/uuid/uuid.hpp>
#include <boost/uuid/uuid_io.hpp>
#include <boost/uuid/uuid_generators.hpp>
#include <tinyros_msgs/TopicInfo.h>
#include <tinyros_msgs/Log.h>
#include <std_msgs/Time.h>
#include <std_msgs/String.h>

#include "async_read_buffer.h"
#include "topic_handlers.h"
#include "serialization.h"

namespace ros
{
typedef std::vector<uint8_t> Buffer;
typedef boost::shared_ptr<Buffer> BufferPtr;

template<typename Socket>
class Session : boost::noncopyable
{
public:
  Session(boost::asio::io_service& io_service)
    : socket_(io_service),
      sync_timer_(io_service),
      require_check_timer_(io_service),
      ros_spin_timer_(io_service),
      async_read_buffer_(socket_, buffer_max,
                         boost::bind(&Session::read_failed, this,
                                     boost::asio::placeholders::error))
  {
    active_ = false;

    require_check_interval_ = boost::posix_time::milliseconds(1000);

    session_id_ = boost::uuids::to_string(boost::uuids::random_generator()());
  }

  Socket& socket()
  {
    return socket_;
  }

  void start()
  {
    BOOST_LOG_TRIVIAL(debug) << "Starting session.";

    using namespace tinyros_msgs;
    callbacks_[TopicInfo::ID_PUBLISHER] = boost::bind(&Session::setup_publisher, this, _1);
    callbacks_[TopicInfo::ID_SUBSCRIBER] = boost::bind(&Session::setup_subscriber, this, _1);
    callbacks_[TopicInfo::ID_SERVICE_SERVER+TopicInfo::ID_PUBLISHER] = boost::bind(&Session::setup_service_server_publisher, this, _1);
    callbacks_[TopicInfo::ID_SERVICE_SERVER+TopicInfo::ID_SUBSCRIBER] = boost::bind(&Session::setup_service_server_subscriber, this, _1);
    callbacks_[TopicInfo::ID_SERVICE_CLIENT+TopicInfo::ID_PUBLISHER] = boost::bind(&Session::setup_service_client_publisher, this, _1);
    callbacks_[TopicInfo::ID_SERVICE_CLIENT+TopicInfo::ID_SUBSCRIBER] = boost::bind(&Session::setup_service_client_subscriber, this, _1);
    callbacks_[TopicInfo::ID_ROSTOPIC_REQUEST] = boost::bind(&Session::handle_rostopic_request, this, _1);
    callbacks_[TopicInfo::ID_ROSSERVICE_REQUEST] = boost::bind(&Session::handle_rosservice_request, this, _1);
    callbacks_[TopicInfo::ID_LOG] = boost::bind(&Session::handle_log, this, _1);
    callbacks_[TopicInfo::ID_TIME] = boost::bind(&Session::handle_time, this, _1);

    active_ = true;
    attempt_sync();
    read_sync_header();
  }

  void stop()
  {
    {
      boost::unique_lock<boost::mutex> lock(Rostopic::topics_mutex_);
      for (uint32_t i=0; i<topic_connections_.size(); i++) {
        RostopicConnection connection = topic_connections_.at(i);
        connection.connection_.disconnect();
        connection.rostopic_->ref_count_--;

        if (connection.rostopic_->ref_count_ <=0) {
          Rostopic::topics_.erase(connection.rostopic_->topic_name_);
        }
      }
      topic_connections_.clear();
    }

    {
      boost::unique_lock<boost::mutex> lock(ServiceServer::services_mutex_);
      for (uint32_t i=0; i<service_server_.size(); i++) {
        if (ServiceServer::services_.count(service_server_.at(i))) {
          ServiceServerPtr service = ServiceServer::services_[service_server_.at(i)];
          (*(service->destroy_signal_))(service_server_.at(i));
          ServiceServer::services_.erase(service_server_.at(i));
        }
      }
      
      std::map<uint16_t, ServiceClientPtr>::iterator it;
      for(it = services_client_.begin(); it != services_client_.end(); ) {
        ServiceClientPtr client = it->second;
        client->client_connection_.disconnect();
        client->service_connection_.disconnect();
        client->destroy_connection_.disconnect();
        it++;
      }
      service_server_.clear();
      services_client_.clear();
    }


    // Abort active session timer callbacks, if present.
    sync_timer_.cancel();
    require_check_timer_.cancel();

    // Reset the state of the session, dropping any publishers or subscribers
    // we currently know about from this client.
    callbacks_.clear();
    subscribers_.clear();
    publishers_.clear();

    // Close the socket.
    socket_.close();
    active_ = false;
    
    delete this;
  }

  bool is_active()
  {
    return active_;
  }

private:
  //// RECEIVING MESSAGES ////
  void read_sync_header() {
    async_read_buffer_.read(1, boost::bind(&Session::read_sync_first, this, _1));
  }

  void read_sync_first(ros::serialization::IStream& stream) {
    uint8_t sync;
    stream >> sync;
    if (sync == 0xff) {
      async_read_buffer_.read(1, boost::bind(&Session::read_sync_second, this, _1));
    } else {
      read_sync_header();
    }
  }

  void read_sync_second(ros::serialization::IStream& stream) {
    uint8_t sync;
    stream >> sync;
    if (sync == 0xb9) {
      async_read_buffer_.read(7, boost::bind(&Session::read_id_length, this, _1));
    } else {
      read_sync_header();
    }
  }

  void read_id_length(ros::serialization::IStream& stream) {
    uint32_t length;
    uint8_t length_checksum;
    uint16_t topic_id;

    // Check header checksum byte for length field.
    stream >> length >> length_checksum >> topic_id;
    if (length_checksum + checksum(length) != 0xff) {
      uint8_t csl = checksum(length);
      BOOST_LOG_TRIVIAL(warning)
          << "Bad message header length checksum. Dropping message from client."
          <<" T"<<topic_id<<" L"<<length<<" C"<<length_checksum<<" "<<csl;
      read_sync_header();
      return;
    }

    BOOST_LOG_TRIVIAL(debug)
        << "Received message header with length "<<length<<" and topic_id="<<topic_id;

    // Read message length + checksum byte.
    async_read_buffer_.read(length + 1, boost::bind(&Session::read_body, this,
                                                    _1, topic_id));
  }

  void read_body(ros::serialization::IStream& stream, uint16_t topic_id) {
    BOOST_LOG_TRIVIAL(debug)
        << "Received body of length "<<stream.getLength()<<" for message on topic "<<topic_id;
    ros::serialization::IStream checksum_stream(stream.getData(), stream.getLength());
    uint8_t msg_checksum = checksum(checksum_stream) + checksum(topic_id);
    if (msg_checksum != 0xff) {
      BOOST_LOG_TRIVIAL(warning)
          << "Rejecting message on topicId="<<topic_id<<", length="
          <<stream.getLength()<<" with bad checksum.";
    } else {
      if (callbacks_.count(topic_id) == 1) {
        try {
          callbacks_[topic_id](stream);
        } catch(ros::serialization::StreamOverrunException e) {
          if (topic_id < 100) {
            BOOST_LOG_TRIVIAL(error)
                << "Buffer overrun when attempting to parse setup message.";
            BOOST_LOG_TRIVIAL(error)
                << "Is this firmware from a pre-Groovy rosserial?";
          } else {
            BOOST_LOG_TRIVIAL(warning)
                << "Buffer overrun when attempting to parse user message.";
          }
        }
      } else {
        BOOST_LOG_TRIVIAL(warning)
            << "Received message with unrecognized topicId ("<<topic_id<<").";
      }
    }

    // Kickoff next message read.
    read_sync_header();
  }

  void read_failed(const boost::system::error_code& error) {
    if (error == boost::system::errc::no_buffer_space) {
      // No worries. Begin syncing on a new message.
      BOOST_LOG_TRIVIAL(warning)
          <<"Overrun on receive buffer. Attempting to regain rx sync.";
      read_sync_header();
    } else if (error) {
      // When some other read error has occurred, stop the session, which destroys
      // all known publishers and subscribers.
      BOOST_LOG_TRIVIAL(fatal)
          <<"Socket asio error, closing socket: " << error;
      stop();
    }
  }

  //// SENDING MESSAGES ////

  void write_message(Buffer& message, const uint16_t topic_id) {
    uint8_t overhead_bytes = 10;
    uint32_t length = overhead_bytes + message.size();
    BufferPtr buffer_ptr(new Buffer(length));

    uint8_t msg_checksum;
    ros::serialization::IStream checksum_stream(message.size() > 0 ? &message[0] : NULL, message.size());

    ros::serialization::OStream stream(&buffer_ptr->at(0), buffer_ptr->size());
    uint8_t msg_len_checksum = 255 - checksum((uint32_t)message.size());

    stream << (uint16_t)0xb9ff << (uint32_t)message.size() << msg_len_checksum << topic_id;
    msg_checksum = 255 - (checksum(checksum_stream) + checksum(topic_id));

    memcpy(stream.advance(message.size()), &message[0], message.size());
    stream << msg_checksum;

    BOOST_LOG_TRIVIAL(debug)
        <<"async_write: Sending buffer of " << length << " bytes to client.";
    boost::asio::async_write(socket_, boost::asio::buffer(*buffer_ptr),
          boost::bind(&Session::write_completion_cb, this, boost::asio::placeholders::error, buffer_ptr));
  }

  void write_completion_cb(const boost::system::error_code& error,
                           BufferPtr buffer_ptr) {
    if (error) {
      if (error == boost::system::errc::io_error) {
        BOOST_LOG_TRIVIAL(fatal) <<"Socket write operation returned IO error.";
      } else if (error == boost::system::errc::no_such_device) {
        BOOST_LOG_TRIVIAL(fatal) <<"Socket write operation returned no device.";
      } else {
        BOOST_LOG_TRIVIAL(fatal) <<"Unknown error returned during write operation: " << error;
      }
      stop();
    }
    // Buffer is destructed when this function exits and buffer_ptr goes out of scope.
  }

  //// SYNC WATCHDOG ////
  void attempt_sync() {
    request_topics();
  }

  //// HELPERS ////
  void request_topics() {
    std::vector<uint8_t> message(0);
    BOOST_LOG_TRIVIAL(debug) <<"Sending request topics message for VER=0xb9 protocol.";
    write_message(message, tinyros_msgs::TopicInfo::ID_PUBLISHER);

    // Set timer for future point at which to verify the subscribers and publishers
    // created by the client against the expected set given in the parameters.
    require_check_timer_.expires_from_now(require_check_interval_);
    require_check_timer_.async_wait(boost::bind(&Session::required_topics_check, this,
          boost::asio::placeholders::error));
  }

  void required_topics_check(const boost::system::error_code& error) {
    if (error != boost::asio::error::operation_aborted) {
      request_topics();
    }
  }

  static uint8_t checksum(ros::serialization::IStream& stream) {
    uint8_t sum = 0;
    for (uint32_t i = 0; i < stream.getLength(); ++i) {
      sum += stream.getData()[i];
    }
    return sum;
  }

  static uint8_t checksum(uint16_t val) {
    return (val >> 8) + val;
  }

  static uint8_t checksum(uint32_t val) {
    uint8_t sum = 0;
    for (size_t i = 0; i < sizeof(val); i++) {
      sum += (uint8_t)((uint32_t)((val >> (8*i)) & 0xFF));
    }
    return sum;
  }

  //// RECEIVED MESSAGE HANDLERS ////
  void setup_publisher(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);
    if (!publishers_.count(topic_info.topic_id)) {
      BOOST_LOG_TRIVIAL(info) << "setup_publisher(topic_id:" << topic_info.topic_id << ", topic_name:" << topic_info.topic_name << ")";
      PublisherPtr pub(new Publisher(topic_info));
      callbacks_[topic_info.topic_id] = boost::bind(&Publisher::handle, pub, _1);
      publishers_[topic_info.topic_id] = pub;

      boost::unique_lock<boost::mutex> lock(Rostopic::topics_mutex_);
      if (!Rostopic::topics_.count(topic_info.topic_name)) {
        Rostopic::topics_[topic_info.topic_name] = RostopicPtr(new Rostopic(topic_info));
      }

      // fake connection for stop
      RostopicConnection connection;
      connection.rostopic_ = Rostopic::topics_[topic_info.topic_name];
      connection.rostopic_->ref_count_++;
      topic_connections_.push_back(connection);
    }
    
    topic_info.negotiated = true;
    
    handle_negotiated(topic_info);
  }

  void setup_subscriber(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);
    if (!subscribers_.count(topic_info.topic_id)) {
      BOOST_LOG_TRIVIAL(info) << "setup_subscriber(topic_id:" << topic_info.topic_id
        << ", topic_name:" << topic_info.topic_name << ")";
      SubscriberPtr sub(new Subscriber(topic_info, boost::bind(&Session::write_message, this, _1, topic_info.topic_id)));
      subscribers_[topic_info.topic_id] = sub;

      boost::unique_lock<boost::mutex> lock(Rostopic::topics_mutex_);
      if (!Rostopic::topics_.count(topic_info.topic_name)) {
        Rostopic::topics_[topic_info.topic_name] = RostopicPtr(new Rostopic(topic_info));
      }

      RostopicConnection connection;
      connection.rostopic_ = Rostopic::topics_[topic_info.topic_name];
      connection.rostopic_->ref_count_++;
      connection.connection_ = connection.rostopic_->signal_->connect(boost::bind(&Subscriber::handle, sub, _1));
      topic_connections_.push_back(connection);
    }
    
    topic_info.negotiated = true;
    
    handle_negotiated(topic_info);
  }

  void setup_service_server_publisher(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);

    boost::unique_lock<boost::mutex> lock(ServiceServer::services_mutex_);
    if (!ServiceServer::services_.count(topic_info.topic_name)) {
      BOOST_LOG_TRIVIAL(info) << "setup_service_server_publisher(topic_id:" << topic_info.topic_id
        << ", topic_name:" << topic_info.topic_name << ")";
      ServiceServerPtr srv(new ServiceServer(topic_info, boost::bind(&Session::write_message, this, _1, _2)));
      callbacks_[topic_info.topic_id] = boost::bind(&ServiceServer::handle, srv, _1);
      ServiceServer::services_[topic_info.topic_name] = srv;
      ServiceServer::services_[topic_info.topic_name]->setTopicId(topic_info.topic_id);
      service_server_.push_back(topic_info.topic_name);
    }
    
    topic_info.negotiated = true;
    
    handle_negotiated(topic_info);
  }

  void setup_service_server_subscriber(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);

    boost::unique_lock<boost::mutex> lock(ServiceServer::services_mutex_);
    if (!ServiceServer::services_.count(topic_info.topic_name)) {
      BOOST_LOG_TRIVIAL(info) << "setup_service_server_subscriber(topic_id:" << topic_info.topic_id
       << ", topic_name:" << topic_info.topic_name << ")";
      ServiceServerPtr srv(new ServiceServer(topic_info, boost::bind(&Session::write_message, this, _1, _2)));
      callbacks_[topic_info.topic_id] = boost::bind(&ServiceServer::handle, srv, _1);
      ServiceServer::services_[topic_info.topic_name] = srv;
      ServiceServer::services_[topic_info.topic_name]->setTopicId(topic_info.topic_id);
      service_server_.push_back(topic_info.topic_name);
    }
    
    topic_info.negotiated = true;
    
    handle_negotiated(topic_info);
  }

  void setup_service_client_publisher(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);

    boost::unique_lock<boost::mutex> lock(ServiceServer::services_mutex_);
    if (ServiceServer::services_.count(topic_info.topic_name)) {
      if (!services_client_.count(topic_info.topic_id)) {
        BOOST_LOG_TRIVIAL(info) << "setup_service_client_publisher(topic_id:" << topic_info.topic_id
          << ", topic_name:" << topic_info.topic_name << ")";
        ServiceServerPtr service = ServiceServer::services_[topic_info.topic_name];
        ServiceClientPtr client(new ServiceClient(topic_info, boost::bind(&Session::write_message, this, _1, _2)));
        client->setTopicId(topic_info.topic_id);
        client->client_connection_ = client->signal_->connect(boost::bind(&ServiceServer::callback, service, _1));
        client->service_connection_ = service->signal_->connect(boost::bind(&ServiceClient::callback, client, _1));
        client->destroy_connection_ = service->destroy_signal_->connect(boost::bind(&Session::stop_service, this, _1));
        callbacks_[topic_info.topic_id] = boost::bind(&ServiceClient::handle, client, _1);
        services_client_[topic_info.topic_id] = client;
      }
      topic_info.negotiated = true;
    } else {
      topic_info.negotiated = false;
    }
    
    handle_negotiated(topic_info);
  }

  void setup_service_client_subscriber(ros::serialization::IStream& stream) {
    tinyros_msgs::TopicInfo topic_info;
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::read(stream, topic_info);

    boost::unique_lock<boost::mutex> lock(ServiceServer::services_mutex_);
    if (ServiceServer::services_.count(topic_info.topic_name)) {
      if (!services_client_.count(topic_info.topic_id)) {
        BOOST_LOG_TRIVIAL(info) << "setup_service_client_subscriber(topic_id:" << topic_info.topic_id
          << ", topic_name:" << topic_info.topic_name << ")";
        ServiceServerPtr service = ServiceServer::services_[topic_info.topic_name];
        ServiceClientPtr client(new ServiceClient(topic_info, boost::bind(&Session::write_message, this, _1, _2)));
        client->setTopicId(topic_info.topic_id);
        client->client_connection_ = client->signal_->connect(boost::bind(&ServiceServer::callback, service, _1));
        client->service_connection_ = service->signal_->connect(boost::bind(&ServiceClient::callback, client, _1));
        client->destroy_connection_ = service->destroy_signal_->connect(boost::bind(&Session::stop_service, this, _1));
        callbacks_[topic_info.topic_id] = boost::bind(&ServiceClient::handle, client, _1);
        services_client_[topic_info.topic_id] = client;
      }
      topic_info.negotiated = true;
    } else {
      topic_info.negotiated = false;
    }
      
    handle_negotiated(topic_info);
  }

  void stop_service(std::string &topic_name) {
    BOOST_LOG_TRIVIAL(warning) <<"stop_service topic_name: " << topic_name;
    std::map<uint16_t, ServiceClientPtr>::iterator it;
    for(it = services_client_.begin(); it != services_client_.end(); ) {
      ServiceClientPtr client = it->second;
      if (client->topic_name_ == topic_name) {
        client->client_connection_.disconnect();
        client->service_connection_.disconnect();
        client->destroy_connection_.disconnect();
        callbacks_.erase(it->first);
        services_client_.erase(it++);
      } else {
        it++;
      }
    }
  }

  void handle_log(ros::serialization::IStream& stream) {
    tinyros_msgs::Log l;
    ros::serialization::Serializer<tinyros_msgs::Log>::read(stream, l);
    if(l.level == tinyros_msgs::Log::ROSDEBUG) BOOST_LOG_TRIVIAL(debug) << l.msg;
    else if(l.level == tinyros_msgs::Log::ROSINFO) BOOST_LOG_TRIVIAL(info) << l.msg;
    else if(l.level == tinyros_msgs::Log::ROSWARN) BOOST_LOG_TRIVIAL(warning) << l.msg;
    else if(l.level == tinyros_msgs::Log::ROSERROR) BOOST_LOG_TRIVIAL(error) << l.msg;
    else if(l.level == tinyros_msgs::Log::ROSFATAL) BOOST_LOG_TRIVIAL(fatal) << l.msg;
  }

  void handle_time(ros::serialization::IStream& stream) {
    std_msgs::Time time;
    time.data = ros::Time::now();

    size_t length = ros::serialization::serializationLength(time);
    std::vector<uint8_t> message(length);

    ros::serialization::OStream ostream(&message[0], length);
    ros::serialization::Serializer<std_msgs::Time>::write(ostream, time);

    write_message(message, tinyros_msgs::TopicInfo::ID_TIME);
  }

  void handle_negotiated(const tinyros_msgs::TopicInfo& topic_info) {
    size_t length = ros::serialization::serializationLength(topic_info);
    std::vector<uint8_t> message(length);

    ros::serialization::OStream ostream(&message[0], length);
    ros::serialization::Serializer<tinyros_msgs::TopicInfo>::write(ostream, topic_info);

    write_message(message, tinyros_msgs::TopicInfo::ID_NEGOTIATED);
  }

  void handle_rostopic_request(ros::serialization::IStream& stream) {
    std::string topic_list = "\ntopic_list:\n";
    std::map<std::string, RostopicPtr>::iterator it;
    for(it = Rostopic::topics_.begin(); it != Rostopic::topics_.end(); ) {
      topic_list += "        " + it->first + " [" + it->second->message_type_ + "]\n";
      it++;
    }
    std_msgs::String msg;
    msg.data = topic_list.c_str();
    size_t length = ros::serialization::serializationLength(msg);
    std::vector<uint8_t> message(length);
    ros::serialization::OStream ostream(&message[0], length);
    ros::serialization::Serializer<std_msgs::String>::write(ostream, msg);
    write_message(message, tinyros_msgs::TopicInfo::ID_ROSTOPIC_REQUEST);
  }

  void handle_rosservice_request(ros::serialization::IStream& stream) {
    std::string service_list = "\n\nservice_list:\n";
    std::map<std::string, ServiceServerPtr>::iterator it;
    for(it = ServiceServer::services_.begin(); it != ServiceServer::services_.end(); ) {
      service_list += "          " + it->first + " [" + it->second->message_type_ + "]\n";
      it++;
    }
    std_msgs::String msg;
    msg.data = service_list.c_str();
    size_t length = ros::serialization::serializationLength(msg);
    std::vector<uint8_t> message(length);
    ros::serialization::OStream ostream(&message[0], length);
    ros::serialization::Serializer<std_msgs::String>::write(ostream, msg);
    write_message(message, tinyros_msgs::TopicInfo::ID_ROSSERVICE_REQUEST);
  }

  Socket socket_;
  AsyncReadBuffer<Socket> async_read_buffer_;
  enum { buffer_max = 65*1024 };
  bool active_;

  boost::posix_time::time_duration require_check_interval_;
  boost::asio::deadline_timer sync_timer_;
  boost::asio::deadline_timer require_check_timer_;
  boost::asio::deadline_timer ros_spin_timer_;

  std::map<uint16_t, boost::function<void(ros::serialization::IStream&)> > callbacks_;
  std::map<uint16_t, PublisherPtr> publishers_;
  std::map<uint16_t, SubscriberPtr> subscribers_;
  std::vector<RostopicConnection> topic_connections_;
  std::vector<std::string> service_server_;
  std::map<uint16_t, ServiceClientPtr> services_client_;

  std::string session_id_;
};
}  // namespace

#endif  // TINY_ROS_SERVER_SESSION_H
