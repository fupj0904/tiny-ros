package com.roslib.yocs_msgs;

import java.lang.*;

public class LocalizeGoal implements com.roslib.ros.Msg {
    public byte command;
    public float distortion;
    public static final byte STAND_AND_LOCALIZE = (byte)(10);
    public static final byte SPIN_AND_LOCALIZE = (byte)(20);

    public LocalizeGoal() {
        this.command = 0;
        this.distortion = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.command >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_distortion = Float.floatToRawIntBits(distortion);
        outbuffer[offset + 0] = (byte)((bits_distortion >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_distortion >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_distortion >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_distortion >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.command   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_distortion = 0;
        bits_distortion |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_distortion |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_distortion |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_distortion |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.distortion = Float.intBitsToFloat(bits_distortion);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/LocalizeGoal"; }
    public java.lang.String getMD5(){ return "59db6fc985f0b7842bcddc27501b9f85"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
