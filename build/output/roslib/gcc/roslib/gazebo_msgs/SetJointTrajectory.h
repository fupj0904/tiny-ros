#ifndef _ROS_SERVICE_SetJointTrajectory_h
#define _ROS_SERVICE_SetJointTrajectory_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "trajectory_msgs/JointTrajectory.h"
#include "geometry_msgs/Pose.h"

namespace gazebo_msgs
{

static const char SETJOINTTRAJECTORY[] = "gazebo_msgs/SetJointTrajectory";

  class SetJointTrajectoryRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _model_name_type;
      _model_name_type model_name;
      typedef trajectory_msgs::JointTrajectory _joint_trajectory_type;
      _joint_trajectory_type joint_trajectory;
      typedef geometry_msgs::Pose _model_pose_type;
      _model_pose_type model_pose;
      typedef bool _set_model_pose_type;
      _set_model_pose_type set_model_pose;
      typedef bool _disable_physics_updates_type;
      _disable_physics_updates_type disable_physics_updates;

    SetJointTrajectoryRequest():
      model_name(""),
      joint_trajectory(),
      model_pose(),
      set_model_pose(0),
      disable_physics_updates(0)
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
      offset += this->joint_trajectory.serialize(outbuffer + offset);
      offset += this->model_pose.serialize(outbuffer + offset);
      union {
        bool real;
        uint8_t base;
      } u_set_model_pose;
      u_set_model_pose.real = this->set_model_pose;
      *(outbuffer + offset + 0) = (u_set_model_pose.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->set_model_pose);
      union {
        bool real;
        uint8_t base;
      } u_disable_physics_updates;
      u_disable_physics_updates.real = this->disable_physics_updates;
      *(outbuffer + offset + 0) = (u_disable_physics_updates.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->disable_physics_updates);
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
      offset += this->joint_trajectory.deserialize(inbuffer + offset);
      offset += this->model_pose.deserialize(inbuffer + offset);
      union {
        bool real;
        uint8_t base;
      } u_set_model_pose;
      u_set_model_pose.base = 0;
      u_set_model_pose.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->set_model_pose = u_set_model_pose.real;
      offset += sizeof(this->set_model_pose);
      union {
        bool real;
        uint8_t base;
      } u_disable_physics_updates;
      u_disable_physics_updates.base = 0;
      u_disable_physics_updates.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->disable_physics_updates = u_disable_physics_updates.real;
      offset += sizeof(this->disable_physics_updates);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_model_name = strlen(this->model_name);
      length += 4;
      length += length_model_name;
      length += this->joint_trajectory.serializedLength();
      length += this->model_pose.serializedLength();
      length += sizeof(this->set_model_pose);
      length += sizeof(this->disable_physics_updates);
      return length;
    }

    const char * getType(){ return SETJOINTTRAJECTORY; }
    const char * getMD5(){ return "8230e1fcc0295d8d21fbd5df0ccb0af3"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetJointTrajectoryResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _success_type;
      _success_type success;
      typedef const char* _status_message_type;
      _status_message_type status_message;

    SetJointTrajectoryResponse():
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

    const char * getType(){ return SETJOINTTRAJECTORY; }
    const char * getMD5(){ return "2f5fe47400272efd54556969ffe63e7e"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class SetJointTrajectory {
    public:
    typedef SetJointTrajectoryRequest Request;
    typedef SetJointTrajectoryResponse Response;
  };

}
#endif
