#ifndef _ROS_SERVICE_PublishMap_h
#define _ROS_SERVICE_PublishMap_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace world_canvas_msgs
{

static const char PUBLISHMAP[] = "world_canvas_msgs/PublishMap";

  class PublishMapRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _map_id_type;
      _map_id_type map_id;

    PublishMapRequest():
      map_id("")
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
      uint32_t length_map_id = strlen(this->map_id);
      varToArr(outbuffer + offset, length_map_id);
      offset += 4;
      memcpy(outbuffer + offset, this->map_id, length_map_id);
      offset += length_map_id;
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
      uint32_t length_map_id;
      arrToVar(length_map_id, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_map_id; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_map_id-1]=0;
      this->map_id = (char *)(inbuffer + offset-1);
      offset += length_map_id;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_map_id = strlen(this->map_id);
      length += 4;
      length += length_map_id;
      return length;
    }

    const char * getType(){ return PUBLISHMAP; }
    const char * getMD5(){ return "2d2a24d2e4cb903547c919bb44ec9ad9"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class PublishMapResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    PublishMapResponse()
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

    const char * getType(){ return PUBLISHMAP; }
    const char * getMD5(){ return "ff47e2a63afa5fad46fea0e718a94cfa"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class PublishMap {
    public:
    typedef PublishMapRequest Request;
    typedef PublishMapResponse Response;
  };

}
#endif
