package com.roslib.turtle_actionlib;

import java.lang.*;

public class ShapeResult implements com.roslib.ros.Msg {
    public float interior_angle;
    public float apothem;

    public ShapeResult() {
        this.interior_angle = 0;
        this.apothem = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_interior_angle = Float.floatToRawIntBits(interior_angle);
        outbuffer[offset + 0] = (byte)((bits_interior_angle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_interior_angle >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_interior_angle >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_interior_angle >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_apothem = Float.floatToRawIntBits(apothem);
        outbuffer[offset + 0] = (byte)((bits_apothem >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_apothem >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_apothem >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_apothem >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_interior_angle = 0;
        bits_interior_angle |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_interior_angle |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_interior_angle |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_interior_angle |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.interior_angle = Float.intBitsToFloat(bits_interior_angle);
        offset += 4;
        int bits_apothem = 0;
        bits_apothem |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_apothem |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_apothem |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_apothem |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.apothem = Float.intBitsToFloat(bits_apothem);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "turtle_actionlib/ShapeResult"; }
    public java.lang.String getMD5(){ return "c9b2927568a145f40c8b15b9eb1065c6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
