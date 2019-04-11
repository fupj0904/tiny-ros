#ifndef _ROS_SERVICE_GetRoutePlan_h
#define _ROS_SERVICE_GetRoutePlan_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geographic_msgs/RoutePath.h"
#include "uuid_msgs/UniqueID.h"

namespace geographic_msgs
{

static const char GETROUTEPLAN[] = "geographic_msgs/GetRoutePlan";

  class GetRoutePlanRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef uuid_msgs::UniqueID _network_type;
      _network_type network;
      typedef uuid_msgs::UniqueID _start_type;
      _start_type start;
      typedef uuid_msgs::UniqueID _goal_type;
      _goal_type goal;

    GetRoutePlanRequest():
      network(),
      start(),
      goal()
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
      offset += this->network.serialize(outbuffer + offset);
      offset += this->start.serialize(outbuffer + offset);
      offset += this->goal.serialize(outbuffer + offset);
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
      offset += this->network.deserialize(inbuffer + offset);
      offset += this->start.deserialize(inbuffer + offset);
      offset += this->goal.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->network.serializedLength();
      length += this->start.serializedLength();
      length += this->goal.serializedLength();
      return length;
    }

    const char * getType(){ return GETROUTEPLAN; }
    const char * getMD5(){ return "ba158f79f4ed4771e50143e56ff78905"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRoutePlanResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _success_type;
      _success_type success;
      typedef const char* _status_type;
      _status_type status;
      typedef geographic_msgs::RoutePath _plan_type;
      _plan_type plan;

    GetRoutePlanResponse():
      success(0),
      status(""),
      plan()
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
      offset += this->plan.serialize(outbuffer + offset);
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
      offset += this->plan.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->success);
      uint32_t length_status = strlen(this->status);
      length += 4;
      length += length_status;
      length += this->plan.serializedLength();
      return length;
    }

    const char * getType(){ return GETROUTEPLAN; }
    const char * getMD5(){ return "45192ffe523f10c7dd1e09de81d58b69"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRoutePlan {
    public:
    typedef GetRoutePlanRequest Request;
    typedef GetRoutePlanResponse Response;
  };

}
#endif
