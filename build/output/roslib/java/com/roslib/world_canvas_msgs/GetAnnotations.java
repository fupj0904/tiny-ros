package com.roslib.world_canvas_msgs;

import java.lang.*;

public class GetAnnotations {

public static final java.lang.String GETANNOTATIONS = "world_canvas_msgs/GetAnnotations";

public class GetAnnotationsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String world;
    public com.roslib.uuid_msgs.UniqueID[] ids;
    public java.lang.String[] names;
    public java.lang.String[] types;
    public java.lang.String[] keywords;
    public com.roslib.uuid_msgs.UniqueID[] relationships;

    public GetAnnotationsRequest() {
        this.world = "";
        this.ids = null;
        this.names = null;
        this.types = null;
        this.keywords = null;
        this.relationships = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_world = this.world.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_world >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_world >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_world >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_world >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_world; k++) {
            outbuffer[offset + k] = (byte)((this.world.getBytes())[k] & 0xFF);
        }
        offset += length_world;
        int length_ids = this.ids != null ? this.ids.length : 0;
        outbuffer[offset + 0] = (byte)((length_ids >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ids >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ids >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ids >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_ids; i++){
        offset = this.ids[i].serialize(outbuffer, offset);
        }
        int length_names = this.names != null ? this.names.length : 0;
        outbuffer[offset + 0] = (byte)((length_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_names; i++){
        int length_namesi = this.names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.names[i].getBytes())[k] & 0xFF);
        }
        offset += length_namesi;
        }
        int length_types = this.types != null ? this.types.length : 0;
        outbuffer[offset + 0] = (byte)((length_types >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_types >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_types >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_types >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_types; i++){
        int length_typesi = this.types[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_typesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_typesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_typesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_typesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_typesi; k++) {
            outbuffer[offset + k] = (byte)((this.types[i].getBytes())[k] & 0xFF);
        }
        offset += length_typesi;
        }
        int length_keywords = this.keywords != null ? this.keywords.length : 0;
        outbuffer[offset + 0] = (byte)((length_keywords >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_keywords >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_keywords >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_keywords >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_keywords; i++){
        int length_keywordsi = this.keywords[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_keywordsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_keywordsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_keywordsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_keywordsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_keywordsi; k++) {
            outbuffer[offset + k] = (byte)((this.keywords[i].getBytes())[k] & 0xFF);
        }
        offset += length_keywordsi;
        }
        int length_relationships = this.relationships != null ? this.relationships.length : 0;
        outbuffer[offset + 0] = (byte)((length_relationships >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_relationships >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_relationships >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_relationships >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_relationships; i++){
        offset = this.relationships[i].serialize(outbuffer, offset);
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
        int length_world = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_world |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_world |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_world |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_world = new byte[length_world];
        for(int k= 0; k< length_world; k++){
            bytes_world[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.world = new java.lang.String(bytes_world);
        offset += length_world;
        int length_ids = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ids |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ids |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ids |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_ids > 0) {
            this.ids = new com.roslib.uuid_msgs.UniqueID[length_ids];
        }
        for (int i = 0; i < length_ids; i++){
        offset = this.ids[i].deserialize(inbuffer, offset);
        }
        int length_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_names > 0) {
            this.names = new java.lang.String[length_names];
        }
        for (int i = 0; i < length_names; i++){
        int length_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_namesi = new byte[length_namesi];
        for(int k= 0; k< length_namesi; k++){
            bytes_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.names[i] = new java.lang.String(bytes_namesi);
        offset += length_namesi;
        }
        int length_types = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_types |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_types |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_types |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_types > 0) {
            this.types = new java.lang.String[length_types];
        }
        for (int i = 0; i < length_types; i++){
        int length_typesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_typesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_typesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_typesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_typesi = new byte[length_typesi];
        for(int k= 0; k< length_typesi; k++){
            bytes_typesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.types[i] = new java.lang.String(bytes_typesi);
        offset += length_typesi;
        }
        int length_keywords = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_keywords |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_keywords |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_keywords |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_keywords > 0) {
            this.keywords = new java.lang.String[length_keywords];
        }
        for (int i = 0; i < length_keywords; i++){
        int length_keywordsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_keywordsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_keywordsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_keywordsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_keywordsi = new byte[length_keywordsi];
        for(int k= 0; k< length_keywordsi; k++){
            bytes_keywordsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.keywords[i] = new java.lang.String(bytes_keywordsi);
        offset += length_keywordsi;
        }
        int length_relationships = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_relationships |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_relationships |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_relationships |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_relationships > 0) {
            this.relationships = new com.roslib.uuid_msgs.UniqueID[length_relationships];
        }
        for (int i = 0; i < length_relationships; i++){
        offset = this.relationships[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_world = this.world.getBytes().length;
        length += 4;
        length += length_world;
        length += 4;
        int length_ids = this.ids != null ? this.ids.length : 0;
        for (int i = 0; i < length_ids; i++) {
        length += this.ids[i].serializedLength();
        }
        length += 4;
        int length_names = this.names != null ? this.names.length : 0;
        for (int i = 0; i < length_names; i++) {
        int length_namesi = this.names[i].getBytes().length;
        length += 4;
        length += length_namesi;
        }
        length += 4;
        int length_types = this.types != null ? this.types.length : 0;
        for (int i = 0; i < length_types; i++) {
        int length_typesi = this.types[i].getBytes().length;
        length += 4;
        length += length_typesi;
        }
        length += 4;
        int length_keywords = this.keywords != null ? this.keywords.length : 0;
        for (int i = 0; i < length_keywords; i++) {
        int length_keywordsi = this.keywords[i].getBytes().length;
        length += 4;
        length += length_keywordsi;
        }
        length += 4;
        int length_relationships = this.relationships != null ? this.relationships.length : 0;
        for (int i = 0; i < length_relationships; i++) {
        length += this.relationships[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETANNOTATIONS; }
    public java.lang.String getMD5(){ return "3a6b374aeaa6a8e423c2c3d793678c17"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetAnnotationsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public java.lang.String message;
    public com.roslib.world_canvas_msgs.Annotation[] annotations;

    public GetAnnotationsResponse() {
        this.result = false;
        this.message = "";
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
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        length += 4;
        int length_annotations = this.annotations != null ? this.annotations.length : 0;
        for (int i = 0; i < length_annotations; i++) {
        length += this.annotations[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETANNOTATIONS; }
    public java.lang.String getMD5(){ return "44f5a0fdd2aeece7baee9704bcb33241"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
