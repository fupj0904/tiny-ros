package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigateToResult implements com.roslib.ros.Msg {
    public boolean success;
    public float distance;
    public java.lang.String message;

    public NavigateToResult() {
        this.success = false;
        this.distance = 0;
        this.message = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int bits_distance = Float.floatToRawIntBits(distance);
        outbuffer[offset + 0] = (byte)((bits_distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_distance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_distance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_distance >> (8 * 3)) & 0xFF);
        offset += 4;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int bits_distance = 0;
        bits_distance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_distance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_distance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_distance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.distance = Float.intBitsToFloat(bits_distance);
        offset += 4;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/NavigateToResult"; }
    public java.lang.String getMD5(){ return "4de577a42c1a5fc202b13ad14dfb578c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
