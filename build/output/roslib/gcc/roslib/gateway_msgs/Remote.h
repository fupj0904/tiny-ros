#ifndef _ROS_SERVICE_Remote_h
#define _ROS_SERVICE_Remote_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "gateway_msgs/RemoteRule.h"

namespace gateway_msgs
{

static const char REMOTE[] = "gateway_msgs/Remote";

  class RemoteRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t remotes_length;
      typedef gateway_msgs::RemoteRule _remotes_type;
      _remotes_type st_remotes;
      _remotes_type * remotes;
      typedef bool _cancel_type;
      _cancel_type cancel;

    RemoteRequest():
      remotes_length(0), remotes(NULL),
      cancel(0)
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
      *(outbuffer + offset + 0) = (this->remotes_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->remotes_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->remotes_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->remotes_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->remotes_length);
      for( uint32_t i = 0; i < remotes_length; i++){
      offset += this->remotes[i].serialize(outbuffer + offset);
      }
      union {
        bool real;
        uint8_t base;
      } u_cancel;
      u_cancel.real = this->cancel;
      *(outbuffer + offset + 0) = (u_cancel.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->cancel);
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
      uint32_t remotes_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      remotes_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      remotes_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      remotes_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->remotes_length);
      if(remotes_lengthT > remotes_length)
        this->remotes = (gateway_msgs::RemoteRule*)realloc(this->remotes, remotes_lengthT * sizeof(gateway_msgs::RemoteRule));
      remotes_length = remotes_lengthT;
      for( uint32_t i = 0; i < remotes_length; i++){
      offset += this->st_remotes.deserialize(inbuffer + offset);
        memcpy( &(this->remotes[i]), &(this->st_remotes), sizeof(gateway_msgs::RemoteRule));
      }
      union {
        bool real;
        uint8_t base;
      } u_cancel;
      u_cancel.base = 0;
      u_cancel.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->cancel = u_cancel.real;
      offset += sizeof(this->cancel);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->remotes_length);
      for( uint32_t i = 0; i < remotes_length; i++){
      length += this->remotes[i].serializedLength();
      }
      length += sizeof(this->cancel);
      return length;
    }

    const char * getType(){ return REMOTE; }
    const char * getMD5(){ return "ce0600de63db6c78eaeee340aac67210"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class RemoteResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef int8_t _result_type;
      _result_type result;
      typedef const char* _error_message_type;
      _error_message_type error_message;

    RemoteResponse():
      result(0),
      error_message("")
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
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->result);
      uint32_t length_error_message = strlen(this->error_message);
      length += 4;
      length += length_error_message;
      return length;
    }

    const char * getType(){ return REMOTE; }
    const char * getMD5(){ return "faef73a7b9feae427bfbde8aa37c2816"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class Remote {
    public:
    typedef RemoteRequest Request;
    typedef RemoteResponse Response;
  };

}
#endif
