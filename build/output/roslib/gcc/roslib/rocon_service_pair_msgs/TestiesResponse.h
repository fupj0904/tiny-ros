#ifndef _ROS_rocon_service_pair_msgs_TestiesResponse_h
#define _ROS_rocon_service_pair_msgs_TestiesResponse_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "uuid_msgs/UniqueID.h"

namespace rocon_service_pair_msgs
{

  class TestiesResponse : public ros::Msg
  {
    public:
      typedef uuid_msgs::UniqueID _id_type;
      _id_type id;
      typedef const char* _data_type;
      _data_type data;

    TestiesResponse():
      id(),
      data("")
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->id.serialize(outbuffer + offset);
      uint32_t length_data = strlen(this->data);
      varToArr(outbuffer + offset, length_data);
      offset += 4;
      memcpy(outbuffer + offset, this->data, length_data);
      offset += length_data;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->id.deserialize(inbuffer + offset);
      uint32_t length_data;
      arrToVar(length_data, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_data; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_data-1]=0;
      this->data = (char *)(inbuffer + offset-1);
      offset += length_data;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->id.serializedLength();
      uint32_t length_data = strlen(this->data);
      length += 4;
      length += length_data;
      return length;
    }

    const char * getType(){ return "rocon_service_pair_msgs/TestiesResponse"; }
    const char * getMD5(){ return "64acffd8a4e411827ee8fc5d9e853975"; }

  };

}
#endif