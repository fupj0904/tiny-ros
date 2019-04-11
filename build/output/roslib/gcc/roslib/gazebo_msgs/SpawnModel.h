#ifndef _ROS_SERVICE_SpawnModel_h
#define _ROS_SERVICE_SpawnModel_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "geometry_msgs/Pose.h"

namespace gazebo_msgs
{

static const char SPAWNMODEL[] = "gazebo_msgs/SpawnModel";

  class SpawnModelRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _model_name_type;
      _model_name_type model_name;
      typedef const char* _model_xml_type;
      _model_xml_type model_xml;
      typedef const char* _robot_namespace_type;
      _robot_namespace_type robot_namespace;
      typedef geometry_msgs::Pose _initial_pose_type;
      _initial_pose_type initial_pose;
      typedef const char* _reference_frame_type;
      _reference_frame_type reference_frame;

    SpawnModelRequest():
      model_name(""),
      model_xml(""),
      robot_namespace(""),
      initial_pose(),
      reference_frame("")
    {
      this->__id__ = 0;
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->__id__ >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->__id__ >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->__id__ >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->__id__ >> (8 * 3)) & 0xFF;
      offset += sizeof(this->__id__);
      uint32_t length_model_name = strlen(this->model_name);
      varToArr(outbuffer + offset, length_model_name);
      offset += 4;
      memcpy(outbuffer + offset, this->model_name, length_model_name);
      offset += length_model_name;
      uint32_t length_model_xml = strlen(this->model_xml);
      varToArr(outbuffer + offset, length_model_xml);
      offset += 4;
      memcpy(outbuffer + offset, this->model_xml, length_model_xml);
      offset += length_model_xml;
      uint32_t length_robot_namespace = strlen(this->robot_namespace);
      varToArr(outbuffer + offset, length_robot_namespace);
      offset += 4;
      memcpy(outbuffer + offset, this->robot_namespace, length_robot_namespace);
      offset += length_robot_namespace;
      offset += this->initial_pose.serialize(outbuffer + offset);
      uint32_t length_reference_frame = strlen(this->reference_frame);
      varToArr(outbuffer + offset, length_reference_frame);
      offset += 4;
      memcpy(outbuffer + offset, this->reference_frame, length_reference_frame);
      offset += length_reference_frame;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->__id__ =  ((uint32_t) (*(inbuffer + offset)));
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->__id__);
      uint32_t length_model_name;
      arrToVar(length_model_name, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_model_name; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_model_name-1]=0;
      this->model_name = (char *)(inbuffer + offset-1);
      offset += length_model_name;
      uint32_t length_model_xml;
      arrToVar(length_model_xml, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_model_xml; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_model_xml-1]=0;
      this->model_xml = (char *)(inbuffer + offset-1);
      offset += length_model_xml;
      uint32_t length_robot_namespace;
      arrToVar(length_robot_namespace, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_robot_namespace; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_robot_namespace-1]=0;
      this->robot_namespace = (char *)(inbuffer + offset-1);
      offset += length_robot_namespace;
      offset += this->initial_pose.deserialize(inbuffer + offset);
      uint32_t length_reference_frame;
      arrToVar(length_reference_frame, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_reference_frame; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_reference_frame-1]=0;
      this->reference_frame = (char *)(inbuffer + offset-1);
      offset += length_reference_frame;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_model_name = strlen(this->model_name);
      length += 4;
      length += length_model_name;
      uint32_t length_model_xml = strlen(this->model_xml);
      length += 4;
      length += length_model_xml;
      uint32_t length_robot_namespace = strlen(this->robot_namespace);
      length += 4;
      length += length_robot_namespace;
      length += this->initial_pose.serializedLength();
      uint32_t length_reference_frame = strlen(this->reference_frame);
      length += 4;
      length += length_reference_frame;
      return length;
    }

    const char * getType(){ return SPAWNMODEL; }
    const char * getMD5(){ return "da34e61c8813e52ac159e5f31fbf55be"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SpawnModelResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _success_type;
      _success_type success;
      typedef const char* _status_message_type;
      _status_message_type status_message;

    SpawnModelResponse():
      success(0),
      status_message("")
    {
      this->__id__ = 0;
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      *(outbuffer + offset + 0) = (this->__id__ >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->__id__ >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->__id__ >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->__id__ >> (8 * 3)) & 0xFF;
      offset += sizeof(this->__id__);
      union {
        bool real;
        uint8_t base;
      } u_success;
      u_success.real = this->success;
      *(outbuffer + offset + 0) = (u_success.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->success);
      uint32_t length_status_message = strlen(this->status_message);
      varToArr(outbuffer + offset, length_status_message);
      offset += 4;
      memcpy(outbuffer + offset, this->status_message, length_status_message);
      offset += length_status_message;
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      this->__id__ =  ((uint32_t) (*(inbuffer + offset)));
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      this->__id__ |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      offset += sizeof(this->__id__);
      union {
        bool real;
        uint8_t base;
      } u_success;
      u_success.base = 0;
      u_success.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->success = u_success.real;
      offset += sizeof(this->success);
      uint32_t length_status_message;
      arrToVar(length_status_message, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_status_message; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_status_message-1]=0;
      this->status_message = (char *)(inbuffer + offset-1);
      offset += length_status_message;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->success);
      uint32_t length_status_message = strlen(this->status_message);
      length += 4;
      length += length_status_message;
      return length;
    }

    const char * getType(){ return SPAWNMODEL; }
    const char * getMD5(){ return "d59d46cc4e5a64f978a429dd7c306d30"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SpawnModel {
    public:
    typedef SpawnModelRequest Request;
    typedef SpawnModelResponse Response;
  };

}
#endif
