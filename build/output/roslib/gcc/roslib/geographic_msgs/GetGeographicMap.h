#ifndef _ROS_SERVICE_GetGeographicMap_h
#define _ROS_SERVICE_GetGeographicMap_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geographic_msgs/GeographicMap.h"
#include "geographic_msgs/BoundingBox.h"

namespace geographic_msgs
{

static const char GETGEOGRAPHICMAP[] = "geographic_msgs/GetGeographicMap";

  class GetGeographicMapRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _url_type;
      _url_type url;
      typedef geographic_msgs::BoundingBox _bounds_type;
      _bounds_type bounds;

    GetGeographicMapRequest():
      url(""),
      bounds()
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
      uint32_t length_url = strlen(this->url);
      varToArr(outbuffer + offset, length_url);
      offset += 4;
      memcpy(outbuffer + offset, this->url, length_url);
      offset += length_url;
      offset += this->bounds.serialize(outbuffer + offset);
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
      uint32_t length_url;
      arrToVar(length_url, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_url; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_url-1]=0;
      this->url = (char *)(inbuffer + offset-1);
      offset += length_url;
      offset += this->bounds.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_url = strlen(this->url);
      length += 4;
      length += length_url;
      length += this->bounds.serializedLength();
      return length;
    }

    const char * getType(){ return GETGEOGRAPHICMAP; }
    const char * getMD5(){ return "d56b83e41c9f0f0a10bde67b534b01e1"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetGeographicMapResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _success_type;
      _success_type success;
      typedef const char* _status_type;
      _status_type status;
      typedef geographic_msgs::GeographicMap _map_type;
      _map_type map;

    GetGeographicMapResponse():
      success(0),
      status(""),
      map()
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
      union {
        bool real;
        uint8_t base;
      } u_success;
      u_success.real = this->success;
      *(outbuffer + offset + 0) = (u_success.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->success);
      uint32_t length_status = strlen(this->status);
      varToArr(outbuffer + offset, length_status);
      offset += 4;
      memcpy(outbuffer + offset, this->status, length_status);
      offset += length_status;
      offset += this->map.serialize(outbuffer + offset);
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
      union {
        bool real;
        uint8_t base;
      } u_success;
      u_success.base = 0;
      u_success.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->success = u_success.real;
      offset += sizeof(this->success);
      uint32_t length_status;
      arrToVar(length_status, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_status; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_status-1]=0;
      this->status = (char *)(inbuffer + offset-1);
      offset += length_status;
      offset += this->map.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->success);
      uint32_t length_status = strlen(this->status);
      length += 4;
      length += length_status;
      length += this->map.serializedLength();
      return length;
    }

    const char * getType(){ return GETGEOGRAPHICMAP; }
    const char * getMD5(){ return "0bd518b5d84a5f570d982556972ec802"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetGeographicMap {
    public:
    typedef GetGeographicMapRequest Request;
    typedef GetGeographicMapResponse Response;
  };

}
#endif
