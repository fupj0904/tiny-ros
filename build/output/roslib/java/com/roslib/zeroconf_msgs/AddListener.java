package com.roslib.zeroconf_msgs;

import java.lang.*;

public class AddListener {

public static final java.lang.String ADDLISTENER = "zeroconf_msgs/AddListener";

public class AddListenerRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String service_type;

    public AddListenerRequest() {
        this.service_type = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_service_type = this.service_type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_service_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_service_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_service_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_service_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_service_type; k++) {
            outbuffer[offset + k] = (byte)((this.service_type.getBytes())[k] & 0xFF);
        }
        offset += length_service_type;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_service_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_service_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_service_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_service_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_service_type = new byte[length_service_type];
        for(int k= 0; k< length_service_type; k++){
            bytes_service_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.service_type = new java.lang.String(bytes_service_type);
        offset += length_service_type;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_service_type = this.service_type.getBytes().length;
        length += 4;
        length += length_service_type;
        return length;
    }

    public java.lang.String getType() { return ADDLISTENER; }
    public java.lang.String getMD5(){ return "05b1c4737f2b6a004ecd01e77f9f1a52"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AddListenerResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;

    public AddListenerResponse() {
        this.result = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((result ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.result = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return ADDLISTENER; }
    public java.lang.String getMD5(){ return "f67976a40c0a577b93edbeeb7db2550e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
