package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class StopRapp {

public static final java.lang.String STOPRAPP = "rocon_app_manager_msgs/StopRapp";

public class StopRappRequest implements com.roslib.ros.Msg {
    private long __id__;

    public StopRappRequest() {
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

    public java.lang.String getType() { return STOPRAPP; }
    public java.lang.String getMD5(){ return "5cf1ac0de7fbd43c2fc7bbe5ce5a9620"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class StopRappResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean stopped;
    public int error_code;
    public java.lang.String message;

    public StopRappResponse() {
        this.stopped = false;
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
        outbuffer[offset] = (byte)((stopped ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.error_code >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.error_code >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.error_code >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.error_code >> (8 * 3)) & 0xFF);
        offset += 4;
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
        this.stopped = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.error_code   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.error_code |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.error_code |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.error_code |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        length += 4;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return STOPRAPP; }
    public java.lang.String getMD5(){ return "149836aa8f280d5d504067c17f7bdec5"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
