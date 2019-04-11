#ifndef _ROS_turtle_actionlib_ShapeFeedback_h
#define _ROS_turtle_actionlib_ShapeFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace turtle_actionlib
{

  class ShapeFeedback : public ros::Msg
  {
    public:

    ShapeFeedback()
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

    const char * getType(){ return "turtle_actionlib/ShapeFeedback"; }
    const char * getMD5(){ return "edba39d84dde7fbe1f1bdcbabe6a6e18"; }

  };

}
#endif