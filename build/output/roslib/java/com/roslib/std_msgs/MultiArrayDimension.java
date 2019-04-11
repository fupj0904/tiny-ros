package com.roslib.std_msgs;

import java.lang.*;

public class MultiArrayDimension implements com.roslib.ros.Msg {
    public java.lang.String label;
    public long size;
    public long stride;

    public MultiArrayDimension() {
        this.label = "";
        this.size = 0;
        this.stride = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_label = this.label.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_label >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_label >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_label >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_label >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_label; k++) {
            outbuffer[offset + k] = (byte)((this.label.getBytes())[k] & 0xFF);
        }
        offset += length_label;
        outbuffer[offset + 0] = (byte)((this.size >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.size >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.size >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.size >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stride >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stride >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stride >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stride >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_label = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_label |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_label |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_label |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_label = new byte[length_label];
        for(int k= 0; k< length_label; k++){
            bytes_label[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.label = new java.lang.String(bytes_label);
        offset += length_label;
        this.size   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.size |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.size |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.size |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stride   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stride |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stride |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stride |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_label = this.label.getBytes().length;
        length += 4;
        length += length_label;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/MultiArrayDimension"; }
    public java.lang.String getMD5(){ return "c2aacf83d49c7aa4a8504bd32158e990"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
