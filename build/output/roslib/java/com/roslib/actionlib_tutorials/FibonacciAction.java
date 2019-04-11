package com.roslib.actionlib_tutorials;

import java.lang.*;

public class FibonacciAction implements com.roslib.ros.Msg {
    public com.roslib.actionlib_tutorials.FibonacciActionGoal action_goal;
    public com.roslib.actionlib_tutorials.FibonacciActionResult action_result;
    public com.roslib.actionlib_tutorials.FibonacciActionFeedback action_feedback;

    public FibonacciAction() {
        this.action_goal = new com.roslib.actionlib_tutorials.FibonacciActionGoal();
        this.action_result = new com.roslib.actionlib_tutorials.FibonacciActionResult();
        this.action_feedback = new com.roslib.actionlib_tutorials.FibonacciActionFeedback();
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

    public java.lang.String getType(){ return "actionlib_tutorials/FibonacciAction"; }
    public java.lang.String getMD5(){ return "c54e011e741c75472b9ca2a2e845c5b9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
