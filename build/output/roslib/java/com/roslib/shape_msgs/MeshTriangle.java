package com.roslib.shape_msgs;

import java.lang.*;

public class MeshTriangle implements com.roslib.ros.Msg {
    public long[] vertex_indices;

    public MeshTriangle() {
        this.vertex_indices = new long[3];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        for (int i = 0; i < 3; i++){
        outbuffer[offset + 0] = (byte)((this.vertex_indices[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.vertex_indices[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.vertex_indices[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.vertex_indices[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        for(int i = 0; i < 3; i++){
        this.vertex_indices[i]   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.vertex_indices[i] |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.vertex_indices[i] |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.vertex_indices[i] |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        for (int i = 0; i < 3; i++){
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "shape_msgs/MeshTriangle"; }
    public java.lang.String getMD5(){ return "01020cfeb9ad7679dd18bbd7149962ba"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
