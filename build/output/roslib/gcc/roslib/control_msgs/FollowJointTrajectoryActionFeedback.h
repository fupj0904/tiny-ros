#ifndef _ROS_control_msgs_FollowJointTrajectoryActionFeedback_h
#define _ROS_control_msgs_FollowJointTrajectoryActionFeedback_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "actionlib_msgs/GoalStatus.h"
#include "control_msgs/FollowJointTrajectoryFeedback.h"

namespace control_msgs
{

  class FollowJointTrajectoryActionFeedback : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef actionlib_msgs::GoalStatus _status_type;
      _status_type status;
      typedef control_msgs::FollowJointTrajectoryFeedback _feedback_type;
      _feedback_type feedback;

    FollowJointTrajectoryActionFeedback():
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

    const char * getType(){ return "control_msgs/FollowJointTrajectoryActionFeedback"; }
    const char * getMD5(){ return "463ce156380889cbd7ec7903b63f9f0c"; }

  };

}
#endif