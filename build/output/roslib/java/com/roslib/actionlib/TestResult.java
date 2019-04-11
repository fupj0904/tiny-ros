package com.roslib.actionlib;

import java.lang.*;

public class TestResult implements com.roslib.ros.Msg {
    public int result;

    public TestResult() {
        this.result = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.result >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.result >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.result >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.result >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.result   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.result |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.result |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.result |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestResult"; }
    public java.lang.String getMD5(){ return "45a7b967f74bd5515b5360efcb447521"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
