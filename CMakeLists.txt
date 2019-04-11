cmake_minimum_required(VERSION 2.6)

set(OUTPUT_PATHS ${PROJECT_SOURCE_DIR}/build/output)
set(ROSLIB_PATHS ${PROJECT_SOURCE_DIR}/roslib/gcc)

add_definitions(-DBOOST_LOG_DYN_LINK)

include_directories(
  ${OUTPUT_PATHS}/roslib/gcc/roslib
  ${Boost_INCLUDE_DIRS}
)

add_subdirectory(core)
add_subdirectory(examples)
add_subdirectory(tools)
