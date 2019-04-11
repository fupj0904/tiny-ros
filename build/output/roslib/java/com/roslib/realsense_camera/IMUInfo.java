package com.roslib.realsense_camera;

import java.lang.*;

public class IMUInfo implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public double[] data;
    public double[] noise_variances;
    public double[] bias_variances;

    public IMUInfo() {
        this.header = new com.roslib.std_msgs.Header();
        this.data = new double[12];
        this.noise_variances = new double[3];
        this.bias_variances = new double[3];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        for (int i = 0; i < 12; i++){
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
        for (int i = 0; i < 3; i++){
        long bits_noise_variancesi = Double.doubleToRawLongBits(this.noise_variances[i]);
        outbuffer[offset + 0] = (byte)((bits_noise_variancesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_noise_variancesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_noise_variancesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_noise_variancesi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_noise_variancesi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_noise_variancesi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_noise_variancesi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_noise_variancesi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        for (int i = 0; i < 3; i++){
        long bits_bias_variancesi = Double.doubleToRawLongBits(this.bias_variances[i]);
        outbuffer[offset + 0] = (byte)((bits_bias_variancesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_bias_variancesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_bias_variancesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_bias_variancesi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_bias_variancesi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_bias_variancesi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_bias_variancesi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_bias_variancesi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        for(int i = 0; i < 12; i++){
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
        for(int i = 0; i < 3; i++){
        long bits_noise_variancesi = 0;
        bits_noise_variancesi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_noise_variancesi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_noise_variancesi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_noise_variancesi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_noise_variancesi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_noise_variancesi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_noise_variancesi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_noise_variancesi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.noise_variances[i] = Double.longBitsToDouble(bits_noise_variancesi);
        offset += 8;
        }
        for(int i = 0; i < 3; i++){
        long bits_bias_variancesi = 0;
        bits_bias_variancesi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_bias_variancesi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_bias_variancesi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_bias_variancesi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_bias_variancesi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_bias_variancesi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_bias_variancesi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_bias_variancesi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.bias_variances[i] = Double.longBitsToDouble(bits_bias_variancesi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        for (int i = 0; i < 12; i++){
        length += 8;
        }
        for (int i = 0; i < 3; i++){
        length += 8;
        }
        for (int i = 0; i < 3; i++){
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "realsense_camera/IMUInfo"; }
    public java.lang.String getMD5(){ return "83dae37517a9b4794bf8e79575e0e0ed"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
