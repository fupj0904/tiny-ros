package com.roslib.std_msgs;

import java.lang.*;

public class Duration implements com.roslib.ros.Msg {
    public com.roslib.ros.Duration data;

    public Duration() {
        this.data = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.data.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.data.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Duration"; }
    public java.lang.String getMD5(){ return "5dc598a1f3dfbcf0b7343c41b15d6ab2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
