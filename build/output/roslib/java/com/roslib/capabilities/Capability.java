package com.roslib.capabilities;

import java.lang.*;

public class Capability implements com.roslib.ros.Msg {
    public java.lang.String capability;
    public java.lang.String provider;

    public Capability() {
        this.capability = "";
        this.provider = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_capability = this.capability.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_capability >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_capability >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_capability >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_capability >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_capability; k++) {
            outbuffer[offset + k] = (byte)((this.capability.getBytes())[k] & 0xFF);
        }
        offset += length_capability;
        int length_provider = this.provider.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_provider >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_provider >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_provider >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_provider >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_provider; k++) {
            outbuffer[offset + k] = (byte)((this.provider.getBytes())[k] & 0xFF);
        }
        offset += length_provider;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_capability = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_capability |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_capability |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_capability |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_capability = new byte[length_capability];
        for(int k= 0; k< length_capability; k++){
            bytes_capability[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.capability = new java.lang.String(bytes_capability);
        offset += length_capability;
        int length_provider = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_provider |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_provider |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_provider |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_provider = new byte[length_provider];
        for(int k= 0; k< length_provider; k++){
            bytes_provider[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.provider = new java.lang.String(bytes_provider);
        offset += length_provider;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_capability = this.capability.getBytes().length;
        length += 4;
        length += length_capability;
        int length_provider = this.provider.getBytes().length;
        length += 4;
        length += length_provider;
        return length;
    }

    public java.lang.String getType(){ return "capabilities/Capability"; }
    public java.lang.String getMD5(){ return "875eea4cfd3728a7a30a570e76e43be2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
