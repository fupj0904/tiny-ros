#ifndef _ROS_nav_msgs_GetMapActionFeedback_h
#define _ROS_nav_msgs_GetMapActionFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "actionlib_msgs/GoalStatus.h"
#include "nav_msgs/GetMapFeedback.h"

namespace nav_msgs
{

  class GetMapActionFeedback : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef actionlib_msgs::GoalStatus _status_type;
      _status_type status;
      typedef nav_msgs::GetMapFeedback _feedback_type;
      _feedback_type feedback;

    GetMapActionFeedback():
      header(),
      status(),
      feedback()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->header.serialize(outbuffer + offset);
      offset += this->status.serialize(outbuffer + offset);
      offset += this->feedback.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->header.deserialize(inbuffer + offset);
      offset += this->status.deserialize(inbuffer + offset);
      offset += this->feedback.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->header.serializedLength();
      length += this->status.serializedLength();
      length += this->feedback.serializedLength();
      return length;
    }

    const char * getType(){ return "nav_msgs/GetMapActionFeedback"; }
    const char * getMD5(){ return "9ebb88ff2cf2120160bf2197071a69b6"; }

  };

}
#endif