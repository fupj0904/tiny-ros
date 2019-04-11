package com.roslib.sensor_msgs;

import java.lang.*;

public class Imu implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Quaternion orientation;
    public double[] orientation_covariance;
    public com.roslib.geometry_msgs.Vector3 angular_velocity;
    public double[] angular_velocity_covariance;
    public com.roslib.geometry_msgs.Vector3 linear_acceleration;
    public double[] linear_acceleration_covariance;

    public Imu() {
        this.header = new com.roslib.std_msgs.Header();
        this.orientation = new com.roslib.geometry_msgs.Quaternion();
        this.orientation_covariance = new double[9];
        this.angular_velocity = new com.roslib.geometry_msgs.Vector3();
        this.angular_velocity_covariance = new double[9];
        this.linear_acceleration = new com.roslib.geometry_msgs.Vector3();
        this.linear_acceleration_covariance = new double[9];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.orientation.serialize(outbuffer, offset);
        for (int i = 0; i < 9; i++){
        long bits_orientation_covariancei = Double.doubleToRawLongBits(this.orientation_covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_orientation_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_orientation_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_orientation_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_orientation_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_orientation_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_orientation_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_orientation_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_orientation_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        offset = this.angular_velocity.serialize(outbuffer, offset);
        for (int i = 0; i < 9; i++){
        long bits_angular_velocity_covariancei = Double.doubleToRawLongBits(this.angular_velocity_covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_angular_velocity_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angular_velocity_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angular_velocity_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angular_velocity_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_angular_velocity_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_angular_velocity_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_angular_velocity_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_angular_velocity_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        offset = this.linear_acceleration.serialize(outbuffer, offset);
        for (int i = 0; i < 9; i++){
        long bits_linear_acceleration_covariancei = Double.doubleToRawLongBits(this.linear_acceleration_covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_linear_acceleration_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_linear_acceleration_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_linear_acceleration_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_linear_acceleration_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_linear_acceleration_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_linear_acceleration_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_linear_acceleration_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_linear_acceleration_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.orientation.deserialize(inbuffer, offset);
        for(int i = 0; i < 9; i++){
        long bits_orientation_covariancei = 0;
        bits_orientation_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_orientation_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.orientation_covariance[i] = Double.longBitsToDouble(bits_orientation_covariancei);
        offset += 8;
        }
        offset = this.angular_velocity.deserialize(inbuffer, offset);
        for(int i = 0; i < 9; i++){
        long bits_angular_velocity_covariancei = 0;
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_angular_velocity_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.angular_velocity_covariance[i] = Double.longBitsToDouble(bits_angular_velocity_covariancei);
        offset += 8;
        }
        offset = this.linear_acceleration.deserialize(inbuffer, offset);
        for(int i = 0; i < 9; i++){
        long bits_linear_acceleration_covariancei = 0;
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_linear_acceleration_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.linear_acceleration_covariance[i] = Double.longBitsToDouble(bits_linear_acceleration_covariancei);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.orientation.serializedLength();
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        length += this.angular_velocity.serializedLength();
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        length += this.linear_acceleration.serializedLength();
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/Imu"; }
    public java.lang.String getMD5(){ return "a42c1ab94665a5807834c0ea19a6d16a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
