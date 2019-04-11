package com.roslib.turtlebot_actions;

import java.lang.*;

public class FindFiducialAction implements com.roslib.ros.Msg {
    public com.roslib.turtlebot_actions.FindFiducialActionGoal action_goal;
    public com.roslib.turtlebot_actions.FindFiducialActionResult action_result;
    public com.roslib.turtlebot_actions.FindFiducialActionFeedback action_feedback;

    public FindFiducialAction() {
        this.action_goal = new com.roslib.turtlebot_actions.FindFiducialActionGoal();
        this.action_result = new com.roslib.turtlebot_actions.FindFiducialActionResult();
        this.action_feedback = new com.roslib.turtlebot_actions.FindFiducialActionFeedback();
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

    public java.lang.String getType(){ return "turtlebot_actions/FindFiducialAction"; }
    public java.lang.String getMD5(){ return "7e8fbfb1d501b0b59545dd13cae1208d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
