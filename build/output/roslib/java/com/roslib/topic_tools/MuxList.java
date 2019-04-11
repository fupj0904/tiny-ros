package com.roslib.topic_tools;

import java.lang.*;

public class MuxList {

public static final java.lang.String MUXLIST = "topic_tools/MuxList";

public class MuxListRequest implements com.roslib.ros.Msg {
    private long __id__;

    public MuxListRequest() {
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

    public java.lang.String getType() { return MUXLIST; }
    public java.lang.String getMD5(){ return "1575639b05945a836e66e6905a76646c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class MuxListResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] topics;

    public MuxListResponse() {
        this.topics = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        outbuffer[offset + 0] = (byte)((length_topics >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topics >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topics >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topics >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_topics; i++){
        int length_topicsi = this.topics[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_topicsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topicsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topicsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topicsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_topicsi; k++) {
            outbuffer[offset + k] = (byte)((this.topics[i].getBytes())[k] & 0xFF);
        }
        offset += length_topicsi;
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
        int length_topics = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topics |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topics |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topics |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_topics > 0) {
            this.topics = new java.lang.String[length_topics];
        }
        for (int i = 0; i < length_topics; i++){
        int length_topicsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topicsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topicsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topicsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_topicsi = new byte[length_topicsi];
        for(int k= 0; k< length_topicsi; k++){
            bytes_topicsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.topics[i] = new java.lang.String(bytes_topicsi);
        offset += length_topicsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        for (int i = 0; i < length_topics; i++) {
        int length_topicsi = this.topics[i].getBytes().length;
        length += 4;
        length += length_topicsi;
        }
        return length;
    }

    public java.lang.String getType() { return MUXLIST; }
    public java.lang.String getMD5(){ return "eedbdbe6cdb29b20c2133e0b07c301fa"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
