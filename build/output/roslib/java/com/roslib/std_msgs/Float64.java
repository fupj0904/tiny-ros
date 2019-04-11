package com.roslib.std_msgs;

import java.lang.*;

public class Float64 implements com.roslib.ros.Msg {
    public double data;

    public Float64() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_data = Double.doubleToRawLongBits(this.data);
        outbuffer[offset + 0] = (byte)((bits_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_data >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_data >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_data >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_data >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_data >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        long bits_data = 0;
        bits_data |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_data |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_data |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_data |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_data |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_data |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_data |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_data |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.data = Double.longBitsToDouble(bits_data);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Float64"; }
    public java.lang.String getMD5(){ return "3439fe880debfd63cf4e61e62e285345"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
