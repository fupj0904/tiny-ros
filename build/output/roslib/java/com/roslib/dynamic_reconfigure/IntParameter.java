package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class IntParameter implements com.roslib.ros.Msg {
    public java.lang.String name;
    public int value;

    public IntParameter() {
        this.name = "";
        this.value = 0;
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
        outbuffer[offset + 0] = (byte)((this.value >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.value >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.value >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.value >> (8 * 3)) & 0xFF);
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
        this.value   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.value |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.value |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.value |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/IntParameter"; }
    public java.lang.String getMD5(){ return "47d88220423b5a04657f3e9b2e5b5604"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
