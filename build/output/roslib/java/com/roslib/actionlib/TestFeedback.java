package com.roslib.actionlib;

import java.lang.*;

public class TestFeedback implements com.roslib.ros.Msg {
    public int feedback;

    public TestFeedback() {
        this.feedback = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.feedback >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.feedback >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.feedback >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.feedback >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.feedback   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.feedback |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.feedback |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.feedback |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestFeedback"; }
    public java.lang.String getMD5(){ return "19722dac21b73e232681d4460d851efb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
