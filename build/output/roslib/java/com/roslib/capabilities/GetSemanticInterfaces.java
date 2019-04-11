package com.roslib.capabilities;

import java.lang.*;

public class GetSemanticInterfaces {

public static final java.lang.String GETSEMANTICINTERFACES = "capabilities/GetSemanticInterfaces";

public class GetSemanticInterfacesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String interface_;

    public GetSemanticInterfacesRequest() {
        this.interface_ = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_interface_ = this.interface_.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_interface_ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_interface_ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_interface_ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_interface_ >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_interface_; k++) {
            outbuffer[offset + k] = (byte)((this.interface_.getBytes())[k] & 0xFF);
        }
        offset += length_interface_;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_interface_ = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_interface_ |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_interface_ |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_interface_ |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_interface_ = new byte[length_interface_];
        for(int k= 0; k< length_interface_; k++){
            bytes_interface_[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.interface_ = new java.lang.String(bytes_interface_);
        offset += length_interface_;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_interface_ = this.interface_.getBytes().length;
        length += 4;
        length += length_interface_;
        return length;
    }

    public java.lang.String getType() { return GETSEMANTICINTERFACES; }
    public java.lang.String getMD5(){ return "f42a102203eb375d2ebd403aede69432"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetSemanticInterfacesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] semantic_interfaces;

    public GetSemanticInterfacesResponse() {
        this.semantic_interfaces = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_semantic_interfaces = this.semantic_interfaces != null ? this.semantic_interfaces.length : 0;
        outbuffer[offset + 0] = (byte)((length_semantic_interfaces >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_semantic_interfaces >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_semantic_interfaces >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_semantic_interfaces >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_semantic_interfaces; i++){
        int length_semantic_interfacesi = this.semantic_interfaces[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_semantic_interfacesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_semantic_interfacesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_semantic_interfacesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_semantic_interfacesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_semantic_interfacesi; k++) {
            outbuffer[offset + k] = (byte)((this.semantic_interfaces[i].getBytes())[k] & 0xFF);
        }
        offset += length_semantic_interfacesi;
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
        int length_semantic_interfaces = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_semantic_interfaces |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_semantic_interfaces |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_semantic_interfaces |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_semantic_interfaces > 0) {
            this.semantic_interfaces = new java.lang.String[length_semantic_interfaces];
        }
        for (int i = 0; i < length_semantic_interfaces; i++){
        int length_semantic_interfacesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_semantic_interfacesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_semantic_interfacesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_semantic_interfacesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_semantic_interfacesi = new byte[length_semantic_interfacesi];
        for(int k= 0; k< length_semantic_interfacesi; k++){
            bytes_semantic_interfacesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.semantic_interfaces[i] = new java.lang.String(bytes_semantic_interfacesi);
        offset += length_semantic_interfacesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_semantic_interfaces = this.semantic_interfaces != null ? this.semantic_interfaces.length : 0;
        for (int i = 0; i < length_semantic_interfaces; i++) {
        int length_semantic_interfacesi = this.semantic_interfaces[i].getBytes().length;
        length += 4;
        length += length_semantic_interfacesi;
        }
        return length;
    }

    public java.lang.String getType() { return GETSEMANTICINTERFACES; }
    public java.lang.String getMD5(){ return "ce6cb72a7939290a37327acfff99a111"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
