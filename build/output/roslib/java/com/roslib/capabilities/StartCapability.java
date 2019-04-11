package com.roslib.capabilities;

import java.lang.*;

public class StartCapability {

public static final java.lang.String STARTCAPABILITY = "capabilities/StartCapability";

public class StartCapabilityRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String capability;
    public java.lang.String preferred_provider;

    public StartCapabilityRequest() {
        this.capability = "";
        this.preferred_provider = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        int length_preferred_provider = this.preferred_provider.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_preferred_provider >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_preferred_provider >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_preferred_provider >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_preferred_provider >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_preferred_provider; k++) {
            outbuffer[offset + k] = (byte)((this.preferred_provider.getBytes())[k] & 0xFF);
        }
        offset += length_preferred_provider;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        int length_preferred_provider = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_preferred_provider |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_preferred_provider |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_preferred_provider |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_preferred_provider = new byte[length_preferred_provider];
        for(int k= 0; k< length_preferred_provider; k++){
            bytes_preferred_provider[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.preferred_provider = new java.lang.String(bytes_preferred_provider);
        offset += length_preferred_provider;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_capability = this.capability.getBytes().length;
        length += 4;
        length += length_capability;
        int length_preferred_provider = this.preferred_provider.getBytes().length;
        length += 4;
        length += length_preferred_provider;
        return length;
    }

    public java.lang.String getType() { return STARTCAPABILITY; }
    public java.lang.String getMD5(){ return "f121dd6b47f883a6b49fc3fa17495f55"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class StartCapabilityResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean successful;

    public StartCapabilityResponse() {
        this.successful = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((successful ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.successful = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return STARTCAPABILITY; }
    public java.lang.String getMD5(){ return "630ec07051eb93a656bfcfe4e9031579"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
