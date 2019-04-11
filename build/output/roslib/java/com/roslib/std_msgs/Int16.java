package com.roslib.std_msgs;

import java.lang.*;

public class Int16 implements com.roslib.ros.Msg {
    public short data;

    public Int16() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Int16"; }
    public java.lang.String getMD5(){ return "156735359f7b6d347f113a1090134af3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
