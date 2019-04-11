package com.roslib.tf;

import java.lang.*;

public class FrameGraph {

public static final java.lang.String FRAMEGRAPH = "tf/FrameGraph";

public class FrameGraphRequest implements com.roslib.ros.Msg {
    private long __id__;

    public FrameGraphRequest() {
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

    public java.lang.String getType() { return FRAMEGRAPH; }
    public java.lang.String getMD5(){ return "d66179e20d21cee31291f40363976e1d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class FrameGraphResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String dot_graph;

    public FrameGraphResponse() {
        this.dot_graph = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_dot_graph = this.dot_graph.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_dot_graph >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_dot_graph >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_dot_graph >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_dot_graph >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_dot_graph; k++) {
            outbuffer[offset + k] = (byte)((this.dot_graph.getBytes())[k] & 0xFF);
        }
        offset += length_dot_graph;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_dot_graph = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_dot_graph |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_dot_graph |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_dot_graph |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_dot_graph = new byte[length_dot_graph];
        for(int k= 0; k< length_dot_graph; k++){
            bytes_dot_graph[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.dot_graph = new java.lang.String(bytes_dot_graph);
        offset += length_dot_graph;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_dot_graph = this.dot_graph.getBytes().length;
        length += 4;
        length += length_dot_graph;
        return length;
    }

    public java.lang.String getType() { return FRAMEGRAPH; }
    public java.lang.String getMD5(){ return "8528671f80a5c0815f9700a446efbc36"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
