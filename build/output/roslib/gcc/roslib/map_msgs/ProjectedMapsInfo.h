#ifndef _ROS_SERVICE_ProjectedMapsInfo_h
#define _ROS_SERVICE_ProjectedMapsInfo_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "map_msgs/ProjectedMapInfo.h"

namespace map_msgs
{

static const char PROJECTEDMAPSINFO[] = "map_msgs/ProjectedMapsInfo";

  class ProjectedMapsInfoRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t projected_maps_info_length;
      typedef map_msgs::ProjectedMapInfo _projected_maps_info_type;
      _projected_maps_info_type st_projected_maps_info;
      _projected_maps_info_type * projected_maps_info;

    ProjectedMapsInfoRequest():
      projected_maps_info_length(0), projected_maps_info(NULL)
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
      *(outbuffer + offset + 0) = (this->projected_maps_info_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->projected_maps_info_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->projected_maps_info_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->projected_maps_info_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->projected_maps_info_length);
      for( uint32_t i = 0; i < projected_maps_info_length; i++){
      offset += this->projected_maps_info[i].serialize(outbuffer + offset);
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
      uint32_t projected_maps_info_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      projected_maps_info_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      projected_maps_info_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      projected_maps_info_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->projected_maps_info_length);
      if(projected_maps_info_lengthT > projected_maps_info_length)
        this->projected_maps_info = (map_msgs::ProjectedMapInfo*)realloc(this->projected_maps_info, projected_maps_info_lengthT * sizeof(map_msgs::ProjectedMapInfo));
      projected_maps_info_length = projected_maps_info_lengthT;
      for( uint32_t i = 0; i < projected_maps_info_length; i++){
      offset += this->st_projected_maps_info.deserialize(inbuffer + offset);
        memcpy( &(this->projected_maps_info[i]), &(this->st_projected_maps_info), sizeof(map_msgs::ProjectedMapInfo));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->projected_maps_info_length);
      for( uint32_t i = 0; i < projected_maps_info_length; i++){
      length += this->projected_maps_info[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return PROJECTEDMAPSINFO; }
    const char * getMD5(){ return "59778fc7286f314a408be52b4611a8b4"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class ProjectedMapsInfoResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    ProjectedMapsInfoResponse()
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

    const char * getType(){ return PROJECTEDMAPSINFO; }
    const char * getMD5(){ return "223a7c48f052c5181dd525823dcc67fc"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class ProjectedMapsInfo {
    public:
    typedef ProjectedMapsInfoRequest Request;
    typedef ProjectedMapsInfoResponse Response;
  };

}
#endif
