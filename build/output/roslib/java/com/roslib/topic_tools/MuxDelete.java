package com.roslib.topic_tools;

import java.lang.*;

public class MuxDelete {

public static final java.lang.String MUXDELETE = "topic_tools/MuxDelete";

public class MuxDeleteRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String topic;

    public MuxDeleteRequest() {
        this.topic = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_topic = this.topic.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_topic >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topic >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topic >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topic >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_topic; k++) {
            outbuffer[offset + k] = (byte)((this.topic.getBytes())[k] & 0xFF);
        }
        offset += length_topic;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_topic = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topic |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topic |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topic |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_topic = new byte[length_topic];
        for(int k= 0; k< length_topic; k++){
            bytes_topic[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.topic = new java.lang.String(bytes_topic);
        offset += length_topic;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_topic = this.topic.getBytes().length;
        length += 4;
        length += length_topic;
        return length;
    }

    public java.lang.String getType() { return MUXDELETE; }
    public java.lang.String getMD5(){ return "d869c7cad98c0966bbdecf2e3419f942"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class MuxDeleteResponse implements com.roslib.ros.Msg {
    private long __id__;

    public MuxDeleteResponse() {
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

    public java.lang.String getType() { return MUXDELETE; }
    public java.lang.String getMD5(){ return "8afc94a02fc9a0fc6180c6393c360dc0"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
