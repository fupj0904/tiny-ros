package com.roslib.rocon_std_msgs;

import java.lang.*;

public class Icon implements com.roslib.ros.Msg {
    public java.lang.String resource_name;
    public java.lang.String format;
    public int[] data;

    public Icon() {
        this.resource_name = "";
        this.format = "";
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_resource_name = this.resource_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_resource_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_resource_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_resource_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_resource_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_resource_name; k++) {
            outbuffer[offset + k] = (byte)((this.resource_name.getBytes())[k] & 0xFF);
        }
        offset += length_resource_name;
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
        int length_resource_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_resource_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_resource_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_resource_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_resource_name = new byte[length_resource_name];
        for(int k= 0; k< length_resource_name; k++){
            bytes_resource_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.resource_name = new java.lang.String(bytes_resource_name);
        offset += length_resource_name;
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
        int length_resource_name = this.resource_name.getBytes().length;
        length += 4;
        length += length_resource_name;
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

    public java.lang.String getType(){ return "rocon_std_msgs/Icon"; }
    public java.lang.String getMD5(){ return "b54e1773dcd30c895331771f96456ed8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
