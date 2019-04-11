package com.roslib.pcl_msgs;

import java.lang.*;

public class Vertices implements com.roslib.ros.Msg {
    public long[] vertices;

    public Vertices() {
        this.vertices = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_vertices = this.vertices != null ? this.vertices.length : 0;
        outbuffer[offset + 0] = (byte)((length_vertices >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_vertices >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_vertices >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_vertices >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_vertices; i++){
        outbuffer[offset + 0] = (byte)((this.vertices[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.vertices[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.vertices[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.vertices[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_vertices = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_vertices |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_vertices |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_vertices |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_vertices > 0) {
            this.vertices = new long[length_vertices];
        }
        for (int i = 0; i < length_vertices; i++){
        this.vertices[i]   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.vertices[i] |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.vertices[i] |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.vertices[i] |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_vertices = this.vertices != null ? this.vertices.length : 0;
        for (int i = 0; i < length_vertices; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "pcl_msgs/Vertices"; }
    public java.lang.String getMD5(){ return "4e2a3dd4ebe1d7ed3755b6e3aea94cd6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
