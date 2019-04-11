package com.roslib.turtle_actionlib;

import java.lang.*;

public class ShapeFeedback implements com.roslib.ros.Msg {

    public ShapeFeedback() {
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

    public java.lang.String getType(){ return "turtle_actionlib/ShapeFeedback"; }
    public java.lang.String getMD5(){ return "edba39d84dde7fbe1f1bdcbabe6a6e18"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
