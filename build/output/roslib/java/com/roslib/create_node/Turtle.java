package com.roslib.create_node;

import java.lang.*;

public class Turtle implements com.roslib.ros.Msg {
    public float linear;
    public float angular;

    public Turtle() {
        this.linear = 0;
        this.angular = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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

    public java.lang.String getType(){ return "create_node/Turtle"; }
    public java.lang.String getMD5(){ return "07e0153b5d95d5162da359838872df3a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
