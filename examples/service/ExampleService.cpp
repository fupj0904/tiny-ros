/*
 * File      : ExampleService.cpp
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
#include <std_msgs/String.h>
#include <tinyros_hello/Test.h>
#include <stdio.h>

ros::NodeHandle  nh;
using tinyros_hello::Test;

int i=0;
char buffer[50] = {0};
void svcCallback(const Test::Request & req, Test::Response & res) {
  snprintf(buffer, sizeof(buffer), "Hello, tiny-ros ^_^");
  res.output = buffer;
}
ros::ServiceServer<Test::Request, Test::Response> server("test_srv", &svcCallback);

int main()
{
  nh.initNode((char*)"127.0.0.1");
  nh.advertiseService(server);

  while(nh.ok()) {
    nh.spinOnce();
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
    Sleep(500);
#else
    usleep(500*1000);
#endif
  }
}
