package com.roslib.world_canvas_msgs;

import java.lang.*;

public class RenameMap {

public static final java.lang.String RENAMEMAP = "world_canvas_msgs/RenameMap";

public class RenameMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String map_id;
    public java.lang.String new_name;

    public RenameMapRequest() {
        this.map_id = "";
        this.new_name = "";
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
        int length_new_name = this.new_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_new_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_new_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_new_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_new_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_new_name; k++) {
            outbuffer[offset + k] = (byte)((this.new_name.getBytes())[k] & 0xFF);
        }
        offset += length_new_name;
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
        int length_new_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_new_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_new_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_new_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_new_name = new byte[length_new_name];
        for(int k= 0; k< length_new_name; k++){
            bytes_new_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.new_name = new java.lang.String(bytes_new_name);
        offset += length_new_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_map_id = this.map_id.getBytes().length;
        length += 4;
        length += length_map_id;
        int length_new_name = this.new_name.getBytes().length;
        length += 4;
        length += length_new_name;
        return length;
    }

    public java.lang.String getType() { return RENAMEMAP; }
    public java.lang.String getMD5(){ return "3993f22b2aa7f9fc0a9495f2a4c474f7"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class RenameMapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public RenameMapResponse() {
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

    public java.lang.String getType() { return RENAMEMAP; }
    public java.lang.String getMD5(){ return "ad201943168c33455525e32bbd193308"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
