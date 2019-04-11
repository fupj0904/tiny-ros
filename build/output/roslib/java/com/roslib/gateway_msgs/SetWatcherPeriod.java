package com.roslib.gateway_msgs;

import java.lang.*;

public class SetWatcherPeriod {

public static final java.lang.String SETWATCHERPERIOD = "gateway_msgs/SetWatcherPeriod";

public class SetWatcherPeriodRequest implements com.roslib.ros.Msg {
    private long __id__;
    public float period;

    public SetWatcherPeriodRequest() {
        this.period = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_period = Float.floatToRawIntBits(period);
        outbuffer[offset + 0] = (byte)((bits_period >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_period >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_period >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_period >> (8 * 3)) & 0xFF);
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
        int bits_period = 0;
        bits_period |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_period |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_period |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_period |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.period = Float.intBitsToFloat(bits_period);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return SETWATCHERPERIOD; }
    public java.lang.String getMD5(){ return "ac1f092e4a88fe31ba61f73a1601123b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetWatcherPeriodResponse implements com.roslib.ros.Msg {
    private long __id__;
    public float last_period;

    public SetWatcherPeriodResponse() {
        this.last_period = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_last_period = Float.floatToRawIntBits(last_period);
        outbuffer[offset + 0] = (byte)((bits_last_period >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_last_period >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_last_period >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_last_period >> (8 * 3)) & 0xFF);
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
        int bits_last_period = 0;
        bits_last_period |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_last_period |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_last_period |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_last_period |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.last_period = Float.intBitsToFloat(bits_last_period);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return SETWATCHERPERIOD; }
    public java.lang.String getMD5(){ return "71fc5046201c2cb819d6e3de53959564"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
