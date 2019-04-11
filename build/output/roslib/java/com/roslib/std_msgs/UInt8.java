package com.roslib.std_msgs;

import java.lang.*;

public class UInt8 implements com.roslib.ros.Msg {
    public int data;

    public UInt8() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/UInt8"; }
    public java.lang.String getMD5(){ return "6f90555707d539e508484b884b2acc65"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
