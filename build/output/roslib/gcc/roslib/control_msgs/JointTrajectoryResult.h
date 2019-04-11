#ifndef _ROS_control_msgs_JointTrajectoryResult_h
#define _ROS_control_msgs_JointTrajectoryResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace control_msgs
{

  class JointTrajectoryResult : public ros::Msg
  {
    public:

    JointTrajectoryResult()
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

    const char * getType(){ return "control_msgs/JointTrajectoryResult"; }
    const char * getMD5(){ return "f99682617160dbb184130c20a9117dd2"; }

  };

}
#endif