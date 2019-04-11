package com.roslib.actionlib;

import java.lang.*;

public class TestActionFeedback implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalStatus status;
    public com.roslib.actionlib.TestFeedback feedback;

    public TestActionFeedback() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = new com.roslib.actionlib_msgs.GoalStatus();
        this.feedback = new com.roslib.actionlib.TestFeedback();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.status.serialize(outbuffer, offset);
        offset = this.feedback.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.status.deserialize(inbuffer, offset);
        offset = this.feedback.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.status.serializedLength();
        length += this.feedback.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestActionFeedback"; }
    public java.lang.String getMD5(){ return "ab40999852b0c43b140e587a49caeaf5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
