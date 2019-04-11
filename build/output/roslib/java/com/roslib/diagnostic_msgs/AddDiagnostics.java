package com.roslib.diagnostic_msgs;

import java.lang.*;

public class AddDiagnostics {

public static final java.lang.String ADDDIAGNOSTICS = "diagnostic_msgs/AddDiagnostics";

public class AddDiagnosticsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String load_namespace;

    public AddDiagnosticsRequest() {
        this.load_namespace = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_load_namespace = this.load_namespace.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_load_namespace >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_load_namespace >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_load_namespace >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_load_namespace >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_load_namespace; k++) {
            outbuffer[offset + k] = (byte)((this.load_namespace.getBytes())[k] & 0xFF);
        }
        offset += length_load_namespace;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_load_namespace = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_load_namespace |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_load_namespace |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_load_namespace |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_load_namespace = new byte[length_load_namespace];
        for(int k= 0; k< length_load_namespace; k++){
            bytes_load_namespace[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.load_namespace = new java.lang.String(bytes_load_namespace);
        offset += length_load_namespace;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_load_namespace = this.load_namespace.getBytes().length;
        length += 4;
        length += length_load_namespace;
        return length;
    }

    public java.lang.String getType() { return ADDDIAGNOSTICS; }
    public java.lang.String getMD5(){ return "005ba76b3cd04edebfe46acad928fbeb"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AddDiagnosticsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String message;

    public AddDiagnosticsResponse() {
        this.success = false;
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
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
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
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
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
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return ADDDIAGNOSTICS; }
    public java.lang.String getMD5(){ return "9bd37b30a2340a31743d1e80a2c52ed0"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
