cmake_minimum_required(VERSION 2.6)

set(EXECUTABLE_OUTPUT_PATH ${OUTPUT_PATHS}/bin)

aux_source_directory(src SRC_LIST)

include_directories(include)

add_executable(roscore
  ${SRC_LIST}
  ${ROSLIB_PATHS}/time.cpp
  ${ROSLIB_PATHS}/duration.cpp
)

IF (CMAKE_SYSTEM_NAME MATCHES "CYGWIN")
  target_link_libraries(roscore
    libboost_log.dll.a
    libboost_log_setup.dll.a
    libboost_date_time.dll.a
    libboost_system.a
    libboost_filesystem.dll.a
    libboost_thread.dll.a
    libpthread.a
  )
ENDIF()

IF (CMAKE_SYSTEM_NAME MATCHES "Linux")
  target_link_libraries(roscore
    libboost_log.so
    libboost_log_setup.so
    libboost_date_time.so
    libboost_system.so
    libboost_filesystem.so
    libboost_thread.so
    libpthread.so
  )
ENDIF()


