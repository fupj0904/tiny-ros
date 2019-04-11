/*
 * File      : windows_hardware.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
#ifndef ROS_WINDOWS_HARDWARE_H_
#define ROS_WINDOWS_HARDWARE_H_

// forward declaration of the implementation class
// this class is defined in the implementation file to abstract all of the
// windows specific crud. It gets in the way of the ROS libraries.
class WindowsHardwareImpl;

class WindowsHardware
{
public:
  WindowsHardware ();

  void init (char *server_hostname);

  int read ();

  void write (const unsigned char *data, int length);

  unsigned long time ();

  bool connected() ;

private:
    WindowsHardwareImpl * impl;
};

#endif
#endif
