package com.roslib.control_toolbox;

import java.lang.*;

public class SetPidGains {

public static final java.lang.String SETPIDGAINS = "control_toolbox/SetPidGains";

public class SetPidGainsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public double p;
    public double i;
    public double d;
    public double i_clamp;

    public SetPidGainsRequest() {
        this.p = 0;
        this.i = 0;
        this.d = 0;
        this.i_clamp = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        long bits_p = Double.doubleToRawLongBits(this.p);
        outbuffer[offset + 0] = (byte)((bits_p >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_p >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_p >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_p >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_p >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_p >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_p >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_p >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_i = Double.doubleToRawLongBits(this.i);
        outbuffer[offset + 0] = (byte)((bits_i >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_i >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_i >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_i >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_i >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_i >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_i >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_i >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_d = Double.doubleToRawLongBits(this.d);
        outbuffer[offset + 0] = (byte)((bits_d >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_d >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_d >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_d >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_d >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_d >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_d >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_d >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_i_clamp = Double.doubleToRawLongBits(this.i_clamp);
        outbuffer[offset + 0] = (byte)((bits_i_clamp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_i_clamp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_i_clamp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_i_clamp >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_i_clamp >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_i_clamp >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_i_clamp >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_i_clamp >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        long bits_p = 0;
        bits_p |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_p |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_p |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_p |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_p |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_p |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_p |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_p |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.p = Double.longBitsToDouble(bits_p);
        offset += 8;
        long bits_i = 0;
        bits_i |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_i |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_i |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_i |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_i |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_i |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_i |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_i |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.i = Double.longBitsToDouble(bits_i);
        offset += 8;
        long bits_d = 0;
        bits_d |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_d |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_d |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_d |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_d |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_d |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_d |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_d |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.d = Double.longBitsToDouble(bits_d);
        offset += 8;
        long bits_i_clamp = 0;
        bits_i_clamp |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_i_clamp |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_i_clamp |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_i_clamp |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_i_clamp |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_i_clamp |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_i_clamp |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_i_clamp |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.i_clamp = Double.longBitsToDouble(bits_i_clamp);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType() { return SETPIDGAINS; }
    public java.lang.String getMD5(){ return "4c47825ecf55afb8327becff3d88029d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetPidGainsResponse implements com.roslib.ros.Msg {
    private long __id__;

    public SetPidGainsResponse() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return SETPIDGAINS; }
    public java.lang.String getMD5(){ return "3cf6dde1d915834e5a5d91b5f3a2fd63"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
