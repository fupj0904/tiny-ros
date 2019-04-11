package com.roslib.gazebo_msgs;

import java.lang.*;

public class BodyRequest {

public static final java.lang.String BODYREQUEST = "gazebo_msgs/BodyRequest";

public class BodyRequestRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String body_name;

    public BodyRequestRequest() {
        this.body_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_body_name = this.body_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_body_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_body_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_body_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_body_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_body_name; k++) {
            outbuffer[offset + k] = (byte)((this.body_name.getBytes())[k] & 0xFF);
        }
        offset += length_body_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_body_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_body_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_body_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_body_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_body_name = new byte[length_body_name];
        for(int k= 0; k< length_body_name; k++){
            bytes_body_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.body_name = new java.lang.String(bytes_body_name);
        offset += length_body_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_body_name = this.body_name.getBytes().length;
        length += 4;
        length += length_body_name;
        return length;
    }

    public java.lang.String getType() { return BODYREQUEST; }
    public java.lang.String getMD5(){ return "d1c66fbceb0ee1b51e3b09ac030dedec"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class BodyRequestResponse implements com.roslib.ros.Msg {
    private long __id__;

    public BodyRequestResponse() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return BODYREQUEST; }
    public java.lang.String getMD5(){ return "e0caf2eb9951542b962f95924c6eeb34"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
