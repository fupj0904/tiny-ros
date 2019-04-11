package com.roslib.sensor_msgs;

import java.lang.*;

public class CompressedImage implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String format;
    public int[] data;

    public CompressedImage() {
        this.header = new com.roslib.std_msgs.Header();
        this.format = "";
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_format = this.format.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_format >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_format >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_format >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_format >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_format; k++) {
            outbuffer[offset + k] = (byte)((this.format.getBytes())[k] & 0xFF);
        }
        offset += length_format;
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
        int length_format = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_format |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_format |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_format |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_format = new byte[length_format];
        for(int k= 0; k< length_format; k++){
            bytes_format[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.format = new java.lang.String(bytes_format);
        offset += length_format;
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
        int length_format = this.format.getBytes().length;
        length += 4;
        length += length_format;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/CompressedImage"; }
    public java.lang.String getMD5(){ return "eed57d856457441995644e6294152301"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
