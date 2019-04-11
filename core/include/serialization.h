/*
 * File      : serialization.h
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-03     Pinkie.Fu    initial version
 */

#ifndef TINY_ROS_SERIALIZATION_H
#define TINY_ROS_SERIALIZATION_H
#include "exception.h"
#include <vector>
#include <map>
#include <boost/array.hpp>
#include <boost/call_traits.hpp>
#include <boost/utility/enable_if.hpp>
#include <boost/mpl/and.hpp>
#include <boost/mpl/or.hpp>
#include <boost/mpl/not.hpp>
#include <stdint.h>
#include <cstring>

namespace ros
{
namespace serialization
{
class StreamOverrunException : public ros::Exception
{
public:
  StreamOverrunException(const std::string& what)
  : Exception(what)
  {}
};

void throwStreamOverrun();

/**
 * \brief Templated serialization class.  Default implementation provides backwards compatibility with
 * old message types.
 *
 * Specializing the Serializer class is the only thing you need to do to get the ROS serialization system
 * to work with a type.
 */
template<typename T>
struct Serializer
{
  /**
   * \brief Write an object to the stream.  Normally the stream passed in here will be a ros::serialization::OStream
   */
  template<typename Stream>
  inline static void write(Stream& stream, typename boost::call_traits<T>::param_type t)
  {
    stream.advance(t.serialize(stream.getData()));
  }

  /**
   * \brief Read an object from the stream.  Normally the stream passed in here will be a ros::serialization::IStream
   */
  template<typename Stream>
  inline static void read(Stream& stream, typename boost::call_traits<T>::reference t)
  {
    stream.advance(t.deserialize(stream.getData()));
  }

