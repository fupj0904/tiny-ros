package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class InteractiveClient implements com.roslib.ros.Msg {
    public java.lang.String name;
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.rocon_std_msgs.PlatformInfo platform_info;
    public java.lang.String[] running_interactions;

    public InteractiveClient() {
        this.name = "";
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.platform_info = new com.roslib.rocon_std_msgs.PlatformInfo();
        this.running_interactions = null;
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
        offset = this.id.serialize(outbuffer, offset);
        offset = this.platform_info.serialize(outbuffer, offset);
        int length_running_interactions = this.running_interactions != null ? this.running_interactions.length : 0;
        outbuffer[offset + 0] = (byte)((length_running_interactions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_interactions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_interactions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_interactions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_running_interactions; i++){
        int length_running_interactionsi = this.running_interactions[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_running_interactionsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_interactionsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_interactionsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_interactionsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_running_interactionsi; k++) {
            outbuffer[offset + k] = (byte)((this.running_interactions[i].getBytes())[k] & 0xFF);
        }
        offset += length_running_interactionsi;
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
        offset = this.id.deserialize(inbuffer, offset);
        offset = this.platform_info.deserialize(inbuffer, offset);
        int length_running_interactions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_interactions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_interactions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_interactions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_running_interactions > 0) {
            this.running_interactions = new java.lang.String[length_running_interactions];
        }
        for (int i = 0; i < length_running_interactions; i++){
        int length_running_interactionsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_interactionsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_interactionsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_interactionsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_running_interactionsi = new byte[length_running_interactionsi];
        for(int k= 0; k< length_running_interactionsi; k++){
            bytes_running_interactionsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.running_interactions[i] = new java.lang.String(bytes_running_interactionsi);
        offset += length_running_interactionsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += this.id.serializedLength();
        length += this.platform_info.serializedLength();
        length += 4;
        int length_running_interactions = this.running_interactions != null ? this.running_interactions.length : 0;
        for (int i = 0; i < length_running_interactions; i++) {
        int length_running_interactionsi = this.running_interactions[i].getBytes().length;
        length += 4;
        length += length_running_interactionsi;
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/InteractiveClient"; }
    public java.lang.String getMD5(){ return "33de9efa37bd22e3121b993d17b4b72b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
