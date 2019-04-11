#ifndef _ROS_SERVICE_GetPointMapROI_h
#define _ROS_SERVICE_GetPointMapROI_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "sensor_msgs/PointCloud2.h"

namespace map_msgs
{

static const char GETPOINTMAPROI[] = "map_msgs/GetPointMapROI";

  class GetPointMapROIRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef double _x_type;
      _x_type x;
      typedef double _y_type;
      _y_type y;
      typedef double _z_type;
      _z_type z;
      typedef double _r_type;
      _r_type r;
      typedef double _l_x_type;
      _l_x_type l_x;
      typedef double _l_y_type;
      _l_y_type l_y;
      typedef double _l_z_type;
      _l_z_type l_z;

    GetPointMapROIRequest():
      x(0),
      y(0),
      z(0),
      r(0),
      l_x(0),
      l_y(0),
      l_z(0)
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
        double real;
        uint64_t base;
      } u_x;
      u_x.real = this->x;
      *(outbuffer + offset + 0) = (u_x.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_x.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_x.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_x.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_x.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_x.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_x.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_x.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->x);
      union {
        double real;
        uint64_t base;
      } u_y;
      u_y.real = this->y;
      *(outbuffer + offset + 0) = (u_y.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_y.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_y.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_y.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_y.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_y.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_y.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_y.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->y);
      union {
        double real;
        uint64_t base;
      } u_z;
      u_z.real = this->z;
      *(outbuffer + offset + 0) = (u_z.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_z.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_z.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_z.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_z.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_z.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_z.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_z.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->z);
      union {
        double real;
        uint64_t base;
      } u_r;
      u_r.real = this->r;
      *(outbuffer + offset + 0) = (u_r.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_r.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_r.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_r.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_r.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_r.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_r.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_r.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->r);
      union {
        double real;
        uint64_t base;
      } u_l_x;
      u_l_x.real = this->l_x;
      *(outbuffer + offset + 0) = (u_l_x.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_l_x.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_l_x.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_l_x.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_l_x.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_l_x.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_l_x.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_l_x.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->l_x);
      union {
        double real;
        uint64_t base;
      } u_l_y;
      u_l_y.real = this->l_y;
      *(outbuffer + offset + 0) = (u_l_y.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_l_y.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_l_y.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_l_y.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_l_y.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_l_y.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_l_y.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_l_y.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->l_y);
      union {
        double real;
        uint64_t base;
      } u_l_z;
      u_l_z.real = this->l_z;
      *(outbuffer + offset + 0) = (u_l_z.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_l_z.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_l_z.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_l_z.base >> (8 * 3)) & 0xFF;
      *(outbuffer + offset + 4) = (u_l_z.base >> (8 * 4)) & 0xFF;
      *(outbuffer + offset + 5) = (u_l_z.base >> (8 * 5)) & 0xFF;
      *(outbuffer + offset + 6) = (u_l_z.base >> (8 * 6)) & 0xFF;
      *(outbuffer + offset + 7) = (u_l_z.base >> (8 * 7)) & 0xFF;
      offset += sizeof(this->l_z);
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
        double real;
        uint64_t base;
      } u_x;
      u_x.base = 0;
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_x.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->x = u_x.real;
      offset += sizeof(this->x);
      union {
        double real;
        uint64_t base;
      } u_y;
      u_y.base = 0;
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_y.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->y = u_y.real;
      offset += sizeof(this->y);
      union {
        double real;
        uint64_t base;
      } u_z;
      u_z.base = 0;
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_z.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->z = u_z.real;
      offset += sizeof(this->z);
      union {
        double real;
        uint64_t base;
      } u_r;
      u_r.base = 0;
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_r.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->r = u_r.real;
      offset += sizeof(this->r);
      union {
        double real;
        uint64_t base;
      } u_l_x;
      u_l_x.base = 0;
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_l_x.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->l_x = u_l_x.real;
      offset += sizeof(this->l_x);
      union {
        double real;
        uint64_t base;
      } u_l_y;
      u_l_y.base = 0;
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_l_y.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->l_y = u_l_y.real;
      offset += sizeof(this->l_y);
      union {
        double real;
        uint64_t base;
      } u_l_z;
      u_l_z.base = 0;
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 3))) << (8 * 3);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 4))) << (8 * 4);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 5))) << (8 * 5);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 6))) << (8 * 6);
      u_l_z.base |= ((uint64_t) (*(inbuffer + offset + 7))) << (8 * 7);
      this->l_z = u_l_z.real;
      offset += sizeof(this->l_z);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->x);
      length += sizeof(this->y);
      length += sizeof(this->z);
      length += sizeof(this->r);
      length += sizeof(this->l_x);
      length += sizeof(this->l_y);
      length += sizeof(this->l_z);
      return length;
    }

    const char * getType(){ return GETPOINTMAPROI; }
    const char * getMD5(){ return "c338f5616930e00a72c38486f77e9810"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetPointMapROIResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef sensor_msgs::PointCloud2 _sub_map_type;
      _sub_map_type sub_map;

    GetPointMapROIResponse():
      sub_map()
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
      offset += this->sub_map.serialize(outbuffer + offset);
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
      offset += this->sub_map.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->sub_map.serializedLength();
      return length;
    }

    const char * getType(){ return GETPOINTMAPROI; }
    const char * getMD5(){ return "de10fb68f23987142a0ffbdb59b6e079"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetPointMapROI {
    public:
    typedef GetPointMapROIRequest Request;
    typedef GetPointMapROIResponse Response;
  };

}
#endif