  /**
   * \brief Determine the serialized length of an object.
   */
  inline static uint32_t serializedLength(typename boost::call_traits<T>::param_type t)
  {
    return t.serializedLength();
  }
};

/**
 * \brief Serialize an object.  Stream here should normally be a ros::serialization::OStream
 */
template<typename T, typename Stream>
inline void serialize(Stream& stream, const T& t)
{
  Serializer<T>::write(stream, t);
}

/**
 * \brief Deserialize an object.  Stream here should normally be a ros::serialization::IStream
 */
template<typename T, typename Stream>
inline void deserialize(Stream& stream, T& t)
{
  Serializer<T>::read(stream, t);
}

/**
 * \brief Determine the serialized length of an object
 */
template<typename T>
inline uint32_t serializationLength(const T& t)
{
  return Serializer<T>::serializedLength(t);
}

#define ROS_CREATE_SIMPLE_SERIALIZER(Type) \
  template<> struct Serializer<Type> \
  { \
    template<typename Stream> inline static void write(Stream& stream, const Type v) \
    { \
      *reinterpret_cast<Type*>(stream.advance(sizeof(v))) = v; \
    } \
    \
    template<typename Stream> inline static void read(Stream& stream, Type& v) \
    { \
      v = *reinterpret_cast<Type*>(stream.advance(sizeof(v))); \
    } \
    \
    inline static uint32_t serializedLength(const Type&) \
    { \
      return sizeof(Type); \
    } \
  };

#define ROS_CREATE_SIMPLE_SERIALIZER_ARM(Type) \
  template<> struct Serializer<Type> \
  { \
    template<typename Stream> inline static void write(Stream& stream, const Type v) \
    { \
      memcpy(stream.advance(sizeof(v)), &v, sizeof(v) ); \
    } \
    \
    template<typename Stream> inline static void read(Stream& stream, Type& v) \
    { \
      memcpy(&v, stream.advance(sizeof(v)), sizeof(v) ); \
    } \
    \
    inline static uint32_t serializedLength(const Type t) \
    { \
      return sizeof(Type); \
    } \
};

#if defined(__arm__) || defined(__arm)
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(uint8_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(int8_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(uint16_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(int16_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(uint32_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(int32_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(uint64_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(int64_t);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(float);
    ROS_CREATE_SIMPLE_SERIALIZER_ARM(double);
#else
    ROS_CREATE_SIMPLE_SERIALIZER(uint8_t);
    ROS_CREATE_SIMPLE_SERIALIZER(int8_t);
    ROS_CREATE_SIMPLE_SERIALIZER(uint16_t);
    ROS_CREATE_SIMPLE_SERIALIZER(int16_t);
    ROS_CREATE_SIMPLE_SERIALIZER(uint32_t);
    ROS_CREATE_SIMPLE_SERIALIZER(int32_t);
    ROS_CREATE_SIMPLE_SERIALIZER(uint64_t);
    ROS_CREATE_SIMPLE_SERIALIZER(int64_t);
    ROS_CREATE_SIMPLE_SERIALIZER(float);
    ROS_CREATE_SIMPLE_SERIALIZER(double);
#endif

/**
 * \brief Serializer specialized for bool (serialized as uint8)
 */
template<> struct Serializer<bool>
{
  template<typename Stream> inline static void write(Stream& stream, const bool v)
  {
    uint8_t b = (uint8_t)v;
#if defined(__arm__) || defined(__arm)
    memcpy(stream.advance(1), &b, 1 );
#else
    *reinterpret_cast<uint8_t*>(stream.advance(1)) = b;
#endif
  }

  template<typename Stream> inline static void read(Stream& stream, bool& v)
  {
    uint8_t b;
#if defined(__arm__) || defined(__arm)
    memcpy(&b, stream.advance(1), 1 );
#else
    b = *reinterpret_cast<uint8_t*>(stream.advance(1));
#endif
    v = (bool)b;
  }

  inline static uint32_t serializedLength(bool)
  {
    return 1;
  }
};

/**
 * \brief  Serializer specialized for std::string
 */
template<class ContainerAllocator>
struct Serializer<std::basic_string<char, std::char_traits<char>, ContainerAllocator> >
{
  typedef std::basic_string<char, std::char_traits<char>, ContainerAllocator> StringType;

  template<typename Stream>
  inline static void write(Stream& stream, const StringType& str)
  {
    size_t len = str.size();
    stream.next((uint32_t)len);

    if (len > 0)
    {
      memcpy(stream.advance((uint32_t)len), str.data(), len);
    }
  }

  template<typename Stream>
  inline static void read(Stream& stream, StringType& str)
  {
    uint32_t len;
    stream.next(len);
    if (len > 0)
    {
      str = StringType((char*)stream.advance(len), len);
    }
    else
    {
      str.clear();
    }
  }

  inline static uint32_t serializedLength(const StringType& str)
  {
    return 4 + (uint32_t)str.size();
  }
};

/**
 * \brief Enum
 */
namespace stream_types
{
enum StreamType
{
  Input,
  Output,
  Length
};
}
typedef stream_types::StreamType StreamType;

/**
 * \brief Stream base-class, provides common functionality for IStream and OStream
 */
struct Stream
{
  /*
   * \brief Returns a pointer to the current position of the stream
   */
  inline uint8_t* getData() { return data_; }
  /**
   * \brief Advances the stream, checking bounds, and returns a pointer to the position before it
   * was advanced.
   * \throws StreamOverrunException if len would take this stream past the end of its buffer
   */
  uint8_t* advance(uint32_t len)
  {
    uint8_t* old_data = data_;
    data_ += len;
    if (data_ > end_)
    {
      // Throwing directly here causes a significant speed hit due to the extra code generated
      // for the throw statement
      throwStreamOverrun();
    }
    return old_data;
  }

  /**
   * \brief Returns the amount of space left in the stream
   */
  inline uint32_t getLength() { return (uint32_t)(end_ - data_); }

protected:
  Stream(uint8_t* _data, uint32_t _count)
  : data_(_data)
  , end_(_data + _count)
  {}

private:
  uint8_t* data_;
  uint8_t* end_;
};

/**
 * \brief Input stream
 */
struct IStream : public Stream
{
  static const StreamType stream_type = stream_types::Input;

  IStream(uint8_t* data, uint32_t count)
  : Stream(data, count)
  {}

  /**
   * \brief Deserialize an item from this input stream
   */
  template<typename T>
  void next(T& t)
  {
    deserialize(*this, t);
  }

  template<typename T>
  IStream& operator>>(T& t)
  {
    deserialize(*this, t);
    return *this;
  }
};

/**
 * \brief Output stream
 */
struct OStream : public Stream
{
  static const StreamType stream_type = stream_types::Output;

  OStream(uint8_t* data, uint32_t count)
  : Stream(data, count)
  {}

  /**
   * \brief Serialize an item to this output stream
   */
  template<typename T>
  void next(const T& t)
  {
    serialize(*this, t);
  }

  template<typename T>
  OStream& operator<<(const T& t)
  {
    serialize(*this, t);
    return *this;
  }
};


/**
 * \brief Length stream
 *
 * LStream is not what you would normally think of as a stream, but it is used in order to support
 * allinone serializers.
 */
struct LStream
{
  static const StreamType stream_type = stream_types::Length;

  LStream()
  : count_(0)
  {}

  /**
   * \brief Add the length of an item to this length stream
   */
  template<typename T>
  void next(const T& t)
  {
    count_ += serializationLength(t);
  }

  /**
   * \brief increment the length by len
   */
  uint32_t advance(uint32_t len)
  {
    uint32_t old = count_;
    count_ += len;
    return old;
  }

  /**
   * \brief Get the total length of this tream
   */
  inline uint32_t getLength() { return count_; }

private:
  uint32_t count_;
};
}
}

#endif // TINY_ROS_SERIALIZATION_H
