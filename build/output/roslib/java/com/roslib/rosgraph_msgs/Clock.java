package com.roslib.rosgraph_msgs;

import java.lang.*;

public class Clock implements com.roslib.ros.Msg {
    public com.roslib.ros.Time clock;

    public Clock() {
        this.clock = new com.roslib.ros.Time();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.clock.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.clock.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.clock.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.clock.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.clock.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.clock.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.clock.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.clock.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.clock.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.clock.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.clock.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.clock.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.clock.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.clock.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.clock.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.clock.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "rosgraph_msgs/Clock"; }
    public java.lang.String getMD5(){ return "d3bedbe03b904b8181e3fef4bbe0a73e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
