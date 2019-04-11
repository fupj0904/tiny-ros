package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigateToGoal implements com.roslib.ros.Msg {
    public java.lang.String location;
    public byte approach_type;
    public byte num_retry;
    public float timeout;
    public float distance;
    public static final byte APPROACH_NEAR = (byte)( 11);
    public static final byte APPROACH_ON = (byte)( 12);

    public NavigateToGoal() {
        this.location = "";
        this.approach_type = 0;
        this.num_retry = 0;
        this.timeout = 0;
        this.distance = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_location = this.location.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_location >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_location >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_location >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_location >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_location; k++) {
            outbuffer[offset + k] = (byte)((this.location.getBytes())[k] & 0xFF);
        }
        offset += length_location;
        outbuffer[offset + 0] = (byte)((this.approach_type >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.num_retry >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_timeout = Float.floatToRawIntBits(timeout);
        outbuffer[offset + 0] = (byte)((bits_timeout >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_timeout >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_timeout >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_timeout >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_distance = Float.floatToRawIntBits(distance);
        outbuffer[offset + 0] = (byte)((bits_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_distance >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_location = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_location |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_location |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_location |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_location = new byte[length_location];
        for(int k= 0; k< length_location; k++){
            bytes_location[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.location = new java.lang.String(bytes_location);
        offset += length_location;
        this.approach_type   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.num_retry   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_timeout = 0;
        bits_timeout |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_timeout |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_timeout |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_timeout |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.timeout = Float.intBitsToFloat(bits_timeout);
        offset += 4;
        int bits_distance = 0;
        bits_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.distance = Float.intBitsToFloat(bits_distance);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_location = this.location.getBytes().length;
        length += 4;
        length += length_location;
        length += 1;
        length += 1;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/NavigateToGoal"; }
    public java.lang.String getMD5(){ return "32728335bd3e3cff51eb0a7927dd939c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
