package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class Interaction implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String compatibility;
    public java.lang.String display_name;
    public java.lang.String description;
    public java.lang.String namespace;
    public com.roslib.rocon_std_msgs.Icon icon;
    public com.roslib.rocon_std_msgs.Remapping[] remappings;
    public java.lang.String parameters;
    public int max;
    public com.roslib.rocon_interaction_msgs.Pairing pairing;
    public int hash;
    public java.lang.String role;
    public static final int UNLIMITED_INTERACTIONS = (int)( -1);

    public Interaction() {
        this.name = "";
        this.compatibility = "";
        this.display_name = "";
        this.description = "";
        this.namespace = "";
        this.icon = new com.roslib.rocon_std_msgs.Icon();
        this.remappings = null;
        this.parameters = "";
        this.max = 0;
        this.pairing = new com.roslib.rocon_interaction_msgs.Pairing();
        this.hash = 0;
        this.role = "";
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
        int length_namespace = this.namespace.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_namespace >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_namespace >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_namespace >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_namespace >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_namespace; k++) {
            outbuffer[offset + k] = (byte)((this.namespace.getBytes())[k] & 0xFF);
        }
        offset += length_namespace;
        offset = this.icon.serialize(outbuffer, offset);
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        outbuffer[offset + 0] = (byte)((length_remappings >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remappings >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remappings >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remappings >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_remappings; i++){
        offset = this.remappings[i].serialize(outbuffer, offset);
        }
        int length_parameters = this.parameters.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_parameters; k++) {
            outbuffer[offset + k] = (byte)((this.parameters.getBytes())[k] & 0xFF);
        }
        offset += length_parameters;
        outbuffer[offset + 0] = (byte)((this.max >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.max >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.max >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.max >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pairing.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.hash >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.hash >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.hash >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.hash >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_role = this.role.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_role >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_role >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_role >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_role >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_role; k++) {
            outbuffer[offset + k] = (byte)((this.role.getBytes())[k] & 0xFF);
        }
        offset += length_role;
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
        int length_namespace = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_namespace |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_namespace |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_namespace |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_namespace = new byte[length_namespace];
        for(int k= 0; k< length_namespace; k++){
            bytes_namespace[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.namespace = new java.lang.String(bytes_namespace);
        offset += length_namespace;
        offset = this.icon.deserialize(inbuffer, offset);
        int length_remappings = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remappings |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remappings |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remappings |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_remappings > 0) {
            this.remappings = new com.roslib.rocon_std_msgs.Remapping[length_remappings];
        }
        for (int i = 0; i < length_remappings; i++){
        offset = this.remappings[i].deserialize(inbuffer, offset);
        }
        int length_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_parameters = new byte[length_parameters];
        for(int k= 0; k< length_parameters; k++){
            bytes_parameters[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.parameters = new java.lang.String(bytes_parameters);
        offset += length_parameters;
        this.max   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.max |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.max |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.max |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.pairing.deserialize(inbuffer, offset);
        this.hash   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.hash |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.hash |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.hash |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_role = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_role |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_role |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_role |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_role = new byte[length_role];
        for(int k= 0; k< length_role; k++){
            bytes_role[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.role = new java.lang.String(bytes_role);
        offset += length_role;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_compatibility = this.compatibility.getBytes().length;
        length += 4;
        length += length_compatibility;
        int length_display_name = this.display_name.getBytes().length;
        length += 4;
        length += length_display_name;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        int length_namespace = this.namespace.getBytes().length;
        length += 4;
        length += length_namespace;
        length += this.icon.serializedLength();
        length += 4;
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        for (int i = 0; i < length_remappings; i++) {
        length += this.remappings[i].serializedLength();
        }
        int length_parameters = this.parameters.getBytes().length;
        length += 4;
        length += length_parameters;
        length += 4;
        length += this.pairing.serializedLength();
        length += 4;
        int length_role = this.role.getBytes().length;
        length += 4;
        length += length_role;
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/Interaction"; }
    public java.lang.String getMD5(){ return "e956afc8917050080862e1492c2e0c91"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
