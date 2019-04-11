package com.roslib.capabilities;

import java.lang.*;

public class CapabilityEvent implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String capability;
    public java.lang.String provider;
    public java.lang.String type;
    public int pid;
    public static final java.lang.String LAUNCHED = (java.lang.String)("launched");
    public static final java.lang.String STOPPED = (java.lang.String)("stopped");
    public static final java.lang.String TERMINATED = (java.lang.String)("terminated");
    public static final java.lang.String SERVER_READY = (java.lang.String)("server_ready");

    public CapabilityEvent() {
        this.header = new com.roslib.std_msgs.Header();
        this.capability = "";
        this.provider = "";
        this.type = "";
        this.pid = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
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
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        outbuffer[offset + 0] = (byte)((this.pid >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.pid >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.pid >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.pid >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
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
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        this.pid   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.pid |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.pid |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.pid |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_capability = this.capability.getBytes().length;
        length += 4;
        length += length_capability;
        int length_provider = this.provider.getBytes().length;
        length += 4;
        length += length_provider;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "capabilities/CapabilityEvent"; }
    public java.lang.String getMD5(){ return "78a8d85af549f871ce60ddc8bcef6913"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
