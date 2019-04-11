#ifndef _ROS_stdr_msgs_DeleteRobotActionFeedback_h
#define _ROS_stdr_msgs_DeleteRobotActionFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "actionlib_msgs/GoalStatus.h"
#include "stdr_msgs/DeleteRobotFeedback.h"

namespace stdr_msgs
{

  class DeleteRobotActionFeedback : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef actionlib_msgs::GoalStatus _status_type;
      _status_type status;
      typedef stdr_msgs::DeleteRobotFeedback _feedback_type;
      _feedback_type feedback;

    DeleteRobotActionFeedback():
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

    const char * getType(){ return "stdr_msgs/DeleteRobotActionFeedback"; }
    const char * getMD5(){ return "897110a6f2ae89a1413bf50d758dc429"; }

  };

}
#endif