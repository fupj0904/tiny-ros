#ifndef _ROS_uuid_msgs_UniqueID_h
#define _ROS_uuid_msgs_UniqueID_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace uuid_msgs
{

  class UniqueID : public ros::Msg
  {
    public:
      uint8_t uuid[16];

    UniqueID():
      uuid()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      for( uint32_t i = 0; i < 16; i++){
      *(outbuffer + offset + 0) = (this->uuid[i] >> (8 * 0)) & 0xFF;
      offset += sizeof(this->uuid[i]);
      }
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      for( uint32_t i = 0; i < 16; i++){
      this->uuid[i] =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->uuid[i]);
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      for( uint32_t i = 0; i < 16; i++){
      length += sizeof(this->uuid[i]);
      }
      return length;
    }

    const char * getType(){ return "uuid_msgs/UniqueID"; }
    const char * getMD5(){ return "708a9da6688a5069b38eaede4d922ec4"; }

  };

}
#endif