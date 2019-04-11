package com.roslib.actionlib;

import java.lang.*;

public class TwoIntsResult implements com.roslib.ros.Msg {
    public long sum;

    public TwoIntsResult() {
        this.sum = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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

    public java.lang.String getType(){ return "actionlib/TwoIntsResult"; }
    public java.lang.String getMD5(){ return "d4421f94028d331a146e18be9cfed220"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
