package com.roslib.control_msgs;

import java.lang.*;

public class GripperCommandAction implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.GripperCommandActionGoal action_goal;
    public com.roslib.control_msgs.GripperCommandActionResult action_result;
    public com.roslib.control_msgs.GripperCommandActionFeedback action_feedback;

    public GripperCommandAction() {
        this.action_goal = new com.roslib.control_msgs.GripperCommandActionGoal();
        this.action_result = new com.roslib.control_msgs.GripperCommandActionResult();
        this.action_feedback = new com.roslib.control_msgs.GripperCommandActionFeedback();
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

    public java.lang.String getType(){ return "control_msgs/GripperCommandAction"; }
    public java.lang.String getMD5(){ return "de87f13984bfd534da0d99bcb8221f5c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
