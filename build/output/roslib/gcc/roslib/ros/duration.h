/*
 * File      : duration.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef _ROS_DURATION_H_
#define _ROS_DURATION_H_

#include <math.h>
#include <stdint.h>

namespace ros
{

void normalizeSecNSecSigned(int32_t& sec, int32_t& nsec);

class Duration
{
public:
  int32_t sec, nsec;

  Duration() : sec(0), nsec(0) {}
  Duration(int32_t _sec, int32_t _nsec) : sec(_sec), nsec(_nsec)
  {
    normalizeSecNSecSigned(sec, nsec);
  }

  double toSec() const
  {
    return (double)sec + 1e-9 * (double)nsec;
  };
  void fromSec(double t)
  {
    sec = (uint32_t) floor(t);
    nsec = (uint32_t) round((t - sec) * 1e9);
  };

  Duration& operator+=(const Duration &rhs);
  Duration& operator-=(const Duration &rhs);
  Duration& operator*=(double scale);
};

}

#endif

