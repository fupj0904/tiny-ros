package com.roslib.world_canvas_msgs;

import java.lang.*;

public class YAMLImport {

public static final java.lang.String YAMLIMPORT = "world_canvas_msgs/YAMLImport";

public class YAMLImportRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String filename;

    public YAMLImportRequest() {
        this.filename = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_filename = this.filename.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_filename >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_filename >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_filename >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_filename >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_filename; k++) {
            outbuffer[offset + k] = (byte)((this.filename.getBytes())[k] & 0xFF);
        }
        offset += length_filename;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_filename = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_filename |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_filename |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_filename |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_filename = new byte[length_filename];
        for(int k= 0; k< length_filename; k++){
            bytes_filename[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.filename = new java.lang.String(bytes_filename);
        offset += length_filename;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_filename = this.filename.getBytes().length;
        length += 4;
        length += length_filename;
        return length;
    }

    public java.lang.String getType() { return YAMLIMPORT; }
    public java.lang.String getMD5(){ return "7fd2e0ae83518efd0df169e57cf7a442"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class YAMLImportResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public java.lang.String message;

    public YAMLImportResponse() {
        this.result = false;
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

    public java.lang.String getType() { return YAMLIMPORT; }
    public java.lang.String getMD5(){ return "5199a8cc0f406f51af953f40f449bfc2"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
