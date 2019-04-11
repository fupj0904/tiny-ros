package com.roslib.sensor_msgs;

import java.lang.*;

public class ChannelFloat32 implements com.roslib.ros.Msg {
    public java.lang.String name;
    public float[] values;

    public ChannelFloat32() {
        this.name = "";
        this.values = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
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
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
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
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        int length_values = this.values != null ? this.values.length : 0;
        for (int i = 0; i < length_values; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/ChannelFloat32"; }
    public java.lang.String getMD5(){ return "c4cf01c81334c609dca1afd3a227daff"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
