package com.roslib.sensor_msgs;

import java.lang.*;

public class Temperature implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public double temperature;
    public double variance;

    public Temperature() {
        this.header = new com.roslib.std_msgs.Header();
        this.temperature = 0;
        this.variance = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        long bits_temperature = Double.doubleToRawLongBits(this.temperature);
        outbuffer[offset + 0] = (byte)((bits_temperature >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_temperature >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_temperature >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_temperature >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_temperature >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_temperature >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_temperature >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_temperature >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_variance = Double.doubleToRawLongBits(this.variance);
        outbuffer[offset + 0] = (byte)((bits_variance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_variance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_variance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_variance >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_variance >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_variance >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_variance >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_variance >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        long bits_temperature = 0;
        bits_temperature |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_temperature |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_temperature |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_temperature |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_temperature |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_temperature |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_temperature |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_temperature |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.temperature = Double.longBitsToDouble(bits_temperature);
        offset += 8;
        long bits_variance = 0;
        bits_variance |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_variance |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_variance |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_variance |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_variance |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_variance |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_variance |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_variance |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.variance = Double.longBitsToDouble(bits_variance);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/Temperature"; }
    public java.lang.String getMD5(){ return "898a0e5950c8e4073c0c3cf2d7e7bf26"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
