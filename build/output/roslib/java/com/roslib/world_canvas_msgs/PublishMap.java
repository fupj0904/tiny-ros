package com.roslib.world_canvas_msgs;

import java.lang.*;

public class PublishMap {

public static final java.lang.String PUBLISHMAP = "world_canvas_msgs/PublishMap";

public class PublishMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String map_id;

    public PublishMapRequest() {
        this.map_id = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_map_id = this.map_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_map_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_map_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_map_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_map_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_map_id; k++) {
            outbuffer[offset + k] = (byte)((this.map_id.getBytes())[k] & 0xFF);
        }
        offset += length_map_id;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_map_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_map_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_map_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_map_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_map_id = new byte[length_map_id];
        for(int k= 0; k< length_map_id; k++){
            bytes_map_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.map_id = new java.lang.String(bytes_map_id);
        offset += length_map_id;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_map_id = this.map_id.getBytes().length;
        length += 4;
        length += length_map_id;
        return length;
    }

    public java.lang.String getType() { return PUBLISHMAP; }
    public java.lang.String getMD5(){ return "2d2a24d2e4cb903547c919bb44ec9ad9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class PublishMapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public PublishMapResponse() {
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

    public java.lang.String getType() { return PUBLISHMAP; }
    public java.lang.String getMD5(){ return "ff47e2a63afa5fad46fea0e718a94cfa"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
