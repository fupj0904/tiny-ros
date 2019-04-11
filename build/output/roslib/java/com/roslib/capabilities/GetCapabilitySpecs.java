package com.roslib.capabilities;

import java.lang.*;

public class GetCapabilitySpecs {

public static final java.lang.String GETCAPABILITYSPECS = "capabilities/GetCapabilitySpecs";

public class GetCapabilitySpecsRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetCapabilitySpecsRequest() {
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

    public java.lang.String getType() { return GETCAPABILITYSPECS; }
    public java.lang.String getMD5(){ return "5e863ea94ed35a0069fad233158d2a05"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetCapabilitySpecsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.capabilities.CapabilitySpec[] capability_specs;

    public GetCapabilitySpecsResponse() {
        this.capability_specs = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_capability_specs = this.capability_specs != null ? this.capability_specs.length : 0;
        outbuffer[offset + 0] = (byte)((length_capability_specs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_capability_specs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_capability_specs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_capability_specs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_capability_specs; i++){
        offset = this.capability_specs[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_capability_specs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_capability_specs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_capability_specs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_capability_specs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_capability_specs > 0) {
            this.capability_specs = new com.roslib.capabilities.CapabilitySpec[length_capability_specs];
        }
        for (int i = 0; i < length_capability_specs; i++){
        offset = this.capability_specs[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_capability_specs = this.capability_specs != null ? this.capability_specs.length : 0;
        for (int i = 0; i < length_capability_specs; i++) {
        length += this.capability_specs[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETCAPABILITYSPECS; }
    public java.lang.String getMD5(){ return "3642335251a502151cfcb342c4f53734"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
