package com.roslib.sensor_msgs;

import java.lang.*;

public class Image implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long height;
    public long width;
    public java.lang.String encoding;
    public int is_bigendian;
    public long step;
    public int[] data;

    public Image() {
        this.header = new com.roslib.std_msgs.Header();
        this.height = 0;
        this.width = 0;
        this.encoding = "";
        this.is_bigendian = 0;
        this.step = 0;
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.height >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.width >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_encoding = this.encoding.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_encoding >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_encoding >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_encoding >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_encoding >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_encoding; k++) {
            outbuffer[offset + k] = (byte)((this.encoding.getBytes())[k] & 0xFF);
        }
        offset += length_encoding;
        outbuffer[offset + 0] = (byte)((this.is_bigendian >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.step >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.step >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.step >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.step >> (8 * 3)) & 0xFF);
        offset += 4;
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
        this.height   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.width   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_encoding = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_encoding |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_encoding |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_encoding |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_encoding = new byte[length_encoding];
        for(int k= 0; k< length_encoding; k++){
            bytes_encoding[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.encoding = new java.lang.String(bytes_encoding);
        offset += length_encoding;
        this.is_bigendian   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.step   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.step |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.step |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.step |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        length += 4;
        int length_encoding = this.encoding.getBytes().length;
        length += 4;
        length += length_encoding;
        length += 1;
        length += 4;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/Image"; }
    public java.lang.String getMD5(){ return "886f928dc81bf7f1496a8b452057c5b2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
