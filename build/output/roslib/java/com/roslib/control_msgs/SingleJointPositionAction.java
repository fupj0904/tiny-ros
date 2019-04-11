package com.roslib.control_msgs;

import java.lang.*;

public class SingleJointPositionAction implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.SingleJointPositionActionGoal action_goal;
    public com.roslib.control_msgs.SingleJointPositionActionResult action_result;
    public com.roslib.control_msgs.SingleJointPositionActionFeedback action_feedback;

    public SingleJointPositionAction() {
        this.action_goal = new com.roslib.control_msgs.SingleJointPositionActionGoal();
        this.action_result = new com.roslib.control_msgs.SingleJointPositionActionResult();
        this.action_feedback = new com.roslib.control_msgs.SingleJointPositionActionFeedback();
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

    public java.lang.String getType(){ return "control_msgs/SingleJointPositionAction"; }
    public java.lang.String getMD5(){ return "a50b3ffee53d6fa44d65aa3715a64267"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
