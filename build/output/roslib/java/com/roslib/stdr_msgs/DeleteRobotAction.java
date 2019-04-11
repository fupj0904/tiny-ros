package com.roslib.stdr_msgs;

import java.lang.*;

public class DeleteRobotAction implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.DeleteRobotActionGoal action_goal;
    public com.roslib.stdr_msgs.DeleteRobotActionResult action_result;
    public com.roslib.stdr_msgs.DeleteRobotActionFeedback action_feedback;

    public DeleteRobotAction() {
        this.action_goal = new com.roslib.stdr_msgs.DeleteRobotActionGoal();
        this.action_result = new com.roslib.stdr_msgs.DeleteRobotActionResult();
        this.action_feedback = new com.roslib.stdr_msgs.DeleteRobotActionFeedback();
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

    public java.lang.String getType(){ return "stdr_msgs/DeleteRobotAction"; }
    public java.lang.String getMD5(){ return "7d0914b8935173b8230109fd57b5b294"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
