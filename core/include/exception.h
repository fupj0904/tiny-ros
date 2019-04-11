/*
 * File      : exception.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-03     Pinkie.Fu    initial version
 */

#ifndef TINY_ROS_EXCEPTION_H
#define TINY_ROS_EXCEPTION_H

#include <stdexcept>

namespace ros
{
class Exception : public std::runtime_error
{
public:
  Exception(const std::string& what)
  : std::runtime_error(what)
  {}
};

} // namespace ros

#endif

