/*
 * File      : node_handle.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef ROS_NODE_HANDLE_H_
#define ROS_NODE_HANDLE_H_

#include <stdint.h>

#include "std_msgs/Time.h"
#include "std_msgs/String.h"
#include "tinyros_msgs/TopicInfo.h"
#include "tinyros_msgs/Log.h"

#include "ros/msg.h"

namespace ros
{

class NodeHandleBase_
{
public:
  virtual int publish(int id, const Msg* msg) = 0;
  virtual int spinOnce() = 0;
  virtual bool ok() = 0;
};
}

#include "ros/publisher.h"
#include "ros/subscriber.h"
#include "ros/service_server.h"
#include "ros/service_client.h"

namespace ros
{

const int SPIN_OK = 0;
const int SPIN_ERR = -1;
const int SPIN_TIMEOUT = -2;

const uint8_t SYNC_SECONDS  = 5;
const uint8_t MODE_FIRST_FF = 0;

const uint8_t MODE_PROTOCOL_VER   = 1;
const uint8_t PROTOCOL_VER        = 0xb9;
const uint8_t MODE_SIZE_L         = 2;
const uint8_t MODE_SIZE_L1        = 3;
const uint8_t MODE_SIZE_H         = 4;
const uint8_t MODE_SIZE_H1        = 5;
const uint8_t MODE_SIZE_CHECKSUM  = 6;    // checksum for msg size received from size L and H
const uint8_t MODE_TOPIC_L        = 7;    // waiting for topic id
const uint8_t MODE_TOPIC_H        = 8;
const uint8_t MODE_MESSAGE        = 9;
const uint8_t MODE_MSG_CHECKSUM   = 10;    // checksum for msg and topic id

const uint32_t TIMEOUT_MSG   = 50;     // 50 milliseconds to recieve all of message data
const uint32_t TIMEOUT_SPIN  = 1000;   // 1000 milliseconds to spin timeout

using tinyros_msgs::TopicInfo;

/* Node Handle */
template<class Hardware,
         int MAX_SUBSCRIBERS = 100,
         int MAX_PUBLISHERS = 100,
         int INPUT_SIZE = 65*1024,
         int OUTPUT_SIZE = 65*1024>
class NodeHandle_ : public NodeHandleBase_
{
protected:
  Hardware hardware_;

  /* time used for syncing */
  uint32_t rt_time;

  /* used for computing current time */
  uint32_t sec_offset, nsec_offset;

  /* Spinonce maximum work timeout */
  uint32_t spin_timeout_;

  uint8_t message_in[INPUT_SIZE];
  uint8_t message_out[OUTPUT_SIZE];

  Publisher * publishers[MAX_PUBLISHERS];
  Subscriber_ * subscribers[MAX_SUBSCRIBERS];

  /*
   * Setup Functions
   */
public:
  NodeHandle_()
  {

    for (unsigned int i = 0; i < MAX_PUBLISHERS; i++)
      publishers[i] = 0;

    for (unsigned int i = 0; i < MAX_SUBSCRIBERS; i++)
      subscribers[i] = 0;

    for (unsigned int i = 0; i < INPUT_SIZE; i++)
      message_in[i] = 0;

    for (unsigned int i = 0; i < OUTPUT_SIZE; i++)
      message_out[i] = 0;

    spin_timeout_ = TIMEOUT_SPIN;

    last_sync_receive_time = 0;

    service_list = topic_list = NULL;
  }

  Hardware* getHardware()
  {
    return &hardware_;
  }

  /* Start a named port, which may be network server IP, initialize buffers */
  void initNode(char *portName)
  {
    hardware_.init(portName);
    mode_ = 0;
    bytes_ = 0;
    index_ = 0;
    topic_ = 0;
  }

  /**
   * @brief Sets the maximum time in millisconds that spinOnce() can work.
   * This will not effect the processing of the buffer, as spinOnce processes
   * one byte at a time. It simply sets the maximum time that one call can
   * process for. You can choose to clear the buffer if that is beneficial if
   * SPIN_TIMEOUT is returned from spinOnce().
   * @param timeout The timeout in milliseconds that spinOnce will function.
   */
  void setSpinTimeout(const uint32_t& timeout)
  {
     spin_timeout_ = timeout;
  }

protected:
  //State machine variables for spinOnce
  int mode_;
  int bytes_;
  int topic_;
  int index_;
  int checksum_;

