#ifndef _ROS_kobuki_msgs_WheelDropEvent_h
#define _ROS_kobuki_msgs_WheelDropEvent_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace kobuki_msgs
{

  class WheelDropEvent : public ros::Msg
  {
    public:
      typedef uint8_t _wheel_type;
      _wheel_type wheel;
      typedef uint8_t _state_type;
      _state_type state;
      enum { LEFT =  0 };
      enum { RIGHT =  1 };
      enum { RAISED =  0 };
      enum { DROPPED =  1 };

    WheelDropEvent():
      wheel(0),
      state(0)
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->wheel >> (8 * 0)) & 0xFF;
      offset += sizeof(this->wheel);
      *(outbuffer + offset + 0) = (this->state >> (8 * 0)) & 0xFF;
      offset += sizeof(this->state);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->wheel =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->wheel);
      this->state =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->state);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->wheel);
      length += sizeof(this->state);
      return length;
    }

    const char * getType(){ return "kobuki_msgs/WheelDropEvent"; }
    const char * getMD5(){ return "b7ad48a8acba2e25bec947c0541b772a"; }

  };

}
#endif