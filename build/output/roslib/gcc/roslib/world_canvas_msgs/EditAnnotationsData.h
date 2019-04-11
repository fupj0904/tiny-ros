#ifndef _ROS_SERVICE_EditAnnotationsData_h
#define _ROS_SERVICE_EditAnnotationsData_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "world_canvas_msgs/AnnotationData.h"
#include "world_canvas_msgs/Annotation.h"

namespace world_canvas_msgs
{

static const char EDITANNOTATIONSDATA[] = "world_canvas_msgs/EditAnnotationsData";

  class EditAnnotationsDataRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef uint8_t _action_type;
      _action_type action;
      typedef world_canvas_msgs::Annotation _annotation_type;
      _annotation_type annotation;
      typedef world_canvas_msgs::AnnotationData _data_type;
      _data_type data;
      enum { NEW = 0 };
      enum { EDIT = 1 };

    EditAnnotationsDataRequest():
      action(0),
      annotation(),
      data()
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
      *(outbuffer + offset + 0) = (this->action >> (8 * 0)) & 0xFF;
      offset += sizeof(this->action);
      offset += this->annotation.serialize(outbuffer + offset);
      offset += this->data.serialize(outbuffer + offset);
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
      this->action =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->action);
      offset += this->annotation.deserialize(inbuffer + offset);
      offset += this->data.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->action);
      length += this->annotation.serializedLength();
      length += this->data.serializedLength();
      return length;
    }

    const char * getType(){ return EDITANNOTATIONSDATA; }
    const char * getMD5(){ return "091bed3f1fc4e5dd358a43d6787972f9"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class EditAnnotationsDataResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef uint8_t _action_type;
      _action_type action;
      typedef world_canvas_msgs::AnnotationData _data_type;
      _data_type data;
      enum { UPDATE = 10 };
      enum { DELETE = 12 };
      enum { CANCEL = 13 };

    EditAnnotationsDataResponse():
      action(0),
      data()
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
      *(outbuffer + offset + 0) = (this->action >> (8 * 0)) & 0xFF;
      offset += sizeof(this->action);
      offset += this->data.serialize(outbuffer + offset);
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
      this->action =  ((uint8_t) (*(inbuffer + offset)));
      offset += sizeof(this->action);
      offset += this->data.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->action);
      length += this->data.serializedLength();
      return length;
    }

    const char * getType(){ return EDITANNOTATIONSDATA; }
    const char * getMD5(){ return "3d6853a8279ab3d705da4308efd52fef"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class EditAnnotationsData {
    public:
    typedef EditAnnotationsDataRequest Request;
    typedef EditAnnotationsDataResponse Response;
  };

}
#endif
