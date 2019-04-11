package com.roslib.astra_camera;

import java.lang.*;

public class GetSerial {

public static final java.lang.String GETSERIAL = "astra_camera/GetSerial";

public class GetSerialRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetSerialRequest() {
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

    public java.lang.String getType() { return GETSERIAL; }
    public java.lang.String getMD5(){ return "9dcef67c2d5638793a94d61a77b1cd62"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetSerialResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String serial;

    public GetSerialResponse() {
        this.serial = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_serial = this.serial.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_serial >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_serial >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_serial >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_serial >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_serial; k++) {
            outbuffer[offset + k] = (byte)((this.serial.getBytes())[k] & 0xFF);
        }
        offset += length_serial;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_serial = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_serial |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_serial |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_serial |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_serial = new byte[length_serial];
        for(int k= 0; k< length_serial; k++){
            bytes_serial[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.serial = new java.lang.String(bytes_serial);
        offset += length_serial;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_serial = this.serial.getBytes().length;
        length += 4;
        length += length_serial;
        return length;
    }

    public java.lang.String getType() { return GETSERIAL; }
    public java.lang.String getMD5(){ return "3291b4ab262098d79e5e163269dacc0e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
