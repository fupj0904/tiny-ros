package com.roslib.control_msgs;

import java.lang.*;

public class PointHeadAction implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.PointHeadActionGoal action_goal;
    public com.roslib.control_msgs.PointHeadActionResult action_result;
    public com.roslib.control_msgs.PointHeadActionFeedback action_feedback;

    public PointHeadAction() {
        this.action_goal = new com.roslib.control_msgs.PointHeadActionGoal();
        this.action_result = new com.roslib.control_msgs.PointHeadActionResult();
        this.action_feedback = new com.roslib.control_msgs.PointHeadActionFeedback();
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

    public java.lang.String getType(){ return "control_msgs/PointHeadAction"; }
    public java.lang.String getMD5(){ return "5a58781ca5e0183491ebdad7b7490362"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
