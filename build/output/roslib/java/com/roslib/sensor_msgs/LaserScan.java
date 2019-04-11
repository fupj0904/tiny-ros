package com.roslib.sensor_msgs;

import java.lang.*;

public class LaserScan implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float angle_min;
    public float angle_max;
    public float angle_increment;
    public float time_increment;
    public float scan_time;
    public float range_min;
    public float range_max;
    public float[] ranges;
    public float[] intensities;

    public LaserScan() {
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
        int bits_rangesi = Float.floatToRawIntBits(ranges[i]);
        outbuffer[offset + 0] = (byte)((bits_rangesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_rangesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_rangesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_rangesi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        int length_intensities = this.intensities != null ? this.intensities.length : 0;
        outbuffer[offset + 0] = (byte)((length_intensities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_intensities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_intensities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_intensities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_intensities; i++){
        int bits_intensitiesi = Float.floatToRawIntBits(intensities[i]);
        outbuffer[offset + 0] = (byte)((bits_intensitiesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_intensitiesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_intensitiesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_intensitiesi >> (8 * 3)) & 0xFF);
        offset += 4;
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
            this.ranges = new float[length_ranges];
        }
        for (int i = 0; i < length_ranges; i++){
        int bits_rangesi = 0;
        bits_rangesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_rangesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_rangesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_rangesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.ranges[i] = Float.intBitsToFloat(bits_rangesi);
        offset += 4;
        }
        int length_intensities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_intensities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_intensities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_intensities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_intensities > 0) {
            this.intensities = new float[length_intensities];
        }
        for (int i = 0; i < length_intensities; i++){
        int bits_intensitiesi = 0;
        bits_intensitiesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_intensitiesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_intensitiesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_intensitiesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.intensities[i] = Float.intBitsToFloat(bits_intensitiesi);
        offset += 4;
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
        length += 4;
        }
        length += 4;
        int length_intensities = this.intensities != null ? this.intensities.length : 0;
        for (int i = 0; i < length_intensities; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/LaserScan"; }
    public java.lang.String getMD5(){ return "9387943977c16b7fa134689acd87f1a2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
