#ifndef _ROS_actionlib_tutorials_AveragingAction_h
#define _ROS_actionlib_tutorials_AveragingAction_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "actionlib_tutorials/AveragingActionGoal.h"
#include "actionlib_tutorials/AveragingActionResult.h"
#include "actionlib_tutorials/AveragingActionFeedback.h"

namespace actionlib_tutorials
{

  class AveragingAction : public ros::Msg
  {
    public:
      typedef actionlib_tutorials::AveragingActionGoal _action_goal_type;
      _action_goal_type action_goal;
      typedef actionlib_tutorials::AveragingActionResult _action_result_type;
      _action_result_type action_result;
      typedef actionlib_tutorials::AveragingActionFeedback _action_feedback_type;
      _action_feedback_type action_feedback;

    AveragingAction():
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

    const char * getType(){ return "actionlib_tutorials/AveragingAction"; }
    const char * getMD5(){ return "aedca8a7e3697f2593c3eb492881a81b"; }

  };

}
#endif