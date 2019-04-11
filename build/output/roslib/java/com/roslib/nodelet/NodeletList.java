package com.roslib.nodelet;

import java.lang.*;

public class NodeletList {

public static final java.lang.String NODELETLIST = "nodelet/NodeletList";

public class NodeletListRequest implements com.roslib.ros.Msg {
    private long __id__;

    public NodeletListRequest() {
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

    public java.lang.String getType() { return NODELETLIST; }
    public java.lang.String getMD5(){ return "e2e4441474a4a4aba5e2d82caab2b84b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class NodeletListResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] nodelets;

    public NodeletListResponse() {
        this.nodelets = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_nodelets = this.nodelets != null ? this.nodelets.length : 0;
        outbuffer[offset + 0] = (byte)((length_nodelets >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_nodelets >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_nodelets >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_nodelets >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_nodelets; i++){
        int length_nodeletsi = this.nodelets[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_nodeletsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_nodeletsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_nodeletsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_nodeletsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_nodeletsi; k++) {
            outbuffer[offset + k] = (byte)((this.nodelets[i].getBytes())[k] & 0xFF);
        }
        offset += length_nodeletsi;
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
        int length_nodelets = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_nodelets |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_nodelets |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_nodelets |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_nodelets > 0) {
            this.nodelets = new java.lang.String[length_nodelets];
        }
        for (int i = 0; i < length_nodelets; i++){
        int length_nodeletsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_nodeletsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_nodeletsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_nodeletsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_nodeletsi = new byte[length_nodeletsi];
        for(int k= 0; k< length_nodeletsi; k++){
            bytes_nodeletsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.nodelets[i] = new java.lang.String(bytes_nodeletsi);
        offset += length_nodeletsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_nodelets = this.nodelets != null ? this.nodelets.length : 0;
        for (int i = 0; i < length_nodelets; i++) {
        int length_nodeletsi = this.nodelets[i].getBytes().length;
        length += 4;
        length += length_nodeletsi;
        }
        return length;
    }

    public java.lang.String getType() { return NODELETLIST; }
    public java.lang.String getMD5(){ return "e8cef489e3c5eba314d252a9b0f0d166"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
