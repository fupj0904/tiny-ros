package com.roslib.actionlib_tutorials;

import java.lang.*;

public class AveragingGoal implements com.roslib.ros.Msg {
    public int samples;

    public AveragingGoal() {
        this.samples = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.samples >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.samples >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.samples >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.samples >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.samples   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.samples |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.samples |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.samples |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/AveragingGoal"; }
    public java.lang.String getMD5(){ return "e13343a6ca326f6ee7dfcb08c20f31a0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
