package com.roslib.gazebo_msgs;

import java.lang.*;

public class ApplyBodyWrench {

public static final java.lang.String APPLYBODYWRENCH = "gazebo_msgs/ApplyBodyWrench";

public class ApplyBodyWrenchRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String body_name;
    public java.lang.String reference_frame;
    public com.roslib.geometry_msgs.Point reference_point;
    public com.roslib.geometry_msgs.Wrench wrench;
    public com.roslib.ros.Time start_time;
    public com.roslib.ros.Duration duration;

    public ApplyBodyWrenchRequest() {
        this.body_name = "";
        this.reference_frame = "";
        this.reference_point = new com.roslib.geometry_msgs.Point();
        this.wrench = new com.roslib.geometry_msgs.Wrench();
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
        int length_body_name = this.body_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_body_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_body_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_body_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_body_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_body_name; k++) {
            outbuffer[offset + k] = (byte)((this.body_name.getBytes())[k] & 0xFF);
        }
        offset += length_body_name;
        int length_reference_frame = this.reference_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_reference_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_reference_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_reference_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_reference_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_reference_frame; k++) {
            outbuffer[offset + k] = (byte)((this.reference_frame.getBytes())[k] & 0xFF);
        }
        offset += length_reference_frame;
        offset = this.reference_point.serialize(outbuffer, offset);
        offset = this.wrench.serialize(outbuffer, offset);
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
        int length_body_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_body_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_body_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_body_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_body_name = new byte[length_body_name];
        for(int k= 0; k< length_body_name; k++){
            bytes_body_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.body_name = new java.lang.String(bytes_body_name);
        offset += length_body_name;
        int length_reference_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_reference_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_reference_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_reference_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_reference_frame = new byte[length_reference_frame];
        for(int k= 0; k< length_reference_frame; k++){
            bytes_reference_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.reference_frame = new java.lang.String(bytes_reference_frame);
        offset += length_reference_frame;
        offset = this.reference_point.deserialize(inbuffer, offset);
        offset = this.wrench.deserialize(inbuffer, offset);
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
        int length_body_name = this.body_name.getBytes().length;
        length += 4;
        length += length_body_name;
        int length_reference_frame = this.reference_frame.getBytes().length;
        length += 4;
        length += length_reference_frame;
        length += this.reference_point.serializedLength();
        length += this.wrench.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return APPLYBODYWRENCH; }
    public java.lang.String getMD5(){ return "434adb4bdbb64c5610c7fadb31f0fa7d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ApplyBodyWrenchResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public ApplyBodyWrenchResponse() {
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

    public java.lang.String getType() { return APPLYBODYWRENCH; }
    public java.lang.String getMD5(){ return "f29b3c75e7d692065eda02aae6d3a3a0"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
