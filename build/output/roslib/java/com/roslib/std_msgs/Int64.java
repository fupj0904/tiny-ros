package com.roslib.std_msgs;

import java.lang.*;

public class Int64 implements com.roslib.ros.Msg {
    public long data;

    public Int64() {
        this.data = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.data >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.data >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.data >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.data >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.data   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.data |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.data |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.data |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.data |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Int64"; }
    public java.lang.String getMD5(){ return "3dd57e1dfe8b2ebcc4764deb44bda243"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
