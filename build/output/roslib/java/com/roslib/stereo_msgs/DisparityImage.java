package com.roslib.stereo_msgs;

import java.lang.*;

public class DisparityImage implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.sensor_msgs.Image image;
    public float f;
    public float T;
    public com.roslib.sensor_msgs.RegionOfInterest valid_window;
    public float min_disparity;
    public float max_disparity;
    public float delta_d;

    public DisparityImage() {
        this.header = new com.roslib.std_msgs.Header();
        this.image = new com.roslib.sensor_msgs.Image();
        this.f = 0;
        this.T = 0;
        this.valid_window = new com.roslib.sensor_msgs.RegionOfInterest();
        this.min_disparity = 0;
        this.max_disparity = 0;
        this.delta_d = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.image.serialize(outbuffer, offset);
        int bits_f = Float.floatToRawIntBits(f);
        outbuffer[offset + 0] = (byte)((bits_f >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_f >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_f >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_f >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_T = Float.floatToRawIntBits(T);
        outbuffer[offset + 0] = (byte)((bits_T >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_T >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_T >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_T >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.valid_window.serialize(outbuffer, offset);
        int bits_min_disparity = Float.floatToRawIntBits(min_disparity);
        outbuffer[offset + 0] = (byte)((bits_min_disparity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_min_disparity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_min_disparity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_min_disparity >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_max_disparity = Float.floatToRawIntBits(max_disparity);
        outbuffer[offset + 0] = (byte)((bits_max_disparity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_disparity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_disparity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_disparity >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_delta_d = Float.floatToRawIntBits(delta_d);
        outbuffer[offset + 0] = (byte)((bits_delta_d >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_delta_d >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_delta_d >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_delta_d >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.image.deserialize(inbuffer, offset);
        int bits_f = 0;
        bits_f |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_f |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_f |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_f |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.f = Float.intBitsToFloat(bits_f);
        offset += 4;
        int bits_T = 0;
        bits_T |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_T |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_T |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_T |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.T = Float.intBitsToFloat(bits_T);
        offset += 4;
        offset = this.valid_window.deserialize(inbuffer, offset);
        int bits_min_disparity = 0;
        bits_min_disparity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_min_disparity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_min_disparity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_min_disparity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.min_disparity = Float.intBitsToFloat(bits_min_disparity);
        offset += 4;
        int bits_max_disparity = 0;
        bits_max_disparity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_disparity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_disparity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_disparity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.max_disparity = Float.intBitsToFloat(bits_max_disparity);
        offset += 4;
        int bits_delta_d = 0;
        bits_delta_d |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_delta_d |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_delta_d |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_delta_d |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.delta_d = Float.intBitsToFloat(bits_delta_d);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.image.serializedLength();
        length += 4;
        length += 4;
        length += this.valid_window.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stereo_msgs/DisparityImage"; }
    public java.lang.String getMD5(){ return "03545cef8df8d20bea21fdbbf9482b4b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
