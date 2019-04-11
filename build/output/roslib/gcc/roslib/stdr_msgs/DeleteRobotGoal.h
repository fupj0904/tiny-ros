#ifndef _ROS_stdr_msgs_DeleteRobotGoal_h
#define _ROS_stdr_msgs_DeleteRobotGoal_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace stdr_msgs
{

  class DeleteRobotGoal : public ros::Msg
  {
    public:
      typedef const char* _name_type;
      _name_type name;

    DeleteRobotGoal():
      name("")
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      uint32_t length_name = strlen(this->name);
      varToArr(outbuffer + offset, length_name);
      offset += 4;
      memcpy(outbuffer + offset, this->name, length_name);
      offset += length_name;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      uint32_t length_name;
      arrToVar(length_name, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_name; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_name-1]=0;
      this->name = (char *)(inbuffer + offset-1);
      offset += length_name;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_name = strlen(this->name);
      length += 4;
      length += length_name;
      return length;
    }

    const char * getType(){ return "stdr_msgs/DeleteRobotGoal"; }
    const char * getMD5(){ return "5ce9fc2e0a35f7f4fd47eee5ddff08b4"; }

  };

}
#endif