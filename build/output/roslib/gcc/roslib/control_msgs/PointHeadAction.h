#ifndef _ROS_control_msgs_PointHeadAction_h
#define _ROS_control_msgs_PointHeadAction_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "control_msgs/PointHeadActionGoal.h"
#include "control_msgs/PointHeadActionResult.h"
#include "control_msgs/PointHeadActionFeedback.h"

namespace control_msgs
{

  class PointHeadAction : public ros::Msg
  {
    public:
      typedef control_msgs::PointHeadActionGoal _action_goal_type;
      _action_goal_type action_goal;
      typedef control_msgs::PointHeadActionResult _action_result_type;
      _action_result_type action_result;
      typedef control_msgs::PointHeadActionFeedback _action_feedback_type;
      _action_feedback_type action_feedback;

    PointHeadAction():
      action_goal(),
      action_result(),
      action_feedback()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->action_goal.serialize(outbuffer + offset);
      offset += this->action_result.serialize(outbuffer + offset);
      offset += this->action_feedback.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->action_goal.deserialize(inbuffer + offset);
      offset += this->action_result.deserialize(inbuffer + offset);
      offset += this->action_feedback.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->action_goal.serializedLength();
      length += this->action_result.serializedLength();
      length += this->action_feedback.serializedLength();
      return length;
    }

    const char * getType(){ return "control_msgs/PointHeadAction"; }
    const char * getMD5(){ return "5a58781ca5e0183491ebdad7b7490362"; }

  };

}
#endif