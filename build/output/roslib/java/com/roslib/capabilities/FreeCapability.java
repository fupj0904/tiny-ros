package com.roslib.capabilities;

import java.lang.*;

public class FreeCapability {

public static final java.lang.String FREECAPABILITY = "capabilities/FreeCapability";

public class FreeCapabilityRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String capability;
    public java.lang.String bond_id;

    public FreeCapabilityRequest() {
        this.capability = "";
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
        int length_bond_id = this.bond_id.getBytes().length;
        length += 4;
        length += length_bond_id;
        return length;
    }

    public java.lang.String getType() { return FREECAPABILITY; }
    public java.lang.String getMD5(){ return "e72a6763f63ef4e7af3390e321317d79"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class FreeCapabilityResponse implements com.roslib.ros.Msg {
    private long __id__;

    public FreeCapabilityResponse() {
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

    public java.lang.String getType() { return FREECAPABILITY; }
    public java.lang.String getMD5(){ return "cbcfb40d3662f70e34a787a523cd3bda"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
