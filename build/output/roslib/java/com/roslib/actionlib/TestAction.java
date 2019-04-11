package com.roslib.actionlib;

import java.lang.*;

public class TestAction implements com.roslib.ros.Msg {
    public com.roslib.actionlib.TestActionGoal action_goal;
    public com.roslib.actionlib.TestActionResult action_result;
    public com.roslib.actionlib.TestActionFeedback action_feedback;

    public TestAction() {
        this.action_goal = new com.roslib.actionlib.TestActionGoal();
        this.action_result = new com.roslib.actionlib.TestActionResult();
        this.action_feedback = new com.roslib.actionlib.TestActionFeedback();
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

    public java.lang.String getType(){ return "actionlib/TestAction"; }
    public java.lang.String getMD5(){ return "95e4ed47eee5ae21e87da3c9e46c3ef2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
