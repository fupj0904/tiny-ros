#ifndef _ROS_actionlib_TwoIntsFeedback_h
#define _ROS_actionlib_TwoIntsFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace actionlib
{

  class TwoIntsFeedback : public ros::Msg
  {
    public:

    TwoIntsFeedback()
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

    const char * getType(){ return "actionlib/TwoIntsFeedback"; }
    const char * getMD5(){ return "782b19a4f01be8638a09613998a91f08"; }

  };

}
#endif