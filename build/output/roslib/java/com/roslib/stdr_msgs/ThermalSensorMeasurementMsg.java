package com.roslib.stdr_msgs;

import java.lang.*;

public class ThermalSensorMeasurementMsg implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float[] thermal_source_degrees;

    public ThermalSensorMeasurementMsg() {
        this.header = new com.roslib.std_msgs.Header();
        this.thermal_source_degrees = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_thermal_source_degrees = this.thermal_source_degrees != null ? this.thermal_source_degrees.length : 0;
        outbuffer[offset + 0] = (byte)((length_thermal_source_degrees >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_thermal_source_degrees >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_thermal_source_degrees >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_thermal_source_degrees >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_thermal_source_degrees; i++){
        int bits_thermal_source_degreesi = Float.floatToRawIntBits(thermal_source_degrees[i]);
        outbuffer[offset + 0] = (byte)((bits_thermal_source_degreesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_thermal_source_degreesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_thermal_source_degreesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_thermal_source_degreesi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_thermal_source_degrees = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_thermal_source_degrees |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_thermal_source_degrees |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_thermal_source_degrees |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_thermal_source_degrees > 0) {
            this.thermal_source_degrees = new float[length_thermal_source_degrees];
        }
        for (int i = 0; i < length_thermal_source_degrees; i++){
        int bits_thermal_source_degreesi = 0;
        bits_thermal_source_degreesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_thermal_source_degreesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_thermal_source_degreesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_thermal_source_degreesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.thermal_source_degrees[i] = Float.intBitsToFloat(bits_thermal_source_degreesi);
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_thermal_source_degrees = this.thermal_source_degrees != null ? this.thermal_source_degrees.length : 0;
        for (int i = 0; i < length_thermal_source_degrees; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/ThermalSensorMeasurementMsg"; }
    public java.lang.String getMD5(){ return "67ac23961d04538616a6d8f259a2740b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
