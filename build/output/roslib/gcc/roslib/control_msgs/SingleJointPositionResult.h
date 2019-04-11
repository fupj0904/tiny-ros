#ifndef _ROS_control_msgs_SingleJointPositionResult_h
#define _ROS_control_msgs_SingleJointPositionResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace control_msgs
{

  class SingleJointPositionResult : public ros::Msg
  {
    public:

    SingleJointPositionResult()
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

    const char * getType(){ return "control_msgs/SingleJointPositionResult"; }
    const char * getMD5(){ return "ba1fc8ef3dc3c6c3e7987a72b310deb6"; }

  };

}
#endif