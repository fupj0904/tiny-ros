package com.roslib.std_msgs;

import java.lang.*;

public class Float32 implements com.roslib.ros.Msg {
    public float data;

    public Float32() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_data = Float.floatToRawIntBits(data);
        outbuffer[offset + 0] = (byte)((bits_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_data >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_data = 0;
        bits_data |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.data = Float.intBitsToFloat(bits_data);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Float32"; }
    public java.lang.String getMD5(){ return "2aff5d2343e8e80ceea1362fc770035c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
