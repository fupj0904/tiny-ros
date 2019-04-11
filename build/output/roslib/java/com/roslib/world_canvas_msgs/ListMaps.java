package com.roslib.world_canvas_msgs;

import java.lang.*;

public class ListMaps {

public static final java.lang.String LISTMAPS = "world_canvas_msgs/ListMaps";

public class ListMapsRequest implements com.roslib.ros.Msg {
    private long __id__;

    public ListMapsRequest() {
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

    public java.lang.String getType() { return LISTMAPS; }
    public java.lang.String getMD5(){ return "e76f19757b2ebbf84fa8318d251e0d74"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ListMapsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.world_canvas_msgs.MapListEntry[] map_list;

    public ListMapsResponse() {
        this.map_list = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_map_list = this.map_list != null ? this.map_list.length : 0;
        outbuffer[offset + 0] = (byte)((length_map_list >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_map_list >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_map_list >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_map_list >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_map_list; i++){
        offset = this.map_list[i].serialize(outbuffer, offset);
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
        int length_map_list = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_map_list |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_map_list |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_map_list |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_map_list > 0) {
            this.map_list = new com.roslib.world_canvas_msgs.MapListEntry[length_map_list];
        }
        for (int i = 0; i < length_map_list; i++){
        offset = this.map_list[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_map_list = this.map_list != null ? this.map_list.length : 0;
        for (int i = 0; i < length_map_list; i++) {
        length += this.map_list[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return LISTMAPS; }
    public java.lang.String getMD5(){ return "cce99290d11458f8f31f7951dd59bb36"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
