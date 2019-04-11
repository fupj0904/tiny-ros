package com.roslib.move_base_msgs;

import java.lang.*;

public class MoveBaseGoal implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.PoseStamped target_pose;

    public MoveBaseGoal() {
        this.target_pose = new com.roslib.geometry_msgs.PoseStamped();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.target_pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.target_pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.target_pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "move_base_msgs/MoveBaseGoal"; }
    public java.lang.String getMD5(){ return "1dfe03a48bc9ae61ad14a86bd30eac33"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
