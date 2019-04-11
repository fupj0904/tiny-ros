package com.roslib.kobuki_msgs;

import java.lang.*;

public class Led implements com.roslib.ros.Msg {
    public int value;
    public static final int BLACK = (int)( 0);
    public static final int GREEN = (int)( 1);
    public static final int ORANGE = (int)( 2);
    public static final int RED = (int)( 3);

    public Led() {
        this.value = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.value >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.value   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/Led"; }
    public java.lang.String getMD5(){ return "cef01eb27ae755a42b3b02c26c2cb0f3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
