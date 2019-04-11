package com.roslib.rocon_std_msgs;

import java.lang.*;

public class KeyValue implements com.roslib.ros.Msg {
    public java.lang.String key;
    public java.lang.String value;

    public KeyValue() {
        this.key = "";
        this.value = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_key = this.key.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_key >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_key >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_key >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_key >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_key; k++) {
            outbuffer[offset + k] = (byte)((this.key.getBytes())[k] & 0xFF);
        }
        offset += length_key;
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
        int length_key = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_key |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_key |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_key |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_key = new byte[length_key];
        for(int k= 0; k< length_key; k++){
            bytes_key[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.key = new java.lang.String(bytes_key);
        offset += length_key;
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
        int length_key = this.key.getBytes().length;
        length += 4;
        length += length_key;
        int length_value = this.value.getBytes().length;
        length += 4;
        length += length_value;
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/KeyValue"; }
    public java.lang.String getMD5(){ return "c86334a285e8e8270c4d68b72fb45e9c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
