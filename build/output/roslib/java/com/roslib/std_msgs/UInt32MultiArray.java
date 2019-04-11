package com.roslib.std_msgs;

import java.lang.*;

public class UInt32MultiArray implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.MultiArrayLayout layout;
    public long[] data;

    public UInt32MultiArray() {
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
        offset += 4;
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
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.layout.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/UInt32MultiArray"; }
    public java.lang.String getMD5(){ return "eb9320ab0c1ae5878d7ab30676e3083f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
