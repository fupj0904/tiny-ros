package com.roslib.turtle_actionlib;

import java.lang.*;

public class ShapeGoal implements com.roslib.ros.Msg {
    public int edges;
    public float radius;

    public ShapeGoal() {
        this.edges = 0;
        this.radius = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.edges >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.edges >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.edges >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.edges >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_radius = Float.floatToRawIntBits(radius);
        outbuffer[offset + 0] = (byte)((bits_radius >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_radius >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_radius >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_radius >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.edges   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.edges |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.edges |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.edges |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int bits_radius = 0;
        bits_radius |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_radius |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_radius |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_radius |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.radius = Float.intBitsToFloat(bits_radius);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "turtle_actionlib/ShapeGoal"; }
    public java.lang.String getMD5(){ return "52b158dce674143c4f5d3edb0a46d295"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
