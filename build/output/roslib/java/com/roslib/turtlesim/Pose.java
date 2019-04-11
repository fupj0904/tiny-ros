package com.roslib.turtlesim;

import java.lang.*;

public class Pose implements com.roslib.ros.Msg {
    public float x;
    public float y;
    public float theta;
    public float linear_velocity;
    public float angular_velocity;

    public Pose() {
        this.x = 0;
        this.y = 0;
        this.theta = 0;
        this.linear_velocity = 0;
        this.angular_velocity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_x = Float.floatToRawIntBits(x);
        outbuffer[offset + 0] = (byte)((bits_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_x >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_y = Float.floatToRawIntBits(y);
        outbuffer[offset + 0] = (byte)((bits_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_y >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_theta = Float.floatToRawIntBits(theta);
        outbuffer[offset + 0] = (byte)((bits_theta >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_theta >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_theta >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_theta >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_linear_velocity = Float.floatToRawIntBits(linear_velocity);
        outbuffer[offset + 0] = (byte)((bits_linear_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_linear_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_linear_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_linear_velocity >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_angular_velocity = Float.floatToRawIntBits(angular_velocity);
        outbuffer[offset + 0] = (byte)((bits_angular_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angular_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angular_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angular_velocity >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_x = 0;
        bits_x |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_x |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_x |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_x |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.x = Float.intBitsToFloat(bits_x);
        offset += 4;
        int bits_y = 0;
        bits_y |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_y |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_y |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_y |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.y = Float.intBitsToFloat(bits_y);
        offset += 4;
        int bits_theta = 0;
        bits_theta |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_theta |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_theta |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_theta |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.theta = Float.intBitsToFloat(bits_theta);
        offset += 4;
        int bits_linear_velocity = 0;
        bits_linear_velocity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_linear_velocity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_linear_velocity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_linear_velocity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.linear_velocity = Float.intBitsToFloat(bits_linear_velocity);
        offset += 4;
        int bits_angular_velocity = 0;
        bits_angular_velocity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angular_velocity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angular_velocity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angular_velocity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.angular_velocity = Float.intBitsToFloat(bits_angular_velocity);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "turtlesim/Pose"; }
    public java.lang.String getMD5(){ return "a6324165dd9146373b1e14bdc17dcfd9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
