package com.roslib.std_msgs;

import java.lang.*;

public class ColorRGBA implements com.roslib.ros.Msg {
    public float r;
    public float g;
    public float b;
    public float a;

    public ColorRGBA() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.a = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_r = Float.floatToRawIntBits(r);
        outbuffer[offset + 0] = (byte)((bits_r >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_r >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_r >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_r >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_g = Float.floatToRawIntBits(g);
        outbuffer[offset + 0] = (byte)((bits_g >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_g >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_g >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_g >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_b = Float.floatToRawIntBits(b);
        outbuffer[offset + 0] = (byte)((bits_b >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_b >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_b >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_b >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a = Float.floatToRawIntBits(a);
        outbuffer[offset + 0] = (byte)((bits_a >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_r = 0;
        bits_r |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_r |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_r |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_r |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.r = Float.intBitsToFloat(bits_r);
        offset += 4;
        int bits_g = 0;
        bits_g |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_g |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_g |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_g |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.g = Float.intBitsToFloat(bits_g);
        offset += 4;
        int bits_b = 0;
        bits_b |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_b |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_b |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_b |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.b = Float.intBitsToFloat(bits_b);
        offset += 4;
        int bits_a = 0;
        bits_a |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a = Float.intBitsToFloat(bits_a);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/ColorRGBA"; }
    public java.lang.String getMD5(){ return "3c740aa311a337bfa4133c69405e0aed"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
