/*
 * File      : ExampleSubscriber.cpp
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

ros::NodeHandle  nh;

void messageCb(const tinyros_hello::TinyrosHello& received_msg) {
  printf("%s\n", received_msg.hello);
}

ros::Subscriber<tinyros_hello::TinyrosHello> sub("tinyros_hello", messageCb );

int main() {
  nh.initNode((char*)"127.0.0.1");
  nh.subscribe(sub);

  while(nh.ok()) {
#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
    Sleep(500);
#else
    usleep(500*1000);
#endif
    nh.spinOnce();
  }
}
