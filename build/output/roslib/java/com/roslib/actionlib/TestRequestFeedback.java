package com.roslib.actionlib;

import java.lang.*;

public class TestRequestFeedback implements com.roslib.ros.Msg {

    public TestRequestFeedback() {
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestRequestFeedback"; }
    public java.lang.String getMD5(){ return "f12766879fe103f43d9bcee183548cab"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
