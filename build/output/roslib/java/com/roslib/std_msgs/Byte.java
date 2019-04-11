package com.roslib.std_msgs;

import java.lang.*;

public class Byte implements com.roslib.ros.Msg {
    public byte data;

    public Byte() {
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
        this.data   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Byte"; }
    public java.lang.String getMD5(){ return "8c5affe485c5af9bd37408a1a905a49c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
