package com.roslib.kobuki_msgs;

import java.lang.*;

public class AutoDockingAction implements com.roslib.ros.Msg {
    public com.roslib.kobuki_msgs.AutoDockingActionGoal action_goal;
    public com.roslib.kobuki_msgs.AutoDockingActionResult action_result;
    public com.roslib.kobuki_msgs.AutoDockingActionFeedback action_feedback;

    public AutoDockingAction() {
        this.action_goal = new com.roslib.kobuki_msgs.AutoDockingActionGoal();
        this.action_result = new com.roslib.kobuki_msgs.AutoDockingActionResult();
        this.action_feedback = new com.roslib.kobuki_msgs.AutoDockingActionFeedback();
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

    public java.lang.String getType(){ return "kobuki_msgs/AutoDockingAction"; }
    public java.lang.String getMD5(){ return "efacb9db8ea32e549a6463cf0f86ed04"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
