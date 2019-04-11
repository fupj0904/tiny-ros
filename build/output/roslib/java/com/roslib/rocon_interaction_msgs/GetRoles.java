package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class GetRoles {

public static final java.lang.String GETROLES = "rocon_interaction_msgs/GetRoles";

public class GetRolesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String uri;

    public GetRolesRequest() {
        this.uri = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_uri = this.uri.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_uri >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_uri >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_uri >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_uri >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_uri; k++) {
            outbuffer[offset + k] = (byte)((this.uri.getBytes())[k] & 0xFF);
        }
        offset += length_uri;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_uri = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_uri |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_uri |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_uri |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_uri = new byte[length_uri];
        for(int k= 0; k< length_uri; k++){
            bytes_uri[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.uri = new java.lang.String(bytes_uri);
        offset += length_uri;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_uri = this.uri.getBytes().length;
        length += 4;
        length += length_uri;
        return length;
    }

    public java.lang.String getType() { return GETROLES; }
    public java.lang.String getMD5(){ return "6df69cbf8d9d66972f6054c22c0abae7"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetRolesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] roles;

    public GetRolesResponse() {
        this.roles = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_roles = this.roles != null ? this.roles.length : 0;
        outbuffer[offset + 0] = (byte)((length_roles >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_roles >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_roles >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_roles >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_roles; i++){
        int length_rolesi = this.roles[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rolesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rolesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rolesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rolesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rolesi; k++) {
            outbuffer[offset + k] = (byte)((this.roles[i].getBytes())[k] & 0xFF);
        }
        offset += length_rolesi;
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
        int length_roles = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_roles |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_roles |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_roles |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_roles > 0) {
            this.roles = new java.lang.String[length_roles];
        }
        for (int i = 0; i < length_roles; i++){
        int length_rolesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rolesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rolesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rolesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rolesi = new byte[length_rolesi];
        for(int k= 0; k< length_rolesi; k++){
            bytes_rolesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.roles[i] = new java.lang.String(bytes_rolesi);
        offset += length_rolesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_roles = this.roles != null ? this.roles.length : 0;
        for (int i = 0; i < length_roles; i++) {
        int length_rolesi = this.roles[i].getBytes().length;
        length += 4;
        length += length_rolesi;
        }
        return length;
    }

    public java.lang.String getType() { return GETROLES; }
    public java.lang.String getMD5(){ return "cc3dfcf3789c775dea07f46d5718633d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
