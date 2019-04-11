package com.roslib.capabilities;

import java.lang.*;

public class RunningCapability implements com.roslib.ros.Msg {
    public com.roslib.capabilities.Capability capability;
    public com.roslib.capabilities.Capability[] dependent_capabilities;
    public java.lang.String started_by;
    public int pid;

    public RunningCapability() {
        this.capability = new com.roslib.capabilities.Capability();
        this.dependent_capabilities = null;
        this.started_by = "";
        this.pid = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.capability.serialize(outbuffer, offset);
        int length_dependent_capabilities = this.dependent_capabilities != null ? this.dependent_capabilities.length : 0;
        outbuffer[offset + 0] = (byte)((length_dependent_capabilities >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_dependent_capabilities >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_dependent_capabilities >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_dependent_capabilities >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_dependent_capabilities; i++){
        offset = this.dependent_capabilities[i].serialize(outbuffer, offset);
        }
        int length_started_by = this.started_by.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_started_by >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_started_by >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_started_by >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_started_by >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_started_by; k++) {
            outbuffer[offset + k] = (byte)((this.started_by.getBytes())[k] & 0xFF);
        }
        offset += length_started_by;
        outbuffer[offset + 0] = (byte)((this.pid >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.pid >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.pid >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.pid >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.capability.deserialize(inbuffer, offset);
        int length_dependent_capabilities = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_dependent_capabilities |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_dependent_capabilities |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_dependent_capabilities |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_dependent_capabilities > 0) {
            this.dependent_capabilities = new com.roslib.capabilities.Capability[length_dependent_capabilities];
        }
        for (int i = 0; i < length_dependent_capabilities; i++){
        offset = this.dependent_capabilities[i].deserialize(inbuffer, offset);
        }
        int length_started_by = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_started_by |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_started_by |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_started_by |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_started_by = new byte[length_started_by];
        for(int k= 0; k< length_started_by; k++){
            bytes_started_by[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.started_by = new java.lang.String(bytes_started_by);
        offset += length_started_by;
        this.pid   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.pid |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.pid |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.pid |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.capability.serializedLength();
        length += 4;
        int length_dependent_capabilities = this.dependent_capabilities != null ? this.dependent_capabilities.length : 0;
        for (int i = 0; i < length_dependent_capabilities; i++) {
        length += this.dependent_capabilities[i].serializedLength();
        }
        int length_started_by = this.started_by.getBytes().length;
        length += 4;
        length += length_started_by;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "capabilities/RunningCapability"; }
    public java.lang.String getMD5(){ return "44f3cddc9b17c79d778b10742a14a3d1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
