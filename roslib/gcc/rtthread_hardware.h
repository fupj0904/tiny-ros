/*
 * File      : rtthread_hardware.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-01-22     Pinkie.Fu    initial version
 */

#ifndef RTTHREAD_HARDWARE_H_
#define RTTHREAD_HARDWARE_H_
#include <rthw.h>
#include <rtthread.h>
namespace ros
{
class RTThreadHardware
{
public:
  RTThreadHardware ();
  ~RTThreadHardware ();
  void init ();
  void init (char *server_hostname);
  int read ();
  void write (const unsigned char *data, int length);
  unsigned long time ();
  rt_bool_t socketInit(char *server_hostname);
  bool connected();

protected:
  int sockfd;
  char server_hostname_[64];
  bool connected_;
};

}

#endif
