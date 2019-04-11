#ifndef _ROS_rocon_std_msgs_StringsPairResponse_h
#define _ROS_rocon_std_msgs_StringsPairResponse_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "uuid_msgs/UniqueID.h"
#include "rocon_std_msgs/StringsResponse.h"

namespace rocon_std_msgs
{

  class StringsPairResponse : public ros::Msg
  {
    public:
      typedef uuid_msgs::UniqueID _id_type;
      _id_type id;
      typedef rocon_std_msgs::StringsResponse _response_type;
      _response_type response;

    StringsPairResponse():
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

    const char * getType(){ return "rocon_std_msgs/StringsPairResponse"; }
    const char * getMD5(){ return "82e9f6cf40a20b618c59de6b6ddaec21"; }

  };

}
#endif