/*
 * File      : service_client.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef _ROS_SERVICE_CLIENT_H_
#define _ROS_SERVICE_CLIENT_H_

#include "tinyros_msgs/TopicInfo.h"
#include "ros/publisher.h"
#include "ros/subscriber.h"

namespace ros
{

template<typename MReq , typename MRes>
class ServiceClient : public Subscriber_
{
public:
  ServiceClient(const char* topic_name) :
    pub(topic_name, &req, tinyros_msgs::TopicInfo::ID_SERVICE_CLIENT + tinyros_msgs::TopicInfo::ID_PUBLISHER)
  {
    this->negotiated_ = false;
    this->topic_ = topic_name;
    this->waiting = true;
  }

  virtual bool call(const MReq & request, MRes & response, uint32_t durationSec = 3)
  {
    double time = ros::Time::now().toSec();
    double duration = (double)(durationSec * 1.0);
    if (!pub.nh_->ok())
    {
      return false;
    }
    ret = &response;
    
    waiting = true;
    
    if (pub.publish(&request) <= 0)
    {
        return false;
    }
    
    while (waiting)
    {
      double now = ros::Time::now().toSec();
      if (!pub.nh_->ok() || ((now - time) > duration))
      {
        return false;
      }
      pub.nh_->spinOnce();
    }
    return true;
  }

  // these refer to the subscriber
  virtual void callback(unsigned char *data)
  {
    ret->deserialize(data);
    waiting = false;
  }
  virtual const char * getMsgType()
  {
    return this->resp.getType();
  }
  virtual const char * getMsgMD5()
  {
    return this->resp.getMD5();
  }
  virtual int getEndpointType()
  {
    return tinyros_msgs::TopicInfo::ID_SERVICE_CLIENT + tinyros_msgs::TopicInfo::ID_SUBSCRIBER;
  }
  
  virtual bool negotiated()
  { 
    return (negotiated_ && pub.negotiated_); 
  }

  MReq req;
  MRes resp;
  MRes * ret;
  bool waiting;
  Publisher pub;
};

}

#endif
