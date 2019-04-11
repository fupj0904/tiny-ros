/*
 * File      : time.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef ROS_TIME_H_
#define ROS_TIME_H_

#include "ros/duration.h"
#include <math.h>
#include <stdint.h>

namespace ros
{
void normalizeSecNSec(uint32_t &sec, uint32_t &nsec);
void normalizeSecNSecUnsigned(int64_t& sec, int64_t& nsec);

class Time
{
public:
  uint32_t sec, nsec;

  Time() : sec(0), nsec(0) {}
  Time(uint32_t _sec, uint32_t _nsec) : sec(_sec), nsec(_nsec)
  {
    normalizeSecNSec(sec, nsec);
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

  uint32_t toNsec()
  {
    return (uint32_t)sec * 1000000000ull + (uint32_t)nsec;
  };
  Time& fromNSec(int32_t t);

  Time& operator +=(const Duration &rhs);
  Time& operator -=(const Duration &rhs);

  static Time now();
  static void setNow(Time & new_now);
};

}

#endif
