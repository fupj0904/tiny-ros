package com.roslib.trajectory_msgs;

import java.lang.*;

public class JointTrajectoryPoint implements com.roslib.ros.Msg {
    public double[] positions;
    public double[] velocities;
    public double[] accelerations;
    public double[] effort;
    public com.roslib.ros.Duration time_from_start;

    public JointTrajectoryPoint() {
        this.positions = null;
        this.velocities = null;
        this.accelerations = null;
        this.effort = null;
        this.time_from_start = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_positions = this.positions != null ? this.positions.length : 0;
        outbuffer[offset + 0] = (byte)((length_positions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_positions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_positions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_positions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_positions; i++){
        long bits_positionsi = Double.doubleToRawLongBits(this.positions[i]);
        outbuffer[offset + 0] = (byte)((bits_positionsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_positionsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_positionsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_positionsi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_positionsi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_positionsi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_positionsi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_positionsi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_velocities = this.velocities != null ? this.velocities.length : 0;
        outbuffer[offset + 0] = (byte)((length_velocities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_velocities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_velocities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_velocities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_velocities; i++){
        long bits_velocitiesi = Double.doubleToRawLongBits(this.velocities[i]);
        outbuffer[offset + 0] = (byte)((bits_velocitiesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_velocitiesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_velocitiesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_velocitiesi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_velocitiesi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_velocitiesi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_velocitiesi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_velocitiesi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_accelerations = this.accelerations != null ? this.accelerations.length : 0;
        outbuffer[offset + 0] = (byte)((length_accelerations >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_accelerations >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_accelerations >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_accelerations >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_accelerations; i++){
        long bits_accelerationsi = Double.doubleToRawLongBits(this.accelerations[i]);
        outbuffer[offset + 0] = (byte)((bits_accelerationsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_accelerationsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_accelerationsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_accelerationsi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_accelerationsi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_accelerationsi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_accelerationsi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_accelerationsi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_effort = this.effort != null ? this.effort.length : 0;
        outbuffer[offset + 0] = (byte)((length_effort >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_effort >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_effort >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_effort >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_effort; i++){
        long bits_efforti = Double.doubleToRawLongBits(this.effort[i]);
        outbuffer[offset + 0] = (byte)((bits_efforti >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_efforti >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_efforti >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_efforti >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_efforti >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_efforti >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_efforti >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_efforti >> (8 * 7)) & 0xFF);
        offset += 8;
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
        int length_positions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_positions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_positions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_positions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_positions > 0) {
            this.positions = new double[length_positions];
        }
        for (int i = 0; i < length_positions; i++){
        long bits_positionsi = 0;
        bits_positionsi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_positionsi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_positionsi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_positionsi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_positionsi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_positionsi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_positionsi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_positionsi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.positions[i] = Double.longBitsToDouble(bits_positionsi);
        offset += 8;
        }
        int length_velocities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_velocities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_velocities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_velocities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_velocities > 0) {
            this.velocities = new double[length_velocities];
        }
        for (int i = 0; i < length_velocities; i++){
        long bits_velocitiesi = 0;
        bits_velocitiesi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_velocitiesi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_velocitiesi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_velocitiesi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_velocitiesi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_velocitiesi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_velocitiesi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_velocitiesi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.velocities[i] = Double.longBitsToDouble(bits_velocitiesi);
        offset += 8;
        }
        int length_accelerations = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_accelerations |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_accelerations |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_accelerations |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_accelerations > 0) {
            this.accelerations = new double[length_accelerations];
        }
        for (int i = 0; i < length_accelerations; i++){
        long bits_accelerationsi = 0;
        bits_accelerationsi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_accelerationsi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_accelerationsi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_accelerationsi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_accelerationsi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_accelerationsi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_accelerationsi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_accelerationsi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.accelerations[i] = Double.longBitsToDouble(bits_accelerationsi);
        offset += 8;
        }
        int length_effort = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_effort |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_effort |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_effort |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_effort > 0) {
            this.effort = new double[length_effort];
        }
        for (int i = 0; i < length_effort; i++){
        long bits_efforti = 0;
        bits_efforti |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_efforti |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_efforti |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_efforti |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_efforti |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_efforti |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_efforti |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_efforti |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.effort[i] = Double.longBitsToDouble(bits_efforti);
        offset += 8;
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
        int length_positions = this.positions != null ? this.positions.length : 0;
        for (int i = 0; i < length_positions; i++) {
        length += 8;
        }
        length += 4;
        int length_velocities = this.velocities != null ? this.velocities.length : 0;
        for (int i = 0; i < length_velocities; i++) {
        length += 8;
        }
        length += 4;
        int length_accelerations = this.accelerations != null ? this.accelerations.length : 0;
        for (int i = 0; i < length_accelerations; i++) {
        length += 8;
        }
        length += 4;
        int length_effort = this.effort != null ? this.effort.length : 0;
        for (int i = 0; i < length_effort; i++) {
        length += 8;
        }
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "trajectory_msgs/JointTrajectoryPoint"; }
    public java.lang.String getMD5(){ return "38679319321341510f6fde7d7f745eb0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
