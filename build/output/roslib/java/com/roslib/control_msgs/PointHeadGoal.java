package com.roslib.control_msgs;

import java.lang.*;

public class PointHeadGoal implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.PointStamped target;
    public com.roslib.geometry_msgs.Vector3 pointing_axis;
    public java.lang.String pointing_frame;
    public com.roslib.ros.Duration min_duration;
    public double max_velocity;

    public PointHeadGoal() {
        this.target = new com.roslib.geometry_msgs.PointStamped();
        this.pointing_axis = new com.roslib.geometry_msgs.Vector3();
        this.pointing_frame = "";
        this.min_duration = new com.roslib.ros.Duration();
        this.max_velocity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.target.serialize(outbuffer, offset);
        offset = this.pointing_axis.serialize(outbuffer, offset);
        int length_pointing_frame = this.pointing_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_pointing_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pointing_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pointing_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pointing_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_pointing_frame; k++) {
            outbuffer[offset + k] = (byte)((this.pointing_frame.getBytes())[k] & 0xFF);
        }
        offset += length_pointing_frame;
        outbuffer[offset + 0] = (byte)((this.min_duration.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.min_duration.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.min_duration.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.min_duration.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.min_duration.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.min_duration.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.min_duration.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.min_duration.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        long bits_max_velocity = Double.doubleToRawLongBits(this.max_velocity);
        outbuffer[offset + 0] = (byte)((bits_max_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_velocity >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_max_velocity >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_max_velocity >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_max_velocity >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_max_velocity >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.target.deserialize(inbuffer, offset);
        offset = this.pointing_axis.deserialize(inbuffer, offset);
        int length_pointing_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pointing_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pointing_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pointing_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_pointing_frame = new byte[length_pointing_frame];
        for(int k= 0; k< length_pointing_frame; k++){
            bytes_pointing_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.pointing_frame = new java.lang.String(bytes_pointing_frame);
        offset += length_pointing_frame;
        this.min_duration.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.min_duration.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.min_duration.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.min_duration.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.min_duration.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.min_duration.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.min_duration.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.min_duration.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        long bits_max_velocity = 0;
        bits_max_velocity |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_velocity |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_velocity |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_velocity |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_max_velocity |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_max_velocity |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_max_velocity |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_max_velocity |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.max_velocity = Double.longBitsToDouble(bits_max_velocity);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.target.serializedLength();
        length += this.pointing_axis.serializedLength();
        int length_pointing_frame = this.pointing_frame.getBytes().length;
        length += 4;
        length += length_pointing_frame;
        length += 4;
        length += 4;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/PointHeadGoal"; }
    public java.lang.String getMD5(){ return "a3039e74f384beb52d16f9c1fe856835"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
