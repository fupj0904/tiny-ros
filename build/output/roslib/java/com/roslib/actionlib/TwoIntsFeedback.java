package com.roslib.actionlib;

import java.lang.*;

public class TwoIntsFeedback implements com.roslib.ros.Msg {

    public TwoIntsFeedback() {
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

    public java.lang.String getType(){ return "actionlib/TwoIntsFeedback"; }
    public java.lang.String getMD5(){ return "782b19a4f01be8638a09613998a91f08"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
