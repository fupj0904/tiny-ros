package com.roslib.turtle_actionlib;

import java.lang.*;

public class ShapeAction implements com.roslib.ros.Msg {
    public com.roslib.turtle_actionlib.ShapeActionGoal action_goal;
    public com.roslib.turtle_actionlib.ShapeActionResult action_result;
    public com.roslib.turtle_actionlib.ShapeActionFeedback action_feedback;

    public ShapeAction() {
        this.action_goal = new com.roslib.turtle_actionlib.ShapeActionGoal();
        this.action_result = new com.roslib.turtle_actionlib.ShapeActionResult();
        this.action_feedback = new com.roslib.turtle_actionlib.ShapeActionFeedback();
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

    public java.lang.String getType(){ return "turtle_actionlib/ShapeAction"; }
    public java.lang.String getMD5(){ return "d8a79e16af9e148a32a80bec95bcb10b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
