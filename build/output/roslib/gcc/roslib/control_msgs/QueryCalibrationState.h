#ifndef _ROS_SERVICE_QueryCalibrationState_h
#define _ROS_SERVICE_QueryCalibrationState_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace control_msgs
{

static const char QUERYCALIBRATIONSTATE[] = "control_msgs/QueryCalibrationState";

  class QueryCalibrationStateRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    QueryCalibrationStateRequest()
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

    const char * getType(){ return QUERYCALIBRATIONSTATE; }
    const char * getMD5(){ return "56272c891f82a60028bdd655c685575f"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class QueryCalibrationStateResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _is_calibrated_type;
      _is_calibrated_type is_calibrated;

    QueryCalibrationStateResponse():
      is_calibrated(0)
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
      } u_is_calibrated;
      u_is_calibrated.real = this->is_calibrated;
      *(outbuffer + offset + 0) = (u_is_calibrated.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->is_calibrated);
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
      } u_is_calibrated;
      u_is_calibrated.base = 0;
      u_is_calibrated.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->is_calibrated = u_is_calibrated.real;
      offset += sizeof(this->is_calibrated);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->is_calibrated);
      return length;
    }

    const char * getType(){ return QUERYCALIBRATIONSTATE; }
    const char * getMD5(){ return "186e65eb149cc5c8cfc21667e92aaf43"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class QueryCalibrationState {
    public:
    typedef QueryCalibrationStateRequest Request;
    typedef QueryCalibrationStateResponse Response;
  };

}
#endif
