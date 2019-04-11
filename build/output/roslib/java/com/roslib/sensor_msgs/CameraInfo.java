package com.roslib.sensor_msgs;

import java.lang.*;

public class CameraInfo implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long height;
    public long width;
    public java.lang.String distortion_model;
    public double[] D;
    public double[] K;
    public double[] R;
    public double[] P;
    public long binning_x;
    public long binning_y;
    public com.roslib.sensor_msgs.RegionOfInterest roi;

    public CameraInfo() {
        this.header = new com.roslib.std_msgs.Header();
        this.height = 0;
        this.width = 0;
        this.distortion_model = "";
        this.D = null;
        this.K = new double[9];
        this.R = new double[9];
        this.P = new double[12];
        this.binning_x = 0;
        this.binning_y = 0;
        this.roi = new com.roslib.sensor_msgs.RegionOfInterest();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.height >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.width >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_distortion_model = this.distortion_model.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_distortion_model >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_distortion_model >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_distortion_model >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_distortion_model >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_distortion_model; k++) {
            outbuffer[offset + k] = (byte)((this.distortion_model.getBytes())[k] & 0xFF);
        }
        offset += length_distortion_model;
        int length_D = this.D != null ? this.D.length : 0;
        outbuffer[offset + 0] = (byte)((length_D >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_D >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_D >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_D >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_D; i++){
        long bits_Di = Double.doubleToRawLongBits(this.D[i]);
        outbuffer[offset + 0] = (byte)((bits_Di >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_Di >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_Di >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_Di >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_Di >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_Di >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_Di >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_Di >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        for (int i = 0; i < 9; i++){
        long bits_Ki = Double.doubleToRawLongBits(this.K[i]);
        outbuffer[offset + 0] = (byte)((bits_Ki >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_Ki >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_Ki >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_Ki >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_Ki >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_Ki >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_Ki >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_Ki >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        for (int i = 0; i < 9; i++){
        long bits_Ri = Double.doubleToRawLongBits(this.R[i]);
        outbuffer[offset + 0] = (byte)((bits_Ri >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_Ri >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_Ri >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_Ri >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_Ri >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_Ri >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_Ri >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_Ri >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        for (int i = 0; i < 12; i++){
        long bits_Pi = Double.doubleToRawLongBits(this.P[i]);
        outbuffer[offset + 0] = (byte)((bits_Pi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_Pi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_Pi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_Pi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_Pi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_Pi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_Pi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_Pi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        outbuffer[offset + 0] = (byte)((this.binning_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.binning_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.binning_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.binning_x >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.binning_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.binning_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.binning_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.binning_y >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.roi.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.height   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.width   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_distortion_model = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_distortion_model |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_distortion_model |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_distortion_model |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_distortion_model = new byte[length_distortion_model];
        for(int k= 0; k< length_distortion_model; k++){
            bytes_distortion_model[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.distortion_model = new java.lang.String(bytes_distortion_model);
        offset += length_distortion_model;
        int length_D = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_D |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_D |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_D |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_D > 0) {
            this.D = new double[length_D];
        }
        for (int i = 0; i < length_D; i++){
        long bits_Di = 0;
        bits_Di |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_Di |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_Di |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_Di |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_Di |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_Di |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_Di |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_Di |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.D[i] = Double.longBitsToDouble(bits_Di);
        offset += 8;
        }
        for(int i = 0; i < 9; i++){
        long bits_Ki = 0;
        bits_Ki |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_Ki |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_Ki |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_Ki |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_Ki |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_Ki |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_Ki |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_Ki |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.K[i] = Double.longBitsToDouble(bits_Ki);
        offset += 8;
        }
        for(int i = 0; i < 9; i++){
        long bits_Ri = 0;
        bits_Ri |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_Ri |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_Ri |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_Ri |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_Ri |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_Ri |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_Ri |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_Ri |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.R[i] = Double.longBitsToDouble(bits_Ri);
        offset += 8;
        }
        for(int i = 0; i < 12; i++){
        long bits_Pi = 0;
        bits_Pi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_Pi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_Pi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_Pi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_Pi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_Pi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_Pi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_Pi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.P[i] = Double.longBitsToDouble(bits_Pi);
        offset += 8;
        }
        this.binning_x   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.binning_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.binning_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.binning_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.binning_y   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.binning_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.binning_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.binning_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.roi.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        int length_distortion_model = this.distortion_model.getBytes().length;
        length += 4;
        length += length_distortion_model;
        length += 4;
        int length_D = this.D != null ? this.D.length : 0;
        for (int i = 0; i < length_D; i++) {
        length += 8;
        }
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        for (int i = 0; i < 9; i++){
        length += 8;
        }
        for (int i = 0; i < 12; i++){
        length += 8;
        }
        length += 4;
        length += 4;
        length += this.roi.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/CameraInfo"; }
    public java.lang.String getMD5(){ return "57d2553deec0a7842f00837f40032798"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
