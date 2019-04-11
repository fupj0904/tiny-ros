package com.roslib.std_msgs;

import java.lang.*;

public class Int64MultiArray implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.MultiArrayLayout layout;
    public long[] data;

    public Int64MultiArray() {
        this.layout = new com.roslib.std_msgs.MultiArrayLayout();
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.layout.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data[i] >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.data[i] >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.data[i] >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.data[i] >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.data[i] >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.layout.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new long[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data[i] |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data[i] |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data[i] |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.data[i] |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.data[i] |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.data[i] |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.data[i] |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.layout.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Int64MultiArray"; }
    public java.lang.String getMD5(){ return "c06d166bcec6ac0d57a5122b314c9f5c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
