package com.roslib.roscpp;

import java.lang.*;

public class Logger implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String level;

    public Logger() {
        this.name = "";
        this.level = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        int length_level = this.level.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_level >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_level >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_level >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_level >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_level; k++) {
            outbuffer[offset + k] = (byte)((this.level.getBytes())[k] & 0xFF);
        }
        offset += length_level;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        int length_level = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_level |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_level |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_level |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_level = new byte[length_level];
        for(int k= 0; k< length_level; k++){
            bytes_level[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.level = new java.lang.String(bytes_level);
        offset += length_level;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_level = this.level.getBytes().length;
        length += 4;
        length += length_level;
        return length;
    }

    public java.lang.String getType(){ return "roscpp/Logger"; }
    public java.lang.String getMD5(){ return "3afc956666f9cf8d128a190b614a4d29"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
