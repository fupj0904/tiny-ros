package com.roslib.tf2_msgs;

import java.lang.*;

public class LookupTransformGoal implements com.roslib.ros.Msg {
    public java.lang.String target_frame;
    public java.lang.String source_frame;
    public com.roslib.ros.Time source_time;
    public com.roslib.ros.Duration timeout;
    public com.roslib.ros.Time target_time;
    public java.lang.String fixed_frame;
    public boolean advanced;

    public LookupTransformGoal() {
        this.target_frame = "";
        this.source_frame = "";
        this.source_time = new com.roslib.ros.Time();
        this.timeout = new com.roslib.ros.Duration();
        this.target_time = new com.roslib.ros.Time();
        this.fixed_frame = "";
        this.advanced = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_target_frame = this.target_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_target_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_target_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_target_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_target_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_target_frame; k++) {
            outbuffer[offset + k] = (byte)((this.target_frame.getBytes())[k] & 0xFF);
        }
        offset += length_target_frame;
        int length_source_frame = this.source_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_source_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_source_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_source_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_source_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_source_frame; k++) {
            outbuffer[offset + k] = (byte)((this.source_frame.getBytes())[k] & 0xFF);
        }
        offset += length_source_frame;
        outbuffer[offset + 0] = (byte)((this.source_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.source_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.source_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.source_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.source_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.source_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.source_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.source_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timeout.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timeout.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timeout.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timeout.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timeout.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timeout.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timeout.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timeout.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.target_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.target_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.target_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.target_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.target_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.target_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.target_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.target_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_fixed_frame = this.fixed_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_fixed_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_fixed_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_fixed_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_fixed_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_fixed_frame; k++) {
            outbuffer[offset + k] = (byte)((this.fixed_frame.getBytes())[k] & 0xFF);
        }
        offset += length_fixed_frame;
        outbuffer[offset] = (byte)((advanced ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_target_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_target_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_target_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_target_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_target_frame = new byte[length_target_frame];
        for(int k= 0; k< length_target_frame; k++){
            bytes_target_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.target_frame = new java.lang.String(bytes_target_frame);
        offset += length_target_frame;
        int length_source_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_source_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_source_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_source_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_source_frame = new byte[length_source_frame];
        for(int k= 0; k< length_source_frame; k++){
            bytes_source_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.source_frame = new java.lang.String(bytes_source_frame);
        offset += length_source_frame;
        this.source_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.source_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.source_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.source_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.source_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.source_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.source_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.source_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timeout.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timeout.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timeout.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timeout.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timeout.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timeout.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timeout.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timeout.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.target_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.target_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.target_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.target_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.target_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.target_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.target_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.target_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_fixed_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_fixed_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_fixed_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_fixed_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_fixed_frame = new byte[length_fixed_frame];
        for(int k= 0; k< length_fixed_frame; k++){
            bytes_fixed_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.fixed_frame = new java.lang.String(bytes_fixed_frame);
        offset += length_fixed_frame;
        this.advanced = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_target_frame = this.target_frame.getBytes().length;
        length += 4;
        length += length_target_frame;
        int length_source_frame = this.source_frame.getBytes().length;
        length += 4;
        length += length_source_frame;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        int length_fixed_frame = this.fixed_frame.getBytes().length;
        length += 4;
        length += length_fixed_frame;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "tf2_msgs/LookupTransformGoal"; }
    public java.lang.String getMD5(){ return "677c84a912b788ccaaea5fbc38570182"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
