package com.roslib.create_node;

import java.lang.*;

public class Drive implements com.roslib.ros.Msg {
    public float velocity;
    public float radius;

    public Drive() {
        this.velocity = 0;
        this.radius = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_velocity = Float.floatToRawIntBits(velocity);
        outbuffer[offset + 0] = (byte)((bits_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_velocity >> (8 * 3)) & 0xFF);
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
        int bits_velocity = 0;
        bits_velocity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_velocity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_velocity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_velocity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.velocity = Float.intBitsToFloat(bits_velocity);
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

    public java.lang.String getType(){ return "create_node/Drive"; }
    public java.lang.String getMD5(){ return "13d818c12537464636f7f681b45a91bf"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
