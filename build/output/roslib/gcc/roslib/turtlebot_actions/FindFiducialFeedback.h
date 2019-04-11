#ifndef _ROS_turtlebot_actions_FindFiducialFeedback_h
#define _ROS_turtlebot_actions_FindFiducialFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace turtlebot_actions
{

  class FindFiducialFeedback : public ros::Msg
  {
    public:

    FindFiducialFeedback()
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

    const char * getType(){ return "turtlebot_actions/FindFiducialFeedback"; }
    const char * getMD5(){ return "339b06c55644cb26db3f54727a73a552"; }

  };

}
#endif