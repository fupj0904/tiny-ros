package com.roslib.pcl_msgs;

import java.lang.*;

public class ModelCoefficients implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float[] values;

    public ModelCoefficients() {
        this.header = new com.roslib.std_msgs.Header();
        this.values = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_values = this.values != null ? this.values.length : 0;
        outbuffer[offset + 0] = (byte)((length_values >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_values >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_values >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_values >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_values; i++){
        int bits_valuesi = Float.floatToRawIntBits(values[i]);
        outbuffer[offset + 0] = (byte)((bits_valuesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_valuesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_valuesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_valuesi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_values = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_values |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_values |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_values |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_values > 0) {
            this.values = new float[length_values];
        }
        for (int i = 0; i < length_values; i++){
        int bits_valuesi = 0;
        bits_valuesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_valuesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_valuesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_valuesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.values[i] = Float.intBitsToFloat(bits_valuesi);
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_values = this.values != null ? this.values.length : 0;
        for (int i = 0; i < length_values; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "pcl_msgs/ModelCoefficients"; }
    public java.lang.String getMD5(){ return "72c0165edc5809720c0ef5e1a214311a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
