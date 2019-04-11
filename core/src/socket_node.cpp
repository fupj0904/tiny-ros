/*
 * File      : socket_node.cpp
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-02-09     Pinkie.Fu    initial version
 */

#include <boost/asio.hpp>
#include <boost/bind.hpp>
#include <boost/thread.hpp>
#include <boost/filesystem.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/utility/setup/common_attributes.hpp>
#include <boost/log/utility/setup/formatter_parser.hpp>
#include <boost/log/utility/setup/filter_parser.hpp>
#include <boost/log/utility/setup/settings.hpp>
#include <boost/log/utility/setup/from_settings.hpp>

#include "tcp_server.h"

#define LOG_ROTATION_SIZE  1*1024*1024 //1MB

#define LOG_MAX_SIZE       3*1024*1024 //3MB

static void init_log_environment() {
  namespace logging = boost::log;
  using namespace logging::trivial;

  logging::settings setts;
  logging::add_common_attributes();
  logging::register_simple_formatter_factory<severity_level, char>("Severity");
  logging::register_simple_filter_factory<severity_level, char>("Severity");

  setts["Core"]["Filter"] = "%Severity% >= trace";
  setts["Core"]["DisableLogging"] = false;

  // Sinks.console
  setts["Sinks.console.Format"] = "[%TimeStamp%] [%Severity%] %Message%";
  setts["Sinks.console.Destination"] = "Console";
  setts["Sinks.console.Filter"] = "%Severity% >= warning";
  setts["Sinks.console.Asynchronous"] = false;
  setts["Sinks.console.AutoFlush"] = true;

  // Sinks.trace
  setts["Sinks.trace.Filter"] = "%Severity% >= trace";
  setts["Sinks.trace.Format"] = "[%TimeStamp%] [%Severity%] %Message%";
  setts["Sinks.trace.Destination"] = "TextFile";
  setts["Sinks.trace.FileName"] = "tinyros-logs/%Y%m%d_%H%M%S.log";
  setts["Sinks.trace.Target"] = "tinyros-logs";
  setts["Sinks.trace.Asynchronous"] = false;
  setts["Sinks.trace.AutoFlush"] = true;
  setts["Sinks.trace.RotationSize"] = LOG_ROTATION_SIZE;
  setts["Sinks.trace.MaxSize"] = LOG_MAX_SIZE;
  setts["Sinks.trace.ScanForFiles"] = "All";

  logging::init_from_settings(setts);
}


int main(int argc, char* argv[]) {
  int port = 11411;

  init_log_environment();

  boost::asio::io_service io_service;
  ros::TcpServer<> tcp_server(io_service, port);

  BOOST_LOG_TRIVIAL(info) << "Listening for tiny-ros TCP connections on port " << port;
  io_service.run();
  return 0;
}
