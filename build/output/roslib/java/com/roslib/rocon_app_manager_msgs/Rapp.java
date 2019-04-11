package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class Rapp implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String display_name;
    public java.lang.String description;
    public java.lang.String compatibility;
    public java.lang.String status;
    public java.lang.String[] implementations;
    public java.lang.String preferred;
    public com.roslib.rocon_std_msgs.Icon icon;
    public com.roslib.rocon_std_msgs.KeyValue[] public_interface;
    public com.roslib.rocon_std_msgs.KeyValue[] public_parameters;

    public Rapp() {
        this.name = "";
        this.display_name = "";
        this.description = "";
        this.compatibility = "";
        this.status = "";
        this.implementations = null;
        this.preferred = "";
        this.icon = new com.roslib.rocon_std_msgs.Icon();
        this.public_interface = null;
        this.public_parameters = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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
        int length_display_name = this.display_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_display_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_display_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_display_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_display_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_display_name; k++) {
            outbuffer[offset + k] = (byte)((this.display_name.getBytes())[k] & 0xFF);
        }
        offset += length_display_name;
        int length_description = this.description.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_description >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_description >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_description >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_description >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_description; k++) {
            outbuffer[offset + k] = (byte)((this.description.getBytes())[k] & 0xFF);
        }
        offset += length_description;
        int length_compatibility = this.compatibility.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_compatibility >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_compatibility >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_compatibility >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_compatibility >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_compatibility; k++) {
            outbuffer[offset + k] = (byte)((this.compatibility.getBytes())[k] & 0xFF);
        }
        offset += length_compatibility;
        int length_status = this.status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status; k++) {
            outbuffer[offset + k] = (byte)((this.status.getBytes())[k] & 0xFF);
        }
        offset += length_status;
        int length_implementations = this.implementations != null ? this.implementations.length : 0;
        outbuffer[offset + 0] = (byte)((length_implementations >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_implementations >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_implementations >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_implementations >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_implementations; i++){
        int length_implementationsi = this.implementations[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_implementationsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_implementationsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_implementationsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_implementationsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_implementationsi; k++) {
            outbuffer[offset + k] = (byte)((this.implementations[i].getBytes())[k] & 0xFF);
        }
        offset += length_implementationsi;
        }
        int length_preferred = this.preferred.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_preferred >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_preferred >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_preferred >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_preferred >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_preferred; k++) {
            outbuffer[offset + k] = (byte)((this.preferred.getBytes())[k] & 0xFF);
        }
        offset += length_preferred;
        offset = this.icon.serialize(outbuffer, offset);
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        outbuffer[offset + 0] = (byte)((length_public_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_public_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_public_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_public_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_public_interface; i++){
        offset = this.public_interface[i].serialize(outbuffer, offset);
        }
        int length_public_parameters = this.public_parameters != null ? this.public_parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_public_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_public_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_public_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_public_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_public_parameters; i++){
        offset = this.public_parameters[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
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
        int length_display_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_display_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_display_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_display_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_display_name = new byte[length_display_name];
        for(int k= 0; k< length_display_name; k++){
            bytes_display_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.display_name = new java.lang.String(bytes_display_name);
        offset += length_display_name;
        int length_description = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_description |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_description |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_description |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_description = new byte[length_description];
        for(int k= 0; k< length_description; k++){
            bytes_description[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.description = new java.lang.String(bytes_description);
        offset += length_description;
        int length_compatibility = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_compatibility |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_compatibility |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_compatibility |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_compatibility = new byte[length_compatibility];
        for(int k= 0; k< length_compatibility; k++){
            bytes_compatibility[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.compatibility = new java.lang.String(bytes_compatibility);
        offset += length_compatibility;
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status = new byte[length_status];
        for(int k= 0; k< length_status; k++){
            bytes_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status = new java.lang.String(bytes_status);
        offset += length_status;
        int length_implementations = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_implementations |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_implementations |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_implementations |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_implementations > 0) {
            this.implementations = new java.lang.String[length_implementations];
        }
        for (int i = 0; i < length_implementations; i++){
        int length_implementationsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_implementationsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_implementationsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_implementationsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_implementationsi = new byte[length_implementationsi];
        for(int k= 0; k< length_implementationsi; k++){
            bytes_implementationsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.implementations[i] = new java.lang.String(bytes_implementationsi);
        offset += length_implementationsi;
        }
        int length_preferred = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_preferred |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_preferred |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_preferred |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_preferred = new byte[length_preferred];
        for(int k= 0; k< length_preferred; k++){
            bytes_preferred[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.preferred = new java.lang.String(bytes_preferred);
        offset += length_preferred;
        offset = this.icon.deserialize(inbuffer, offset);
        int length_public_interface = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_public_interface |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_public_interface |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_public_interface |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_public_interface > 0) {
            this.public_interface = new com.roslib.rocon_std_msgs.KeyValue[length_public_interface];
        }
        for (int i = 0; i < length_public_interface; i++){
        offset = this.public_interface[i].deserialize(inbuffer, offset);
        }
        int length_public_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_public_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_public_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_public_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_public_parameters > 0) {
            this.public_parameters = new com.roslib.rocon_std_msgs.KeyValue[length_public_parameters];
        }
        for (int i = 0; i < length_public_parameters; i++){
        offset = this.public_parameters[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_display_name = this.display_name.getBytes().length;
        length += 4;
        length += length_display_name;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        int length_compatibility = this.compatibility.getBytes().length;
        length += 4;
        length += length_compatibility;
        int length_status = this.status.getBytes().length;
        length += 4;
        length += length_status;
        length += 4;
        int length_implementations = this.implementations != null ? this.implementations.length : 0;
        for (int i = 0; i < length_implementations; i++) {
        int length_implementationsi = this.implementations[i].getBytes().length;
        length += 4;
        length += length_implementationsi;
        }
        int length_preferred = this.preferred.getBytes().length;
        length += 4;
        length += length_preferred;
        length += this.icon.serializedLength();
        length += 4;
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        for (int i = 0; i < length_public_interface; i++) {
        length += this.public_interface[i].serializedLength();
        }
        length += 4;
        int length_public_parameters = this.public_parameters != null ? this.public_parameters.length : 0;
        for (int i = 0; i < length_public_parameters; i++) {
        length += this.public_parameters[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_app_manager_msgs/Rapp"; }
    public java.lang.String getMD5(){ return "a5d5abc32c76a37c5031e6188d3bc6c6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
