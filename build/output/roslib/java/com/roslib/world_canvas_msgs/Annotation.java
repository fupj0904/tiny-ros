package com.roslib.world_canvas_msgs;

import java.lang.*;

public class Annotation implements com.roslib.ros.Msg {
    public com.roslib.ros.Time timestamp;
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.uuid_msgs.UniqueID data_id;
    public java.lang.String world;
    public java.lang.String name;
    public java.lang.String type;
    public int shape;
    public com.roslib.std_msgs.ColorRGBA color;
    public com.roslib.geometry_msgs.Vector3 size;
    public com.roslib.geometry_msgs.PoseWithCovarianceStamped pose;
    public java.lang.String[] keywords;
    public com.roslib.uuid_msgs.UniqueID[] relationships;

    public Annotation() {
        this.timestamp = new com.roslib.ros.Time();
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.data_id = new com.roslib.uuid_msgs.UniqueID();
        this.world = "";
        this.name = "";
        this.type = "";
        this.shape = 0;
        this.color = new com.roslib.std_msgs.ColorRGBA();
        this.size = new com.roslib.geometry_msgs.Vector3();
        this.pose = new com.roslib.geometry_msgs.PoseWithCovarianceStamped();
        this.keywords = null;
        this.relationships = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.timestamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timestamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.id.serialize(outbuffer, offset);
        offset = this.data_id.serialize(outbuffer, offset);
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
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        outbuffer[offset + 0] = (byte)((this.shape >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.shape >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.shape >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.shape >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.color.serialize(outbuffer, offset);
        offset = this.size.serialize(outbuffer, offset);
        offset = this.pose.serialize(outbuffer, offset);
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
        this.timestamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timestamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.id.deserialize(inbuffer, offset);
        offset = this.data_id.deserialize(inbuffer, offset);
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
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        this.shape   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.shape |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.shape |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.shape |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.color.deserialize(inbuffer, offset);
        offset = this.size.deserialize(inbuffer, offset);
        offset = this.pose.deserialize(inbuffer, offset);
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
        length += 4;
        length += 4;
        length += this.id.serializedLength();
        length += this.data_id.serializedLength();
        int length_world = this.world.getBytes().length;
        length += 4;
        length += length_world;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        length += 4;
        length += this.color.serializedLength();
        length += this.size.serializedLength();
        length += this.pose.serializedLength();
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

    public java.lang.String getType(){ return "world_canvas_msgs/Annotation"; }
    public java.lang.String getMD5(){ return "a8f9dce6516e1b01140f38f358ecee73"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
