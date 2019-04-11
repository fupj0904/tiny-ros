package com.roslib.yocs_msgs;

import java.lang.*;

public class DockingInteractorGoal implements com.roslib.ros.Msg {
    public byte command;
    public float distance;
    public static final byte WAKE_UP = (byte)( 10);
    public static final byte REGISTER_DOCK_IN_GLOBAL_FRAME = (byte)( 20);
    public static final byte RETURN_TO_DOCK = (byte)( 30);
    public static final byte GOTO_DOCK_FRONT = (byte)( 40);
    public static final byte CALL_AUTODOCK = (byte)( 50);

    public DockingInteractorGoal() {
        this.command = 0;
        this.distance = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.command >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_distance = Float.floatToRawIntBits(distance);
        outbuffer[offset + 0] = (byte)((bits_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_distance >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.command   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_distance = 0;
        bits_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.distance = Float.intBitsToFloat(bits_distance);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/DockingInteractorGoal"; }
    public java.lang.String getMD5(){ return "5fb8e22dc9b8d5c8c86d7d743eb8c100"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
