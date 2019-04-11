package com.roslib.world_canvas_msgs;

import java.lang.*;

public class WorldCanvas implements com.roslib.ros.Msg {
    public com.roslib.ros.Time timestamp;
    public java.lang.String name;
    public java.lang.String description;
    public java.lang.String geometry;

    public WorldCanvas() {
        this.timestamp = new com.roslib.ros.Time();
        this.name = "";
        this.description = "";
        this.geometry = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.timestamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timestamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        int length_description = this.description.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_description >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_description >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_description >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_description >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_description; k++) {
            outbuffer[offset + k] = (byte)((this.description.getBytes())[k] & 0xFF);
        }
        offset += length_description;
        int length_geometry = this.geometry.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_geometry >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_geometry >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_geometry >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_geometry >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_geometry; k++) {
            outbuffer[offset + k] = (byte)((this.geometry.getBytes())[k] & 0xFF);
        }
        offset += length_geometry;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.timestamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timestamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        int length_description = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_description |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_description |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_description |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_description = new byte[length_description];
        for(int k= 0; k< length_description; k++){
            bytes_description[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.description = new java.lang.String(bytes_description);
        offset += length_description;
        int length_geometry = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_geometry |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_geometry |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_geometry |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_geometry = new byte[length_geometry];
        for(int k= 0; k< length_geometry; k++){
            bytes_geometry[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.geometry = new java.lang.String(bytes_geometry);
        offset += length_geometry;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        int length_geometry = this.geometry.getBytes().length;
        length += 4;
        length += length_geometry;
        return length;
    }

    public java.lang.String getType(){ return "world_canvas_msgs/WorldCanvas"; }
    public java.lang.String getMD5(){ return "f548c0791bff4b65d78b3cd6dedac452"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
