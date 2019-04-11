#ifndef _ROS_SERVICE_LoadMap_h
#define _ROS_SERVICE_LoadMap_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace stdr_msgs
{

static const char LOADMAP[] = "stdr_msgs/LoadMap";

  class LoadMapRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _mapFile_type;
      _mapFile_type mapFile;

    LoadMapRequest():
      mapFile("")
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
      uint32_t length_mapFile = strlen(this->mapFile);
      varToArr(outbuffer + offset, length_mapFile);
      offset += 4;
      memcpy(outbuffer + offset, this->mapFile, length_mapFile);
      offset += length_mapFile;
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
      uint32_t length_mapFile;
      arrToVar(length_mapFile, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_mapFile; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_mapFile-1]=0;
      this->mapFile = (char *)(inbuffer + offset-1);
      offset += length_mapFile;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_mapFile = strlen(this->mapFile);
      length += 4;
      length += length_mapFile;
      return length;
    }

    const char * getType(){ return LOADMAP; }
    const char * getMD5(){ return "a5f9de3266e2c12f213ab607cd227bf4"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class LoadMapResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    LoadMapResponse()
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

    const char * getType(){ return LOADMAP; }
    const char * getMD5(){ return "45c8e797fe50282d12c2547dbfab9af3"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class LoadMap {
    public:
    typedef LoadMapRequest Request;
    typedef LoadMapResponse Response;
  };

}
#endif
