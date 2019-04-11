package com.roslib.shape_msgs;

import java.lang.*;

public class Mesh implements com.roslib.ros.Msg {
    public com.roslib.shape_msgs.MeshTriangle[] triangles;
    public com.roslib.geometry_msgs.Point[] vertices;

    public Mesh() {
        this.triangles = null;
        this.vertices = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_triangles = this.triangles != null ? this.triangles.length : 0;
        outbuffer[offset + 0] = (byte)((length_triangles >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_triangles >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_triangles >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_triangles >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_triangles; i++){
        offset = this.triangles[i].serialize(outbuffer, offset);
        }
        int length_vertices = this.vertices != null ? this.vertices.length : 0;
        outbuffer[offset + 0] = (byte)((length_vertices >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_vertices >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_vertices >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_vertices >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_vertices; i++){
        offset = this.vertices[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_triangles = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_triangles |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_triangles |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_triangles |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_triangles > 0) {
            this.triangles = new com.roslib.shape_msgs.MeshTriangle[length_triangles];
        }
        for (int i = 0; i < length_triangles; i++){
        offset = this.triangles[i].deserialize(inbuffer, offset);
        }
        int length_vertices = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_vertices |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_vertices |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_vertices |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_vertices > 0) {
            this.vertices = new com.roslib.geometry_msgs.Point[length_vertices];
        }
        for (int i = 0; i < length_vertices; i++){
        offset = this.vertices[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_triangles = this.triangles != null ? this.triangles.length : 0;
        for (int i = 0; i < length_triangles; i++) {
        length += this.triangles[i].serializedLength();
        }
        length += 4;
        int length_vertices = this.vertices != null ? this.vertices.length : 0;
        for (int i = 0; i < length_vertices; i++) {
        length += this.vertices[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "shape_msgs/Mesh"; }
    public java.lang.String getMD5(){ return "1579670b316f622b47d6700cd4f7e18d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
