#ifndef _ROS_tinyros_hello_TinyrosHello_h
#define _ROS_tinyros_hello_TinyrosHello_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace tinyros_hello
{

  class TinyrosHello : public ros::Msg
  {
    public:
      typedef const char* _hello_type;
      _hello_type hello;

    TinyrosHello():
      hello("")
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      uint32_t length_hello = strlen(this->hello);
      varToArr(outbuffer + offset, length_hello);
      offset += 4;
      memcpy(outbuffer + offset, this->hello, length_hello);
      offset += length_hello;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      uint32_t length_hello;
      arrToVar(length_hello, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_hello; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_hello-1]=0;
      this->hello = (char *)(inbuffer + offset-1);
      offset += length_hello;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_hello = strlen(this->hello);
      length += 4;
      length += length_hello;
      return length;
    }

    const char * getType(){ return "tinyros_hello/TinyrosHello"; }
    const char * getMD5(){ return "0c68e66a217802ad0c9f648b7a69d090"; }

  };

}
#endif