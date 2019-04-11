#ifndef _ROS_SERVICE_RemoteGatewayInfo_h
#define _ROS_SERVICE_RemoteGatewayInfo_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "gateway_msgs/RemoteGateway.h"

namespace gateway_msgs
{

static const char REMOTEGATEWAYINFO[] = "gateway_msgs/RemoteGatewayInfo";

  class RemoteGatewayInfoRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t gateways_length;
      typedef char* _gateways_type;
      _gateways_type st_gateways;
      _gateways_type * gateways;

    RemoteGatewayInfoRequest():
      gateways_length(0), gateways(NULL)
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
      *(outbuffer + offset + 0) = (this->gateways_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->gateways_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->gateways_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->gateways_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->gateways_length);
      for( uint32_t i = 0; i < gateways_length; i++){
      uint32_t length_gatewaysi = strlen(this->gateways[i]);
      varToArr(outbuffer + offset, length_gatewaysi);
      offset += 4;
      memcpy(outbuffer + offset, this->gateways[i], length_gatewaysi);
      offset += length_gatewaysi;
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
      uint32_t gateways_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->gateways_length);
      if(gateways_lengthT > gateways_length)
        this->gateways = (char**)realloc(this->gateways, gateways_lengthT * sizeof(char*));
      gateways_length = gateways_lengthT;
      for( uint32_t i = 0; i < gateways_length; i++){
      uint32_t length_st_gateways;
      arrToVar(length_st_gateways, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_st_gateways; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_st_gateways-1]=0;
      this->st_gateways = (char *)(inbuffer + offset-1);
      offset += length_st_gateways;
        memcpy( &(this->gateways[i]), &(this->st_gateways), sizeof(char*));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->gateways_length);
      for( uint32_t i = 0; i < gateways_length; i++){
      uint32_t length_gatewaysi = strlen(this->gateways[i]);
      length += 4;
      length += length_gatewaysi;
      }
      return length;
    }

    const char * getType(){ return REMOTEGATEWAYINFO; }
    const char * getMD5(){ return "e4daaae2f80b4b2c9dfce849ea79d49f"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class RemoteGatewayInfoResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t gateways_length;
      typedef gateway_msgs::RemoteGateway _gateways_type;
      _gateways_type st_gateways;
      _gateways_type * gateways;

    RemoteGatewayInfoResponse():
      gateways_length(0), gateways(NULL)
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
      *(outbuffer + offset + 0) = (this->gateways_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->gateways_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->gateways_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->gateways_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->gateways_length);
      for( uint32_t i = 0; i < gateways_length; i++){
      offset += this->gateways[i].serialize(outbuffer + offset);
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
      uint32_t gateways_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      gateways_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->gateways_length);
      if(gateways_lengthT > gateways_length)
        this->gateways = (gateway_msgs::RemoteGateway*)realloc(this->gateways, gateways_lengthT * sizeof(gateway_msgs::RemoteGateway));
      gateways_length = gateways_lengthT;
      for( uint32_t i = 0; i < gateways_length; i++){
      offset += this->st_gateways.deserialize(inbuffer + offset);
        memcpy( &(this->gateways[i]), &(this->st_gateways), sizeof(gateway_msgs::RemoteGateway));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->gateways_length);
      for( uint32_t i = 0; i < gateways_length; i++){
      length += this->gateways[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return REMOTEGATEWAYINFO; }
    const char * getMD5(){ return "e6c0026f98b41412ab013427f3105885"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class RemoteGatewayInfo {
    public:
    typedef RemoteGatewayInfoRequest Request;
    typedef RemoteGatewayInfoResponse Response;
  };

}
#endif
