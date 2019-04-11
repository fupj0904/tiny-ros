package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigateToFeedback implements com.roslib.ros.Msg {
    public java.lang.String message;
    public float distance;
    public float remain_time;
    public byte status;
    public static final byte STATUS_RETRY = (byte)( 21);
    public static final byte STATUS_INPROGRESS = (byte)( 22);
    public static final byte STATUS_ERROR = (byte)( 23);

    public NavigateToFeedback() {
        this.message = "";
        this.distance = 0;
        this.remain_time = 0;
        this.status = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
        int bits_distance = Float.floatToRawIntBits(distance);
        outbuffer[offset + 0] = (byte)((bits_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_distance >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_remain_time = Float.floatToRawIntBits(remain_time);
        outbuffer[offset + 0] = (byte)((bits_remain_time >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_remain_time >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_remain_time >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_remain_time >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.status >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        int bits_distance = 0;
        bits_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.distance = Float.intBitsToFloat(bits_distance);
        offset += 4;
        int bits_remain_time = 0;
        bits_remain_time |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_remain_time |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_remain_time |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_remain_time |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.remain_time = Float.intBitsToFloat(bits_remain_time);
        offset += 4;
        this.status   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        length += 4;
        length += 4;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/NavigateToFeedback"; }
    public java.lang.String getMD5(){ return "bd2238e9219a7256d2ca83d79077108d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
