package com.roslib.geometry_msgs;

import java.lang.*;

public class AccelWithCovariance implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Accel accel;
    public double[] covariance;

    public AccelWithCovariance() {
        this.accel = new com.roslib.geometry_msgs.Accel();
        this.covariance = new double[36];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.accel.serialize(outbuffer, offset);
        for (int i = 0; i < 36; i++){
        long bits_covariancei = Double.doubleToRawLongBits(this.covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.accel.deserialize(inbuffer, offset);
        for(int i = 0; i < 36; i++){
        long bits_covariancei = 0;
        bits_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.covariance[i] = Double.longBitsToDouble(bits_covariancei);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.accel.serializedLength();
        for (int i = 0; i < 36; i++){
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/AccelWithCovariance"; }
    public java.lang.String getMD5(){ return "6c9c3b4380e0391a48b0a1be79b38ac6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
