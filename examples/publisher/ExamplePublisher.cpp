/*
 * File      : ExamplePublisher.cpp
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
#include "stdafx.h"
#include <windows.h>
#else
#include <unistd.h>
#endif
#include <ros.h>
#include <tinyros_hello/TinyrosHello.h>
#include <stdio.h>

int main (int argc, char *argv[]) {
  ros::NodeHandle nh;
  nh.initNode((char*)"127.0.0.1");

  printf ("Advertising chatter message\n");
  tinyros_hello::TinyrosHello hello_msg;
  ros::Publisher hello_pub ("tinyros_hello", &hello_msg);
  nh.advertise (hello_pub);

  while (nh.ok())
  {
    if (hello_pub.negotiated())
    {
      hello_msg.hello = "Hello, tiny-ros ^_^ ";
      hello_pub.publish (&hello_msg);
    }
    nh.spinOnce ();
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
    Sleep(500);
#else
    usleep(500*1000);
#endif
  }
  return 0;
}
