package com.roslib.capabilities;

import java.lang.*;

public class GetCapabilitySpec {

public static final java.lang.String GETCAPABILITYSPEC = "capabilities/GetCapabilitySpec";

public class GetCapabilitySpecRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String capability_spec;

    public GetCapabilitySpecRequest() {
        this.capability_spec = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_capability_spec = this.capability_spec.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_capability_spec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_capability_spec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_capability_spec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_capability_spec >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_capability_spec; k++) {
            outbuffer[offset + k] = (byte)((this.capability_spec.getBytes())[k] & 0xFF);
        }
        offset += length_capability_spec;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_capability_spec = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_capability_spec |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_capability_spec |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_capability_spec |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_capability_spec = new byte[length_capability_spec];
        for(int k= 0; k< length_capability_spec; k++){
            bytes_capability_spec[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.capability_spec = new java.lang.String(bytes_capability_spec);
        offset += length_capability_spec;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_capability_spec = this.capability_spec.getBytes().length;
        length += 4;
        length += length_capability_spec;
        return length;
    }

    public java.lang.String getType() { return GETCAPABILITYSPEC; }
    public java.lang.String getMD5(){ return "e061d073a19df8f5112f3e48db707e91"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetCapabilitySpecResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.capabilities.CapabilitySpec capability_spec;

    public GetCapabilitySpecResponse() {
        this.capability_spec = new com.roslib.capabilities.CapabilitySpec();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.capability_spec.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.capability_spec.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.capability_spec.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETCAPABILITYSPEC; }
    public java.lang.String getMD5(){ return "894aad5f33b01cf286d1eee43a18d67e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
