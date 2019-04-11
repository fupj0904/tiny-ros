package com.roslib.geographic_msgs;

import java.lang.*;

public class GetGeographicMap {

public static final java.lang.String GETGEOGRAPHICMAP = "geographic_msgs/GetGeographicMap";

public class GetGeographicMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String url;
    public com.roslib.geographic_msgs.BoundingBox bounds;

    public GetGeographicMapRequest() {
        this.url = "";
        this.bounds = new com.roslib.geographic_msgs.BoundingBox();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_url = this.url.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_url >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_url >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_url >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_url >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_url; k++) {
            outbuffer[offset + k] = (byte)((this.url.getBytes())[k] & 0xFF);
        }
        offset += length_url;
        offset = this.bounds.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_url = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_url |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_url |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_url |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_url = new byte[length_url];
        for(int k= 0; k< length_url; k++){
            bytes_url[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.url = new java.lang.String(bytes_url);
        offset += length_url;
        offset = this.bounds.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_url = this.url.getBytes().length;
        length += 4;
        length += length_url;
        length += this.bounds.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETGEOGRAPHICMAP; }
    public java.lang.String getMD5(){ return "d56b83e41c9f0f0a10bde67b534b01e1"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetGeographicMapResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status;
    public com.roslib.geographic_msgs.GeographicMap map;

    public GetGeographicMapResponse() {
        this.success = false;
        this.status = "";
        this.map = new com.roslib.geographic_msgs.GeographicMap();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status = this.status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status; k++) {
            outbuffer[offset + k] = (byte)((this.status.getBytes())[k] & 0xFF);
        }
        offset += length_status;
        offset = this.map.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status = new byte[length_status];
        for(int k= 0; k< length_status; k++){
            bytes_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status = new java.lang.String(bytes_status);
        offset += length_status;
        offset = this.map.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status = this.status.getBytes().length;
        length += 4;
        length += length_status;
        length += this.map.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETGEOGRAPHICMAP; }
    public java.lang.String getMD5(){ return "0bd518b5d84a5f570d982556972ec802"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
