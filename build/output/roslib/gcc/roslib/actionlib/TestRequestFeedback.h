#ifndef _ROS_actionlib_TestRequestFeedback_h
#define _ROS_actionlib_TestRequestFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace actionlib
{

  class TestRequestFeedback : public ros::Msg
  {
    public:

    TestRequestFeedback()
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

    const char * getType(){ return "actionlib/TestRequestFeedback"; }
    const char * getMD5(){ return "f12766879fe103f43d9bcee183548cab"; }

  };

}
#endif