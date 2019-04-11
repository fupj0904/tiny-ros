package com.roslib.capabilities;

import java.lang.*;

public class GetRunningCapabilities {

public static final java.lang.String GETRUNNINGCAPABILITIES = "capabilities/GetRunningCapabilities";

public class GetRunningCapabilitiesRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetRunningCapabilitiesRequest() {
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

    public java.lang.String getType() { return GETRUNNINGCAPABILITIES; }
    public java.lang.String getMD5(){ return "de1a174462d39d81162b8d3de00e913c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetRunningCapabilitiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.capabilities.RunningCapability[] running_capabilities;

    public GetRunningCapabilitiesResponse() {
        this.running_capabilities = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_running_capabilities = this.running_capabilities != null ? this.running_capabilities.length : 0;
        outbuffer[offset + 0] = (byte)((length_running_capabilities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_capabilities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_capabilities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_capabilities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_running_capabilities; i++){
        offset = this.running_capabilities[i].serialize(outbuffer, offset);
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
        int length_running_capabilities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_capabilities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_capabilities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_capabilities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_running_capabilities > 0) {
            this.running_capabilities = new com.roslib.capabilities.RunningCapability[length_running_capabilities];
        }
        for (int i = 0; i < length_running_capabilities; i++){
        offset = this.running_capabilities[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_running_capabilities = this.running_capabilities != null ? this.running_capabilities.length : 0;
        for (int i = 0; i < length_running_capabilities; i++) {
        length += this.running_capabilities[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETRUNNINGCAPABILITIES; }
    public java.lang.String getMD5(){ return "d44ece956f99f54d4d1afd84d4d96b4f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
