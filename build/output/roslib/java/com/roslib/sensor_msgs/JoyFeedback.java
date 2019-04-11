package com.roslib.sensor_msgs;

import java.lang.*;

public class JoyFeedback implements com.roslib.ros.Msg {
    public int type;
    public int id;
    public float intensity;
    public static final int TYPE_LED = (int)( 0);
    public static final int TYPE_RUMBLE = (int)( 1);
    public static final int TYPE_BUZZER = (int)( 2);

    public JoyFeedback() {
        this.type = 0;
        this.id = 0;
        this.intensity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_intensity = Float.floatToRawIntBits(intensity);
        outbuffer[offset + 0] = (byte)((bits_intensity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_intensity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_intensity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_intensity >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_intensity = 0;
        bits_intensity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_intensity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_intensity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_intensity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.intensity = Float.intBitsToFloat(bits_intensity);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 1;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/JoyFeedback"; }
    public java.lang.String getMD5(){ return "206b65e86c8b195f816ccbe40b3568a2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
