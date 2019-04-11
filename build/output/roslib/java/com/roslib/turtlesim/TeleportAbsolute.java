package com.roslib.turtlesim;

import java.lang.*;

public class TeleportAbsolute {

public static final java.lang.String TELEPORTABSOLUTE = "turtlesim/TeleportAbsolute";

public class TeleportAbsoluteRequest implements com.roslib.ros.Msg {
    private long __id__;
    public float x;
    public float y;
    public float theta;

    public TeleportAbsoluteRequest() {
        this.x = 0;
        this.y = 0;
        this.theta = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return TELEPORTABSOLUTE; }
    public java.lang.String getMD5(){ return "feff6e56bab41f2e0b04f33aef1393d1"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class TeleportAbsoluteResponse implements com.roslib.ros.Msg {
    private long __id__;

    public TeleportAbsoluteResponse() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return TELEPORTABSOLUTE; }
    public java.lang.String getMD5(){ return "e5d5480aa3e54a3a02f496f5de5bf08e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
