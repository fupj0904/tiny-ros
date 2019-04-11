#ifndef _ROS_SERVICE_SetCostmap_h
#define _ROS_SERVICE_SetCostmap_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace navfn
{

static const char SETCOSTMAP[] = "navfn/SetCostmap";

  class SetCostmapRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t costs_length;
      typedef uint8_t _costs_type;
      _costs_type st_costs;
      _costs_type * costs;
      typedef uint16_t _height_type;
      _height_type height;
      typedef uint16_t _width_type;
      _width_type width;

    SetCostmapRequest():
      costs_length(0), costs(NULL),
      height(0),
      width(0)
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
      *(outbuffer + offset + 0) = (this->costs_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->costs_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->costs_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->costs_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->costs_length);
      for( uint32_t i = 0; i < costs_length; i++){
      *(outbuffer + offset + 0) = (this->costs[i] >> (8 * 0)) & 0xFF;
      offset += sizeof(this->costs[i]);
      }
      *(outbuffer + offset + 0) = (this->height >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->height >> (8 * 1)) & 0xFF;
      offset += sizeof(this->height);
      *(outbuffer + offset + 0) = (this->width >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->width >> (8 * 1)) & 0xFF;
      offset += sizeof(this->width);
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
      uint32_t costs_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      costs_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      costs_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      costs_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->costs_length);
      if(costs_lengthT > costs_length)
        this->costs = (uint8_t*)realloc(this->costs, costs_lengthT * sizeof(uint8_t));
      costs_length = costs_lengthT;
      for( uint32_t i = 0; i < costs_length; i++){
      this->st_costs =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->st_costs);
        memcpy( &(this->costs[i]), &(this->st_costs), sizeof(uint8_t));
      }
      this->height =  ((uint16_t) (*(inbuffer + offset)));
      this->height |= ((uint16_t) (*(inbuffer + offset + 1))) << (8 * 1);
      offset += sizeof(this->height);
      this->width =  ((uint16_t) (*(inbuffer + offset)));
      this->width |= ((uint16_t) (*(inbuffer + offset + 1))) << (8 * 1);
      offset += sizeof(this->width);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->costs_length);
      for( uint32_t i = 0; i < costs_length; i++){
      length += sizeof(this->costs[i]);
      }
      length += sizeof(this->height);
      length += sizeof(this->width);
      return length;
    }

    const char * getType(){ return SETCOSTMAP; }
    const char * getMD5(){ return "39ff3735e4e7fa4c9273275c91eb2a1b"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetCostmapResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    SetCostmapResponse()
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

    const char * getType(){ return SETCOSTMAP; }
    const char * getMD5(){ return "d786def3c771d99baaa04d66a86e5eeb"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetCostmap {
    public:
    typedef SetCostmapRequest Request;
    typedef SetCostmapResponse Response;
  };

}
#endif
