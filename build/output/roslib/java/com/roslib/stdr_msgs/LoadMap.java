package com.roslib.stdr_msgs;

import java.lang.*;

public class LoadMap {

public static final java.lang.String LOADMAP = "stdr_msgs/LoadMap";

public class LoadMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String mapFile;

    public LoadMapRequest() {
        this.mapFile = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_mapFile = this.mapFile.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_mapFile >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_mapFile >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_mapFile >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_mapFile >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_mapFile; k++) {
            outbuffer[offset + k] = (byte)((this.mapFile.getBytes())[k] & 0xFF);
        }
        offset += length_mapFile;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_mapFile = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_mapFile |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_mapFile |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_mapFile |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_mapFile = new byte[length_mapFile];
        for(int k= 0; k< length_mapFile; k++){
            bytes_mapFile[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.mapFile = new java.lang.String(bytes_mapFile);
        offset += length_mapFile;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_mapFile = this.mapFile.getBytes().length;
        length += 4;
        length += length_mapFile;
        return length;
    }

    public java.lang.String getType() { return LOADMAP; }
    public java.lang.String getMD5(){ return "a5f9de3266e2c12f213ab607cd227bf4"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class LoadMapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public LoadMapResponse() {
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

    public java.lang.String getType() { return LOADMAP; }
    public java.lang.String getMD5(){ return "45c8e797fe50282d12c2547dbfab9af3"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
