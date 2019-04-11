package com.roslib.actionlib_tutorials;

import java.lang.*;

public class AveragingAction implements com.roslib.ros.Msg {
    public com.roslib.actionlib_tutorials.AveragingActionGoal action_goal;
    public com.roslib.actionlib_tutorials.AveragingActionResult action_result;
    public com.roslib.actionlib_tutorials.AveragingActionFeedback action_feedback;

    public AveragingAction() {
        this.action_goal = new com.roslib.actionlib_tutorials.AveragingActionGoal();
        this.action_result = new com.roslib.actionlib_tutorials.AveragingActionResult();
        this.action_feedback = new com.roslib.actionlib_tutorials.AveragingActionFeedback();
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

    public java.lang.String getType(){ return "actionlib_tutorials/AveragingAction"; }
    public java.lang.String getMD5(){ return "aedca8a7e3697f2593c3eb492881a81b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
