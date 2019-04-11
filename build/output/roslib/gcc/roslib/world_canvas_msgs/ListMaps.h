#ifndef _ROS_SERVICE_ListMaps_h
#define _ROS_SERVICE_ListMaps_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "world_canvas_msgs/MapListEntry.h"

namespace world_canvas_msgs
{

static const char LISTMAPS[] = "world_canvas_msgs/ListMaps";

  class ListMapsRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    ListMapsRequest()
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

    const char * getType(){ return LISTMAPS; }
    const char * getMD5(){ return "e76f19757b2ebbf84fa8318d251e0d74"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class ListMapsResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t map_list_length;
      typedef world_canvas_msgs::MapListEntry _map_list_type;
      _map_list_type st_map_list;
      _map_list_type * map_list;

    ListMapsResponse():
      map_list_length(0), map_list(NULL)
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
      *(outbuffer + offset + 0) = (this->map_list_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->map_list_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->map_list_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->map_list_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->map_list_length);
      for( uint32_t i = 0; i < map_list_length; i++){
      offset += this->map_list[i].serialize(outbuffer + offset);
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
      uint32_t map_list_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      map_list_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      map_list_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      map_list_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->map_list_length);
      if(map_list_lengthT > map_list_length)
        this->map_list = (world_canvas_msgs::MapListEntry*)realloc(this->map_list, map_list_lengthT * sizeof(world_canvas_msgs::MapListEntry));
      map_list_length = map_list_lengthT;
      for( uint32_t i = 0; i < map_list_length; i++){
      offset += this->st_map_list.deserialize(inbuffer + offset);
        memcpy( &(this->map_list[i]), &(this->st_map_list), sizeof(world_canvas_msgs::MapListEntry));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->map_list_length);
      for( uint32_t i = 0; i < map_list_length; i++){
      length += this->map_list[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return LISTMAPS; }
    const char * getMD5(){ return "cce99290d11458f8f31f7951dd59bb36"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class ListMaps {
    public:
    typedef ListMapsRequest Request;
    typedef ListMapsResponse Response;
  };

}
#endif
