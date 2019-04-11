#ifndef _ROS_move_base_msgs_MoveBaseGoal_h
#define _ROS_move_base_msgs_MoveBaseGoal_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geometry_msgs/PoseStamped.h"

namespace move_base_msgs
{

  class MoveBaseGoal : public ros::Msg
  {
    public:
      typedef geometry_msgs::PoseStamped _target_pose_type;
      _target_pose_type target_pose;

    MoveBaseGoal():
      target_pose()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->target_pose.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->target_pose.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->target_pose.serializedLength();
      return length;
    }

    const char * getType(){ return "move_base_msgs/MoveBaseGoal"; }
    const char * getMD5(){ return "1dfe03a48bc9ae61ad14a86bd30eac33"; }

  };

}
#endif