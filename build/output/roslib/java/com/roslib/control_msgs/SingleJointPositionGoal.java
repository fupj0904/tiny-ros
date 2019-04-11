package com.roslib.control_msgs;

import java.lang.*;

public class SingleJointPositionGoal implements com.roslib.ros.Msg {
    public double position;
    public com.roslib.ros.Duration min_duration;
    public double max_velocity;

    public SingleJointPositionGoal() {
        this.position = 0;
        this.min_duration = new com.roslib.ros.Duration();
        this.max_velocity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_position = Double.doubleToRawLongBits(this.position);
        outbuffer[offset + 0] = (byte)((bits_position >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_position >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_position >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_position >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_position >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_position >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_position >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_position >> (8 * 7)) & 0xFF);
        offset += 8;
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
        long bits_position = 0;
        bits_position |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_position |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_position |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_position |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_position |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_position |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_position |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_position |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.position = Double.longBitsToDouble(bits_position);
        offset += 8;
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
        length += 8;
        length += 4;
        length += 4;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/SingleJointPositionGoal"; }
    public java.lang.String getMD5(){ return "732c1940dc7faef28a3c84f723108477"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
