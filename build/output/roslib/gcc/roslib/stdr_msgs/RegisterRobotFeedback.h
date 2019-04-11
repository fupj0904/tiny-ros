#ifndef _ROS_stdr_msgs_RegisterRobotFeedback_h
#define _ROS_stdr_msgs_RegisterRobotFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace stdr_msgs
{

  class RegisterRobotFeedback : public ros::Msg
  {
    public:

    RegisterRobotFeedback()
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

    const char * getType(){ return "stdr_msgs/RegisterRobotFeedback"; }
    const char * getMD5(){ return "84c0885c125b0d4011546b0c21fc09bd"; }

  };

}
#endif