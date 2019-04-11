package com.roslib.actionlib;

import java.lang.*;

public class TestRequestAction implements com.roslib.ros.Msg {
    public com.roslib.actionlib.TestRequestActionGoal action_goal;
    public com.roslib.actionlib.TestRequestActionResult action_result;
    public com.roslib.actionlib.TestRequestActionFeedback action_feedback;

    public TestRequestAction() {
        this.action_goal = new com.roslib.actionlib.TestRequestActionGoal();
        this.action_result = new com.roslib.actionlib.TestRequestActionResult();
        this.action_feedback = new com.roslib.actionlib.TestRequestActionFeedback();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.action_goal.serialize(outbuffer, offset);
        offset = this.action_result.serialize(outbuffer, offset);
        offset = this.action_feedback.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.action_goal.deserialize(inbuffer, offset);
        offset = this.action_result.deserialize(inbuffer, offset);
        offset = this.action_feedback.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.action_goal.serializedLength();
        length += this.action_result.serializedLength();
        length += this.action_feedback.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestRequestAction"; }
    public java.lang.String getMD5(){ return "e011e5c4221d924ea6151e4bd7d7d37f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
