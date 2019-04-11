#ifndef _ROS_SERVICE_TwoInts_h
#define _ROS_SERVICE_TwoInts_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace roscpp_tutorials
{

static const char TWOINTS[] = "roscpp_tutorials/TwoInts";

  class TwoIntsRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef int64_t _a_type;
      _a_type a;
      typedef int64_t _b_type;
      _b_type b;

    TwoIntsRequest():
      a(0),
      b(0)
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
        int64_t real;
        uint64_t base;
      } u_a;
      u_a.real = this->a;
      *(outbuffer + offset + 0) = (u_a.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_a.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_a.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_a.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_a.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_a.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_a.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_a.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->a);
      union {
        int64_t real;
        uint64_t base;
      } u_b;
      u_b.real = this->b;
      *(outbuffer + offset + 0) = (u_b.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_b.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_b.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_b.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_b.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_b.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_b.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_b.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->b);
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
        int64_t real;
        uint64_t base;
      } u_a;
      u_a.base = 0;
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_a.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->a = u_a.real;
      offset += sizeof(this->a);
      union {
        int64_t real;
        uint64_t base;
      } u_b;
      u_b.base = 0;
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_b.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->b = u_b.real;
      offset += sizeof(this->b);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->a);
      length += sizeof(this->b);
      return length;
    }

    const char * getType(){ return TWOINTS; }
    const char * getMD5(){ return "8bca2279c052ef9bacfbac1effd1d627"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class TwoIntsResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef int64_t _sum_type;
      _sum_type sum;

    TwoIntsResponse():
      sum(0)
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
        int64_t real;
        uint64_t base;
      } u_sum;
      u_sum.real = this->sum;
      *(outbuffer + offset + 0) = (u_sum.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_sum.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_sum.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_sum.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_sum.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_sum.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_sum.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_sum.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->sum);
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
        int64_t real;
        uint64_t base;
      } u_sum;
      u_sum.base = 0;
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_sum.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->sum = u_sum.real;
      offset += sizeof(this->sum);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->sum);
      return length;
    }

    const char * getType(){ return TWOINTS; }
    const char * getMD5(){ return "6ef3ddbd4d26e86f516bae0f0aa3f9ca"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class TwoInts {
    public:
    typedef TwoIntsRequest Request;
    typedef TwoIntsResponse Response;
  };

}
#endif
