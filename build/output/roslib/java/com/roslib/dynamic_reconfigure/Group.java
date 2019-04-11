package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class Group implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String type;
    public com.roslib.dynamic_reconfigure.ParamDescription[] parameters;
    public int parent;
    public int id;

    public Group() {
        this.name = "";
        this.type = "";
        this.parameters = null;
        this.parent = 0;
        this.id = 0;
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
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].serialize(outbuffer, offset);
        }
        outbuffer[offset + 0] = (byte)((this.parent >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.parent >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.parent >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.parent >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
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
        int length_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_parameters > 0) {
            this.parameters = new com.roslib.dynamic_reconfigure.ParamDescription[length_parameters];
        }
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].deserialize(inbuffer, offset);
        }
        this.parent   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.parent |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.parent |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.parent |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        for (int i = 0; i < length_parameters; i++) {
        length += this.parameters[i].serializedLength();
        }
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/Group"; }
    public java.lang.String getMD5(){ return "cefbd2eef246c87af36a151166f48397"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
