package com.roslib.turtlebot_actions;

import java.lang.*;

public class TurtlebotMoveResult implements com.roslib.ros.Msg {
    public float turn_distance;
    public float forward_distance;

    public TurtlebotMoveResult() {
        this.turn_distance = 0;
        this.forward_distance = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_turn_distance = Float.floatToRawIntBits(turn_distance);
        outbuffer[offset + 0] = (byte)((bits_turn_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_turn_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_turn_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_turn_distance >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_forward_distance = Float.floatToRawIntBits(forward_distance);
        outbuffer[offset + 0] = (byte)((bits_forward_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_forward_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_forward_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_forward_distance >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_turn_distance = 0;
        bits_turn_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_turn_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_turn_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_turn_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.turn_distance = Float.intBitsToFloat(bits_turn_distance);
        offset += 4;
        int bits_forward_distance = 0;
        bits_forward_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_forward_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_forward_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_forward_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.forward_distance = Float.intBitsToFloat(bits_forward_distance);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "turtlebot_actions/TurtlebotMoveResult"; }
    public java.lang.String getMD5(){ return "a5796e0b9fdee3e16326c8120951ad4c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
