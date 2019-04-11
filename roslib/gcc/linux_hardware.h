/*
 * File      : linux_hardware.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#if defined(linux) || defined(__linux__) || defined(__linux) || defined(__MACH__) || defined(__CYGWIN__)
#ifndef ROS_LINUX_HARDWARE_H
#define ROS_LINUX_HARDWARE_H

#include <stdint.h>

#if defined(__linux__) || defined(__CYGWIN__)
#include <time.h>
#endif

// Includes necessary to support time on OS X.
#ifdef __MACH__
#include <mach/mach.h>
#include <mach/mach_time.h>
static mach_timebase_info_data_t    sTimebaseInfo;
#endif

class LinuxHardware
{
public:
  LinuxHardware();

  void init(const char *pName);

  int read();

  void write(uint8_t* data, int length);

  bool connected() ;

#if defined(__linux__) || defined(__CYGWIN__)
  void initTime()
  {
    clock_gettime(CLOCK_MONOTONIC, &start);
  }

  unsigned long time()
  {
    struct timespec end;
    long seconds, nseconds;

    clock_gettime(CLOCK_MONOTONIC, &end);

    seconds  = end.tv_sec  - start.tv_sec;
    nseconds = end.tv_nsec - start.tv_nsec;

    return ((seconds) * 1000 + nseconds / 1000000.0) + 0.5;
  }

#elif __MACH__
  void initTime()
  {
    start = mach_absolute_time();
    mach_timebase_info(&sTimebaseInfo);
  }

  unsigned long time()
  {
    uint64_t elapsed = mach_absolute_time() - start;
    return elapsed * sTimebaseInfo.numer / (sTimebaseInfo.denom * 1000000);
  }
#endif

protected:
  int fd;
  char portName[30];

#if defined(__linux__) || defined(__CYGWIN__)
  struct timespec start;
#elif __MACH__
  uint64_t start;
#endif
};

#endif
#endif
