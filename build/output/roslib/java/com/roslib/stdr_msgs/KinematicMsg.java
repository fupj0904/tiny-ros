package com.roslib.stdr_msgs;

import java.lang.*;

public class KinematicMsg implements com.roslib.ros.Msg {
    public java.lang.String type;
    public float a_ux_ux;
    public float a_ux_uy;
    public float a_ux_w;
    public float a_uy_ux;
    public float a_uy_uy;
    public float a_uy_w;
    public float a_w_ux;
    public float a_w_uy;
    public float a_w_w;
    public float a_g_ux;
    public float a_g_uy;
    public float a_g_w;

    public KinematicMsg() {
        this.type = "";
        this.a_ux_ux = 0;
        this.a_ux_uy = 0;
        this.a_ux_w = 0;
        this.a_uy_ux = 0;
        this.a_uy_uy = 0;
        this.a_uy_w = 0;
        this.a_w_ux = 0;
        this.a_w_uy = 0;
        this.a_w_w = 0;
        this.a_g_ux = 0;
        this.a_g_uy = 0;
        this.a_g_w = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        int bits_a_ux_ux = Float.floatToRawIntBits(a_ux_ux);
        outbuffer[offset + 0] = (byte)((bits_a_ux_ux >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_ux_ux >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_ux_ux >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_ux_ux >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_ux_uy = Float.floatToRawIntBits(a_ux_uy);
        outbuffer[offset + 0] = (byte)((bits_a_ux_uy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_ux_uy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_ux_uy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_ux_uy >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_ux_w = Float.floatToRawIntBits(a_ux_w);
        outbuffer[offset + 0] = (byte)((bits_a_ux_w >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_ux_w >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_ux_w >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_ux_w >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_uy_ux = Float.floatToRawIntBits(a_uy_ux);
        outbuffer[offset + 0] = (byte)((bits_a_uy_ux >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_uy_ux >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_uy_ux >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_uy_ux >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_uy_uy = Float.floatToRawIntBits(a_uy_uy);
        outbuffer[offset + 0] = (byte)((bits_a_uy_uy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_uy_uy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_uy_uy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_uy_uy >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_uy_w = Float.floatToRawIntBits(a_uy_w);
        outbuffer[offset + 0] = (byte)((bits_a_uy_w >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_uy_w >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_uy_w >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_uy_w >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_w_ux = Float.floatToRawIntBits(a_w_ux);
        outbuffer[offset + 0] = (byte)((bits_a_w_ux >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_w_ux >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_w_ux >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_w_ux >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_w_uy = Float.floatToRawIntBits(a_w_uy);
        outbuffer[offset + 0] = (byte)((bits_a_w_uy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_w_uy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_w_uy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_w_uy >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_w_w = Float.floatToRawIntBits(a_w_w);
        outbuffer[offset + 0] = (byte)((bits_a_w_w >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_w_w >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_w_w >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_w_w >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_g_ux = Float.floatToRawIntBits(a_g_ux);
        outbuffer[offset + 0] = (byte)((bits_a_g_ux >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_g_ux >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_g_ux >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_g_ux >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_g_uy = Float.floatToRawIntBits(a_g_uy);
        outbuffer[offset + 0] = (byte)((bits_a_g_uy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_g_uy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_g_uy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_g_uy >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_a_g_w = Float.floatToRawIntBits(a_g_w);
        outbuffer[offset + 0] = (byte)((bits_a_g_w >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_a_g_w >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_a_g_w >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_a_g_w >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        int bits_a_ux_ux = 0;
        bits_a_ux_ux |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_ux_ux |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_ux_ux |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_ux_ux |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_ux_ux = Float.intBitsToFloat(bits_a_ux_ux);
        offset += 4;
        int bits_a_ux_uy = 0;
        bits_a_ux_uy |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_ux_uy |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_ux_uy |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_ux_uy |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_ux_uy = Float.intBitsToFloat(bits_a_ux_uy);
        offset += 4;
        int bits_a_ux_w = 0;
        bits_a_ux_w |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_ux_w |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_ux_w |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_ux_w |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_ux_w = Float.intBitsToFloat(bits_a_ux_w);
        offset += 4;
        int bits_a_uy_ux = 0;
        bits_a_uy_ux |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_uy_ux |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_uy_ux |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_uy_ux |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_uy_ux = Float.intBitsToFloat(bits_a_uy_ux);
        offset += 4;
        int bits_a_uy_uy = 0;
        bits_a_uy_uy |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_uy_uy |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_uy_uy |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_uy_uy |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_uy_uy = Float.intBitsToFloat(bits_a_uy_uy);
        offset += 4;
        int bits_a_uy_w = 0;
        bits_a_uy_w |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_uy_w |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_uy_w |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_uy_w |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_uy_w = Float.intBitsToFloat(bits_a_uy_w);
        offset += 4;
        int bits_a_w_ux = 0;
        bits_a_w_ux |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_w_ux |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_w_ux |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_w_ux |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_w_ux = Float.intBitsToFloat(bits_a_w_ux);
        offset += 4;
        int bits_a_w_uy = 0;
        bits_a_w_uy |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_w_uy |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_w_uy |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_w_uy |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_w_uy = Float.intBitsToFloat(bits_a_w_uy);
        offset += 4;
        int bits_a_w_w = 0;
        bits_a_w_w |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_w_w |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_w_w |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_w_w |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_w_w = Float.intBitsToFloat(bits_a_w_w);
        offset += 4;
        int bits_a_g_ux = 0;
        bits_a_g_ux |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_g_ux |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_g_ux |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_g_ux |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_g_ux = Float.intBitsToFloat(bits_a_g_ux);
        offset += 4;
        int bits_a_g_uy = 0;
        bits_a_g_uy |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_g_uy |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_g_uy |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_g_uy |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_g_uy = Float.intBitsToFloat(bits_a_g_uy);
        offset += 4;
        int bits_a_g_w = 0;
        bits_a_g_w |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_a_g_w |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_a_g_w |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_a_g_w |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a_g_w = Float.intBitsToFloat(bits_a_g_w);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/KinematicMsg"; }
    public java.lang.String getMD5(){ return "cf0b9abaed86b18d8a763aca389d5103"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
