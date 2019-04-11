/*
 * File      : ros.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#ifndef _ROS_H_
#define _ROS_H_
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
#include "windows_hardware.h"
#else
#include "linux_hardware.h"
#endif
#include "ros/node_handle.h"
#include "duration.cpp"
#include "time.cpp"


namespace ros
{
#ifndef WIN32
typedef NodeHandle_<LinuxHardware> NodeHandle;
#else
typedef NodeHandle_<WindowsHardware> NodeHandle;
#endif
}

#endif
