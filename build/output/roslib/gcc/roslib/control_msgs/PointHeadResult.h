#ifndef _ROS_control_msgs_PointHeadResult_h
#define _ROS_control_msgs_PointHeadResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace control_msgs
{

  class PointHeadResult : public ros::Msg
  {
    public:

    PointHeadResult()
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

    const char * getType(){ return "control_msgs/PointHeadResult"; }
    const char * getMD5(){ return "59dd54d997d44b6d2afe81f6b92681af"; }

  };

}
#endif