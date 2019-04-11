/*
 * File      : rostopic.cpp
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
#include <stdio.h>

#define USAGE "\n\nUSAGE:\n" \
              "       rostopic          //ros_ip: 127.0.0.1, no arguments\n" \
              "       rostopic <ros_ip> //ros_ip: tiny-ros ip address\n"

int main(int argc, char **argv) {
  char *ros_ip = (char*)"127.0.0.1";
  if (argc >= 2) {
    ros_ip = (char*)argv[1];
  }
  ros::NodeHandle  nh;
  nh.initNode(ros_ip);
  char* topiclist = nh.getTopicList(3000);
  printf(USAGE);
  printf("%s\n", topiclist);
  return 0;
}

