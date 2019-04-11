package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigateToAction implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.NavigateToActionGoal action_goal;
    public com.roslib.yocs_msgs.NavigateToActionResult action_result;
    public com.roslib.yocs_msgs.NavigateToActionFeedback action_feedback;

    public NavigateToAction() {
        this.action_goal = new com.roslib.yocs_msgs.NavigateToActionGoal();
        this.action_result = new com.roslib.yocs_msgs.NavigateToActionResult();
        this.action_feedback = new com.roslib.yocs_msgs.NavigateToActionFeedback();
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

    public java.lang.String getType(){ return "yocs_msgs/NavigateToAction"; }
    public java.lang.String getMD5(){ return "aafde36888ef7412513ef730167ebae1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
