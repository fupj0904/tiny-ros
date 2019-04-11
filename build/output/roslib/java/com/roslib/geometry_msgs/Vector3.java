package com.roslib.geometry_msgs;

import java.lang.*;

public class Vector3 implements com.roslib.ros.Msg {
    public double x;
    public double y;
    public double z;

    public Vector3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
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
        long bits_z = Double.doubleToRawLongBits(this.z);
        outbuffer[offset + 0] = (byte)((bits_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_z >> (8 * 7)) & 0xFF);
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
        long bits_z = 0;
        bits_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.z = Double.longBitsToDouble(bits_z);
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

    public java.lang.String getType(){ return "geometry_msgs/Vector3"; }
    public java.lang.String getMD5(){ return "b5c8c5b484ec7d5e36a4d9de9124c561"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
