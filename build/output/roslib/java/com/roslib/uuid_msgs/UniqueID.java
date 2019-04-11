package com.roslib.uuid_msgs;

import java.lang.*;

public class UniqueID implements com.roslib.ros.Msg {
    public int[] uuid;

    public UniqueID() {
        this.uuid = new int[16];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        for (int i = 0; i < 16; i++){
        outbuffer[offset + 0] = (byte)((this.uuid[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        for(int i = 0; i < 16; i++){
        this.uuid[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        for (int i = 0; i < 16; i++){
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "uuid_msgs/UniqueID"; }
    public java.lang.String getMD5(){ return "708a9da6688a5069b38eaede4d922ec4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
