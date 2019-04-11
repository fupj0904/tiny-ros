#ifndef _ROS_SERVICE_AssembleScans_h
#define _ROS_SERVICE_AssembleScans_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "ros/time.h"
#include "sensor_msgs/PointCloud.h"

namespace laser_assembler
{

static const char ASSEMBLESCANS[] = "laser_assembler/AssembleScans";

  class AssembleScansRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef ros::Time _begin_type;
      _begin_type begin;
      typedef ros::Time _end_type;
      _end_type end;

    AssembleScansRequest():
      begin(),
      end()
    {
      this->__id__ = 0;
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->__id__ >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->__id__ >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->__id__ >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->__id__ >> (8 * 3)) & 0xFF;
      offset += sizeof(this->__id__);
      *(outbuffer + offset + 0) = (this->begin.sec >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->begin.sec >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->begin.sec >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->begin.sec >> (8 * 3)) & 0xFF;
      offset += sizeof(this->begin.sec);
      *(outbuffer + offset + 0) = (this->begin.nsec >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->begin.nsec >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->begin.nsec >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->begin.nsec >> (8 * 3)) & 0xFF;
      offset += sizeof(this->begin.nsec);
      *(outbuffer + offset + 0) = (this->end.sec >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->end.sec >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->end.sec >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->end.sec >> (8 * 3)) & 0xFF;
      offset += sizeof(this->end.sec);
      *(outbuffer + offset + 0) = (this->end.nsec >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->end.nsec >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->end.nsec >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->end.nsec >> (8 * 3)) & 0xFF;
      offset += sizeof(this->end.nsec);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->__id__ =  ((uint32_t) (*(inbuffer + offset)));
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->__id__);
      this->begin.sec =  ((uint32_t) (*(inbuffer + offset)));
      this->begin.sec |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->begin.sec |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->begin.sec |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->begin.sec);
      this->begin.nsec =  ((uint32_t) (*(inbuffer + offset)));
      this->begin.nsec |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->begin.nsec |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->begin.nsec |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->begin.nsec);
      this->end.sec =  ((uint32_t) (*(inbuffer + offset)));
      this->end.sec |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->end.sec |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->end.sec |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->end.sec);
      this->end.nsec =  ((uint32_t) (*(inbuffer + offset)));
      this->end.nsec |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->end.nsec |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->end.nsec |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->end.nsec);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->begin.sec);
      length += sizeof(this->begin.nsec);
      length += sizeof(this->end.sec);
      length += sizeof(this->end.nsec);
      return length;
    }

    const char * getType(){ return ASSEMBLESCANS; }
    const char * getMD5(){ return "191273ccf43a9edb786a7993ff4d6a58"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class AssembleScansResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef sensor_msgs::PointCloud _cloud_type;
      _cloud_type cloud;

    AssembleScansResponse():
      cloud()
    {
      this->__id__ = 0;
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->__id__ >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->__id__ >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->__id__ >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->__id__ >> (8 * 3)) & 0xFF;
      offset += sizeof(this->__id__);
      offset += this->cloud.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->__id__ =  ((uint32_t) (*(inbuffer + offset)));
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->__id__);
      offset += this->cloud.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->cloud.serializedLength();
      return length;
    }

    const char * getType(){ return ASSEMBLESCANS; }
    const char * getMD5(){ return "8c15b011ee1551b6a6ae73c1b716d733"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class AssembleScans {
    public:
    typedef AssembleScansRequest Request;
    typedef AssembleScansResponse Response;
  };

}
#endif
