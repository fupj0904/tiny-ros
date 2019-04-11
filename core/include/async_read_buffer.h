/*
 * File      : async_read_buffer.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-02-09     Pinkie.Fu    initial version
 */

#ifndef TINY_ROS_ASYNC_READ_BUFFER_H
#define TINY_ROS_ASYNC_READ_BUFFER_H

#include <boost/bind.hpp>
#include <boost/asio.hpp>
#include <boost/function.hpp>
#include <boost/log/trivial.hpp>
#include "serialization.h"

namespace ros
{

template<typename AsyncReadStream>
class AsyncReadBuffer
{
public:
  AsyncReadBuffer(AsyncReadStream& s, size_t capacity,
                  boost::function<void(const boost::system::error_code&)> error_callback)
       : stream_(s), read_requested_bytes_(0), error_callback_(error_callback) {
    reset();
    mem_.resize(capacity);
  }

  /**
   * @brief Commands a fixed number of bytes from the buffer. This may be fulfilled from existing
   *        buffer content, or following a hardware read if required.
   */
  void read(size_t requested_bytes, boost::function<void(ros::serialization::IStream&)> callback) {
    read_success_callback_ = callback;
    read_requested_bytes_ = requested_bytes;

    if (read_requested_bytes_ > mem_.size())
    {
      error_callback_(boost::system::errc::make_error_code(boost::system::errc::no_buffer_space));
      return;
    }

    // Number of bytes which must be transferred to satisfy the request.
    ssize_t transfer_bytes = read_requested_bytes_ - bytesAvailable();

    if (transfer_bytes > 0)
    {
      // If we don't have enough headroom in the buffer, we'll have to shift what's currently in there to make room.
      if (bytesHeadroom() < transfer_bytes)
      {
        memmove(&mem_[0], &mem_[read_index_], bytesAvailable());
        write_index_ = bytesAvailable();
        read_index_ = 0;
      }

      // Initiate a read from hardware so that we have enough bytes to fill the user request.
      boost::asio::async_read(stream_,
          boost::asio::buffer(&mem_[write_index_], bytesHeadroom()),
          boost::asio::transfer_at_least(transfer_bytes),
          boost::bind(&AsyncReadBuffer::callback, this,
                      boost::asio::placeholders::error,
                      boost::asio::placeholders::bytes_transferred));
    }
    else
    {
      // We have enough in the buffer already, can fill the request without going to hardware.
      callSuccessCallback();
    }
  }

private:
  void reset()
  {
    read_index_ = 0;
    write_index_ = 0;
  }

  inline size_t bytesAvailable()
  {
    return write_index_ - read_index_;
  }

  inline size_t bytesHeadroom()
  {
    return mem_.size() - write_index_;
  }

  /**
   * @brief The internal callback which is called by the boost::asio::async_read invocation
   *        in the public read method above.
   */
  void callback(const boost::system::error_code& error, size_t bytes_transferred)
  {
    if (error)
    {
      read_requested_bytes_ = 0;
      read_success_callback_.clear();

      if (error == boost::asio::error::operation_aborted)
      {
        // Special case for operation_aborted. The abort callback comes when the owning Session
        // is in the middle of teardown, which means the callback is no longer valid.
      }
      else
      {
        error_callback_(error);
      }
      return;
    }

    write_index_ += bytes_transferred;
    callSuccessCallback();
  }

  /**
   * @brief Calls the user's callback. This is a separate function because it gets called from two
   *        places, depending whether or not an actual HW read is required to fill the request.
   */
  void callSuccessCallback()
  {
    ros::serialization::IStream stream(&mem_[read_index_], read_requested_bytes_);
    read_index_ += read_requested_bytes_;

    // Post the callback rather than executing it here so, so that we have a chance to do the cleanup
    // below prior to it actually getting run, in the event that the callback queues up another read.
    stream_.get_io_service().post(boost::bind(read_success_callback_, stream));

    // Resetting these values clears our state so that we know there isn't a callback pending.
    read_requested_bytes_ = 0;
    read_success_callback_.clear();

    if (bytesAvailable() == 0)
    {
      reset();
    }
  }

  AsyncReadStream& stream_;
  std::vector<uint8_t> mem_;

  size_t write_index_;
  size_t read_index_;
  boost::function<void(const boost::system::error_code&)> error_callback_;

  boost::function<void(ros::serialization::IStream&)> read_success_callback_;
  size_t read_requested_bytes_;
};

}  // namespace

#endif  // TINY_ROS_ASYNC_READ_BUFFER_H
