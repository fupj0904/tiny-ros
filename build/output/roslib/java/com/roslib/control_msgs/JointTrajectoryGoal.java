package com.roslib.control_msgs;

import java.lang.*;

public class JointTrajectoryGoal implements com.roslib.ros.Msg {
    public com.roslib.trajectory_msgs.JointTrajectory trajectory;

    public JointTrajectoryGoal() {
        this.trajectory = new com.roslib.trajectory_msgs.JointTrajectory();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.trajectory.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.trajectory.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.trajectory.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/JointTrajectoryGoal"; }
    public java.lang.String getMD5(){ return "50904210d346d9730b34d8e24b5a520b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
