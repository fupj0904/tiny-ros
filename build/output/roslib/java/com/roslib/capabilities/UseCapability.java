package com.roslib.capabilities;

import java.lang.*;

public class UseCapability {

public static final java.lang.String USECAPABILITY = "capabilities/UseCapability";

public class UseCapabilityRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String capability;
    public java.lang.String preferred_provider;
    public java.lang.String bond_id;

    public UseCapabilityRequest() {
        this.capability = "";
        this.preferred_provider = "";
        this.bond_id = "";
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
        int length_bond_id = this.bond_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_bond_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_bond_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_bond_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_bond_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_bond_id; k++) {
            outbuffer[offset + k] = (byte)((this.bond_id.getBytes())[k] & 0xFF);
        }
        offset += length_bond_id;
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
        int length_bond_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_bond_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_bond_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_bond_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_bond_id = new byte[length_bond_id];
        for(int k= 0; k< length_bond_id; k++){
            bytes_bond_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.bond_id = new java.lang.String(bytes_bond_id);
        offset += length_bond_id;
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
        int length_bond_id = this.bond_id.getBytes().length;
        length += 4;
        length += length_bond_id;
        return length;
    }

    public java.lang.String getType() { return USECAPABILITY; }
    public java.lang.String getMD5(){ return "613137a3d08c20596ba38c292bf5199f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class UseCapabilityResponse implements com.roslib.ros.Msg {
    private long __id__;

    public UseCapabilityResponse() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return USECAPABILITY; }
    public java.lang.String getMD5(){ return "089547423517208d9d9a92e920b1f9ed"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
