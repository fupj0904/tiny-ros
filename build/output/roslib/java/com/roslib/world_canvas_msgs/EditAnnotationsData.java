package com.roslib.world_canvas_msgs;

import java.lang.*;

public class EditAnnotationsData {

public static final java.lang.String EDITANNOTATIONSDATA = "world_canvas_msgs/EditAnnotationsData";

public class EditAnnotationsDataRequest implements com.roslib.ros.Msg {
    private long __id__;
    public int action;
    public com.roslib.world_canvas_msgs.Annotation annotation;
    public com.roslib.world_canvas_msgs.AnnotationData data;
    public static final int NEW = (int)(0);
    public static final int EDIT = (int)(1);

    public EditAnnotationsDataRequest() {
        this.action = 0;
        this.annotation = new com.roslib.world_canvas_msgs.Annotation();
        this.data = new com.roslib.world_canvas_msgs.AnnotationData();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.action >> (8 * 0)) & 0xFF);
        offset += 1;
        offset = this.annotation.serialize(outbuffer, offset);
        offset = this.data.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.action   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        offset = this.annotation.deserialize(inbuffer, offset);
        offset = this.data.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += this.annotation.serializedLength();
        length += this.data.serializedLength();
        return length;
    }

    public java.lang.String getType() { return EDITANNOTATIONSDATA; }
    public java.lang.String getMD5(){ return "091bed3f1fc4e5dd358a43d6787972f9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class EditAnnotationsDataResponse implements com.roslib.ros.Msg {
    private long __id__;
    public int action;
    public com.roslib.world_canvas_msgs.AnnotationData data;
    public static final int UPDATE = (int)(10);
    public static final int DELETE = (int)(12);
    public static final int CANCEL = (int)(13);

    public EditAnnotationsDataResponse() {
        this.action = 0;
        this.data = new com.roslib.world_canvas_msgs.AnnotationData();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.action >> (8 * 0)) & 0xFF);
        offset += 1;
        offset = this.data.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.action   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        offset = this.data.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += this.data.serializedLength();
        return length;
    }

    public java.lang.String getType() { return EDITANNOTATIONSDATA; }
    public java.lang.String getMD5(){ return "3d6853a8279ab3d705da4308efd52fef"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
