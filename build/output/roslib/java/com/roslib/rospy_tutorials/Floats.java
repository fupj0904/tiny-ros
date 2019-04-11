package com.roslib.rospy_tutorials;

import java.lang.*;

public class Floats implements com.roslib.ros.Msg {
    public float[] data;

    public Floats() {
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        int bits_datai = Float.floatToRawIntBits(data[i]);
        outbuffer[offset + 0] = (byte)((bits_datai >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_datai >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_datai >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_datai >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new float[length_data];
        }
        for (int i = 0; i < length_data; i++){
        int bits_datai = 0;
        bits_datai |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_datai |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_datai |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_datai |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.data[i] = Float.intBitsToFloat(bits_datai);
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "rospy_tutorials/Floats"; }
    public java.lang.String getMD5(){ return "253837a364903dc5f291bac6d9c88d05"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
