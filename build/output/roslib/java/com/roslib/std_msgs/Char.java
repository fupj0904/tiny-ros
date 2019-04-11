package com.roslib.std_msgs;

import java.lang.*;

public class Char implements com.roslib.ros.Msg {
    public char data;

    public Char() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data   = (char)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Char"; }
    public java.lang.String getMD5(){ return "18741a80dcc02fcae20538073fcb0872"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
