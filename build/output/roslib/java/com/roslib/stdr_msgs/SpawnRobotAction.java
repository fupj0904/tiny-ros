package com.roslib.stdr_msgs;

import java.lang.*;

public class SpawnRobotAction implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.SpawnRobotActionGoal action_goal;
    public com.roslib.stdr_msgs.SpawnRobotActionResult action_result;
    public com.roslib.stdr_msgs.SpawnRobotActionFeedback action_feedback;

    public SpawnRobotAction() {
        this.action_goal = new com.roslib.stdr_msgs.SpawnRobotActionGoal();
        this.action_result = new com.roslib.stdr_msgs.SpawnRobotActionResult();
        this.action_feedback = new com.roslib.stdr_msgs.SpawnRobotActionFeedback();
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

    public java.lang.String getType(){ return "stdr_msgs/SpawnRobotAction"; }
    public java.lang.String getMD5(){ return "3d58eb447d15ee1ceb088e3bde2b4206"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
