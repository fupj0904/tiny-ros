#ifndef _ROS_SERVICE_GetInterfaces_h
#define _ROS_SERVICE_GetInterfaces_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace capabilities
{

static const char GETINTERFACES[] = "capabilities/GetInterfaces";

  class GetInterfacesRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetInterfacesRequest()
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

    const char * getType(){ return GETINTERFACES; }
    const char * getMD5(){ return "86e773635c4819add378b61523c8827a"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetInterfacesResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t interfaces_length;
      typedef char* _interfaces_type;
      _interfaces_type st_interfaces;
      _interfaces_type * interfaces;

    GetInterfacesResponse():
      interfaces_length(0), interfaces(NULL)
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
      *(outbuffer + offset + 0) = (this->interfaces_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->interfaces_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->interfaces_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->interfaces_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->interfaces_length);
      for( uint32_t i = 0; i < interfaces_length; i++){
      uint32_t length_interfacesi = strlen(this->interfaces[i]);
      varToArr(outbuffer + offset, length_interfacesi);
      offset += 4;
      memcpy(outbuffer + offset, this->interfaces[i], length_interfacesi);
      offset += length_interfacesi;
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
      uint32_t interfaces_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      interfaces_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      interfaces_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      interfaces_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->interfaces_length);
      if(interfaces_lengthT > interfaces_length)
        this->interfaces = (char**)realloc(this->interfaces, interfaces_lengthT * sizeof(char*));
      interfaces_length = interfaces_lengthT;
      for( uint32_t i = 0; i < interfaces_length; i++){
      uint32_t length_st_interfaces;
      arrToVar(length_st_interfaces, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_st_interfaces; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_st_interfaces-1]=0;
      this->st_interfaces = (char *)(inbuffer + offset-1);
      offset += length_st_interfaces;
        memcpy( &(this->interfaces[i]), &(this->st_interfaces), sizeof(char*));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->interfaces_length);
      for( uint32_t i = 0; i < interfaces_length; i++){
      uint32_t length_interfacesi = strlen(this->interfaces[i]);
      length += 4;
      length += length_interfacesi;
      }
      return length;
    }

    const char * getType(){ return GETINTERFACES; }
    const char * getMD5(){ return "6faec341dd1e98d4643f8cbb238daa68"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetInterfaces {
    public:
    typedef GetInterfacesRequest Request;
    typedef GetInterfacesResponse Response;
  };

}
#endif
