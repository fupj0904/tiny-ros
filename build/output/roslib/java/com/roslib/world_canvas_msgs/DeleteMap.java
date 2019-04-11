package com.roslib.world_canvas_msgs;

import java.lang.*;

public class DeleteMap {

public static final java.lang.String DELETEMAP = "world_canvas_msgs/DeleteMap";

public class DeleteMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String map_id;

    public DeleteMapRequest() {
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

    public java.lang.String getType() { return DELETEMAP; }
    public java.lang.String getMD5(){ return "857fdc7105ed1477be34384bb89a2e3a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class DeleteMapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public DeleteMapResponse() {
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

    public java.lang.String getType() { return DELETEMAP; }
    public java.lang.String getMD5(){ return "a444b990490e95ab21daa429fec4771a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
