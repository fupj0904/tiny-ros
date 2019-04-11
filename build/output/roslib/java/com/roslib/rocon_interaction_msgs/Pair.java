package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class Pair implements com.roslib.ros.Msg {
    public java.lang.String rapp;
    public java.lang.String remocon;

    public Pair() {
        this.rapp = "";
        this.remocon = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_rapp = this.rapp.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rapp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rapp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rapp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rapp >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rapp; k++) {
            outbuffer[offset + k] = (byte)((this.rapp.getBytes())[k] & 0xFF);
        }
        offset += length_rapp;
        int length_remocon = this.remocon.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remocon >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remocon >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remocon >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remocon >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remocon; k++) {
            outbuffer[offset + k] = (byte)((this.remocon.getBytes())[k] & 0xFF);
        }
        offset += length_remocon;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_rapp = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rapp |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rapp |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rapp |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rapp = new byte[length_rapp];
        for(int k= 0; k< length_rapp; k++){
            bytes_rapp[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.rapp = new java.lang.String(bytes_rapp);
        offset += length_rapp;
        int length_remocon = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remocon |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remocon |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remocon |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remocon = new byte[length_remocon];
        for(int k= 0; k< length_remocon; k++){
            bytes_remocon[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remocon = new java.lang.String(bytes_remocon);
        offset += length_remocon;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_rapp = this.rapp.getBytes().length;
        length += 4;
        length += length_rapp;
        int length_remocon = this.remocon.getBytes().length;
        length += 4;
        length += length_remocon;
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/Pair"; }
    public java.lang.String getMD5(){ return "b7a6df4c2235f4259330d56ba911c4c3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
