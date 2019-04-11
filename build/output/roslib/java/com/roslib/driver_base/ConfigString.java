package com.roslib.driver_base;

import java.lang.*;

public class ConfigString implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String value;

    public ConfigString() {
        this.name = "";
        this.value = "";
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
        int length_value = this.value.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_value >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_value >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_value >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_value >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_value; k++) {
            outbuffer[offset + k] = (byte)((this.value.getBytes())[k] & 0xFF);
        }
        offset += length_value;
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
        int length_value = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_value |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_value |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_value |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_value = new byte[length_value];
        for(int k= 0; k< length_value; k++){
            bytes_value[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.value = new java.lang.String(bytes_value);
        offset += length_value;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_value = this.value.getBytes().length;
        length += 4;
        length += length_value;
        return length;
    }

    public java.lang.String getType(){ return "driver_base/ConfigString"; }
    public java.lang.String getMD5(){ return "2e0b1bade237ecd942d137fab944a8e3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
