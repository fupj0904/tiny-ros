package com.roslib.std_msgs;

import java.lang.*;

public class Float64MultiArray implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.MultiArrayLayout layout;
    public double[] data;

    public Float64MultiArray() {
        this.layout = new com.roslib.std_msgs.MultiArrayLayout();
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.layout.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        long bits_datai = Double.doubleToRawLongBits(this.data[i]);
        outbuffer[offset + 0] = (byte)((bits_datai >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_datai >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_datai >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_datai >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_datai >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_datai >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_datai >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_datai >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.layout.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new double[length_data];
        }
        for (int i = 0; i < length_data; i++){
        long bits_datai = 0;
        bits_datai |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_datai |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_datai |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_datai |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_datai |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_datai |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_datai |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_datai |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.data[i] = Double.longBitsToDouble(bits_datai);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.layout.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Float64MultiArray"; }
    public java.lang.String getMD5(){ return "e3061da26924f3790a70f9dbf06fc1a5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
