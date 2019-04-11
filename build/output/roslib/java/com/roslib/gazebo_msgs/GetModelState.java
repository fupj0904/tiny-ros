package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetModelState {

public static final java.lang.String GETMODELSTATE = "gazebo_msgs/GetModelState";

public class GetModelStateRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String model_name;
    public java.lang.String relative_entity_name;

    public GetModelStateRequest() {
        this.model_name = "";
        this.relative_entity_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_model_name = this.model_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_model_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_model_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_model_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_model_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_model_name; k++) {
            outbuffer[offset + k] = (byte)((this.model_name.getBytes())[k] & 0xFF);
        }
        offset += length_model_name;
        int length_relative_entity_name = this.relative_entity_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_relative_entity_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_relative_entity_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_relative_entity_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_relative_entity_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_relative_entity_name; k++) {
            outbuffer[offset + k] = (byte)((this.relative_entity_name.getBytes())[k] & 0xFF);
        }
        offset += length_relative_entity_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_model_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_model_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_model_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_model_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_model_name = new byte[length_model_name];
        for(int k= 0; k< length_model_name; k++){
            bytes_model_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.model_name = new java.lang.String(bytes_model_name);
        offset += length_model_name;
        int length_relative_entity_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_relative_entity_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_relative_entity_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_relative_entity_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_relative_entity_name = new byte[length_relative_entity_name];
        for(int k= 0; k< length_relative_entity_name; k++){
            bytes_relative_entity_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.relative_entity_name = new java.lang.String(bytes_relative_entity_name);
        offset += length_relative_entity_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_model_name = this.model_name.getBytes().length;
        length += 4;
        length += length_model_name;
        int length_relative_entity_name = this.relative_entity_name.getBytes().length;
        length += 4;
        length += length_relative_entity_name;
        return length;
    }

    public java.lang.String getType() { return GETMODELSTATE; }
    public java.lang.String getMD5(){ return "92a8c6443abf59a40e396c81c0e29d40"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetModelStateResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.geometry_msgs.Pose pose;
    public com.roslib.geometry_msgs.Twist twist;
    public boolean success;
    public java.lang.String status_message;

    public GetModelStateResponse() {
        this.pose = new com.roslib.geometry_msgs.Pose();
        this.twist = new com.roslib.geometry_msgs.Twist();
        this.success = false;
        this.status_message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pose.serialize(outbuffer, offset);
        offset = this.twist.serialize(outbuffer, offset);
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status_message = this.status_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_message; k++) {
            outbuffer[offset + k] = (byte)((this.status_message.getBytes())[k] & 0xFF);
        }
        offset += length_status_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.pose.deserialize(inbuffer, offset);
        offset = this.twist.deserialize(inbuffer, offset);
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_message = new byte[length_status_message];
        for(int k= 0; k< length_status_message; k++){
            bytes_status_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_message = new java.lang.String(bytes_status_message);
        offset += length_status_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.pose.serializedLength();
        length += this.twist.serializedLength();
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETMODELSTATE; }
    public java.lang.String getMD5(){ return "3fd873975bc823929b01f7473704b974"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
