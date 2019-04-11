package com.roslib.stdr_msgs;

import java.lang.*;

public class SoundSensorMeasurementMsg implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float sound_dbs;

    public SoundSensorMeasurementMsg() {
        this.header = new com.roslib.std_msgs.Header();
        this.sound_dbs = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int bits_sound_dbs = Float.floatToRawIntBits(sound_dbs);
        outbuffer[offset + 0] = (byte)((bits_sound_dbs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_sound_dbs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_sound_dbs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_sound_dbs >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int bits_sound_dbs = 0;
        bits_sound_dbs |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_sound_dbs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_sound_dbs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_sound_dbs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.sound_dbs = Float.intBitsToFloat(bits_sound_dbs);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/SoundSensorMeasurementMsg"; }
    public java.lang.String getMD5(){ return "10e45415a975e7c86712a58a6cc9c0e8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
