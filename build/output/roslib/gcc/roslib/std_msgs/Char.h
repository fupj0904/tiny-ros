#ifndef _ROS_std_msgs_Char_h
#define _ROS_std_msgs_Char_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace std_msgs
{

  class Char : public ros::Msg
  {
    public:
      typedef uint8_t _data_type;
      _data_type data;

    Char():
      data(0)
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->data >> (8 * 0)) & 0xFF;
      offset += sizeof(this->data);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->data =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->data);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->data);
      return length;
    }

    const char * getType(){ return "std_msgs/Char"; }
    const char * getMD5(){ return "18741a80dcc02fcae20538073fcb0872"; }

  };

}
#endif