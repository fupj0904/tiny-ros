package com.roslib.gazebo_msgs;

import java.lang.*;

public class ApplyJointEffort {

public static final java.lang.String APPLYJOINTEFFORT = "gazebo_msgs/ApplyJointEffort";

public class ApplyJointEffortRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String joint_name;
    public double effort;
    public com.roslib.ros.Time start_time;
    public com.roslib.ros.Duration duration;

    public ApplyJointEffortRequest() {
        this.joint_name = "";
        this.effort = 0;
        this.start_time = new com.roslib.ros.Time();
        this.duration = new com.roslib.ros.Duration();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_joint_name = this.joint_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_name; k++) {
            outbuffer[offset + k] = (byte)((this.joint_name.getBytes())[k] & 0xFF);
        }
        offset += length_joint_name;
        long bits_effort = Double.doubleToRawLongBits(this.effort);
        outbuffer[offset + 0] = (byte)((bits_effort >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_effort >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_effort >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_effort >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_effort >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_effort >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_effort >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_effort >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset + 0] = (byte)((this.start_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.start_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.start_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.start_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.start_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.start_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.start_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.start_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.duration.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.duration.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.duration.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.duration.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.duration.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.duration.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.duration.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.duration.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_joint_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_name = new byte[length_joint_name];
        for(int k= 0; k< length_joint_name; k++){
            bytes_joint_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_name = new java.lang.String(bytes_joint_name);
        offset += length_joint_name;
        long bits_effort = 0;
        bits_effort |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_effort |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_effort |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_effort |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_effort |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_effort |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_effort |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_effort |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.effort = Double.longBitsToDouble(bits_effort);
        offset += 8;
        this.start_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.start_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.start_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.start_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.start_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.start_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.start_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.start_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.duration.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.duration.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.duration.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.duration.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.duration.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.duration.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.duration.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.duration.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_joint_name = this.joint_name.getBytes().length;
        length += 4;
        length += length_joint_name;
        length += 8;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return APPLYJOINTEFFORT; }
    public java.lang.String getMD5(){ return "90595a46cf1fb4ee17158e2f7034a0eb"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ApplyJointEffortResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public ApplyJointEffortResponse() {
        this.success = false;
        this.status_message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status_message = this.status_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_message; k++) {
            outbuffer[offset + k] = (byte)((this.status_message.getBytes())[k] & 0xFF);
        }
        offset += length_status_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_message = new byte[length_status_message];
        for(int k= 0; k< length_status_message; k++){
            bytes_status_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_message = new java.lang.String(bytes_status_message);
        offset += length_status_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return APPLYJOINTEFFORT; }
    public java.lang.String getMD5(){ return "953194fc8ca726693bef2876cebb0438"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
