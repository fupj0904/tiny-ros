package com.roslib.control_msgs;

import java.lang.*;

public class GripperCommandActionFeedback implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalStatus status;
    public com.roslib.control_msgs.GripperCommandFeedback feedback;

    public GripperCommandActionFeedback() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = new com.roslib.actionlib_msgs.GoalStatus();
        this.feedback = new com.roslib.control_msgs.GripperCommandFeedback();
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

    public java.lang.String getType(){ return "control_msgs/GripperCommandActionFeedback"; }
    public java.lang.String getMD5(){ return "9c8253beaed01a6c4076683e676c269c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
