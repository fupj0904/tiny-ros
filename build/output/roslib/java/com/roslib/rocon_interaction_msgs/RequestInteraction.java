package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class RequestInteraction {

public static final java.lang.String REQUESTINTERACTION = "rocon_interaction_msgs/RequestInteraction";

public class RequestInteractionRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String remocon;
    public int hash;

    public RequestInteractionRequest() {
        this.remocon = "";
        this.hash = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_remocon = this.remocon.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remocon >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remocon >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remocon >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remocon >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remocon; k++) {
            outbuffer[offset + k] = (byte)((this.remocon.getBytes())[k] & 0xFF);
        }
        offset += length_remocon;
        outbuffer[offset + 0] = (byte)((this.hash >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.hash >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.hash >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.hash >> (8 * 3)) & 0xFF);
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
        int length_remocon = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remocon |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remocon |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remocon |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remocon = new byte[length_remocon];
        for(int k= 0; k< length_remocon; k++){
            bytes_remocon[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remocon = new java.lang.String(bytes_remocon);
        offset += length_remocon;
        this.hash   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.hash |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.hash |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.hash |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_remocon = this.remocon.getBytes().length;
        length += 4;
        length += length_remocon;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return REQUESTINTERACTION; }
    public java.lang.String getMD5(){ return "b16075d0d50996639360984031d48c72"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class RequestInteractionResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public byte error_code;
    public java.lang.String message;

    public RequestInteractionResponse() {
        this.result = false;
        this.error_code = 0;
        this.message = "";
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
        outbuffer[offset + 0] = (byte)((this.error_code >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
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
        this.error_code   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return REQUESTINTERACTION; }
    public java.lang.String getMD5(){ return "8d381b1b1e19163c502f0ff76485aa83"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
