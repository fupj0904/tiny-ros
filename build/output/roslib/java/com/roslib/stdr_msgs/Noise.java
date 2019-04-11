package com.roslib.stdr_msgs;

import java.lang.*;

public class Noise implements com.roslib.ros.Msg {
    public boolean noise;
    public float noiseMean;
    public float noiseStd;

    public Noise() {
        this.noise = false;
        this.noiseMean = 0;
        this.noiseStd = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset] = (byte)((noise ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int bits_noiseMean = Float.floatToRawIntBits(noiseMean);
        outbuffer[offset + 0] = (byte)((bits_noiseMean >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_noiseMean >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_noiseMean >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_noiseMean >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_noiseStd = Float.floatToRawIntBits(noiseStd);
        outbuffer[offset + 0] = (byte)((bits_noiseStd >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_noiseStd >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_noiseStd >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_noiseStd >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.noise = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int bits_noiseMean = 0;
        bits_noiseMean |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_noiseMean |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_noiseMean |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_noiseMean |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.noiseMean = Float.intBitsToFloat(bits_noiseMean);
        offset += 4;
        int bits_noiseStd = 0;
        bits_noiseStd |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_noiseStd |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_noiseStd |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_noiseStd |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.noiseStd = Float.intBitsToFloat(bits_noiseStd);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/Noise"; }
    public java.lang.String getMD5(){ return "49f90c3415d07028f6218fbf5cc63426"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
