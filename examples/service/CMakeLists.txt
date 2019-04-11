cmake_minimum_required(VERSION 2.6)

set(EXECUTABLE_OUTPUT_PATH ${OUTPUT_PATHS}/bin/examples)
add_executable(ExampleService
  ExampleService.cpp
  ${ROSLIB_PATHS}/linux_hardware.cpp
  ${ROSLIB_PATHS}/windows_hardware.cpp
)


