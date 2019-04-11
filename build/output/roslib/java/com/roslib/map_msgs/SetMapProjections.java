package com.roslib.map_msgs;

import java.lang.*;

public class SetMapProjections {

public static final java.lang.String SETMAPPROJECTIONS = "map_msgs/SetMapProjections";

public class SetMapProjectionsRequest implements com.roslib.ros.Msg {
    private long __id__;

    public SetMapProjectionsRequest() {
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

    public java.lang.String getType() { return SETMAPPROJECTIONS; }
    public java.lang.String getMD5(){ return "26dbba584adf9695d68b8667830be463"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetMapProjectionsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.map_msgs.ProjectedMapInfo[] projected_maps_info;

    public SetMapProjectionsResponse() {
        this.projected_maps_info = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_projected_maps_info = this.projected_maps_info != null ? this.projected_maps_info.length : 0;
        outbuffer[offset + 0] = (byte)((length_projected_maps_info >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_projected_maps_info >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_projected_maps_info >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_projected_maps_info >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_projected_maps_info; i++){
        offset = this.projected_maps_info[i].serialize(outbuffer, offset);
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
        int length_projected_maps_info = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_projected_maps_info |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_projected_maps_info |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_projected_maps_info |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_projected_maps_info > 0) {
            this.projected_maps_info = new com.roslib.map_msgs.ProjectedMapInfo[length_projected_maps_info];
        }
        for (int i = 0; i < length_projected_maps_info; i++){
        offset = this.projected_maps_info[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_projected_maps_info = this.projected_maps_info != null ? this.projected_maps_info.length : 0;
        for (int i = 0; i < length_projected_maps_info; i++) {
        length += this.projected_maps_info[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return SETMAPPROJECTIONS; }
    public java.lang.String getMD5(){ return "47b7931263dc316e5b0f0264428853e9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
