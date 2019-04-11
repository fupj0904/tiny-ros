package com.roslib.tf2_msgs;

import java.lang.*;

public class LookupTransformAction implements com.roslib.ros.Msg {
    public com.roslib.tf2_msgs.LookupTransformActionGoal action_goal;
    public com.roslib.tf2_msgs.LookupTransformActionResult action_result;
    public com.roslib.tf2_msgs.LookupTransformActionFeedback action_feedback;

    public LookupTransformAction() {
        this.action_goal = new com.roslib.tf2_msgs.LookupTransformActionGoal();
        this.action_result = new com.roslib.tf2_msgs.LookupTransformActionResult();
        this.action_feedback = new com.roslib.tf2_msgs.LookupTransformActionFeedback();
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

    public java.lang.String getType(){ return "tf2_msgs/LookupTransformAction"; }
    public java.lang.String getMD5(){ return "49655e848adf6c64870a8eb763b94484"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
