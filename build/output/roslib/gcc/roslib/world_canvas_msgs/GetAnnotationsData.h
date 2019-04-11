#ifndef _ROS_SERVICE_GetAnnotationsData_h
#define _ROS_SERVICE_GetAnnotationsData_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "world_canvas_msgs/AnnotationData.h"
#include "uuid_msgs/UniqueID.h"

namespace world_canvas_msgs
{

static const char GETANNOTATIONSDATA[] = "world_canvas_msgs/GetAnnotationsData";

  class GetAnnotationsDataRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t annotation_ids_length;
      typedef uuid_msgs::UniqueID _annotation_ids_type;
      _annotation_ids_type st_annotation_ids;
      _annotation_ids_type * annotation_ids;

    GetAnnotationsDataRequest():
      annotation_ids_length(0), annotation_ids(NULL)
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
      *(outbuffer + offset + 0) = (this->annotation_ids_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->annotation_ids_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->annotation_ids_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->annotation_ids_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->annotation_ids_length);
      for( uint32_t i = 0; i < annotation_ids_length; i++){
      offset += this->annotation_ids[i].serialize(outbuffer + offset);
      }
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
      uint32_t annotation_ids_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      annotation_ids_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      annotation_ids_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      annotation_ids_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->annotation_ids_length);
      if(annotation_ids_lengthT > annotation_ids_length)
        this->annotation_ids = (uuid_msgs::UniqueID*)realloc(this->annotation_ids, annotation_ids_lengthT * sizeof(uuid_msgs::UniqueID));
      annotation_ids_length = annotation_ids_lengthT;
      for( uint32_t i = 0; i < annotation_ids_length; i++){
      offset += this->st_annotation_ids.deserialize(inbuffer + offset);
        memcpy( &(this->annotation_ids[i]), &(this->st_annotation_ids), sizeof(uuid_msgs::UniqueID));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->annotation_ids_length);
      for( uint32_t i = 0; i < annotation_ids_length; i++){
      length += this->annotation_ids[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return GETANNOTATIONSDATA; }
    const char * getMD5(){ return "7494d014bf37c8e6034d89a189b1aba4"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetAnnotationsDataResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef bool _result_type;
      _result_type result;
      typedef const char* _message_type;
      _message_type message;
      uint32_t data_length;
      typedef world_canvas_msgs::AnnotationData _data_type;
      _data_type st_data;
      _data_type * data;

    GetAnnotationsDataResponse():
      result(0),
      message(""),
      data_length(0), data(NULL)
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
      } u_result;
      u_result.real = this->result;
      *(outbuffer + offset + 0) = (u_result.base >> (8 * 0)) & 0xFF;
      offset += sizeof(this->result);
      uint32_t length_message = strlen(this->message);
      varToArr(outbuffer + offset, length_message);
      offset += 4;
      memcpy(outbuffer + offset, this->message, length_message);
      offset += length_message;
      *(outbuffer + offset + 0) = (this->data_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->data_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->data_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->data_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->data_length);
      for( uint32_t i = 0; i < data_length; i++){
      offset += this->data[i].serialize(outbuffer + offset);
      }
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
      } u_result;
      u_result.base = 0;
      u_result.base |= ((uint8_t) (*(inbuffer + offset + 0))) << (8 * 0);
      this->result = u_result.real;
      offset += sizeof(this->result);
      uint32_t length_message;
      arrToVar(length_message, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_message; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_message-1]=0;
      this->message = (char *)(inbuffer + offset-1);
      offset += length_message;
      uint32_t data_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      data_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      data_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      data_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->data_length);
      if(data_lengthT > data_length)
        this->data = (world_canvas_msgs::AnnotationData*)realloc(this->data, data_lengthT * sizeof(world_canvas_msgs::AnnotationData));
      data_length = data_lengthT;
      for( uint32_t i = 0; i < data_length; i++){
      offset += this->st_data.deserialize(inbuffer + offset);
        memcpy( &(this->data[i]), &(this->st_data), sizeof(world_canvas_msgs::AnnotationData));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->result);
      uint32_t length_message = strlen(this->message);
      length += 4;
      length += length_message;
      length += sizeof(this->data_length);
      for( uint32_t i = 0; i < data_length; i++){
      length += this->data[i].serializedLength();
      }
      return length;
    }

    const char * getType(){ return GETANNOTATIONSDATA; }
    const char * getMD5(){ return "abe8ef65ae56a2d557e12d6c41190606"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetAnnotationsData {
    public:
    typedef GetAnnotationsDataRequest Request;
    typedef GetAnnotationsDataResponse Response;
  };

}
#endif
