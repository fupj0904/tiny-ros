package com.roslib.yocs_msgs;

import java.lang.*;

public class DockingInteractorAction implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.DockingInteractorActionGoal action_goal;
    public com.roslib.yocs_msgs.DockingInteractorActionResult action_result;
    public com.roslib.yocs_msgs.DockingInteractorActionFeedback action_feedback;

    public DockingInteractorAction() {
        this.action_goal = new com.roslib.yocs_msgs.DockingInteractorActionGoal();
        this.action_result = new com.roslib.yocs_msgs.DockingInteractorActionResult();
        this.action_feedback = new com.roslib.yocs_msgs.DockingInteractorActionFeedback();
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

    public java.lang.String getType(){ return "yocs_msgs/DockingInteractorAction"; }
    public java.lang.String getMD5(){ return "659d89edfb9097db91f0c3b9417a489c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
