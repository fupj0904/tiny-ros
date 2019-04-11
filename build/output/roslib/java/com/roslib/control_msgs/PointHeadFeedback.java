package com.roslib.control_msgs;

import java.lang.*;

public class PointHeadFeedback implements com.roslib.ros.Msg {
    public double pointing_angle_error;

    public PointHeadFeedback() {
        this.pointing_angle_error = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_pointing_angle_error = Double.doubleToRawLongBits(this.pointing_angle_error);
        outbuffer[offset + 0] = (byte)((bits_pointing_angle_error >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_pointing_angle_error >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_pointing_angle_error >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_pointing_angle_error >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_pointing_angle_error >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_pointing_angle_error >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_pointing_angle_error >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_pointing_angle_error >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        long bits_pointing_angle_error = 0;
        bits_pointing_angle_error |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_pointing_angle_error |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.pointing_angle_error = Double.longBitsToDouble(bits_pointing_angle_error);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/PointHeadFeedback"; }
    public java.lang.String getMD5(){ return "c548c58707d0fac401036fd704fac8fd"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
