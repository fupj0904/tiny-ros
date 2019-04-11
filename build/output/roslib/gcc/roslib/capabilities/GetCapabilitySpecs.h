#ifndef _ROS_SERVICE_GetCapabilitySpecs_h
#define _ROS_SERVICE_GetCapabilitySpecs_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "capabilities/CapabilitySpec.h"

namespace capabilities
{

static const char GETCAPABILITYSPECS[] = "capabilities/GetCapabilitySpecs";

  class GetCapabilitySpecsRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetCapabilitySpecsRequest()
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
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      return length;
    }

    const char * getType(){ return GETCAPABILITYSPECS; }
    const char * getMD5(){ return "5e863ea94ed35a0069fad233158d2a05"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetCapabilitySpecsResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t capability_specs_length;
      typedef capabilities::CapabilitySpec _capability_specs_type;
      _capability_specs_type st_capability_specs;
      _capability_specs_type * capability_specs;

    GetCapabilitySpecsResponse():
      capability_specs_length(0), capability_specs(NULL)
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
      *(outbuffer + offset + 0) = (this->capability_specs_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->capability_specs_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->capability_specs_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->capability_specs_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->capability_specs_length);
      for( uint32_t i = 0; i < capability_specs_length; i++){
      offset += this->capability_specs[i].serialize(outbuffer + offset);
      }
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
      uint32_t capability_specs_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      capability_specs_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      capability_specs_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      capability_specs_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->capability_specs_length);
      if(capability_specs_lengthT > capability_specs_length)
        this->capability_specs = (capabilities::CapabilitySpec*)realloc(this->capability_specs, capability_specs_lengthT * sizeof(capabilities::CapabilitySpec));
      capability_specs_length = capability_specs_lengthT;
      for( uint32_t i = 0; i < capability_specs_length; i++){
      offset += this->st_capability_specs.deserialize(inbuffer + offset);
        memcpy( &(this->capability_specs[i]), &(this->st_capability_specs), sizeof(capabilities::CapabilitySpec));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->capability_specs_length);
      for( uint32_t i = 0; i < capability_specs_length; i++){
      length += this->capability_specs[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return GETCAPABILITYSPECS; }
    const char * getMD5(){ return "3642335251a502151cfcb342c4f53734"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetCapabilitySpecs {
    public:
    typedef GetCapabilitySpecsRequest Request;
    typedef GetCapabilitySpecsResponse Response;
  };

}
#endif
