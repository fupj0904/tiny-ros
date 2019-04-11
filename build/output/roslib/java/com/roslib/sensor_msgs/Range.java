package com.roslib.sensor_msgs;

import java.lang.*;

public class Range implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int radiation_type;
    public float field_of_view;
    public float min_range;
    public float max_range;
    public float range;
    public static final int ULTRASOUND = (int)(0);
    public static final int INFRARED = (int)(1);

    public Range() {
        this.header = new com.roslib.std_msgs.Header();
        this.radiation_type = 0;
        this.field_of_view = 0;
        this.min_range = 0;
        this.max_range = 0;
        this.range = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.radiation_type >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_field_of_view = Float.floatToRawIntBits(field_of_view);
        outbuffer[offset + 0] = (byte)((bits_field_of_view >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_field_of_view >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_field_of_view >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_field_of_view >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_min_range = Float.floatToRawIntBits(min_range);
        outbuffer[offset + 0] = (byte)((bits_min_range >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_min_range >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_min_range >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_min_range >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_max_range = Float.floatToRawIntBits(max_range);
        outbuffer[offset + 0] = (byte)((bits_max_range >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_range >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_range >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_range >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_range = Float.floatToRawIntBits(range);
        outbuffer[offset + 0] = (byte)((bits_range >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_range >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_range >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_range >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.radiation_type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_field_of_view = 0;
        bits_field_of_view |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_field_of_view |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_field_of_view |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_field_of_view |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.field_of_view = Float.intBitsToFloat(bits_field_of_view);
        offset += 4;
        int bits_min_range = 0;
        bits_min_range |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_min_range |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_min_range |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_min_range |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.min_range = Float.intBitsToFloat(bits_min_range);
        offset += 4;
        int bits_max_range = 0;
        bits_max_range |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_range |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_range |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_range |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.max_range = Float.intBitsToFloat(bits_max_range);
        offset += 4;
        int bits_range = 0;
        bits_range |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_range |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_range |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_range |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.range = Float.intBitsToFloat(bits_range);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 1;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/Range"; }
    public java.lang.String getMD5(){ return "54d647e3a481f5b87ce39d1b97e84d53"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
