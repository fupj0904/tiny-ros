package com.roslib.control_msgs;

import java.lang.*;

public class FollowJointTrajectoryAction implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.FollowJointTrajectoryActionGoal action_goal;
    public com.roslib.control_msgs.FollowJointTrajectoryActionResult action_result;
    public com.roslib.control_msgs.FollowJointTrajectoryActionFeedback action_feedback;

    public FollowJointTrajectoryAction() {
        this.action_goal = new com.roslib.control_msgs.FollowJointTrajectoryActionGoal();
        this.action_result = new com.roslib.control_msgs.FollowJointTrajectoryActionResult();
        this.action_feedback = new com.roslib.control_msgs.FollowJointTrajectoryActionFeedback();
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

    public java.lang.String getType(){ return "control_msgs/FollowJointTrajectoryAction"; }
    public java.lang.String getMD5(){ return "896724979db6afd8f16c245880414f8a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
