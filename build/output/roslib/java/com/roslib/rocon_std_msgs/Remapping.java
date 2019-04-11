package com.roslib.rocon_std_msgs;

import java.lang.*;

public class Remapping implements com.roslib.ros.Msg {
    public java.lang.String remap_from;
    public java.lang.String remap_to;

    public Remapping() {
        this.remap_from = "";
        this.remap_to = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_remap_from = this.remap_from.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remap_from >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_from >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_from >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_from >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remap_from; k++) {
            outbuffer[offset + k] = (byte)((this.remap_from.getBytes())[k] & 0xFF);
        }
        offset += length_remap_from;
        int length_remap_to = this.remap_to.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remap_to >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_to >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_to >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_to >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remap_to; k++) {
            outbuffer[offset + k] = (byte)((this.remap_to.getBytes())[k] & 0xFF);
        }
        offset += length_remap_to;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_remap_from = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_from |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_from |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_from |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remap_from = new byte[length_remap_from];
        for(int k= 0; k< length_remap_from; k++){
            bytes_remap_from[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remap_from = new java.lang.String(bytes_remap_from);
        offset += length_remap_from;
        int length_remap_to = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_to |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_to |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_to |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remap_to = new byte[length_remap_to];
        for(int k= 0; k< length_remap_to; k++){
            bytes_remap_to[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remap_to = new java.lang.String(bytes_remap_to);
        offset += length_remap_to;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_remap_from = this.remap_from.getBytes().length;
        length += 4;
        length += length_remap_from;
        int length_remap_to = this.remap_to.getBytes().length;
        length += 4;
        length += length_remap_to;
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/Remapping"; }
    public java.lang.String getMD5(){ return "ede70eaf91efc4b8349f18fb7e0e6470"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
