package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetModelProperties {

public static final java.lang.String GETMODELPROPERTIES = "gazebo_msgs/GetModelProperties";

public class GetModelPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String model_name;

    public GetModelPropertiesRequest() {
        this.model_name = "";
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_model_name = this.model_name.getBytes().length;
        length += 4;
        length += length_model_name;
        return length;
    }

    public java.lang.String getType() { return GETMODELPROPERTIES; }
    public java.lang.String getMD5(){ return "fe0194bf75c917c89b820b09c12fe6c1"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetModelPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String parent_model_name;
    public java.lang.String canonical_body_name;
    public java.lang.String[] body_names;
    public java.lang.String[] geom_names;
    public java.lang.String[] joint_names;
    public java.lang.String[] child_model_names;
    public boolean is_static;
    public boolean success;
    public java.lang.String status_message;

    public GetModelPropertiesResponse() {
        this.parent_model_name = "";
        this.canonical_body_name = "";
        this.body_names = null;
        this.geom_names = null;
        this.joint_names = null;
        this.child_model_names = null;
        this.is_static = false;
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
        int length_parent_model_name = this.parent_model_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_parent_model_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parent_model_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parent_model_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parent_model_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_parent_model_name; k++) {
            outbuffer[offset + k] = (byte)((this.parent_model_name.getBytes())[k] & 0xFF);
        }
        offset += length_parent_model_name;
        int length_canonical_body_name = this.canonical_body_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_canonical_body_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_canonical_body_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_canonical_body_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_canonical_body_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_canonical_body_name; k++) {
            outbuffer[offset + k] = (byte)((this.canonical_body_name.getBytes())[k] & 0xFF);
        }
        offset += length_canonical_body_name;
        int length_body_names = this.body_names != null ? this.body_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_body_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_body_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_body_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_body_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_body_names; i++){
        int length_body_namesi = this.body_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_body_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_body_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_body_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_body_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_body_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.body_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_body_namesi;
        }
        int length_geom_names = this.geom_names != null ? this.geom_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_geom_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_geom_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_geom_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_geom_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_geom_names; i++){
        int length_geom_namesi = this.geom_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_geom_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_geom_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_geom_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_geom_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_geom_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.geom_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_geom_namesi;
        }
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_joint_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.joint_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_joint_namesi;
        }
        int length_child_model_names = this.child_model_names != null ? this.child_model_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_child_model_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_child_model_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_child_model_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_child_model_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_child_model_names; i++){
        int length_child_model_namesi = this.child_model_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_child_model_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_child_model_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_child_model_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_child_model_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_child_model_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.child_model_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_child_model_namesi;
        }
        outbuffer[offset] = (byte)((is_static ? 0x01 : 0x00) & 0xFF);
        offset += 1;
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
        int length_parent_model_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_parent_model_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_parent_model_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_parent_model_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_parent_model_name = new byte[length_parent_model_name];
        for(int k= 0; k< length_parent_model_name; k++){
            bytes_parent_model_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.parent_model_name = new java.lang.String(bytes_parent_model_name);
        offset += length_parent_model_name;
        int length_canonical_body_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_canonical_body_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_canonical_body_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_canonical_body_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_canonical_body_name = new byte[length_canonical_body_name];
        for(int k= 0; k< length_canonical_body_name; k++){
            bytes_canonical_body_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.canonical_body_name = new java.lang.String(bytes_canonical_body_name);
        offset += length_canonical_body_name;
        int length_body_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_body_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_body_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_body_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_body_names > 0) {
            this.body_names = new java.lang.String[length_body_names];
        }
        for (int i = 0; i < length_body_names; i++){
        int length_body_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_body_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_body_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_body_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_body_namesi = new byte[length_body_namesi];
        for(int k= 0; k< length_body_namesi; k++){
            bytes_body_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.body_names[i] = new java.lang.String(bytes_body_namesi);
        offset += length_body_namesi;
        }
        int length_geom_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_geom_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_geom_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_geom_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_geom_names > 0) {
            this.geom_names = new java.lang.String[length_geom_names];
        }
        for (int i = 0; i < length_geom_names; i++){
        int length_geom_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_geom_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_geom_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_geom_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_geom_namesi = new byte[length_geom_namesi];
        for(int k= 0; k< length_geom_namesi; k++){
            bytes_geom_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.geom_names[i] = new java.lang.String(bytes_geom_namesi);
        offset += length_geom_namesi;
        }
        int length_joint_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_joint_names > 0) {
            this.joint_names = new java.lang.String[length_joint_names];
        }
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_namesi = new byte[length_joint_namesi];
        for(int k= 0; k< length_joint_namesi; k++){
            bytes_joint_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_names[i] = new java.lang.String(bytes_joint_namesi);
        offset += length_joint_namesi;
        }
        int length_child_model_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_child_model_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_child_model_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_child_model_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_child_model_names > 0) {
            this.child_model_names = new java.lang.String[length_child_model_names];
        }
        for (int i = 0; i < length_child_model_names; i++){
        int length_child_model_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_child_model_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_child_model_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_child_model_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_child_model_namesi = new byte[length_child_model_namesi];
        for(int k= 0; k< length_child_model_namesi; k++){
            bytes_child_model_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.child_model_names[i] = new java.lang.String(bytes_child_model_namesi);
        offset += length_child_model_namesi;
        }
        this.is_static = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
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
        int length_parent_model_name = this.parent_model_name.getBytes().length;
        length += 4;
        length += length_parent_model_name;
        int length_canonical_body_name = this.canonical_body_name.getBytes().length;
        length += 4;
        length += length_canonical_body_name;
        length += 4;
        int length_body_names = this.body_names != null ? this.body_names.length : 0;
        for (int i = 0; i < length_body_names; i++) {
        int length_body_namesi = this.body_names[i].getBytes().length;
        length += 4;
        length += length_body_namesi;
        }
        length += 4;
        int length_geom_names = this.geom_names != null ? this.geom_names.length : 0;
        for (int i = 0; i < length_geom_names; i++) {
        int length_geom_namesi = this.geom_names[i].getBytes().length;
        length += 4;
        length += length_geom_namesi;
        }
        length += 4;
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        for (int i = 0; i < length_joint_names; i++) {
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        length += 4;
        length += length_joint_namesi;
        }
        length += 4;
        int length_child_model_names = this.child_model_names != null ? this.child_model_names.length : 0;
        for (int i = 0; i < length_child_model_names; i++) {
        int length_child_model_namesi = this.child_model_names[i].getBytes().length;
        length += 4;
        length += length_child_model_namesi;
        }
        length += 1;
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETMODELPROPERTIES; }
    public java.lang.String getMD5(){ return "d8f16b08abaf0220a551cf9025748602"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
