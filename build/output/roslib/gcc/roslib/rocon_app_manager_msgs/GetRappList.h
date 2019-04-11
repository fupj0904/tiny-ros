#ifndef _ROS_SERVICE_GetRappList_h
#define _ROS_SERVICE_GetRappList_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "rocon_app_manager_msgs/Rapp.h"

namespace rocon_app_manager_msgs
{

static const char GETRAPPLIST[] = "rocon_app_manager_msgs/GetRappList";

  class GetRappListRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetRappListRequest()
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

    const char * getType(){ return GETRAPPLIST; }
    const char * getMD5(){ return "9933e8dcf74be74cd59e6c847f225e5a"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRappListResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t available_rapps_length;
      typedef rocon_app_manager_msgs::Rapp _available_rapps_type;
      _available_rapps_type st_available_rapps;
      _available_rapps_type * available_rapps;
      uint32_t running_rapps_length;
      typedef rocon_app_manager_msgs::Rapp _running_rapps_type;
      _running_rapps_type st_running_rapps;
      _running_rapps_type * running_rapps;

    GetRappListResponse():
      available_rapps_length(0), available_rapps(NULL),
      running_rapps_length(0), running_rapps(NULL)
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
      *(outbuffer + offset + 0) = (this->available_rapps_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->available_rapps_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->available_rapps_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->available_rapps_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->available_rapps_length);
      for( uint32_t i = 0; i < available_rapps_length; i++){
      offset += this->available_rapps[i].serialize(outbuffer + offset);
      }
      *(outbuffer + offset + 0) = (this->running_rapps_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->running_rapps_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->running_rapps_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->running_rapps_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->running_rapps_length);
      for( uint32_t i = 0; i < running_rapps_length; i++){
      offset += this->running_rapps[i].serialize(outbuffer + offset);
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
      uint32_t available_rapps_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      available_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      available_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      available_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->available_rapps_length);
      if(available_rapps_lengthT > available_rapps_length)
        this->available_rapps = (rocon_app_manager_msgs::Rapp*)realloc(this->available_rapps, available_rapps_lengthT * sizeof(rocon_app_manager_msgs::Rapp));
      available_rapps_length = available_rapps_lengthT;
      for( uint32_t i = 0; i < available_rapps_length; i++){
      offset += this->st_available_rapps.deserialize(inbuffer + offset);
        memcpy( &(this->available_rapps[i]), &(this->st_available_rapps), sizeof(rocon_app_manager_msgs::Rapp));
      }
      uint32_t running_rapps_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      running_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      running_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      running_rapps_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->running_rapps_length);
      if(running_rapps_lengthT > running_rapps_length)
        this->running_rapps = (rocon_app_manager_msgs::Rapp*)realloc(this->running_rapps, running_rapps_lengthT * sizeof(rocon_app_manager_msgs::Rapp));
      running_rapps_length = running_rapps_lengthT;
      for( uint32_t i = 0; i < running_rapps_length; i++){
      offset += this->st_running_rapps.deserialize(inbuffer + offset);
        memcpy( &(this->running_rapps[i]), &(this->st_running_rapps), sizeof(rocon_app_manager_msgs::Rapp));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->available_rapps_length);
      for( uint32_t i = 0; i < available_rapps_length; i++){
      length += this->available_rapps[i].serializedLength();
      }
      length += sizeof(this->running_rapps_length);
      for( uint32_t i = 0; i < running_rapps_length; i++){
      length += this->running_rapps[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return GETRAPPLIST; }
    const char * getMD5(){ return "208979676739fe1dc4af34e2caaaec6b"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRappList {
    public:
    typedef GetRappListRequest Request;
    typedef GetRappListResponse Response;
  };

}
#endif