  /* used for syncing the time */
  uint32_t last_sync_receive_time;
  uint32_t last_msg_timeout_time;

public:
  /* This function goes in your loop() function, it handles
   *  serial input and callbacks for subscribers.
   */
  virtual int spinOnce()
  {
    if (!hardware_.connected()) 
    {
      return SPIN_ERR;
    }
    
    uint32_t c_time = hardware_.time();

    /* reset if message has timed out */
    if (mode_ != MODE_FIRST_FF)
    {
      if (c_time > last_msg_timeout_time)
      {
        mode_ = MODE_FIRST_FF;
      }
    }

    /* while available buffer, read data */
    while (true)
    {
      // If a timeout has been specified, check how long spinOnce has been running.
      if (spin_timeout_ > 0)
      {
        // If the maximum processing timeout has been exceeded, exit with error.
        // The next spinOnce can continue where it left off, or optionally
        // based on the application in use, the hardware buffer could be flushed
        // and start fresh.
        if ((hardware_.time() - c_time) > spin_timeout_)
        {
          // Exit the spin, processing timeout exceeded.
          return SPIN_TIMEOUT;
        }
      }
      
      int data = hardware_.read();
      
      if (data < 0)
        break;
      
      checksum_ += data;
      
      if (mode_ == MODE_MESSAGE)          /* message data being recieved */
      {
        message_in[index_++] = data;
        bytes_--;
        if (bytes_ == 0)                 /* is message complete? if so, checksum */
          mode_ = MODE_MSG_CHECKSUM;
      }
      else if (mode_ == MODE_FIRST_FF)
      {
        if (data == 0xff)
        {
          mode_++;
          last_msg_timeout_time = c_time + TIMEOUT_MSG;
        }
      }
      else if (mode_ == MODE_PROTOCOL_VER)
      {
        if (data == PROTOCOL_VER)
        {
          mode_++;
        }
        else
        {
          mode_ = MODE_FIRST_FF;
        }
      }
      else if (mode_ == MODE_SIZE_L)      /* bottom half of message size */
      {
        bytes_ = data;
        index_ = 0;
        mode_++;
        checksum_ = data;
      }
      else if (mode_ == MODE_SIZE_L1)
      {
        bytes_ += data << 8;
        mode_++;
      }
      else if (mode_ == MODE_SIZE_H)      /* top half of message size */
      {
        bytes_ += data << 16;
        mode_++;
      }
      else if (mode_ == MODE_SIZE_H1)
      {
        bytes_ += data << 24;
        mode_++;
      }
      else if (mode_ == MODE_SIZE_CHECKSUM)
      {
        if ((checksum_ % 256) == 255)
          mode_++;
        else
          mode_ = MODE_FIRST_FF;          /* Abandon the frame if the msg len is wrong */
      }
      else if (mode_ == MODE_TOPIC_L)     /* bottom half of topic id */
      {
        topic_ = data;
        mode_++;
        checksum_ = data;               /* first byte included in checksum */
      }
      else if (mode_ == MODE_TOPIC_H)     /* top half of topic id */
      {
        topic_ += data << 8;
        mode_ = MODE_MESSAGE;
        if (bytes_ == 0)
          mode_ = MODE_MSG_CHECKSUM;
      }
      else if (mode_ == MODE_MSG_CHECKSUM)    /* do checksum */
      {
        mode_ = MODE_FIRST_FF;
        if ((checksum_ % 256) == 255)
        {
          if (topic_ == TopicInfo::ID_PUBLISHER)
          {
            requestSyncTime();
            negotiateTopics();
          }
          else if (topic_ == TopicInfo::ID_ROSTOPIC_REQUEST)
          {
            std_msgs::String msg;
            msg.deserialize(message_in);
            topic_list = strdup(msg.data);
            topic_list_recieved = true;
          }
          else if (topic_ == TopicInfo::ID_ROSSERVICE_REQUEST)
          {
            std_msgs::String msg;
            msg.deserialize(message_in);
            service_list = strdup(msg.data);
            service_list_recieved = true;
          }
          else if (topic_ == TopicInfo::ID_TIME)
          {
            syncTime(message_in);
          }
          else if (topic_ == TopicInfo::ID_NEGOTIATED) {
            tinyros_msgs::TopicInfo ti;
            ti.deserialize(message_in);
            for (int i = 0; i < MAX_PUBLISHERS; i++)
            {
              if (publishers[i] != 0 && publishers[i]->id_ == ti.topic_id)
              {
                publishers[i]->negotiated_ = ti.negotiated;
              }
            }
            for (int i = 0; i < MAX_SUBSCRIBERS; i++)
            {
              if (subscribers[i] != 0 && subscribers[i]->id_ == ti.topic_id)
              {
                subscribers[i]->negotiated_ = ti.negotiated;
              }
            }
          }
          else
          {
            if (subscribers[topic_ - 100])
              subscribers[topic_ - 100]->callback(message_in);
          }
        }
      }
    }

    return SPIN_OK;
  }


