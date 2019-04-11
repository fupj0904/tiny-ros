#ifndef _ROS_SERVICE_GetLoggers_h
#define _ROS_SERVICE_GetLoggers_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "roscpp/Logger.h"

namespace roscpp
{

static const char GETLOGGERS[] = "roscpp/GetLoggers";

  class GetLoggersRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    GetLoggersRequest()
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

    const char * getType(){ return GETLOGGERS; }
    const char * getMD5(){ return "cc3909277965dc7cfae3caa388ee57e5"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetLoggersResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t loggers_length;
      typedef roscpp::Logger _loggers_type;
      _loggers_type st_loggers;
      _loggers_type * loggers;

    GetLoggersResponse():
      loggers_length(0), loggers(NULL)
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
      *(outbuffer + offset + 0) = (this->loggers_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->loggers_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->loggers_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->loggers_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->loggers_length);
      for( uint32_t i = 0; i < loggers_length; i++){
      offset += this->loggers[i].serialize(outbuffer + offset);
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
      uint32_t loggers_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      loggers_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      loggers_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      loggers_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->loggers_length);
      if(loggers_lengthT > loggers_length)
        this->loggers = (roscpp::Logger*)realloc(this->loggers, loggers_lengthT * sizeof(roscpp::Logger));
      loggers_length = loggers_lengthT;
      for( uint32_t i = 0; i < loggers_length; i++){
      offset += this->st_loggers.deserialize(inbuffer + offset);
        memcpy( &(this->loggers[i]), &(this->st_loggers), sizeof(roscpp::Logger));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->loggers_length);
      for( uint32_t i = 0; i < loggers_length; i++){
      length += this->loggers[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return GETLOGGERS; }
    const char * getMD5(){ return "a56828a6a3aaa9dc84dd6e50a3dc55a4"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetLoggers {
    public:
    typedef GetLoggersRequest Request;
    typedef GetLoggersResponse Response;
  };

}
#endif
