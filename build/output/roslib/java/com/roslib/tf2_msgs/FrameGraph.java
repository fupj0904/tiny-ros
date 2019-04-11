package com.roslib.tf2_msgs;

import java.lang.*;

public class FrameGraph {

public static final java.lang.String FRAMEGRAPH = "tf2_msgs/FrameGraph";

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
    public java.lang.String getMD5(){ return "aa023d3c31410363e0583979223258c8"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class FrameGraphResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String frame_yaml;

    public FrameGraphResponse() {
        this.frame_yaml = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_frame_yaml = this.frame_yaml.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_frame_yaml >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_frame_yaml >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_frame_yaml >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_frame_yaml >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_frame_yaml; k++) {
            outbuffer[offset + k] = (byte)((this.frame_yaml.getBytes())[k] & 0xFF);
        }
        offset += length_frame_yaml;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_frame_yaml = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_frame_yaml |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_frame_yaml |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_frame_yaml |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_frame_yaml = new byte[length_frame_yaml];
        for(int k= 0; k< length_frame_yaml; k++){
            bytes_frame_yaml[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.frame_yaml = new java.lang.String(bytes_frame_yaml);
        offset += length_frame_yaml;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_frame_yaml = this.frame_yaml.getBytes().length;
        length += 4;
        length += length_frame_yaml;
        return length;
    }

    public java.lang.String getType() { return FRAMEGRAPH; }
    public java.lang.String getMD5(){ return "97e361486f8cc8fb1a460cf17555126b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
