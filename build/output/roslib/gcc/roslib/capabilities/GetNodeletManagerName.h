#ifndef _ROS_SERVICE_GetNodeletManagerName_h
#define _ROS_SERVICE_GetNodeletManagerName_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace capabilities
{

static const char GETNODELETMANAGERNAME[] = "capabilities/GetNodeletManagerName";

  class GetNodeletManagerNameRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetNodeletManagerNameRequest()
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

    const char * getType(){ return GETNODELETMANAGERNAME; }
    const char * getMD5(){ return "317fdbbe1436624965701bb6948b1b14"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetNodeletManagerNameResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _nodelet_manager_name_type;
      _nodelet_manager_name_type nodelet_manager_name;

    GetNodeletManagerNameResponse():
      nodelet_manager_name("")
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
      uint32_t length_nodelet_manager_name = strlen(this->nodelet_manager_name);
      varToArr(outbuffer + offset, length_nodelet_manager_name);
      offset += 4;
      memcpy(outbuffer + offset, this->nodelet_manager_name, length_nodelet_manager_name);
      offset += length_nodelet_manager_name;
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
      uint32_t length_nodelet_manager_name;
      arrToVar(length_nodelet_manager_name, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_nodelet_manager_name; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_nodelet_manager_name-1]=0;
      this->nodelet_manager_name = (char *)(inbuffer + offset-1);
      offset += length_nodelet_manager_name;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_nodelet_manager_name = strlen(this->nodelet_manager_name);
      length += 4;
      length += length_nodelet_manager_name;
      return length;
    }

    const char * getType(){ return GETNODELETMANAGERNAME; }
    const char * getMD5(){ return "2725db78e3dc9e920e47884af42f59e3"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetNodeletManagerName {
    public:
    typedef GetNodeletManagerNameRequest Request;
    typedef GetNodeletManagerNameResponse Response;
  };

}
#endif
