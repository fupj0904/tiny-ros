#ifndef _ROS_kobuki_msgs_AutoDockingGoal_h
#define _ROS_kobuki_msgs_AutoDockingGoal_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace kobuki_msgs
{

  class AutoDockingGoal : public ros::Msg
  {
    public:

    AutoDockingGoal()
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

    const char * getType(){ return "kobuki_msgs/AutoDockingGoal"; }
    const char * getMD5(){ return "101d4b055b7359df065e1ba46e9a9859"; }

  };

}
#endif