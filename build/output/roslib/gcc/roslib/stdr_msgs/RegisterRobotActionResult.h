#ifndef _ROS_stdr_msgs_RegisterRobotActionResult_h
#define _ROS_stdr_msgs_RegisterRobotActionResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "actionlib_msgs/GoalStatus.h"
#include "stdr_msgs/RegisterRobotResult.h"

namespace stdr_msgs
{

  class RegisterRobotActionResult : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef actionlib_msgs::GoalStatus _status_type;
      _status_type status;
      typedef stdr_msgs::RegisterRobotResult _result_type;
      _result_type result;

    RegisterRobotActionResult():
      header(),
      status(),
      result()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->header.serialize(outbuffer + offset);
      offset += this->status.serialize(outbuffer + offset);
      offset += this->result.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->header.deserialize(inbuffer + offset);
      offset += this->status.deserialize(inbuffer + offset);
      offset += this->result.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->header.serializedLength();
      length += this->status.serializedLength();
      length += this->result.serializedLength();
      return length;
    }

    const char * getType(){ return "stdr_msgs/RegisterRobotActionResult"; }
    const char * getMD5(){ return "a08f1e51cfcfc4b83195ca660f763686"; }

  };

}
#endif