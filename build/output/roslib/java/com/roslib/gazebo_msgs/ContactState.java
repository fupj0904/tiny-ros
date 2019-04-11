package com.roslib.gazebo_msgs;

import java.lang.*;

public class ContactState implements com.roslib.ros.Msg {
    public java.lang.String info;
    public java.lang.String collision1_name;
    public java.lang.String collision2_name;
    public com.roslib.geometry_msgs.Wrench[] wrenches;
    public com.roslib.geometry_msgs.Wrench total_wrench;
    public com.roslib.geometry_msgs.Vector3[] contact_positions;
    public com.roslib.geometry_msgs.Vector3[] contact_normals;
    public double[] depths;

    public ContactState() {
        this.info = "";
        this.collision1_name = "";
        this.collision2_name = "";
        this.wrenches = null;
        this.total_wrench = new com.roslib.geometry_msgs.Wrench();
        this.contact_positions = null;
        this.contact_normals = null;
        this.depths = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_info = this.info.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_info >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_info >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_info >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_info >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_info; k++) {
            outbuffer[offset + k] = (byte)((this.info.getBytes())[k] & 0xFF);
        }
        offset += length_info;
        int length_collision1_name = this.collision1_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_collision1_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_collision1_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_collision1_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_collision1_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_collision1_name; k++) {
            outbuffer[offset + k] = (byte)((this.collision1_name.getBytes())[k] & 0xFF);
        }
        offset += length_collision1_name;
        int length_collision2_name = this.collision2_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_collision2_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_collision2_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_collision2_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_collision2_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_collision2_name; k++) {
            outbuffer[offset + k] = (byte)((this.collision2_name.getBytes())[k] & 0xFF);
        }
        offset += length_collision2_name;
        int length_wrenches = this.wrenches != null ? this.wrenches.length : 0;
        outbuffer[offset + 0] = (byte)((length_wrenches >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_wrenches >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_wrenches >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_wrenches >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_wrenches; i++){
        offset = this.wrenches[i].serialize(outbuffer, offset);
        }
        offset = this.total_wrench.serialize(outbuffer, offset);
        int length_contact_positions = this.contact_positions != null ? this.contact_positions.length : 0;
        outbuffer[offset + 0] = (byte)((length_contact_positions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_contact_positions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_contact_positions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_contact_positions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_contact_positions; i++){
        offset = this.contact_positions[i].serialize(outbuffer, offset);
        }
        int length_contact_normals = this.contact_normals != null ? this.contact_normals.length : 0;
        outbuffer[offset + 0] = (byte)((length_contact_normals >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_contact_normals >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_contact_normals >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_contact_normals >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_contact_normals; i++){
        offset = this.contact_normals[i].serialize(outbuffer, offset);
        }
        int length_depths = this.depths != null ? this.depths.length : 0;
        outbuffer[offset + 0] = (byte)((length_depths >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_depths >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_depths >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_depths >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_depths; i++){
        long bits_depthsi = Double.doubleToRawLongBits(this.depths[i]);
        outbuffer[offset + 0] = (byte)((bits_depthsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_depthsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_depthsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_depthsi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_depthsi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_depthsi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_depthsi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_depthsi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_info = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_info |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_info |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_info |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_info = new byte[length_info];
        for(int k= 0; k< length_info; k++){
            bytes_info[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.info = new java.lang.String(bytes_info);
        offset += length_info;
        int length_collision1_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_collision1_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_collision1_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_collision1_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_collision1_name = new byte[length_collision1_name];
        for(int k= 0; k< length_collision1_name; k++){
            bytes_collision1_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.collision1_name = new java.lang.String(bytes_collision1_name);
        offset += length_collision1_name;
        int length_collision2_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_collision2_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_collision2_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_collision2_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_collision2_name = new byte[length_collision2_name];
        for(int k= 0; k< length_collision2_name; k++){
            bytes_collision2_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.collision2_name = new java.lang.String(bytes_collision2_name);
        offset += length_collision2_name;
        int length_wrenches = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_wrenches |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_wrenches |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_wrenches |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_wrenches > 0) {
            this.wrenches = new com.roslib.geometry_msgs.Wrench[length_wrenches];
        }
        for (int i = 0; i < length_wrenches; i++){
        offset = this.wrenches[i].deserialize(inbuffer, offset);
        }
        offset = this.total_wrench.deserialize(inbuffer, offset);
        int length_contact_positions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_contact_positions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_contact_positions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_contact_positions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_contact_positions > 0) {
            this.contact_positions = new com.roslib.geometry_msgs.Vector3[length_contact_positions];
        }
        for (int i = 0; i < length_contact_positions; i++){
        offset = this.contact_positions[i].deserialize(inbuffer, offset);
        }
        int length_contact_normals = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_contact_normals |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_contact_normals |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_contact_normals |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_contact_normals > 0) {
            this.contact_normals = new com.roslib.geometry_msgs.Vector3[length_contact_normals];
        }
        for (int i = 0; i < length_contact_normals; i++){
        offset = this.contact_normals[i].deserialize(inbuffer, offset);
        }
        int length_depths = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_depths |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_depths |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_depths |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_depths > 0) {
            this.depths = new double[length_depths];
        }
        for (int i = 0; i < length_depths; i++){
        long bits_depthsi = 0;
        bits_depthsi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_depthsi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_depthsi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_depthsi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_depthsi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_depthsi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_depthsi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_depthsi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.depths[i] = Double.longBitsToDouble(bits_depthsi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_info = this.info.getBytes().length;
        length += 4;
        length += length_info;
        int length_collision1_name = this.collision1_name.getBytes().length;
        length += 4;
        length += length_collision1_name;
        int length_collision2_name = this.collision2_name.getBytes().length;
        length += 4;
        length += length_collision2_name;
        length += 4;
        int length_wrenches = this.wrenches != null ? this.wrenches.length : 0;
        for (int i = 0; i < length_wrenches; i++) {
        length += this.wrenches[i].serializedLength();
        }
        length += this.total_wrench.serializedLength();
        length += 4;
        int length_contact_positions = this.contact_positions != null ? this.contact_positions.length : 0;
        for (int i = 0; i < length_contact_positions; i++) {
        length += this.contact_positions[i].serializedLength();
        }
        length += 4;
        int length_contact_normals = this.contact_normals != null ? this.contact_normals.length : 0;
        for (int i = 0; i < length_contact_normals; i++) {
        length += this.contact_normals[i].serializedLength();
        }
        length += 4;
        int length_depths = this.depths != null ? this.depths.length : 0;
        for (int i = 0; i < length_depths; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/ContactState"; }
    public java.lang.String getMD5(){ return "d82d0f0cae88aebf6b2cc86caea33a2b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
