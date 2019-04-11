package com.roslib.control_msgs;

import java.lang.*;

public class FollowJointTrajectoryGoal implements com.roslib.ros.Msg {
    public com.roslib.trajectory_msgs.JointTrajectory trajectory;
    public com.roslib.control_msgs.JointTolerance[] path_tolerance;
    public com.roslib.control_msgs.JointTolerance[] goal_tolerance;
    public com.roslib.ros.Duration goal_time_tolerance;

    public FollowJointTrajectoryGoal() {
        this.trajectory = new com.roslib.trajectory_msgs.JointTrajectory();
        this.path_tolerance = null;
        this.goal_tolerance = null;
        this.goal_time_tolerance = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.trajectory.serialize(outbuffer, offset);
        int length_path_tolerance = this.path_tolerance != null ? this.path_tolerance.length : 0;
        outbuffer[offset + 0] = (byte)((length_path_tolerance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_path_tolerance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_path_tolerance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_path_tolerance >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_path_tolerance; i++){
        offset = this.path_tolerance[i].serialize(outbuffer, offset);
        }
        int length_goal_tolerance = this.goal_tolerance != null ? this.goal_tolerance.length : 0;
        outbuffer[offset + 0] = (byte)((length_goal_tolerance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_goal_tolerance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_goal_tolerance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_goal_tolerance >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_goal_tolerance; i++){
        offset = this.goal_tolerance[i].serialize(outbuffer, offset);
        }
        outbuffer[offset + 0] = (byte)((this.goal_time_tolerance.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.goal_time_tolerance.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.goal_time_tolerance.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.goal_time_tolerance.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.goal_time_tolerance.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.goal_time_tolerance.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.goal_time_tolerance.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.goal_time_tolerance.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.trajectory.deserialize(inbuffer, offset);
        int length_path_tolerance = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_path_tolerance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_path_tolerance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_path_tolerance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_path_tolerance > 0) {
            this.path_tolerance = new com.roslib.control_msgs.JointTolerance[length_path_tolerance];
        }
        for (int i = 0; i < length_path_tolerance; i++){
        offset = this.path_tolerance[i].deserialize(inbuffer, offset);
        }
        int length_goal_tolerance = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_goal_tolerance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_goal_tolerance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_goal_tolerance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_goal_tolerance > 0) {
            this.goal_tolerance = new com.roslib.control_msgs.JointTolerance[length_goal_tolerance];
        }
        for (int i = 0; i < length_goal_tolerance; i++){
        offset = this.goal_tolerance[i].deserialize(inbuffer, offset);
        }
        this.goal_time_tolerance.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.goal_time_tolerance.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.goal_time_tolerance.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.goal_time_tolerance.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.goal_time_tolerance.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.goal_time_tolerance.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.goal_time_tolerance.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.goal_time_tolerance.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.trajectory.serializedLength();
        length += 4;
        int length_path_tolerance = this.path_tolerance != null ? this.path_tolerance.length : 0;
        for (int i = 0; i < length_path_tolerance; i++) {
        length += this.path_tolerance[i].serializedLength();
        }
        length += 4;
        int length_goal_tolerance = this.goal_tolerance != null ? this.goal_tolerance.length : 0;
        for (int i = 0; i < length_goal_tolerance; i++) {
        length += this.goal_tolerance[i].serializedLength();
        }
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/FollowJointTrajectoryGoal"; }
    public java.lang.String getMD5(){ return "1dfc2202b3af4756a0fecc1c87c514ca"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
