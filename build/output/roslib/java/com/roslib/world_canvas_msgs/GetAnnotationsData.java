package com.roslib.world_canvas_msgs;

import java.lang.*;

public class GetAnnotationsData {

public static final java.lang.String GETANNOTATIONSDATA = "world_canvas_msgs/GetAnnotationsData";

public class GetAnnotationsDataRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.uuid_msgs.UniqueID[] annotation_ids;

    public GetAnnotationsDataRequest() {
        this.annotation_ids = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_annotation_ids = this.annotation_ids != null ? this.annotation_ids.length : 0;
        outbuffer[offset + 0] = (byte)((length_annotation_ids >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_annotation_ids >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_annotation_ids >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_annotation_ids >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_annotation_ids; i++){
        offset = this.annotation_ids[i].serialize(outbuffer, offset);
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
        int length_annotation_ids = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_annotation_ids |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_annotation_ids |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_annotation_ids |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_annotation_ids > 0) {
            this.annotation_ids = new com.roslib.uuid_msgs.UniqueID[length_annotation_ids];
        }
        for (int i = 0; i < length_annotation_ids; i++){
        offset = this.annotation_ids[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_annotation_ids = this.annotation_ids != null ? this.annotation_ids.length : 0;
        for (int i = 0; i < length_annotation_ids; i++) {
        length += this.annotation_ids[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETANNOTATIONSDATA; }
    public java.lang.String getMD5(){ return "7494d014bf37c8e6034d89a189b1aba4"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetAnnotationsDataResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public java.lang.String message;
    public com.roslib.world_canvas_msgs.AnnotationData[] data;

    public GetAnnotationsDataResponse() {
        this.result = false;
        this.message = "";
        this.data = null;
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
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        offset = this.data[i].serialize(outbuffer, offset);
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
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new com.roslib.world_canvas_msgs.AnnotationData[length_data];
        }
        for (int i = 0; i < length_data; i++){
        offset = this.data[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += this.data[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETANNOTATIONSDATA; }
    public java.lang.String getMD5(){ return "abe8ef65ae56a2d557e12d6c41190606"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
