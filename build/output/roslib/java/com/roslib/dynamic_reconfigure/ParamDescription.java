package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class ParamDescription implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String type;
    public long level;
    public java.lang.String description;
    public java.lang.String edit_method;

    public ParamDescription() {
        this.name = "";
        this.type = "";
        this.level = 0;
        this.description = "";
        this.edit_method = "";
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
        outbuffer[offset + 0] = (byte)((this.level >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.level >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.level >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.level >> (8 * 3)) & 0xFF);
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
        int length_edit_method = this.edit_method.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_edit_method >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_edit_method >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_edit_method >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_edit_method >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_edit_method; k++) {
            outbuffer[offset + k] = (byte)((this.edit_method.getBytes())[k] & 0xFF);
        }
        offset += length_edit_method;
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
        this.level   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.level |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.level |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.level |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
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
        int length_edit_method = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_edit_method |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_edit_method |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_edit_method |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_edit_method = new byte[length_edit_method];
        for(int k= 0; k< length_edit_method; k++){
            bytes_edit_method[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.edit_method = new java.lang.String(bytes_edit_method);
        offset += length_edit_method;
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
        length += 4;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        int length_edit_method = this.edit_method.getBytes().length;
        length += 4;
        length += length_edit_method;
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/ParamDescription"; }
    public java.lang.String getMD5(){ return "ea94e9961169d3d467236220c44ebecb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
