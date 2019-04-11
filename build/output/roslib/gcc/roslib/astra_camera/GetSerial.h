#ifndef _ROS_SERVICE_GetSerial_h
#define _ROS_SERVICE_GetSerial_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace astra_camera
{

static const char GETSERIAL[] = "astra_camera/GetSerial";

  class GetSerialRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetSerialRequest()
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

    const char * getType(){ return GETSERIAL; }
    const char * getMD5(){ return "9dcef67c2d5638793a94d61a77b1cd62"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetSerialResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _serial_type;
      _serial_type serial;

    GetSerialResponse():
      serial("")
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
      uint32_t length_serial = strlen(this->serial);
      varToArr(outbuffer + offset, length_serial);
      offset += 4;
      memcpy(outbuffer + offset, this->serial, length_serial);
      offset += length_serial;
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
      uint32_t length_serial;
      arrToVar(length_serial, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_serial; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_serial-1]=0;
      this->serial = (char *)(inbuffer + offset-1);
      offset += length_serial;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_serial = strlen(this->serial);
      length += 4;
      length += length_serial;
      return length;
    }

    const char * getType(){ return GETSERIAL; }
    const char * getMD5(){ return "3291b4ab262098d79e5e163269dacc0e"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetSerial {
    public:
    typedef GetSerialRequest Request;
    typedef GetSerialResponse Response;
  };

}
#endif