  /* Are we connected to the PC? */
  virtual bool ok()
  {
    return hardware_.connected();
  }

  /********************************************************************
   * Time functions
   */

  void requestSyncTime()
  {
    std_msgs::Time t;
    publish(TopicInfo::ID_TIME, &t);
    rt_time = hardware_.time();
  }

  void syncTime(uint8_t * data)
  {
    std_msgs::Time t;
    uint32_t offset = hardware_.time() - rt_time;

    t.deserialize(data);
    t.data.sec += offset / 1000;
    t.data.nsec += (offset % 1000) * 1000000UL;

    this->setNow(t.data);
    last_sync_receive_time = hardware_.time();
  }

  Time now()
  {
    uint32_t ms = hardware_.time();
    Time current_time;
    current_time.sec = ms / 1000 + sec_offset;
    current_time.nsec = (ms % 1000) * 1000000UL + nsec_offset;
    normalizeSecNSec(current_time.sec, current_time.nsec);
    return current_time;
  }

  void setNow(Time & new_now)
  {
    uint32_t ms = hardware_.time();
    sec_offset = new_now.sec - ms / 1000 - 1;
    nsec_offset = new_now.nsec - (ms % 1000) * 1000000UL + 1000000000UL;
    normalizeSecNSec(sec_offset, nsec_offset);
  }

  /********************************************************************
   * Topic Management
   */

  /* Register a new publisher */
  bool advertise(Publisher & p)
  {
    for (int i = 0; i < MAX_PUBLISHERS; i++)
    {
      if (publishers[i] == 0) // empty slot
      {
        publishers[i] = &p;
        p.id_ = i + 100 + MAX_SUBSCRIBERS;
        p.nh_ = this;
        return true;
      }
    }
    return false;
  }

  /* Register a new subscriber */
  template<typename SubscriberT>
  bool subscribe(SubscriberT& s)
  {
    for (int i = 0; i < MAX_SUBSCRIBERS; i++)
    {
      if (subscribers[i] == 0) // empty slot
      {
        subscribers[i] = static_cast<Subscriber_*>(&s);
        s.id_ = i + 100;
        return true;
      }
    }
    return false;
  }

  /* Register a new Service Server */
  template<typename MReq, typename MRes, typename ObjT>
  bool advertiseService(ServiceServer<MReq, MRes, ObjT>& srv)
  {
    for (int i = 0; i < MAX_SUBSCRIBERS; i++)
    {
      if (subscribers[i] == 0) // empty slot
      {
        subscribers[i] = static_cast<Subscriber_*>(&srv);
        srv.id_ = i + 100;
        for (int j = 0; j < MAX_PUBLISHERS; j++)
        {
          if (publishers[j] == 0) // empty slot
          {
            publishers[j] = &srv.pub;
            srv.pub.id_ = srv.id_;
            srv.pub.nh_ = this;
            return true;
          }
        }
      }
    }
    return false;
  }

  /* Register a new Service Client */
  template<typename MReq, typename MRes>
  bool serviceClient(ServiceClient<MReq, MRes>& srv)
  {
    for (int i = 0; i < MAX_SUBSCRIBERS; i++)
    {
      if (subscribers[i] == 0) // empty slot
      {
        subscribers[i] = static_cast<Subscriber_*>(&srv);
        srv.id_ = i + 100;
        for (int j = 0; j < MAX_PUBLISHERS; j++)
        {
          if (publishers[j] == 0) // empty slot
          {
            publishers[j] = &srv.pub;
            srv.pub.id_ = srv.id_;
            srv.pub.nh_ = this;
            return true;
          }
        }
      }
    }
    return false;
  }

