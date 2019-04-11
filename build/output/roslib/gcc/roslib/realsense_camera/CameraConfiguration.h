#ifndef _ROS_SERVICE_CameraConfiguration_h
#define _ROS_SERVICE_CameraConfiguration_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace realsense_camera
{

static const char CAMERACONFIGURATION[] = "realsense_camera/CameraConfiguration";

  class CameraConfigurationRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    CameraConfigurationRequest()
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

    const char * getType(){ return CAMERACONFIGURATION; }
    const char * getMD5(){ return "28471fe1557925ee1d31a917d071e2a6"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class CameraConfigurationResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _configuration_str_type;
      _configuration_str_type configuration_str;

    CameraConfigurationResponse():
      configuration_str("")
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
      uint32_t length_configuration_str = strlen(this->configuration_str);
      varToArr(outbuffer + offset, length_configuration_str);
      offset += 4;
      memcpy(outbuffer + offset, this->configuration_str, length_configuration_str);
      offset += length_configuration_str;
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
      uint32_t length_configuration_str;
      arrToVar(length_configuration_str, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_configuration_str; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_configuration_str-1]=0;
      this->configuration_str = (char *)(inbuffer + offset-1);
      offset += length_configuration_str;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_configuration_str = strlen(this->configuration_str);
      length += 4;
      length += length_configuration_str;
      return length;
    }

    const char * getType(){ return CAMERACONFIGURATION; }
    const char * getMD5(){ return "400dcbea991e5cafc404dbc95076e623"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class CameraConfiguration {
    public:
    typedef CameraConfigurationRequest Request;
    typedef CameraConfigurationResponse Response;
  };

}
#endif
