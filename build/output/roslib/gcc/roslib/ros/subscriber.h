/*
 * File      : subscriber.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef ROS_SUBSCRIBER_H_
#define ROS_SUBSCRIBER_H_

#include "tinyros_msgs/TopicInfo.h"

namespace ros
{

/* Base class for objects subscribers. */
class Subscriber_
{
public:
  virtual void callback(unsigned char *data) = 0;
  virtual int getEndpointType() = 0;

  // id_ is set by NodeHandle when we advertise
  int id_;

  virtual const char * getMsgType() = 0;
  virtual const char * getMsgMD5() = 0;
  virtual bool negotiated() { return negotiated_; }
  const char * topic_;

  // negotiated_ is set by NodeHandle when we negotiateTopics
  bool negotiated_;
};

/* Bound function subscriber. */
template<typename MsgT, typename ObjT = void>
class Subscriber: public Subscriber_
{
public:
  typedef void(ObjT::*CallbackT)(const MsgT&);
  MsgT msg;

  Subscriber(const char * topic_name, CallbackT cb, ObjT* obj, int endpoint = tinyros_msgs::TopicInfo::ID_SUBSCRIBER) :
    cb_(cb),
    obj_(obj),
    endpoint_(endpoint) {
    topic_ = topic_name;
    negotiated_ = false;
  }

  virtual void callback(unsigned char* data)
  {
    msg.deserialize(data);
    (obj_->*cb_)(msg);
  }

  virtual const char * getMsgType()
  {
    return this->msg.getType();
  }
  virtual const char * getMsgMD5()
  {
    return this->msg.getMD5();
  }
  virtual int getEndpointType()
  {
    return endpoint_;
  }

private:
  CallbackT cb_;
  ObjT* obj_;
  int endpoint_;
};

/* Standalone function subscriber. */
template<typename MsgT>
class Subscriber<MsgT, void>: public Subscriber_
{
public:
  typedef void(*CallbackT)(const MsgT&);
  MsgT msg;

  Subscriber(const char * topic_name, CallbackT cb, int endpoint = tinyros_msgs::TopicInfo::ID_SUBSCRIBER) :
    cb_(cb),
    endpoint_(endpoint) {
    topic_ = topic_name;
    negotiated_ = false;
  }

  virtual void callback(unsigned char* data)
  {
    msg.deserialize(data);
    this->cb_(msg);
  }

  virtual const char * getMsgType()
  {
    return this->msg.getType();
  }
  virtual const char * getMsgMD5()
  {
    return this->msg.getMD5();
  }
  virtual int getEndpointType()
  {
    return endpoint_;
  }

private:
  CallbackT cb_;
  int endpoint_;
};

}

#endif
