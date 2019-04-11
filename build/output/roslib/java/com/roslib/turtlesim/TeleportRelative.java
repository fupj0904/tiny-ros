package com.roslib.turtlesim;

import java.lang.*;

public class TeleportRelative {

public static final java.lang.String TELEPORTRELATIVE = "turtlesim/TeleportRelative";

public class TeleportRelativeRequest implements com.roslib.ros.Msg {
    private long __id__;
    public float linear;
    public float angular;

    public TeleportRelativeRequest() {
        this.linear = 0;
        this.angular = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_linear = Float.floatToRawIntBits(linear);
        outbuffer[offset + 0] = (byte)((bits_linear >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_linear >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_linear >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_linear >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_angular = Float.floatToRawIntBits(angular);
        outbuffer[offset + 0] = (byte)((bits_angular >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_angular >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_angular >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_angular >> (8 * 3)) & 0xFF);
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
        int bits_linear = 0;
        bits_linear |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_linear |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_linear |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_linear |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.linear = Float.intBitsToFloat(bits_linear);
        offset += 4;
        int bits_angular = 0;
        bits_angular |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_angular |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_angular |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_angular |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.angular = Float.intBitsToFloat(bits_angular);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return TELEPORTRELATIVE; }
    public java.lang.String getMD5(){ return "70ffc3f89d5acf0ecac35f24a6a44e11"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class TeleportRelativeResponse implements com.roslib.ros.Msg {
    private long __id__;

    public TeleportRelativeResponse() {
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

    public java.lang.String getType() { return TELEPORTRELATIVE; }
    public java.lang.String getMD5(){ return "eca765250cce765d13e0b14d324cb06d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
