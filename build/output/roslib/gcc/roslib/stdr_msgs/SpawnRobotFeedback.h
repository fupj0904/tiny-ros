#ifndef _ROS_stdr_msgs_SpawnRobotFeedback_h
#define _ROS_stdr_msgs_SpawnRobotFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace stdr_msgs
{

  class SpawnRobotFeedback : public ros::Msg
  {
    public:

    SpawnRobotFeedback()
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

    const char * getType(){ return "stdr_msgs/SpawnRobotFeedback"; }
    const char * getMD5(){ return "07d19a6c09fdb9ad9fc3fb0c3ef9bbd6"; }

  };

}
#endif