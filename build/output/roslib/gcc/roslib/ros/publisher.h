/*
 * File      : publisher.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef _ROS_PUBLISHER_H_
#define _ROS_PUBLISHER_H_

#include "tinyros_msgs/TopicInfo.h"
#include "ros/node_handle.h"

namespace ros
{

/* Generic Publisher */
class Publisher
{
public:
  Publisher(const char * topic_name, Msg * msg, int endpoint = tinyros_msgs::TopicInfo::ID_PUBLISHER) :
    topic_(topic_name),
    msg_(msg),
    endpoint_(endpoint),
    negotiated_(false) { }

  int publish(const Msg * msg)
  {
    if (negotiated_) 
    {
      return nh_->publish(id_, msg);
    }
    return 0;
  }
  
  int getEndpointType()
  {
    return endpoint_;
  }

  bool negotiated()
  {
    return negotiated_;
  }

  const char * topic_;
  Msg *msg_;
  // id_ and no_ are set by NodeHandle when we advertise
  int id_;
  NodeHandleBase_* nh_;

  // negotiated_ is set by NodeHandle when we negotiateTopics
  bool negotiated_;

private:
  int endpoint_;
};

}

#endif
