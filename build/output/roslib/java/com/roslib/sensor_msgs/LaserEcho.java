package com.roslib.sensor_msgs;

import java.lang.*;

public class LaserEcho implements com.roslib.ros.Msg {
    public float[] echoes;

    public LaserEcho() {
        this.echoes = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_echoes = this.echoes != null ? this.echoes.length : 0;
        outbuffer[offset + 0] = (byte)((length_echoes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_echoes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_echoes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_echoes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_echoes; i++){
        int bits_echoesi = Float.floatToRawIntBits(echoes[i]);
        outbuffer[offset + 0] = (byte)((bits_echoesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_echoesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_echoesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_echoesi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_echoes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_echoes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_echoes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_echoes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_echoes > 0) {
            this.echoes = new float[length_echoes];
        }
        for (int i = 0; i < length_echoes; i++){
        int bits_echoesi = 0;
        bits_echoesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_echoesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_echoesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_echoesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.echoes[i] = Float.intBitsToFloat(bits_echoesi);
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_echoes = this.echoes != null ? this.echoes.length : 0;
        for (int i = 0; i < length_echoes; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/LaserEcho"; }
    public java.lang.String getMD5(){ return "a8537b388573845b3240b44db5bc4905"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
