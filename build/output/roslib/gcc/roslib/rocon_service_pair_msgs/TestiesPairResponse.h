#ifndef _ROS_rocon_service_pair_msgs_TestiesPairResponse_h
#define _ROS_rocon_service_pair_msgs_TestiesPairResponse_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "uuid_msgs/UniqueID.h"
#include "rocon_service_pair_msgs/TestiesResponse.h"

namespace rocon_service_pair_msgs
{

  class TestiesPairResponse : public ros::Msg
  {
    public:
      typedef uuid_msgs::UniqueID _id_type;
      _id_type id;
      typedef rocon_service_pair_msgs::TestiesResponse _response_type;
      _response_type response;

    TestiesPairResponse():
      id(),
      response()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->id.serialize(outbuffer + offset);
      offset += this->response.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->id.deserialize(inbuffer + offset);
      offset += this->response.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->id.serializedLength();
      length += this->response.serializedLength();
      return length;
    }

    const char * getType(){ return "rocon_service_pair_msgs/TestiesPairResponse"; }
    const char * getMD5(){ return "b5a5ff0122f8fe4629962124b40d6212"; }

  };

}
#endif