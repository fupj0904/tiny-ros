package com.roslib.roscpp;

import java.lang.*;

public class GetLoggers {

public static final java.lang.String GETLOGGERS = "roscpp/GetLoggers";

public class GetLoggersRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetLoggersRequest() {
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

    public java.lang.String getType() { return GETLOGGERS; }
    public java.lang.String getMD5(){ return "cc3909277965dc7cfae3caa388ee57e5"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetLoggersResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.roscpp.Logger[] loggers;

    public GetLoggersResponse() {
        this.loggers = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_loggers = this.loggers != null ? this.loggers.length : 0;
        outbuffer[offset + 0] = (byte)((length_loggers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_loggers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_loggers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_loggers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_loggers; i++){
        offset = this.loggers[i].serialize(outbuffer, offset);
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
        int length_loggers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_loggers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_loggers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_loggers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_loggers > 0) {
            this.loggers = new com.roslib.roscpp.Logger[length_loggers];
        }
        for (int i = 0; i < length_loggers; i++){
        offset = this.loggers[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_loggers = this.loggers != null ? this.loggers.length : 0;
        for (int i = 0; i < length_loggers; i++) {
        length += this.loggers[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETLOGGERS; }
    public java.lang.String getMD5(){ return "a56828a6a3aaa9dc84dd6e50a3dc55a4"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
