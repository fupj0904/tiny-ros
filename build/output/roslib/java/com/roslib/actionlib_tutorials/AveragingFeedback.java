package com.roslib.actionlib_tutorials;

import java.lang.*;

public class AveragingFeedback implements com.roslib.ros.Msg {
    public int sample;
    public float data;
    public float mean;
    public float std_dev;

    public AveragingFeedback() {
        this.sample = 0;
        this.data = 0;
        this.mean = 0;
        this.std_dev = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.sample >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.sample >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.sample >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.sample >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_data = Float.floatToRawIntBits(data);
        outbuffer[offset + 0] = (byte)((bits_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_data >> (8 * 3)) & 0xFF);
        offset += 4;
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
        this.sample   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sample |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sample |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sample |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int bits_data = 0;
        bits_data |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.data = Float.intBitsToFloat(bits_data);
        offset += 4;
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
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/AveragingFeedback"; }
    public java.lang.String getMD5(){ return "6c77de0bb1b084b824b3e4590ca351da"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
