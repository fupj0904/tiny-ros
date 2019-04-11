package com.roslib.zeroconf_msgs;

import java.lang.*;

public class PublishedService implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String type;
    public java.lang.String domain;
    public int port;
    public java.lang.String description;

    public PublishedService() {
        this.name = "";
        this.type = "";
        this.domain = "";
        this.port = 0;
        this.description = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        int length_domain = this.domain.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_domain >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_domain >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_domain >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_domain >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_domain; k++) {
            outbuffer[offset + k] = (byte)((this.domain.getBytes())[k] & 0xFF);
        }
        offset += length_domain;
        outbuffer[offset + 0] = (byte)((this.port >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.port >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.port >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.port >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_description = this.description.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_description >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_description >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_description >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_description >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_description; k++) {
            outbuffer[offset + k] = (byte)((this.description.getBytes())[k] & 0xFF);
        }
        offset += length_description;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        int length_domain = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_domain |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_domain |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_domain |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_domain = new byte[length_domain];
        for(int k= 0; k< length_domain; k++){
            bytes_domain[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.domain = new java.lang.String(bytes_domain);
        offset += length_domain;
        this.port   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.port |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.port |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.port |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_description = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_description |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_description |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_description |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_description = new byte[length_description];
        for(int k= 0; k< length_description; k++){
            bytes_description[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.description = new java.lang.String(bytes_description);
        offset += length_description;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        int length_domain = this.domain.getBytes().length;
        length += 4;
        length += length_domain;
        length += 4;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        return length;
    }

    public java.lang.String getType(){ return "zeroconf_msgs/PublishedService"; }
    public java.lang.String getMD5(){ return "852640b9383bfb046dae093e9feb85a7"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
