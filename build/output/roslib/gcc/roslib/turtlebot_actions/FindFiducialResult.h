#ifndef _ROS_turtlebot_actions_FindFiducialResult_h
#define _ROS_turtlebot_actions_FindFiducialResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geometry_msgs/PoseStamped.h"

namespace turtlebot_actions
{

  class FindFiducialResult : public ros::Msg
  {
    public:
      typedef geometry_msgs::PoseStamped _pose_type;
      _pose_type pose;

    FindFiducialResult():
      pose()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->pose.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->pose.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->pose.serializedLength();
      return length;
    }

    const char * getType(){ return "turtlebot_actions/FindFiducialResult"; }
    const char * getMD5(){ return "8653d7a7ef2bd0fc436f0be9b4dbd842"; }

  };

}
#endif