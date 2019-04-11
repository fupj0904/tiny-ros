package com.roslib.control_msgs;

import java.lang.*;

public class FollowJointTrajectoryActionGoal implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalID goal_id;
    public com.roslib.control_msgs.FollowJointTrajectoryGoal goal;

    public FollowJointTrajectoryActionGoal() {
        this.header = new com.roslib.std_msgs.Header();
        this.goal_id = new com.roslib.actionlib_msgs.GoalID();
        this.goal = new com.roslib.control_msgs.FollowJointTrajectoryGoal();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.goal_id.serialize(outbuffer, offset);
        offset = this.goal.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.goal_id.deserialize(inbuffer, offset);
        offset = this.goal.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.goal_id.serializedLength();
        length += this.goal.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/FollowJointTrajectoryActionGoal"; }
    public java.lang.String getMD5(){ return "01fd8d7e561f23e1c30281b3be024d60"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
