package com.roslib.kobuki_msgs;

import java.lang.*;

public class DockInfraRed implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int[] data;
    public static final int NEAR_LEFT = (int)(  1);
    public static final int NEAR_CENTER = (int)(  2);
    public static final int NEAR_RIGHT = (int)(  4);
    public static final int FAR_LEFT = (int)( 16);
    public static final int FAR_CENTER = (int)(  8);
    public static final int FAR_RIGHT = (int)( 32);

    public DockInfraRed() {
        this.header = new com.roslib.std_msgs.Header();
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new int[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/DockInfraRed"; }
    public java.lang.String getMD5(){ return "d4f6b2e90976b8c85111f2f90e10c8b2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
