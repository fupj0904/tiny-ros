#ifndef _ROS_geographic_msgs_GeoPose_h
#define _ROS_geographic_msgs_GeoPose_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geographic_msgs/GeoPoint.h"
#include "geometry_msgs/Quaternion.h"

namespace geographic_msgs
{

  class GeoPose : public ros::Msg
  {
    public:
      typedef geographic_msgs::GeoPoint _position_type;
      _position_type position;
      typedef geometry_msgs::Quaternion _orientation_type;
      _orientation_type orientation;

    GeoPose():
      position(),
      orientation()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->position.serialize(outbuffer + offset);
      offset += this->orientation.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->position.deserialize(inbuffer + offset);
      offset += this->orientation.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->position.serializedLength();
      length += this->orientation.serializedLength();
      return length;
    }

    const char * getType(){ return "geographic_msgs/GeoPose"; }
    const char * getMD5(){ return "c4faca1a2d887f6b05e3857eb0b5bce0"; }

  };

}
#endif