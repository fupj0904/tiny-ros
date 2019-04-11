/*
 * File      : duration.cpp
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#include <math.h>
#include "ros/duration.h"

namespace ros
{
void normalizeSecNSecSigned(int32_t &sec, int32_t &nsec)
{
  int32_t nsec_part = nsec;
  int32_t sec_part = sec;

  while (nsec_part > 1000000000L)
  {
    nsec_part -= 1000000000L;
    ++sec_part;
  }
  while (nsec_part < 0)
  {
    nsec_part += 1000000000L;
    --sec_part;
  }
  sec = sec_part;
  nsec = nsec_part;
}

Duration& Duration::operator+=(const Duration &rhs)
{
  sec += rhs.sec;
  nsec += rhs.nsec;
  normalizeSecNSecSigned(sec, nsec);
  return *this;
}

Duration& Duration::operator-=(const Duration &rhs)
{
  sec += -rhs.sec;
  nsec += -rhs.nsec;
  normalizeSecNSecSigned(sec, nsec);
  return *this;
}

Duration& Duration::operator*=(double scale)
{
  sec *= scale;
  nsec *= scale;
  normalizeSecNSecSigned(sec, nsec);
  return *this;
}

}
