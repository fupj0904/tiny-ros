/*
 * File      : ExampleServiceClient.cpp
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

ros::ServiceClient<Test::Request, Test::Response> client("test_srv");

char hello[13] = "hello world!";

int main()
{
  nh.initNode((char*)"127.0.0.1");
  nh.serviceClient(client);

  while (nh.ok()) {
    if (client.negotiated())
    {
      Test::Request req;
      Test::Response res;
      req.input = hello;
      if (client.call(req, res, 5))
        printf("Service responsed with \"%s\"\n", res.output);
      else
        printf("Service call failed.\n");
    }
    nh.spinOnce();
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
    Sleep(1000);
#else
    usleep(1000*1000);
#endif
  }
}
