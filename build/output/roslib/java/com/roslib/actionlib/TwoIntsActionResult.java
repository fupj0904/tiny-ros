package com.roslib.actionlib;

import java.lang.*;

public class TwoIntsActionResult implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalStatus status;
    public com.roslib.actionlib.TwoIntsResult result;

    public TwoIntsActionResult() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = new com.roslib.actionlib_msgs.GoalStatus();
        this.result = new com.roslib.actionlib.TwoIntsResult();
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

    public java.lang.String getType(){ return "actionlib/TwoIntsActionResult"; }
    public java.lang.String getMD5(){ return "9bdb328c081bd78f60abced22db10ae7"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
