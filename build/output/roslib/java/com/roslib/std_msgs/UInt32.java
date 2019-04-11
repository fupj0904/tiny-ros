package com.roslib.std_msgs;

import java.lang.*;

public class UInt32 implements com.roslib.ros.Msg {
    public long data;

    public UInt32() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/UInt32"; }
    public java.lang.String getMD5(){ return "d4e8dc9c9e9d5076e594a3e342c2d4e3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
