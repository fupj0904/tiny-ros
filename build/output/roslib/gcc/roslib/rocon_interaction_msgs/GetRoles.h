#ifndef _ROS_SERVICE_GetRoles_h
#define _ROS_SERVICE_GetRoles_h
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace rocon_interaction_msgs
{

static const char GETROLES[] = "rocon_interaction_msgs/GetRoles";

  class GetRolesRequest : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      typedef const char* _uri_type;
      _uri_type uri;

    GetRolesRequest():
      uri("")
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
      uint32_t length_uri = strlen(this->uri);
      varToArr(outbuffer + offset, length_uri);
      offset += 4;
      memcpy(outbuffer + offset, this->uri, length_uri);
      offset += length_uri;
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
      uint32_t length_uri;
      arrToVar(length_uri, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_uri; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_uri-1]=0;
      this->uri = (char *)(inbuffer + offset-1);
      offset += length_uri;
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      uint32_t length_uri = strlen(this->uri);
      length += 4;
      length += length_uri;
      return length;
    }

    const char * getType(){ return GETROLES; }
    const char * getMD5(){ return "6df69cbf8d9d66972f6054c22c0abae7"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRolesResponse : public ros::Msg
  {
    private:
      typedef uint32_t ___id___type;
      ___id___type __id__;

    public:
      uint32_t roles_length;
      typedef char* _roles_type;
      _roles_type st_roles;
      _roles_type * roles;

    GetRolesResponse():
      roles_length(0), roles(NULL)
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
      *(outbuffer + offset + 0) = (this->roles_length >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (this->roles_length >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (this->roles_length >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (this->roles_length >> (8 * 3)) & 0xFF;
      offset += sizeof(this->roles_length);
      for( uint32_t i = 0; i < roles_length; i++){
      uint32_t length_rolesi = strlen(this->roles[i]);
      varToArr(outbuffer + offset, length_rolesi);
      offset += 4;
      memcpy(outbuffer + offset, this->roles[i], length_rolesi);
      offset += length_rolesi;
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
      uint32_t roles_lengthT = ((uint32_t) (*(inbuffer + offset))); 
      roles_lengthT |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1); 
      roles_lengthT |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2); 
      roles_lengthT |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3); 
      offset += sizeof(this->roles_length);
      if(roles_lengthT > roles_length)
        this->roles = (char**)realloc(this->roles, roles_lengthT * sizeof(char*));
      roles_length = roles_lengthT;
      for( uint32_t i = 0; i < roles_length; i++){
      uint32_t length_st_roles;
      arrToVar(length_st_roles, (inbuffer + offset));
      offset += 4;
      for(unsigned int k= offset; k< offset+length_st_roles; ++k){
          inbuffer[k-1]=inbuffer[k];
      }
      inbuffer[offset+length_st_roles-1]=0;
      this->st_roles = (char *)(inbuffer + offset-1);
      offset += length_st_roles;
        memcpy( &(this->roles[i]), &(this->st_roles), sizeof(char*));
      }
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->roles_length);
      for( uint32_t i = 0; i < roles_length; i++){
      uint32_t length_rolesi = strlen(this->roles[i]);
      length += 4;
      length += length_rolesi;
      }
      return length;
    }

    const char * getType(){ return GETROLES; }
    const char * getMD5(){ return "cc3dfcf3789c775dea07f46d5718633d"; }
    const uint32_t getID(){ return this->__id__; }
    void setID(uint32_t id){ this->__id__ = id; }

  };

  class GetRoles {
    public:
    typedef GetRolesRequest Request;
    typedef GetRolesResponse Response;
  };

}
#endif