  void negotiateTopics()
  {
    tinyros_msgs::TopicInfo ti;
    int i;
    for (i = 0; i < MAX_PUBLISHERS; i++)
    {
      if (publishers[i] != 0) // non-empty slot
      {
        ti.topic_id = publishers[i]->id_;
        ti.topic_name = (char *) publishers[i]->topic_;
        ti.message_type = (char *) publishers[i]->msg_->getType();
        ti.md5sum = (char *) publishers[i]->msg_->getMD5();
        ti.buffer_size = OUTPUT_SIZE;
        publish(publishers[i]->getEndpointType(), &ti);
      }
    }
    for (i = 0; i < MAX_SUBSCRIBERS; i++)
    {
      if (subscribers[i] != 0) // non-empty slot
      {
        ti.topic_id = subscribers[i]->id_;
        ti.topic_name = (char *) subscribers[i]->topic_;
        ti.message_type = (char *) subscribers[i]->getMsgType();
        ti.md5sum = (char *) subscribers[i]->getMsgMD5();
        ti.buffer_size = INPUT_SIZE;
        publish(subscribers[i]->getEndpointType(), &ti);
      }
    }
  }

  virtual int publish(int id, const Msg * msg)
  {
    /* serialize message */
    int l = msg->serialize(message_out + 9);

    /* setup the header */
    message_out[0] = 0xff;
    message_out[1] = PROTOCOL_VER;
    message_out[2] = (uint8_t)((uint32_t)l & 0xFF);
    message_out[3] = (uint8_t)((uint32_t)((l >> 8) & 0xFF));
    message_out[4] = (uint8_t)((uint32_t)((l >> 16) & 0xFF));
    message_out[5] = (uint8_t)((uint32_t)((l >> 24) & 0xFF));
    message_out[6] = 255 - ((message_out[2] + message_out[3] + message_out[4] + message_out[5]) % 256);
    message_out[7] = (uint8_t)((int16_t)id & 255);
    message_out[8] = (uint8_t)((int16_t)id >> 8);

    /* calculate checksum */
    int chk = 0;
    for (int i = 7; i < l + 9; i++)
      chk += message_out[i];
    l += 9;
    message_out[l++] = 255 - (chk % 256);

    if (l <= OUTPUT_SIZE)
    {
      hardware_.write(message_out, l);
      return l;
    }
    else
    {
      logerror("Message from device dropped: message larger than buffer.");
      return -1;
    }
  }

  /********************************************************************
   * Logging
   */

private:
  void log(char byte, const char * msg)
  {
    if (hardware_.connected()) 
    {
      tinyros_msgs::Log l;
      l.level = byte;
      l.msg = (char*)msg;
      publish(tinyros_msgs::TopicInfo::ID_LOG, &l);
    }
  }

public:
  void logdebug(const char* msg) { log(tinyros_msgs::Log::ROSDEBUG, msg); }
  void loginfo(const char * msg) { log(tinyros_msgs::Log::ROSINFO, msg); }
  void logwarn(const char *msg) { log(tinyros_msgs::Log::ROSWARN, msg); }
  void logerror(const char*msg) { log(tinyros_msgs::Log::ROSERROR, msg); }
  void logfatal(const char*msg) { log(tinyros_msgs::Log::ROSFATAL, msg); }

  /*********************************************************************/
  private:
    bool topic_list_recieved;
    char *topic_list;

    bool service_list_recieved;
    char *service_list;

  public:
    char* getTopicList(int timeout = 1000)
    {
      std_msgs::String msg;
      publish(TopicInfo::ID_ROSTOPIC_REQUEST, &msg);
      uint32_t end_time = hardware_.time() + timeout;
      topic_list_recieved = false;
      while (!topic_list_recieved)
      {
        spinOnce();
        if (hardware_.time() > end_time)
        {
          logwarn("Failed to get getTopicList: timeout expired");
          return strdup("");
        }
      }
      return topic_list;
    }

    char* getServiceList(int timeout = 1000)
    {
      std_msgs::String msg;
      publish(TopicInfo::ID_ROSSERVICE_REQUEST, &msg);
      uint32_t end_time = hardware_.time() + timeout;
      service_list_recieved = false;
      while (!service_list_recieved)
      {
        spinOnce();
        if (hardware_.time() > end_time)
        {
          logwarn("Failed to get getServiceList: timeout expired");
          return strdup("");
        }
      }
      return service_list;
    }
};

}

#endif
