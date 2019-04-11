package com.roslib.shape_msgs;

import java.lang.*;

public class Plane implements com.roslib.ros.Msg {
    public double[] coef;

    public Plane() {
        this.coef = new double[4];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        for (int i = 0; i < 4; i++){
        long bits_coefi = Double.doubleToRawLongBits(this.coef[i]);
        outbuffer[offset + 0] = (byte)((bits_coefi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_coefi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_coefi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_coefi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_coefi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_coefi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_coefi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_coefi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        for(int i = 0; i < 4; i++){
        long bits_coefi = 0;
        bits_coefi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_coefi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_coefi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_coefi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_coefi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_coefi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_coefi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_coefi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.coef[i] = Double.longBitsToDouble(bits_coefi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        for (int i = 0; i < 4; i++){
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "shape_msgs/Plane"; }
    public java.lang.String getMD5(){ return "770421286b7c90effe8aac9f1c37eac0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
