package com.roslib.trajectory_msgs;

import java.lang.*;

public class MultiDOFJointTrajectoryPoint implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Transform[] transforms;
    public com.roslib.geometry_msgs.Twist[] velocities;
    public com.roslib.geometry_msgs.Twist[] accelerations;
    public com.roslib.ros.Duration time_from_start;

    public MultiDOFJointTrajectoryPoint() {
        this.transforms = null;
        this.velocities = null;
        this.accelerations = null;
        this.time_from_start = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        outbuffer[offset + 0] = (byte)((length_transforms >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_transforms >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_transforms >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_transforms >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_transforms; i++){
        offset = this.transforms[i].serialize(outbuffer, offset);
        }
        int length_velocities = this.velocities != null ? this.velocities.length : 0;
        outbuffer[offset + 0] = (byte)((length_velocities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_velocities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_velocities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_velocities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_velocities; i++){
        offset = this.velocities[i].serialize(outbuffer, offset);
        }
        int length_accelerations = this.accelerations != null ? this.accelerations.length : 0;
        outbuffer[offset + 0] = (byte)((length_accelerations >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_accelerations >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_accelerations >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_accelerations >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_accelerations; i++){
        offset = this.accelerations[i].serialize(outbuffer, offset);
        }
        outbuffer[offset + 0] = (byte)((this.time_from_start.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_from_start.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_from_start.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_from_start.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time_from_start.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_from_start.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_from_start.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_from_start.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_transforms = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_transforms |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_transforms |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_transforms |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_transforms > 0) {
            this.transforms = new com.roslib.geometry_msgs.Transform[length_transforms];
        }
        for (int i = 0; i < length_transforms; i++){
        offset = this.transforms[i].deserialize(inbuffer, offset);
        }
        int length_velocities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_velocities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_velocities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_velocities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_velocities > 0) {
            this.velocities = new com.roslib.geometry_msgs.Twist[length_velocities];
        }
        for (int i = 0; i < length_velocities; i++){
        offset = this.velocities[i].deserialize(inbuffer, offset);
        }
        int length_accelerations = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_accelerations |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_accelerations |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_accelerations |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_accelerations > 0) {
            this.accelerations = new com.roslib.geometry_msgs.Twist[length_accelerations];
        }
        for (int i = 0; i < length_accelerations; i++){
        offset = this.accelerations[i].deserialize(inbuffer, offset);
        }
        this.time_from_start.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_from_start.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_from_start.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_from_start.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time_from_start.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_from_start.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_from_start.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_from_start.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        for (int i = 0; i < length_transforms; i++) {
        length += this.transforms[i].serializedLength();
        }
        length += 4;
        int length_velocities = this.velocities != null ? this.velocities.length : 0;
        for (int i = 0; i < length_velocities; i++) {
        length += this.velocities[i].serializedLength();
        }
        length += 4;
        int length_accelerations = this.accelerations != null ? this.accelerations.length : 0;
        for (int i = 0; i < length_accelerations; i++) {
        length += this.accelerations[i].serializedLength();
        }
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "trajectory_msgs/MultiDOFJointTrajectoryPoint"; }
    public java.lang.String getMD5(){ return "f8b4a74b416279b5c5d565029308ff08"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
