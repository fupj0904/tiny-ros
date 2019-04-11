package com.roslib.control_msgs;

import java.lang.*;

public class JointTrajectoryAction implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.JointTrajectoryActionGoal action_goal;
    public com.roslib.control_msgs.JointTrajectoryActionResult action_result;
    public com.roslib.control_msgs.JointTrajectoryActionFeedback action_feedback;

    public JointTrajectoryAction() {
        this.action_goal = new com.roslib.control_msgs.JointTrajectoryActionGoal();
        this.action_result = new com.roslib.control_msgs.JointTrajectoryActionResult();
        this.action_feedback = new com.roslib.control_msgs.JointTrajectoryActionFeedback();
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

    public java.lang.String getType(){ return "control_msgs/JointTrajectoryAction"; }
    public java.lang.String getMD5(){ return "6773cbef98f12b4f226561e019a3c0de"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
