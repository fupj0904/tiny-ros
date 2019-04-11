package com.roslib.sensor_msgs;

import java.lang.*;

public class MultiEchoLaserScan implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float angle_min;
    public float angle_max;
    public float angle_increment;
    public float time_increment;
    public float scan_time;
    public float range_min;
    public float range_max;
    public com.roslib.sensor_msgs.LaserEcho[] ranges;
    public com.roslib.sensor_msgs.LaserEcho[] intensities;

    public MultiEchoLaserScan() {
        this.header = new com.roslib.std_msgs.Header();
        this.angle_min = 0;
        this.angle_max = 0;
        this.angle_increment = 0;
        this.time_increment = 0;
        this.scan_time = 0;
        this.range_min = 0;
        this.range_max = 0;
        this.ranges = null;
        this.intensities = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int bits_angle_min = Float.floatToRawIntBits(angle_min);
        outbuffer[offset + 0] = (byte)((bits_angle_min >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angle_min >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angle_min >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angle_min >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_angle_max = Float.floatToRawIntBits(angle_max);
        outbuffer[offset + 0] = (byte)((bits_angle_max >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angle_max >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angle_max >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angle_max >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_angle_increment = Float.floatToRawIntBits(angle_increment);
        outbuffer[offset + 0] = (byte)((bits_angle_increment >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angle_increment >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angle_increment >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angle_increment >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_time_increment = Float.floatToRawIntBits(time_increment);
        outbuffer[offset + 0] = (byte)((bits_time_increment >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_time_increment >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_time_increment >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_time_increment >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_scan_time = Float.floatToRawIntBits(scan_time);
        outbuffer[offset + 0] = (byte)((bits_scan_time >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_scan_time >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_scan_time >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_scan_time >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_range_min = Float.floatToRawIntBits(range_min);
        outbuffer[offset + 0] = (byte)((bits_range_min >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_range_min >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_range_min >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_range_min >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_range_max = Float.floatToRawIntBits(range_max);
        outbuffer[offset + 0] = (byte)((bits_range_max >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_range_max >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_range_max >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_range_max >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_ranges = this.ranges != null ? this.ranges.length : 0;
        outbuffer[offset + 0] = (byte)((length_ranges >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ranges >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ranges >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ranges >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_ranges; i++){
        offset = this.ranges[i].serialize(outbuffer, offset);
        }
        int length_intensities = this.intensities != null ? this.intensities.length : 0;
        outbuffer[offset + 0] = (byte)((length_intensities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_intensities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_intensities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_intensities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_intensities; i++){
        offset = this.intensities[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int bits_angle_min = 0;
        bits_angle_min |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angle_min |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angle_min |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angle_min |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.angle_min = Float.intBitsToFloat(bits_angle_min);
        offset += 4;
        int bits_angle_max = 0;
        bits_angle_max |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angle_max |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angle_max |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angle_max |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.angle_max = Float.intBitsToFloat(bits_angle_max);
        offset += 4;
        int bits_angle_increment = 0;
        bits_angle_increment |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angle_increment |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angle_increment |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angle_increment |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.angle_increment = Float.intBitsToFloat(bits_angle_increment);
        offset += 4;
        int bits_time_increment = 0;
        bits_time_increment |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_time_increment |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_time_increment |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_time_increment |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.time_increment = Float.intBitsToFloat(bits_time_increment);
        offset += 4;
        int bits_scan_time = 0;
        bits_scan_time |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_scan_time |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_scan_time |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_scan_time |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.scan_time = Float.intBitsToFloat(bits_scan_time);
        offset += 4;
        int bits_range_min = 0;
        bits_range_min |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_range_min |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_range_min |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_range_min |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.range_min = Float.intBitsToFloat(bits_range_min);
        offset += 4;
        int bits_range_max = 0;
        bits_range_max |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_range_max |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_range_max |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_range_max |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.range_max = Float.intBitsToFloat(bits_range_max);
        offset += 4;
        int length_ranges = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ranges |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ranges |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ranges |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_ranges > 0) {
            this.ranges = new com.roslib.sensor_msgs.LaserEcho[length_ranges];
        }
        for (int i = 0; i < length_ranges; i++){
        offset = this.ranges[i].deserialize(inbuffer, offset);
        }
        int length_intensities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_intensities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_intensities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_intensities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_intensities > 0) {
            this.intensities = new com.roslib.sensor_msgs.LaserEcho[length_intensities];
        }
        for (int i = 0; i < length_intensities; i++){
        offset = this.intensities[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        int length_ranges = this.ranges != null ? this.ranges.length : 0;
        for (int i = 0; i < length_ranges; i++) {
        length += this.ranges[i].serializedLength();
        }
        length += 4;
        int length_intensities = this.intensities != null ? this.intensities.length : 0;
        for (int i = 0; i < length_intensities; i++) {
        length += this.intensities[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/MultiEchoLaserScan"; }
    public java.lang.String getMD5(){ return "92f3933b4fa486e3889b461437899bf5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
