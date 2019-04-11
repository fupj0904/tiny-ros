package com.roslib.rospy_tutorials;

import java.lang.*;

public class AddTwoInts {

public static final java.lang.String ADDTWOINTS = "rospy_tutorials/AddTwoInts";

public class AddTwoIntsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public long a;
    public long b;

    public AddTwoIntsRequest() {
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
        outbuffer[offset + 4] = (byte)((this.b >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.b >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.b >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.b >> (8 * 7)) & 0xFF);
        offset += 8;
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
        this.b   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.b |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.b |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.b |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.b |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.b |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.b |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.b |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType() { return ADDTWOINTS; }
    public java.lang.String getMD5(){ return "f5b8bf9c5f36cb55d1f5a03735531dd9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AddTwoIntsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public long sum;

    public AddTwoIntsResponse() {
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
        outbuffer[offset + 4] = (byte)((this.sum >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.sum >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.sum >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.sum >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.sum   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sum |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sum |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sum |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.sum |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.sum |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.sum |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.sum |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        return length;
    }

    public java.lang.String getType() { return ADDTWOINTS; }
    public java.lang.String getMD5(){ return "51e52bccd717ed4e6914860f5fdda89b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
