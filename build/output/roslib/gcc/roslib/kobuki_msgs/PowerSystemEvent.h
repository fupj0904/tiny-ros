#ifndef _ROS_kobuki_msgs_PowerSystemEvent_h
#define _ROS_kobuki_msgs_PowerSystemEvent_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace kobuki_msgs
{

  class PowerSystemEvent : public ros::Msg
  {
    public:
      typedef uint8_t _event_type;
      _event_type event;
      enum { UNPLUGGED =  0 };
      enum { PLUGGED_TO_ADAPTER =  1 };
      enum { PLUGGED_TO_DOCKBASE =  2 };
      enum { CHARGE_COMPLETED =  3 };
      enum { BATTERY_LOW =  4 };
      enum { BATTERY_CRITICAL =  5 };

    PowerSystemEvent():
      event(0)
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->event >> (8 * 0)) & 0xFF;
      offset += sizeof(this->event);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->event =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->event);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->event);
      return length;
    }

    const char * getType(){ return "kobuki_msgs/PowerSystemEvent"; }
    const char * getMD5(){ return "9cb4b9f509fbcaef2884086f7e6d121d"; }

  };

}
#endif