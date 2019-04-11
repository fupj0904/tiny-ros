package com.roslib.turtlebot_actions;

import java.lang.*;

public class TurtlebotMoveAction implements com.roslib.ros.Msg {
    public com.roslib.turtlebot_actions.TurtlebotMoveActionGoal action_goal;
    public com.roslib.turtlebot_actions.TurtlebotMoveActionResult action_result;
    public com.roslib.turtlebot_actions.TurtlebotMoveActionFeedback action_feedback;

    public TurtlebotMoveAction() {
        this.action_goal = new com.roslib.turtlebot_actions.TurtlebotMoveActionGoal();
        this.action_result = new com.roslib.turtlebot_actions.TurtlebotMoveActionResult();
        this.action_feedback = new com.roslib.turtlebot_actions.TurtlebotMoveActionFeedback();
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

    public java.lang.String getType(){ return "turtlebot_actions/TurtlebotMoveAction"; }
    public java.lang.String getMD5(){ return "dd3a888ca15b5d8486b1029834e594b3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
