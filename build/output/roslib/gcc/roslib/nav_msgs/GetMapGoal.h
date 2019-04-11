#ifndef _ROS_nav_msgs_GetMapGoal_h
#define _ROS_nav_msgs_GetMapGoal_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace nav_msgs
{

  class GetMapGoal : public ros::Msg
  {
    public:

    GetMapGoal()
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

    const char * getType(){ return "nav_msgs/GetMapGoal"; }
    const char * getMD5(){ return "b39e6b705afaad0184bd2c87f4bd870f"; }

  };

}
#endif