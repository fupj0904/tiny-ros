package com.roslib.sensor_msgs;

import java.lang.*;

public class MagneticField implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Vector3 magnetic_field;
    public double[] magnetic_field_covariance;

    public MagneticField() {
        this.header = new com.roslib.std_msgs.Header();
        this.magnetic_field = new com.roslib.geometry_msgs.Vector3();
        this.magnetic_field_covariance = new double[9];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.magnetic_field.serialize(outbuffer, offset);
        for (int i = 0; i < 9; i++){
        long bits_magnetic_field_covariancei = Double.doubleToRawLongBits(this.magnetic_field_covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_magnetic_field_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_magnetic_field_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_magnetic_field_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_magnetic_field_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_magnetic_field_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_magnetic_field_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_magnetic_field_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_magnetic_field_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.magnetic_field.deserialize(inbuffer, offset);
        for(int i = 0; i < 9; i++){
        long bits_magnetic_field_covariancei = 0;
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_magnetic_field_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.magnetic_field_covariance[i] = Double.longBitsToDouble(bits_magnetic_field_covariancei);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.magnetic_field.serializedLength();
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/MagneticField"; }
    public java.lang.String getMD5(){ return "f8e051d776de1349146122759c66db92"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
