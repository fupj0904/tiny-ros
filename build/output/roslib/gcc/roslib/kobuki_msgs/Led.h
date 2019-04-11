#ifndef _ROS_kobuki_msgs_Led_h
#define _ROS_kobuki_msgs_Led_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace kobuki_msgs
{

  class Led : public ros::Msg
  {
    public:
      typedef uint8_t _value_type;
      _value_type value;
      enum { BLACK =  0 };
      enum { GREEN =  1 };
      enum { ORANGE =  2 };
      enum { RED =  3 };

    Led():
      value(0)
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->value >> (8 * 0)) & 0xFF;
      offset += sizeof(this->value);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->value =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->value);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->value);
      return length;
    }

    const char * getType(){ return "kobuki_msgs/Led"; }
    const char * getMD5(){ return "cef01eb27ae755a42b3b02c26c2cb0f3"; }

  };

}
#endif