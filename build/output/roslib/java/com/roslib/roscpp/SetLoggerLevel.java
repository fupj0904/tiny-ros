package com.roslib.roscpp;

import java.lang.*;

public class SetLoggerLevel {

public static final java.lang.String SETLOGGERLEVEL = "roscpp/SetLoggerLevel";

public class SetLoggerLevelRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String logger;
    public java.lang.String level;

    public SetLoggerLevelRequest() {
        this.logger = "";
        this.level = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_logger = this.logger.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_logger >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_logger >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_logger >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_logger >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_logger; k++) {
            outbuffer[offset + k] = (byte)((this.logger.getBytes())[k] & 0xFF);
        }
        offset += length_logger;
        int length_level = this.level.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_level >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_level >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_level >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_level >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_level; k++) {
            outbuffer[offset + k] = (byte)((this.level.getBytes())[k] & 0xFF);
        }
        offset += length_level;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_logger = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_logger |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_logger |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_logger |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_logger = new byte[length_logger];
        for(int k= 0; k< length_logger; k++){
            bytes_logger[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.logger = new java.lang.String(bytes_logger);
        offset += length_logger;
        int length_level = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_level |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_level |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_level |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_level = new byte[length_level];
        for(int k= 0; k< length_level; k++){
            bytes_level[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.level = new java.lang.String(bytes_level);
        offset += length_level;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_logger = this.logger.getBytes().length;
        length += 4;
        length += length_logger;
        int length_level = this.level.getBytes().length;
        length += 4;
        length += length_level;
        return length;
    }

    public java.lang.String getType() { return SETLOGGERLEVEL; }
    public java.lang.String getMD5(){ return "d687ff000e337df81c130bb1ca18bf8d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetLoggerLevelResponse implements com.roslib.ros.Msg {
    private long __id__;

    public SetLoggerLevelResponse() {
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

    public java.lang.String getType() { return SETLOGGERLEVEL; }
    public java.lang.String getMD5(){ return "b8e2771e8a5dc070a7dbfc0839411f8a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
