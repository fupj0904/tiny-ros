#ifndef _ROS_SERVICE_SetDigitalOutputs_h
#define _ROS_SERVICE_SetDigitalOutputs_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace create_node
{

static const char SETDIGITALOUTPUTS[] = "create_node/SetDigitalOutputs";

  class SetDigitalOutputsRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef uint8_t _digital_out_0_type;
      _digital_out_0_type digital_out_0;
      typedef uint8_t _digital_out_1_type;
      _digital_out_1_type digital_out_1;
      typedef uint8_t _digital_out_2_type;
      _digital_out_2_type digital_out_2;

    SetDigitalOutputsRequest():
      digital_out_0(0),
      digital_out_1(0),
      digital_out_2(0)
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
      *(outbuffer + offset + 0) = (this->digital_out_0 >> (8 * 0)) & 0xFF;
      offset += sizeof(this->digital_out_0);
      *(outbuffer + offset + 0) = (this->digital_out_1 >> (8 * 0)) & 0xFF;
      offset += sizeof(this->digital_out_1);
      *(outbuffer + offset + 0) = (this->digital_out_2 >> (8 * 0)) & 0xFF;
      offset += sizeof(this->digital_out_2);
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
      this->digital_out_0 =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->digital_out_0);
      this->digital_out_1 =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->digital_out_1);
      this->digital_out_2 =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->digital_out_2);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->digital_out_0);
      length += sizeof(this->digital_out_1);
      length += sizeof(this->digital_out_2);
      return length;
    }

    const char * getType(){ return SETDIGITALOUTPUTS; }
    const char * getMD5(){ return "15a735377e30b705965b2a71089c452e"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetDigitalOutputsResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _done_type;
      _done_type done;

    SetDigitalOutputsResponse():
      done(0)
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
      } u_done;
      u_done.real = this->done;
      *(outbuffer + offset + 0) = (u_done.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->done);
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
      } u_done;
      u_done.base = 0;
      u_done.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->done = u_done.real;
      offset += sizeof(this->done);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->done);
      return length;
    }

    const char * getType(){ return SETDIGITALOUTPUTS; }
    const char * getMD5(){ return "069461b67d5e2e507b7ee9b7d98892d8"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetDigitalOutputs {
    public:
    typedef SetDigitalOutputsRequest Request;
    typedef SetDigitalOutputsResponse Response;
  };

}
#endif
