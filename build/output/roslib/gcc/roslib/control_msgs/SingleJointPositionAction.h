#ifndef _ROS_control_msgs_SingleJointPositionAction_h
#define _ROS_control_msgs_SingleJointPositionAction_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "control_msgs/SingleJointPositionActionGoal.h"
#include "control_msgs/SingleJointPositionActionResult.h"
#include "control_msgs/SingleJointPositionActionFeedback.h"

namespace control_msgs
{

  class SingleJointPositionAction : public ros::Msg
  {
    public:
      typedef control_msgs::SingleJointPositionActionGoal _action_goal_type;
      _action_goal_type action_goal;
      typedef control_msgs::SingleJointPositionActionResult _action_result_type;
      _action_result_type action_result;
      typedef control_msgs::SingleJointPositionActionFeedback _action_feedback_type;
      _action_feedback_type action_feedback;

    SingleJointPositionAction():
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

    const char * getType(){ return "control_msgs/SingleJointPositionAction"; }
    const char * getMD5(){ return "a50b3ffee53d6fa44d65aa3715a64267"; }

  };

}
#endif