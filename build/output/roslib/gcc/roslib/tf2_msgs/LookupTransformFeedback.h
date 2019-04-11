#ifndef _ROS_tf2_msgs_LookupTransformFeedback_h
#define _ROS_tf2_msgs_LookupTransformFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace tf2_msgs
{

  class LookupTransformFeedback : public ros::Msg
  {
    public:

    LookupTransformFeedback()
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

    const char * getType(){ return "tf2_msgs/LookupTransformFeedback"; }
    const char * getMD5(){ return "e6217f8a8e77aa218a8d6f594d08ba08"; }

  };

}
#endif