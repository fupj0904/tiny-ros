#ifndef _ROS_control_msgs_FollowJointTrajectoryActionGoal_h
#define _ROS_control_msgs_FollowJointTrajectoryActionGoal_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "actionlib_msgs/GoalID.h"
#include "control_msgs/FollowJointTrajectoryGoal.h"

namespace control_msgs
{

  class FollowJointTrajectoryActionGoal : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef actionlib_msgs::GoalID _goal_id_type;
      _goal_id_type goal_id;
      typedef control_msgs::FollowJointTrajectoryGoal _goal_type;
      _goal_type goal;

    FollowJointTrajectoryActionGoal():
      header(),
      goal_id(),
      goal()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->header.serialize(outbuffer + offset);
      offset += this->goal_id.serialize(outbuffer + offset);
      offset += this->goal.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->header.deserialize(inbuffer + offset);
      offset += this->goal_id.deserialize(inbuffer + offset);
      offset += this->goal.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->header.serializedLength();
      length += this->goal_id.serializedLength();
      length += this->goal.serializedLength();
      return length;
    }

    const char * getType(){ return "control_msgs/FollowJointTrajectoryActionGoal"; }
    const char * getMD5(){ return "01fd8d7e561f23e1c30281b3be024d60"; }

  };

}
#endif