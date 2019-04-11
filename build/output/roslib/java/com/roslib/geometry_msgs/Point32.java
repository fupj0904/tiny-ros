package com.roslib.geometry_msgs;

import java.lang.*;

public class Point32 implements com.roslib.ros.Msg {
    public float x;
    public float y;
    public float z;

    public Point32() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
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
        int bits_z = Float.floatToRawIntBits(z);
        outbuffer[offset + 0] = (byte)((bits_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_z >> (8 * 3)) & 0xFF);
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
        int bits_z = 0;
        bits_z |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_z |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_z |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_z |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.z = Float.intBitsToFloat(bits_z);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Point32"; }
    public java.lang.String getMD5(){ return "b17f2230f465fce816e3773d7d59a841"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
