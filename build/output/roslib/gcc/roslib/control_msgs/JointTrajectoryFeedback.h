#ifndef _ROS_control_msgs_JointTrajectoryFeedback_h
#define _ROS_control_msgs_JointTrajectoryFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace control_msgs
{

  class JointTrajectoryFeedback : public ros::Msg
  {
    public:

    JointTrajectoryFeedback()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      return length;
    }

    const char * getType(){ return "control_msgs/JointTrajectoryFeedback"; }
    const char * getMD5(){ return "7f01895a68e9841f010f7ffe1f01d718"; }

  };

}
#endif