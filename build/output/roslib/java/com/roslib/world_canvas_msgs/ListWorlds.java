package com.roslib.world_canvas_msgs;

import java.lang.*;

public class ListWorlds {

public static final java.lang.String LISTWORLDS = "world_canvas_msgs/ListWorlds";

public class ListWorldsRequest implements com.roslib.ros.Msg {
    private long __id__;

    public ListWorldsRequest() {
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

    public java.lang.String getType() { return LISTWORLDS; }
    public java.lang.String getMD5(){ return "26950c7a28fc4b6b8c80ab2412072bb3"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ListWorldsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] names;

    public ListWorldsResponse() {
        this.names = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_names = this.names != null ? this.names.length : 0;
        outbuffer[offset + 0] = (byte)((length_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_names; i++){
        int length_namesi = this.names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.names[i].getBytes())[k] & 0xFF);
        }
        offset += length_namesi;
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
        int length_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_names > 0) {
            this.names = new java.lang.String[length_names];
        }
        for (int i = 0; i < length_names; i++){
        int length_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_namesi = new byte[length_namesi];
        for(int k= 0; k< length_namesi; k++){
            bytes_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.names[i] = new java.lang.String(bytes_namesi);
        offset += length_namesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_names = this.names != null ? this.names.length : 0;
        for (int i = 0; i < length_names; i++) {
        int length_namesi = this.names[i].getBytes().length;
        length += 4;
        length += length_namesi;
        }
        return length;
    }

    public java.lang.String getType() { return LISTWORLDS; }
    public java.lang.String getMD5(){ return "5997209227ac70ca1846abe2be60e594"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
