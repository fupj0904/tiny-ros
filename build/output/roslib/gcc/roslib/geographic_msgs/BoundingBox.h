#ifndef _ROS_geographic_msgs_BoundingBox_h
#define _ROS_geographic_msgs_BoundingBox_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geographic_msgs/GeoPoint.h"

namespace geographic_msgs
{

  class BoundingBox : public ros::Msg
  {
    public:
      typedef geographic_msgs::GeoPoint _min_pt_type;
      _min_pt_type min_pt;
      typedef geographic_msgs::GeoPoint _max_pt_type;
      _max_pt_type max_pt;

    BoundingBox():
      min_pt(),
      max_pt()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->min_pt.serialize(outbuffer + offset);
      offset += this->max_pt.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->min_pt.deserialize(inbuffer + offset);
      offset += this->max_pt.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->min_pt.serializedLength();
      length += this->max_pt.serializedLength();
      return length;
    }

    const char * getType(){ return "geographic_msgs/BoundingBox"; }
    const char * getMD5(){ return "4c3f7b915ad45a82f007038781685d3b"; }

  };

}
#endif