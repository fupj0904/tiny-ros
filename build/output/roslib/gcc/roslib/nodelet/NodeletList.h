#ifndef _ROS_SERVICE_NodeletList_h
#define _ROS_SERVICE_NodeletList_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace nodelet
{

static const char NODELETLIST[] = "nodelet/NodeletList";

  class NodeletListRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:

    NodeletListRequest()
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
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      return length;
    }

    const char * getType(){ return NODELETLIST; }
    const char * getMD5(){ return "e2e4441474a4a4aba5e2d82caab2b84b"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class NodeletListResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t nodelets_length;
      typedef char* _nodelets_type;
      _nodelets_type st_nodelets;
      _nodelets_type * nodelets;

    NodeletListResponse():
      nodelets_length(0), nodelets(NULL)
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
      *(outbuffer + offset + 0) = (this->nodelets_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->nodelets_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->nodelets_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->nodelets_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->nodelets_length);
      for( uint32_t i = 0; i < nodelets_length; i++){
      uint32_t length_nodeletsi = strlen(this->nodelets[i]);
      varToArr(outbuffer + offset, length_nodeletsi);
      offset += 4;
      memcpy(outbuffer + offset, this->nodelets[i], length_nodeletsi);
      offset += length_nodeletsi;
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
      uint32_t nodelets_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      nodelets_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      nodelets_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      nodelets_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->nodelets_length);
      if(nodelets_lengthT > nodelets_length)
        this->nodelets = (char**)realloc(this->nodelets, nodelets_lengthT * sizeof(char*));
      nodelets_length = nodelets_lengthT;
      for( uint32_t i = 0; i < nodelets_length; i++){
      uint32_t length_st_nodelets;
      arrToVar(length_st_nodelets, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_st_nodelets; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_st_nodelets-1]=0;
      this->st_nodelets = (char *)(inbuffer + offset-1);
      offset += length_st_nodelets;
        memcpy( &(this->nodelets[i]), &(this->st_nodelets), sizeof(char*));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->nodelets_length);
      for( uint32_t i = 0; i < nodelets_length; i++){
      uint32_t length_nodeletsi = strlen(this->nodelets[i]);
      length += 4;
      length += length_nodeletsi;
      }
      return length;
    }

    const char * getType(){ return NODELETLIST; }
    const char * getMD5(){ return "e8cef489e3c5eba314d252a9b0f0d166"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class NodeletList {
    public:
    typedef NodeletListRequest Request;
    typedef NodeletListResponse Response;
  };

}
#endif
