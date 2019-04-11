#ifndef _ROS_stdr_msgs_RegisterRobotResult_h
#define _ROS_stdr_msgs_RegisterRobotResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "stdr_msgs/RobotMsg.h"

namespace stdr_msgs
{

  class RegisterRobotResult : public ros::Msg
  {
    public:
      typedef stdr_msgs::RobotMsg _description_type;
      _description_type description;

    RegisterRobotResult():
      description()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->description.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->description.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->description.serializedLength();
      return length;
    }

    const char * getType(){ return "stdr_msgs/RegisterRobotResult"; }
    const char * getMD5(){ return "712ebcaa8d452edbedd1d899868c58f8"; }

  };

}
#endif