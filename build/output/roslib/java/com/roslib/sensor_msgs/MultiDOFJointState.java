package com.roslib.sensor_msgs;

import java.lang.*;

public class MultiDOFJointState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String[] joint_names;
    public com.roslib.geometry_msgs.Transform[] transforms;
    public com.roslib.geometry_msgs.Twist[] twist;
    public com.roslib.geometry_msgs.Wrench[] wrench;

    public MultiDOFJointState() {
        this.header = new com.roslib.std_msgs.Header();
        this.joint_names = null;
        this.transforms = null;
        this.twist = null;
        this.wrench = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_joint_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.joint_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_joint_namesi;
        }
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        outbuffer[offset + 0] = (byte)((length_transforms >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_transforms >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_transforms >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_transforms >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_transforms; i++){
        offset = this.transforms[i].serialize(outbuffer, offset);
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
        int length_wrench = this.wrench != null ? this.wrench.length : 0;
        outbuffer[offset + 0] = (byte)((length_wrench >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_wrench >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_wrench >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_wrench >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_wrench; i++){
        offset = this.wrench[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_joint_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_joint_names > 0) {
            this.joint_names = new java.lang.String[length_joint_names];
        }
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_namesi = new byte[length_joint_namesi];
        for(int k= 0; k< length_joint_namesi; k++){
            bytes_joint_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_names[i] = new java.lang.String(bytes_joint_namesi);
        offset += length_joint_namesi;
        }
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
        int length_wrench = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_wrench |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_wrench |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_wrench |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_wrench > 0) {
            this.wrench = new com.roslib.geometry_msgs.Wrench[length_wrench];
        }
        for (int i = 0; i < length_wrench; i++){
        offset = this.wrench[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        for (int i = 0; i < length_joint_names; i++) {
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        length += 4;
        length += length_joint_namesi;
        }
        length += 4;
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        for (int i = 0; i < length_transforms; i++) {
        length += this.transforms[i].serializedLength();
        }
        length += 4;
        int length_twist = this.twist != null ? this.twist.length : 0;
        for (int i = 0; i < length_twist; i++) {
        length += this.twist[i].serializedLength();
        }
        length += 4;
        int length_wrench = this.wrench != null ? this.wrench.length : 0;
        for (int i = 0; i < length_wrench; i++) {
        length += this.wrench[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/MultiDOFJointState"; }
    public java.lang.String getMD5(){ return "c1b0232d8e5071b24db76eb143f286eb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
