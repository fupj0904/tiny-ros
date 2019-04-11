package com.roslib.turtlesim;

import java.lang.*;

public class Color implements com.roslib.ros.Msg {
    public int r;
    public int g;
    public int b;

    public Color() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.r >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.g >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.b >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.r   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.g   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.b   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 1;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "turtlesim/Color"; }
    public java.lang.String getMD5(){ return "02c9082d81fa06468c5f4a6d553ddf71"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
