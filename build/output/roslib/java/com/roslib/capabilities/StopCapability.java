package com.roslib.capabilities;

import java.lang.*;

public class StopCapability {

public static final java.lang.String STOPCAPABILITY = "capabilities/StopCapability";

public class StopCapabilityRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String capability;

    public StopCapabilityRequest() {
        this.capability = "";
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_capability = this.capability.getBytes().length;
        length += 4;
        length += length_capability;
        return length;
    }

    public java.lang.String getType() { return STOPCAPABILITY; }
    public java.lang.String getMD5(){ return "133937fdb8f304fdc356942b5bc52bcc"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class StopCapabilityResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean successful;

    public StopCapabilityResponse() {
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

    public java.lang.String getType() { return STOPCAPABILITY; }
    public java.lang.String getMD5(){ return "13098441a4c59676686ca688522a0a9c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
