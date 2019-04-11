package com.roslib.world_canvas_msgs;

import java.lang.*;

public class SaveMap {

public static final java.lang.String SAVEMAP = "world_canvas_msgs/SaveMap";

public class SaveMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String map_name;

    public SaveMapRequest() {
        this.map_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_map_name = this.map_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_map_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_map_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_map_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_map_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_map_name; k++) {
            outbuffer[offset + k] = (byte)((this.map_name.getBytes())[k] & 0xFF);
        }
        offset += length_map_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_map_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_map_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_map_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_map_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_map_name = new byte[length_map_name];
        for(int k= 0; k< length_map_name; k++){
            bytes_map_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.map_name = new java.lang.String(bytes_map_name);
        offset += length_map_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_map_name = this.map_name.getBytes().length;
        length += 4;
        length += length_map_name;
        return length;
    }

    public java.lang.String getType() { return SAVEMAP; }
    public java.lang.String getMD5(){ return "18216ca9feea66a0aec04f35153e0924"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SaveMapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public SaveMapResponse() {
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

    public java.lang.String getType() { return SAVEMAP; }
    public java.lang.String getMD5(){ return "1ad5b63f11c7f9feece64895653fe1df"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
