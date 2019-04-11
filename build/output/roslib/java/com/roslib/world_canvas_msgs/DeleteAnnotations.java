package com.roslib.world_canvas_msgs;

import java.lang.*;

public class DeleteAnnotations {

public static final java.lang.String DELETEANNOTATIONS = "world_canvas_msgs/DeleteAnnotations";

public class DeleteAnnotationsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.world_canvas_msgs.Annotation[] annotations;

    public DeleteAnnotationsRequest() {
        this.annotations = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        length += 4;
        int length_annotations = this.annotations != null ? this.annotations.length : 0;
        for (int i = 0; i < length_annotations; i++) {
        length += this.annotations[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return DELETEANNOTATIONS; }
    public java.lang.String getMD5(){ return "2c7830b947ab4c4ea8cf745d07862ba1"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class DeleteAnnotationsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public java.lang.String message;

    public DeleteAnnotationsResponse() {
        this.result = false;
        this.message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((result ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.result = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return DELETEANNOTATIONS; }
    public java.lang.String getMD5(){ return "62a31775c174fef631c9af273446d37f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
