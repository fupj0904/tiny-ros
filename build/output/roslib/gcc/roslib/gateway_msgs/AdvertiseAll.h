#ifndef _ROS_SERVICE_AdvertiseAll_h
#define _ROS_SERVICE_AdvertiseAll_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "gateway_msgs/Rule.h"

namespace gateway_msgs
{

static const char ADVERTISEALL[] = "gateway_msgs/AdvertiseAll";

  class AdvertiseAllRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _cancel_type;
      _cancel_type cancel;
      uint32_t blacklist_length;
      typedef gateway_msgs::Rule _blacklist_type;
      _blacklist_type st_blacklist;
      _blacklist_type * blacklist;

    AdvertiseAllRequest():
      cancel(0),
      blacklist_length(0), blacklist(NULL)
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
      } u_cancel;
      u_cancel.real = this->cancel;
      *(outbuffer + offset + 0) = (u_cancel.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->cancel);
      *(outbuffer + offset + 0) = (this->blacklist_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->blacklist_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->blacklist_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->blacklist_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->blacklist_length);
      for( uint32_t i = 0; i < blacklist_length; i++){
      offset += this->blacklist[i].serialize(outbuffer + offset);
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
      union {
        bool real;
        uint8_t base;
      } u_cancel;
      u_cancel.base = 0;
      u_cancel.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->cancel = u_cancel.real;
      offset += sizeof(this->cancel);
      uint32_t blacklist_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->blacklist_length);
      if(blacklist_lengthT > blacklist_length)
        this->blacklist = (gateway_msgs::Rule*)realloc(this->blacklist, blacklist_lengthT * sizeof(gateway_msgs::Rule));
      blacklist_length = blacklist_lengthT;
      for( uint32_t i = 0; i < blacklist_length; i++){
      offset += this->st_blacklist.deserialize(inbuffer + offset);
        memcpy( &(this->blacklist[i]), &(this->st_blacklist), sizeof(gateway_msgs::Rule));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->cancel);
      length += sizeof(this->blacklist_length);
      for( uint32_t i = 0; i < blacklist_length; i++){
      length += this->blacklist[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return ADVERTISEALL; }
    const char * getMD5(){ return "a782c6eba716aa1e2b5d6d7fcb6b7918"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class AdvertiseAllResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef int8_t _result_type;
      _result_type result;
      typedef const char* _error_message_type;
      _error_message_type error_message;
      uint32_t blacklist_length;
      typedef gateway_msgs::Rule _blacklist_type;
      _blacklist_type st_blacklist;
      _blacklist_type * blacklist;

    AdvertiseAllResponse():
      result(0),
      error_message(""),
      blacklist_length(0), blacklist(NULL)
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
        int8_t real;
        uint8_t base;
      } u_result;
      u_result.real = this->result;
      *(outbuffer + offset + 0) = (u_result.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->result);
      uint32_t length_error_message = strlen(this->error_message);
      varToArr(outbuffer + offset, length_error_message);
      offset += 4;
      memcpy(outbuffer + offset, this->error_message, length_error_message);
      offset += length_error_message;
      *(outbuffer + offset + 0) = (this->blacklist_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->blacklist_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->blacklist_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->blacklist_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->blacklist_length);
      for( uint32_t i = 0; i < blacklist_length; i++){
      offset += this->blacklist[i].serialize(outbuffer + offset);
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
      union {
        int8_t real;
        uint8_t base;
      } u_result;
      u_result.base = 0;
      u_result.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->result = u_result.real;
      offset += sizeof(this->result);
      uint32_t length_error_message;
      arrToVar(length_error_message, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_error_message; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_error_message-1]=0;
      this->error_message = (char *)(inbuffer + offset-1);
      offset += length_error_message;
      uint32_t blacklist_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      blacklist_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->blacklist_length);
      if(blacklist_lengthT > blacklist_length)
        this->blacklist = (gateway_msgs::Rule*)realloc(this->blacklist, blacklist_lengthT * sizeof(gateway_msgs::Rule));
      blacklist_length = blacklist_lengthT;
      for( uint32_t i = 0; i < blacklist_length; i++){
      offset += this->st_blacklist.deserialize(inbuffer + offset);
        memcpy( &(this->blacklist[i]), &(this->st_blacklist), sizeof(gateway_msgs::Rule));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->result);
      uint32_t length_error_message = strlen(this->error_message);
      length += 4;
      length += length_error_message;
      length += sizeof(this->blacklist_length);
      for( uint32_t i = 0; i < blacklist_length; i++){
      length += this->blacklist[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return ADVERTISEALL; }
    const char * getMD5(){ return "25f848d762a7c20636a68b55454834cb"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class AdvertiseAll {
    public:
    typedef AdvertiseAllRequest Request;
    typedef AdvertiseAllResponse Response;
  };

}
#endif
