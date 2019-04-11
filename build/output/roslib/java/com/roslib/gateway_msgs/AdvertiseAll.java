package com.roslib.gateway_msgs;

import java.lang.*;

public class AdvertiseAll {

public static final java.lang.String ADVERTISEALL = "gateway_msgs/AdvertiseAll";

public class AdvertiseAllRequest implements com.roslib.ros.Msg {
    private long __id__;
    public boolean cancel;
    public com.roslib.gateway_msgs.Rule[] blacklist;

    public AdvertiseAllRequest() {
        this.cancel = false;
        this.blacklist = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((cancel ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_blacklist = this.blacklist != null ? this.blacklist.length : 0;
        outbuffer[offset + 0] = (byte)((length_blacklist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_blacklist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_blacklist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_blacklist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_blacklist; i++){
        offset = this.blacklist[i].serialize(outbuffer, offset);
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
        this.cancel = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_blacklist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_blacklist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_blacklist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_blacklist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_blacklist > 0) {
            this.blacklist = new com.roslib.gateway_msgs.Rule[length_blacklist];
        }
        for (int i = 0; i < length_blacklist; i++){
        offset = this.blacklist[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        int length_blacklist = this.blacklist != null ? this.blacklist.length : 0;
        for (int i = 0; i < length_blacklist; i++) {
        length += this.blacklist[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return ADVERTISEALL; }
    public java.lang.String getMD5(){ return "a782c6eba716aa1e2b5d6d7fcb6b7918"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AdvertiseAllResponse implements com.roslib.ros.Msg {
    private long __id__;
    public byte result;
    public java.lang.String error_message;
    public com.roslib.gateway_msgs.Rule[] blacklist;

    public AdvertiseAllResponse() {
        this.result = 0;
        this.error_message = "";
        this.blacklist = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.result >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_error_message = this.error_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_error_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_error_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_error_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_error_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_error_message; k++) {
            outbuffer[offset + k] = (byte)((this.error_message.getBytes())[k] & 0xFF);
        }
        offset += length_error_message;
        int length_blacklist = this.blacklist != null ? this.blacklist.length : 0;
        outbuffer[offset + 0] = (byte)((length_blacklist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_blacklist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_blacklist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_blacklist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_blacklist; i++){
        offset = this.blacklist[i].serialize(outbuffer, offset);
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
        this.result   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_error_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_error_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_error_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_error_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_error_message = new byte[length_error_message];
        for(int k= 0; k< length_error_message; k++){
            bytes_error_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.error_message = new java.lang.String(bytes_error_message);
        offset += length_error_message;
        int length_blacklist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_blacklist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_blacklist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_blacklist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_blacklist > 0) {
            this.blacklist = new com.roslib.gateway_msgs.Rule[length_blacklist];
        }
        for (int i = 0; i < length_blacklist; i++){
        offset = this.blacklist[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_error_message = this.error_message.getBytes().length;
        length += 4;
        length += length_error_message;
        length += 4;
        int length_blacklist = this.blacklist != null ? this.blacklist.length : 0;
        for (int i = 0; i < length_blacklist; i++) {
        length += this.blacklist[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return ADVERTISEALL; }
    public java.lang.String getMD5(){ return "25f848d762a7c20636a68b55454834cb"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
