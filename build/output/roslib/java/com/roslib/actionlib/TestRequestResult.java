package com.roslib.actionlib;

import java.lang.*;

public class TestRequestResult implements com.roslib.ros.Msg {
    public int the_result;
    public boolean is_simple_server;

    public TestRequestResult() {
        this.the_result = 0;
        this.is_simple_server = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.the_result >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.the_result >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.the_result >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.the_result >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((is_simple_server ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.the_result   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.the_result |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.the_result |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.the_result |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.is_simple_server = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestRequestResult"; }
    public java.lang.String getMD5(){ return "19d101c82c3cc73293d5542139607a9e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
