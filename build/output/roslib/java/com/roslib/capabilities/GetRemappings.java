package com.roslib.capabilities;

import java.lang.*;

public class GetRemappings {

public static final java.lang.String GETREMAPPINGS = "capabilities/GetRemappings";

public class GetRemappingsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String spec;

    public GetRemappingsRequest() {
        this.spec = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_spec = this.spec.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_spec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_spec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_spec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_spec >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_spec; k++) {
            outbuffer[offset + k] = (byte)((this.spec.getBytes())[k] & 0xFF);
        }
        offset += length_spec;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_spec = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_spec |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_spec |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_spec |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_spec = new byte[length_spec];
        for(int k= 0; k< length_spec; k++){
            bytes_spec[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.spec = new java.lang.String(bytes_spec);
        offset += length_spec;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_spec = this.spec.getBytes().length;
        length += 4;
        length += length_spec;
        return length;
    }

    public java.lang.String getType() { return GETREMAPPINGS; }
    public java.lang.String getMD5(){ return "28b3bb2f7aa29eb5731b68f66784077d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetRemappingsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.capabilities.Remapping[] topics;
    public com.roslib.capabilities.Remapping[] services;
    public com.roslib.capabilities.Remapping[] actions;
    public com.roslib.capabilities.Remapping[] parameters;

    public GetRemappingsResponse() {
        this.topics = null;
        this.services = null;
        this.actions = null;
        this.parameters = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        outbuffer[offset + 0] = (byte)((length_topics >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topics >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topics >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topics >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_topics; i++){
        offset = this.topics[i].serialize(outbuffer, offset);
        }
        int length_services = this.services != null ? this.services.length : 0;
        outbuffer[offset + 0] = (byte)((length_services >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_services >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_services >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_services >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_services; i++){
        offset = this.services[i].serialize(outbuffer, offset);
        }
        int length_actions = this.actions != null ? this.actions.length : 0;
        outbuffer[offset + 0] = (byte)((length_actions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_actions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_actions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_actions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_actions; i++){
        offset = this.actions[i].serialize(outbuffer, offset);
        }
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].serialize(outbuffer, offset);
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
        int length_topics = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topics |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topics |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topics |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_topics > 0) {
            this.topics = new com.roslib.capabilities.Remapping[length_topics];
        }
        for (int i = 0; i < length_topics; i++){
        offset = this.topics[i].deserialize(inbuffer, offset);
        }
        int length_services = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_services |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_services |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_services |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_services > 0) {
            this.services = new com.roslib.capabilities.Remapping[length_services];
        }
        for (int i = 0; i < length_services; i++){
        offset = this.services[i].deserialize(inbuffer, offset);
        }
        int length_actions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_actions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_actions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_actions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_actions > 0) {
            this.actions = new com.roslib.capabilities.Remapping[length_actions];
        }
        for (int i = 0; i < length_actions; i++){
        offset = this.actions[i].deserialize(inbuffer, offset);
        }
        int length_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_parameters > 0) {
            this.parameters = new com.roslib.capabilities.Remapping[length_parameters];
        }
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        for (int i = 0; i < length_topics; i++) {
        length += this.topics[i].serializedLength();
        }
        length += 4;
        int length_services = this.services != null ? this.services.length : 0;
        for (int i = 0; i < length_services; i++) {
        length += this.services[i].serializedLength();
        }
        length += 4;
        int length_actions = this.actions != null ? this.actions.length : 0;
        for (int i = 0; i < length_actions; i++) {
        length += this.actions[i].serializedLength();
        }
        length += 4;
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        for (int i = 0; i < length_parameters; i++) {
        length += this.parameters[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETREMAPPINGS; }
    public java.lang.String getMD5(){ return "29b876d2a35fc5b5468724aa1283ca7b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
