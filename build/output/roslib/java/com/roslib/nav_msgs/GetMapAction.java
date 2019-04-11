package com.roslib.nav_msgs;

import java.lang.*;

public class GetMapAction implements com.roslib.ros.Msg {
    public com.roslib.nav_msgs.GetMapActionGoal action_goal;
    public com.roslib.nav_msgs.GetMapActionResult action_result;
    public com.roslib.nav_msgs.GetMapActionFeedback action_feedback;

    public GetMapAction() {
        this.action_goal = new com.roslib.nav_msgs.GetMapActionGoal();
        this.action_result = new com.roslib.nav_msgs.GetMapActionResult();
        this.action_feedback = new com.roslib.nav_msgs.GetMapActionFeedback();
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

    public java.lang.String getType(){ return "nav_msgs/GetMapAction"; }
    public java.lang.String getMD5(){ return "10a4e277d7b8e53bfc3df54d98b3edb1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
