package com.roslib.actionlib_tutorials;

import java.lang.*;

public class AveragingActionResult implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalStatus status;
    public com.roslib.actionlib_tutorials.AveragingResult result;

    public AveragingActionResult() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = new com.roslib.actionlib_msgs.GoalStatus();
        this.result = new com.roslib.actionlib_tutorials.AveragingResult();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.status.serialize(outbuffer, offset);
        offset = this.result.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.status.deserialize(inbuffer, offset);
        offset = this.result.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.status.serializedLength();
        length += this.result.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/AveragingActionResult"; }
    public java.lang.String getMD5(){ return "a985e192ae92b0e5bd92073270176164"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
