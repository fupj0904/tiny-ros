package com.roslib.sensor_msgs;

import java.lang.*;

public class NavSatFix implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.sensor_msgs.NavSatStatus status;
    public double latitude;
    public double longitude;
    public double altitude;
    public double[] position_covariance;
    public int position_covariance_type;
    public static final int COVARIANCE_TYPE_UNKNOWN = (int)( 0);
    public static final int COVARIANCE_TYPE_APPROXIMATED = (int)( 1);
    public static final int COVARIANCE_TYPE_DIAGONAL_KNOWN = (int)( 2);
    public static final int COVARIANCE_TYPE_KNOWN = (int)( 3);

    public NavSatFix() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = new com.roslib.sensor_msgs.NavSatStatus();
        this.latitude = 0;
        this.longitude = 0;
        this.altitude = 0;
        this.position_covariance = new double[9];
        this.position_covariance_type = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.status.serialize(outbuffer, offset);
        long bits_latitude = Double.doubleToRawLongBits(this.latitude);
        outbuffer[offset + 0] = (byte)((bits_latitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_latitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_latitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_latitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_latitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_latitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_latitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_latitude >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_longitude = Double.doubleToRawLongBits(this.longitude);
        outbuffer[offset + 0] = (byte)((bits_longitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_longitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_longitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_longitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_longitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_longitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_longitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_longitude >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_altitude = Double.doubleToRawLongBits(this.altitude);
        outbuffer[offset + 0] = (byte)((bits_altitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_altitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_altitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_altitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_altitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_altitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_altitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_altitude >> (8 * 7)) & 0xFF);
        offset += 8;
        for (int i = 0; i < 9; i++){
        long bits_position_covariancei = Double.doubleToRawLongBits(this.position_covariance[i]);
        outbuffer[offset + 0] = (byte)((bits_position_covariancei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_position_covariancei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_position_covariancei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_position_covariancei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_position_covariancei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_position_covariancei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_position_covariancei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_position_covariancei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        outbuffer[offset + 0] = (byte)((this.position_covariance_type >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.status.deserialize(inbuffer, offset);
        long bits_latitude = 0;
        bits_latitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_latitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_latitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_latitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_latitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_latitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_latitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_latitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.latitude = Double.longBitsToDouble(bits_latitude);
        offset += 8;
        long bits_longitude = 0;
        bits_longitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_longitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_longitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_longitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_longitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_longitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_longitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_longitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.longitude = Double.longBitsToDouble(bits_longitude);
        offset += 8;
        long bits_altitude = 0;
        bits_altitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_altitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_altitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_altitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_altitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_altitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_altitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_altitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.altitude = Double.longBitsToDouble(bits_altitude);
        offset += 8;
        for(int i = 0; i < 9; i++){
        long bits_position_covariancei = 0;
        bits_position_covariancei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_position_covariancei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_position_covariancei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_position_covariancei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_position_covariancei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_position_covariancei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_position_covariancei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_position_covariancei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.position_covariance[i] = Double.longBitsToDouble(bits_position_covariancei);
        offset += 8;
        }
        this.position_covariance_type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.status.serializedLength();
        length += 8;
        length += 8;
        length += 8;
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/NavSatFix"; }
    public java.lang.String getMD5(){ return "adc27ca9d8634ed087021b82f3c43576"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
