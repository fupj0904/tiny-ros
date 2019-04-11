package com.roslib.actionlib;

import java.lang.*;

public class TestGoal implements com.roslib.ros.Msg {
    public int goal;

    public TestGoal() {
        this.goal = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.goal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.goal >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.goal >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.goal >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.goal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.goal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.goal |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.goal |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestGoal"; }
    public java.lang.String getMD5(){ return "6fd4878a9c3fac9988e8843da436d77f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
