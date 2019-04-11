#ifndef _ROS_nav_msgs_GetMapFeedback_h
#define _ROS_nav_msgs_GetMapFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace nav_msgs
{

  class GetMapFeedback : public ros::Msg
  {
    public:

    GetMapFeedback()
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

    const char * getType(){ return "nav_msgs/GetMapFeedback"; }
    const char * getMD5(){ return "f561626803919fb2f269eb497bfdfea4"; }

  };

}
#endif