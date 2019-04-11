package com.roslib.world_canvas_msgs;

import java.lang.*;

public class Annotations implements com.roslib.ros.Msg {
    public java.lang.String map_id;
    public com.roslib.world_canvas_msgs.Annotation[] annotations;

    public Annotations() {
        this.map_id = "";
        this.annotations = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_map_id = this.map_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_map_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_map_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_map_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_map_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_map_id; k++) {
            outbuffer[offset + k] = (byte)((this.map_id.getBytes())[k] & 0xFF);
        }
        offset += length_map_id;
        int length_annotations = this.annotations != null ? this.annotations.length : 0;
        outbuffer[offset + 0] = (byte)((length_annotations >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_annotations >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_annotations >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_annotations >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_annotations; i++){
        offset = this.annotations[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_map_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_map_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_map_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_map_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_map_id = new byte[length_map_id];
        for(int k= 0; k< length_map_id; k++){
            bytes_map_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.map_id = new java.lang.String(bytes_map_id);
        offset += length_map_id;
        int length_annotations = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_annotations |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_annotations |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_annotations |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_annotations > 0) {
            this.annotations = new com.roslib.world_canvas_msgs.Annotation[length_annotations];
        }
        for (int i = 0; i < length_annotations; i++){
        offset = this.annotations[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_map_id = this.map_id.getBytes().length;
        length += 4;
        length += length_map_id;
        length += 4;
        int length_annotations = this.annotations != null ? this.annotations.length : 0;
        for (int i = 0; i < length_annotations; i++) {
        length += this.annotations[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "world_canvas_msgs/Annotations"; }
    public java.lang.String getMD5(){ return "a3cb6fd1feadeb5f2d7fc1b484d32f80"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
