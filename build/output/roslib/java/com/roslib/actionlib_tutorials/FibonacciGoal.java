package com.roslib.actionlib_tutorials;

import java.lang.*;

public class FibonacciGoal implements com.roslib.ros.Msg {
    public int order;

    public FibonacciGoal() {
        this.order = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.order >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.order >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.order >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.order >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.order   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.order |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.order |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.order |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/FibonacciGoal"; }
    public java.lang.String getMD5(){ return "fbbfa032d2ff316c39f91b435e9fe104"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
