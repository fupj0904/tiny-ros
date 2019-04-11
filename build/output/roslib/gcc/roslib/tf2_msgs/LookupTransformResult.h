#ifndef _ROS_tf2_msgs_LookupTransformResult_h
#define _ROS_tf2_msgs_LookupTransformResult_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geometry_msgs/TransformStamped.h"
#include "tf2_msgs/TF2Error.h"

namespace tf2_msgs
{

  class LookupTransformResult : public ros::Msg
  {
    public:
      typedef geometry_msgs::TransformStamped _transform_type;
      _transform_type transform;
      typedef tf2_msgs::TF2Error _error_type;
      _error_type error;

    LookupTransformResult():
      transform(),
      error()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->transform.serialize(outbuffer + offset);
      offset += this->error.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->transform.deserialize(inbuffer + offset);
      offset += this->error.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->transform.serializedLength();
      length += this->error.serializedLength();
      return length;
    }

    const char * getType(){ return "tf2_msgs/LookupTransformResult"; }
    const char * getMD5(){ return "7be4fc6719f512bc94491db1ccda6aee"; }

  };

}
#endif