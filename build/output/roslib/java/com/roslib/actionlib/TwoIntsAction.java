package com.roslib.actionlib;

import java.lang.*;

public class TwoIntsAction implements com.roslib.ros.Msg {
    public com.roslib.actionlib.TwoIntsActionGoal action_goal;
    public com.roslib.actionlib.TwoIntsActionResult action_result;
    public com.roslib.actionlib.TwoIntsActionFeedback action_feedback;

    public TwoIntsAction() {
        this.action_goal = new com.roslib.actionlib.TwoIntsActionGoal();
        this.action_result = new com.roslib.actionlib.TwoIntsActionResult();
        this.action_feedback = new com.roslib.actionlib.TwoIntsActionFeedback();
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

    public java.lang.String getType(){ return "actionlib/TwoIntsAction"; }
    public java.lang.String getMD5(){ return "2a0bb4bb65878333f9d365c8b4affdb4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
