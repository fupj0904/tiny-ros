#ifndef _ROS_stdr_msgs_DeleteRobotFeedback_h
#define _ROS_stdr_msgs_DeleteRobotFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace stdr_msgs
{

  class DeleteRobotFeedback : public ros::Msg
  {
    public:

    DeleteRobotFeedback()
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

    const char * getType(){ return "stdr_msgs/DeleteRobotFeedback"; }
    const char * getMD5(){ return "6bce4c21c5efaaddb95cd4d549332c1b"; }

  };

}
#endif