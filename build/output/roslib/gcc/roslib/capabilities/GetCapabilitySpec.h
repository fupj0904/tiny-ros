#ifndef _ROS_SERVICE_GetCapabilitySpec_h
#define _ROS_SERVICE_GetCapabilitySpec_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "capabilities/CapabilitySpec.h"

namespace capabilities
{

static const char GETCAPABILITYSPEC[] = "capabilities/GetCapabilitySpec";

  class GetCapabilitySpecRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _capability_spec_type;
      _capability_spec_type capability_spec;

    GetCapabilitySpecRequest():
      capability_spec("")
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
      uint32_t length_capability_spec = strlen(this->capability_spec);
      varToArr(outbuffer + offset, length_capability_spec);
      offset += 4;
      memcpy(outbuffer + offset, this->capability_spec, length_capability_spec);
      offset += length_capability_spec;
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
      uint32_t length_capability_spec;
      arrToVar(length_capability_spec, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_capability_spec; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_capability_spec-1]=0;
      this->capability_spec = (char *)(inbuffer + offset-1);
      offset += length_capability_spec;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_capability_spec = strlen(this->capability_spec);
      length += 4;
      length += length_capability_spec;
      return length;
    }

    const char * getType(){ return GETCAPABILITYSPEC; }
    const char * getMD5(){ return "e061d073a19df8f5112f3e48db707e91"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetCapabilitySpecResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef capabilities::CapabilitySpec _capability_spec_type;
      _capability_spec_type capability_spec;

    GetCapabilitySpecResponse():
      capability_spec()
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
      offset += this->capability_spec.serialize(outbuffer + offset);
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
      offset += this->capability_spec.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->capability_spec.serializedLength();
      return length;
    }

    const char * getType(){ return GETCAPABILITYSPEC; }
    const char * getMD5(){ return "894aad5f33b01cf286d1eee43a18d67e"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetCapabilitySpec {
    public:
    typedef GetCapabilitySpecRequest Request;
    typedef GetCapabilitySpecResponse Response;
  };

}
#endif
