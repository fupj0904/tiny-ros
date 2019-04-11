package com.roslib.stdr_msgs;

import java.lang.*;

public class CO2SensorMeasurementMsg implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float co2_ppm;

    public CO2SensorMeasurementMsg() {
        this.header = new com.roslib.std_msgs.Header();
        this.co2_ppm = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int bits_co2_ppm = Float.floatToRawIntBits(co2_ppm);
        outbuffer[offset + 0] = (byte)((bits_co2_ppm >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_co2_ppm >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_co2_ppm >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_co2_ppm >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int bits_co2_ppm = 0;
        bits_co2_ppm |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_co2_ppm |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_co2_ppm |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_co2_ppm |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.co2_ppm = Float.intBitsToFloat(bits_co2_ppm);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/CO2SensorMeasurementMsg"; }
    public java.lang.String getMD5(){ return "b4a4443684d7f817dc950a8b49300640"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
