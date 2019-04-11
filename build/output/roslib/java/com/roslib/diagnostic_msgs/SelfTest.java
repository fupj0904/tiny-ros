package com.roslib.diagnostic_msgs;

import java.lang.*;

public class SelfTest {

public static final java.lang.String SELFTEST = "diagnostic_msgs/SelfTest";

public class SelfTestRequest implements com.roslib.ros.Msg {
    private long __id__;

    public SelfTestRequest() {
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

    public java.lang.String getType() { return SELFTEST; }
    public java.lang.String getMD5(){ return "049f87742408b36b8ef5f7dd71e3ef5a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SelfTestResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String id;
    public byte passed;
    public com.roslib.diagnostic_msgs.DiagnosticStatus[] status;

    public SelfTestResponse() {
        this.id = "";
        this.passed = 0;
        this.status = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_id = this.id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_id; k++) {
            outbuffer[offset + k] = (byte)((this.id.getBytes())[k] & 0xFF);
        }
        offset += length_id;
        outbuffer[offset + 0] = (byte)((this.passed >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_status = this.status != null ? this.status.length : 0;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_status; i++){
        offset = this.status[i].serialize(outbuffer, offset);
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
        int length_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_id = new byte[length_id];
        for(int k= 0; k< length_id; k++){
            bytes_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.id = new java.lang.String(bytes_id);
        offset += length_id;
        this.passed   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_status > 0) {
            this.status = new com.roslib.diagnostic_msgs.DiagnosticStatus[length_status];
        }
        for (int i = 0; i < length_status; i++){
        offset = this.status[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_id = this.id.getBytes().length;
        length += 4;
        length += length_id;
        length += 1;
        length += 4;
        int length_status = this.status != null ? this.status.length : 0;
        for (int i = 0; i < length_status; i++) {
        length += this.status[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return SELFTEST; }
    public java.lang.String getMD5(){ return "70aaf2a851ccb5e946b2d112ea26f7b9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
