package com.roslib.rospy_tutorials;

import java.lang.*;

public class HeaderString implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String data;

    public HeaderString() {
        this.header = new com.roslib.std_msgs.Header();
        this.data = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_data = this.data.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_data; k++) {
            outbuffer[offset + k] = (byte)((this.data.getBytes())[k] & 0xFF);
        }
        offset += length_data;
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
        byte[] bytes_data = new byte[length_data];
        for(int k= 0; k< length_data; k++){
            bytes_data[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.data = new java.lang.String(bytes_data);
        offset += length_data;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_data = this.data.getBytes().length;
        length += 4;
        length += length_data;
        return length;
    }

    public java.lang.String getType(){ return "rospy_tutorials/HeaderString"; }
    public java.lang.String getMD5(){ return "56ebedb96f8c1f99ddb12288d03533d5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
