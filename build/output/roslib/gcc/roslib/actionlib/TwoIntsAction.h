#ifndef _ROS_actionlib_TwoIntsAction_h
#define _ROS_actionlib_TwoIntsAction_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "actionlib/TwoIntsActionGoal.h"
#include "actionlib/TwoIntsActionResult.h"
#include "actionlib/TwoIntsActionFeedback.h"

namespace actionlib
{

  class TwoIntsAction : public ros::Msg
  {
    public:
      typedef actionlib::TwoIntsActionGoal _action_goal_type;
      _action_goal_type action_goal;
      typedef actionlib::TwoIntsActionResult _action_result_type;
      _action_result_type action_result;
      typedef actionlib::TwoIntsActionFeedback _action_feedback_type;
      _action_feedback_type action_feedback;

    TwoIntsAction():
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

    const char * getType(){ return "actionlib/TwoIntsAction"; }
    const char * getMD5(){ return "2a0bb4bb65878333f9d365c8b4affdb4"; }

  };

}
#endif