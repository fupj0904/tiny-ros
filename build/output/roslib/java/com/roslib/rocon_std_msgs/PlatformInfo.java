package com.roslib.rocon_std_msgs;

import java.lang.*;

public class PlatformInfo implements com.roslib.ros.Msg {
    public java.lang.String uri;
    public java.lang.String version;
    public com.roslib.rocon_std_msgs.Icon icon;

    public PlatformInfo() {
        this.uri = "";
        this.version = "";
        this.icon = new com.roslib.rocon_std_msgs.Icon();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_uri = this.uri.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_uri >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_uri >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_uri >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_uri >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_uri; k++) {
            outbuffer[offset + k] = (byte)((this.uri.getBytes())[k] & 0xFF);
        }
        offset += length_uri;
        int length_version = this.version.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_version >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_version >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_version >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_version >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_version; k++) {
            outbuffer[offset + k] = (byte)((this.version.getBytes())[k] & 0xFF);
        }
        offset += length_version;
        offset = this.icon.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_uri = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_uri |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_uri |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_uri |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_uri = new byte[length_uri];
        for(int k= 0; k< length_uri; k++){
            bytes_uri[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.uri = new java.lang.String(bytes_uri);
        offset += length_uri;
        int length_version = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_version |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_version |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_version |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_version = new byte[length_version];
        for(int k= 0; k< length_version; k++){
            bytes_version[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.version = new java.lang.String(bytes_version);
        offset += length_version;
        offset = this.icon.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_uri = this.uri.getBytes().length;
        length += 4;
        length += length_uri;
        int length_version = this.version.getBytes().length;
        length += 4;
        length += length_version;
        length += this.icon.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/PlatformInfo"; }
    public java.lang.String getMD5(){ return "ff2d1e0ae923abaa177e3565659d2635"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
