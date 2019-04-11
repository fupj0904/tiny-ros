package com.roslib.geometry_msgs;

import java.lang.*;

public class Pose2D implements com.roslib.ros.Msg {
    public double x;
    public double y;
    public double theta;

    public Pose2D() {
        this.x = 0;
        this.y = 0;
        this.theta = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_x = Double.doubleToRawLongBits(this.x);
        outbuffer[offset + 0] = (byte)((bits_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_x >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_x >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_x >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_x >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_x >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_y = Double.doubleToRawLongBits(this.y);
        outbuffer[offset + 0] = (byte)((bits_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_y >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_y >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_y >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_y >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_y >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_theta = Double.doubleToRawLongBits(this.theta);
        outbuffer[offset + 0] = (byte)((bits_theta >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_theta >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_theta >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_theta >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_theta >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_theta >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_theta >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_theta >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        long bits_x = 0;
        bits_x |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_x |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_x |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_x |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_x |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.x = Double.longBitsToDouble(bits_x);
        offset += 8;
        long bits_y = 0;
        bits_y |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_y |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_y |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_y |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_y |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.y = Double.longBitsToDouble(bits_y);
        offset += 8;
        long bits_theta = 0;
        bits_theta |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_theta |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_theta |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_theta |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_theta |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_theta |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_theta |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_theta |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.theta = Double.longBitsToDouble(bits_theta);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Pose2D"; }
    public java.lang.String getMD5(){ return "509f362ff66c4d3df21020fa7c01f8c6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
