package com.roslib.std_msgs;

import java.lang.*;

public class Time implements com.roslib.ros.Msg {
    public com.roslib.ros.Time data;

    public Time() {
        this.data = new com.roslib.ros.Time();
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

    public java.lang.String getType(){ return "std_msgs/Time"; }
    public java.lang.String getMD5(){ return "64602ed67393e1e61260ab68d6fa2045"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
