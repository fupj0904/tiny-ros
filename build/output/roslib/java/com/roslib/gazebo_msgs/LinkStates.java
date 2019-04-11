package com.roslib.gazebo_msgs;

import java.lang.*;

public class LinkStates implements com.roslib.ros.Msg {
    public java.lang.String[] name;
    public com.roslib.geometry_msgs.Pose[] pose;
    public com.roslib.geometry_msgs.Twist[] twist;

    public LinkStates() {
        this.name = null;
        this.pose = null;
        this.twist = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name != null ? this.name.length : 0;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_name; i++){
        int length_namei = this.name[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_namei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_namei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_namei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_namei >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_namei; k++) {
            outbuffer[offset + k] = (byte)((this.name[i].getBytes())[k] & 0xFF);
        }
        offset += length_namei;
        }
        int length_pose = this.pose != null ? this.pose.length : 0;
        outbuffer[offset + 0] = (byte)((length_pose >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pose >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pose >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pose >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_pose; i++){
        offset = this.pose[i].serialize(outbuffer, offset);
        }
        int length_twist = this.twist != null ? this.twist.length : 0;
        outbuffer[offset + 0] = (byte)((length_twist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_twist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_twist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_twist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_twist; i++){
        offset = this.twist[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_name > 0) {
            this.name = new java.lang.String[length_name];
        }
        for (int i = 0; i < length_name; i++){
        int length_namei = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_namei |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_namei |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_namei |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_namei = new byte[length_namei];
        for(int k= 0; k< length_namei; k++){
            bytes_namei[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name[i] = new java.lang.String(bytes_namei);
        offset += length_namei;
        }
        int length_pose = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pose |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pose |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pose |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_pose > 0) {
            this.pose = new com.roslib.geometry_msgs.Pose[length_pose];
        }
        for (int i = 0; i < length_pose; i++){
        offset = this.pose[i].deserialize(inbuffer, offset);
        }
        int length_twist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_twist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_twist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_twist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_twist > 0) {
            this.twist = new com.roslib.geometry_msgs.Twist[length_twist];
        }
        for (int i = 0; i < length_twist; i++){
        offset = this.twist[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_name = this.name != null ? this.name.length : 0;
        for (int i = 0; i < length_name; i++) {
        int length_namei = this.name[i].getBytes().length;
        length += 4;
        length += length_namei;
        }
        length += 4;
        int length_pose = this.pose != null ? this.pose.length : 0;
        for (int i = 0; i < length_pose; i++) {
        length += this.pose[i].serializedLength();
        }
        length += 4;
        int length_twist = this.twist != null ? this.twist.length : 0;
        for (int i = 0; i < length_twist; i++) {
        length += this.twist[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/LinkStates"; }
    public java.lang.String getMD5(){ return "a6f8cc7b3dee31015716313fe2d419eb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
