package com.roslib.capabilities;

import java.lang.*;

public class GetInterfaces {

public static final java.lang.String GETINTERFACES = "capabilities/GetInterfaces";

public class GetInterfacesRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetInterfacesRequest() {
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

    public java.lang.String getType() { return GETINTERFACES; }
    public java.lang.String getMD5(){ return "86e773635c4819add378b61523c8827a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetInterfacesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] interfaces;

    public GetInterfacesResponse() {
        this.interfaces = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_interfaces = this.interfaces != null ? this.interfaces.length : 0;
        outbuffer[offset + 0] = (byte)((length_interfaces >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_interfaces >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_interfaces >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_interfaces >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_interfaces; i++){
        int length_interfacesi = this.interfaces[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_interfacesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_interfacesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_interfacesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_interfacesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_interfacesi; k++) {
            outbuffer[offset + k] = (byte)((this.interfaces[i].getBytes())[k] & 0xFF);
        }
        offset += length_interfacesi;
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
        int length_interfaces = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_interfaces |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_interfaces |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_interfaces |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_interfaces > 0) {
            this.interfaces = new java.lang.String[length_interfaces];
        }
        for (int i = 0; i < length_interfaces; i++){
        int length_interfacesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_interfacesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_interfacesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_interfacesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_interfacesi = new byte[length_interfacesi];
        for(int k= 0; k< length_interfacesi; k++){
            bytes_interfacesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.interfaces[i] = new java.lang.String(bytes_interfacesi);
        offset += length_interfacesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_interfaces = this.interfaces != null ? this.interfaces.length : 0;
        for (int i = 0; i < length_interfaces; i++) {
        int length_interfacesi = this.interfaces[i].getBytes().length;
        length += 4;
        length += length_interfacesi;
        }
        return length;
    }

    public java.lang.String getType() { return GETINTERFACES; }
    public java.lang.String getMD5(){ return "6faec341dd1e98d4643f8cbb238daa68"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
