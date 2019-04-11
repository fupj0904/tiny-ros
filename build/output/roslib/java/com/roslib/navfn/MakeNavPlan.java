package com.roslib.navfn;

import java.lang.*;

public class MakeNavPlan {

public static final java.lang.String MAKENAVPLAN = "navfn/MakeNavPlan";

public class MakeNavPlanRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.geometry_msgs.PoseStamped start;
    public com.roslib.geometry_msgs.PoseStamped goal;

    public MakeNavPlanRequest() {
        this.start = new com.roslib.geometry_msgs.PoseStamped();
        this.goal = new com.roslib.geometry_msgs.PoseStamped();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.start.serialize(outbuffer, offset);
        offset = this.goal.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.start.deserialize(inbuffer, offset);
        offset = this.goal.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.start.serializedLength();
        length += this.goal.serializedLength();
        return length;
    }

    public java.lang.String getType() { return MAKENAVPLAN; }
    public java.lang.String getMD5(){ return "019fadf867addcf0070613002ff7e57b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class MakeNavPlanResponse implements com.roslib.ros.Msg {
    private long __id__;
    public int plan_found;
    public java.lang.String error_message;
    public com.roslib.geometry_msgs.PoseStamped[] path;

    public MakeNavPlanResponse() {
        this.plan_found = 0;
        this.error_message = "";
        this.path = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.plan_found >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_error_message = this.error_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_error_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_error_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_error_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_error_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_error_message; k++) {
            outbuffer[offset + k] = (byte)((this.error_message.getBytes())[k] & 0xFF);
        }
        offset += length_error_message;
        int length_path = this.path != null ? this.path.length : 0;
        outbuffer[offset + 0] = (byte)((length_path >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_path >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_path >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_path >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_path; i++){
        offset = this.path[i].serialize(outbuffer, offset);
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
        this.plan_found   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_error_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_error_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_error_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_error_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_error_message = new byte[length_error_message];
        for(int k= 0; k< length_error_message; k++){
            bytes_error_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.error_message = new java.lang.String(bytes_error_message);
        offset += length_error_message;
        int length_path = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_path |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_path |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_path |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_path > 0) {
            this.path = new com.roslib.geometry_msgs.PoseStamped[length_path];
        }
        for (int i = 0; i < length_path; i++){
        offset = this.path[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_error_message = this.error_message.getBytes().length;
        length += 4;
        length += length_error_message;
        length += 4;
        int length_path = this.path != null ? this.path.length : 0;
        for (int i = 0; i < length_path; i++) {
        length += this.path[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return MAKENAVPLAN; }
    public java.lang.String getMD5(){ return "7f3e5cc0b0c6935d999b2b29304b1da9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
