package com.roslib.move_base_msgs;

import java.lang.*;

public class MoveBaseAction implements com.roslib.ros.Msg {
    public com.roslib.move_base_msgs.MoveBaseActionGoal action_goal;
    public com.roslib.move_base_msgs.MoveBaseActionResult action_result;
    public com.roslib.move_base_msgs.MoveBaseActionFeedback action_feedback;

    public MoveBaseAction() {
        this.action_goal = new com.roslib.move_base_msgs.MoveBaseActionGoal();
        this.action_result = new com.roslib.move_base_msgs.MoveBaseActionResult();
        this.action_feedback = new com.roslib.move_base_msgs.MoveBaseActionFeedback();
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

    public java.lang.String getType(){ return "move_base_msgs/MoveBaseAction"; }
    public java.lang.String getMD5(){ return "6d2deb33785f04f7e031bbd0b696a274"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
