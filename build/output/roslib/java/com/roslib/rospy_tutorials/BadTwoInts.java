package com.roslib.rospy_tutorials;

import java.lang.*;

public class BadTwoInts {

public static final java.lang.String BADTWOINTS = "rospy_tutorials/BadTwoInts";

public class BadTwoIntsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public long a;
    public int b;

    public BadTwoIntsRequest() {
        this.a = 0;
        this.b = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.a >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.a >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.a >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.a >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.a >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.a >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.a >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.a >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset + 0] = (byte)((this.b >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.b >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.b >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.b >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.a   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.a |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.a |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.a |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.a |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.a |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.a |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.a |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        this.b   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.b |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.b |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.b |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return BADTWOINTS; }
    public java.lang.String getMD5(){ return "ce9f1c6f4b0eef1ce1cea90f73e8ef55"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class BadTwoIntsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public int sum;

    public BadTwoIntsResponse() {
        this.sum = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.sum >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.sum >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.sum >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.sum >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.sum   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sum |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sum |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sum |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return BADTWOINTS; }
    public java.lang.String getMD5(){ return "0846ce4f82ba5727b30eb63aaee0c772"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
