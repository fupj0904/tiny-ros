package com.roslib.actionlib_tutorials;

import java.lang.*;

public class AveragingResult implements com.roslib.ros.Msg {
    public float mean;
    public float std_dev;

    public AveragingResult() {
        this.mean = 0;
        this.std_dev = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_mean = Float.floatToRawIntBits(mean);
        outbuffer[offset + 0] = (byte)((bits_mean >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_mean >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_mean >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_mean >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_std_dev = Float.floatToRawIntBits(std_dev);
        outbuffer[offset + 0] = (byte)((bits_std_dev >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_std_dev >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_std_dev >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_std_dev >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_mean = 0;
        bits_mean |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_mean |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_mean |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_mean |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.mean = Float.intBitsToFloat(bits_mean);
        offset += 4;
        int bits_std_dev = 0;
        bits_std_dev |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_std_dev |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_std_dev |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_std_dev |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.std_dev = Float.intBitsToFloat(bits_std_dev);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/AveragingResult"; }
    public java.lang.String getMD5(){ return "4e020115c58f9b55b63f33f55ae51903"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
