package com.roslib.gateway_msgs;

import java.lang.*;

public class ConnectHub {

public static final java.lang.String CONNECTHUB = "gateway_msgs/ConnectHub";

public class ConnectHubRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String uri;

    public ConnectHubRequest() {
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

    public java.lang.String getType() { return CONNECTHUB; }
    public java.lang.String getMD5(){ return "a17948c1c8a3a8c9c5c225d6847d6f7d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ConnectHubResponse implements com.roslib.ros.Msg {
    private long __id__;
    public byte result;
    public java.lang.String error_message;

    public ConnectHubResponse() {
        this.result = 0;
        this.error_message = "";
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_error_message = this.error_message.getBytes().length;
        length += 4;
        length += length_error_message;
        return length;
    }

    public java.lang.String getType() { return CONNECTHUB; }
    public java.lang.String getMD5(){ return "d7c894c278a079ad6d4d8b1781b43dd5"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
