package com.roslib.controller_manager_msgs;

import java.lang.*;

public class ControllerState implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String state;
    public java.lang.String type;
    public java.lang.String hardware_interface;
    public java.lang.String[] resources;

    public ControllerState() {
        this.name = "";
        this.state = "";
        this.type = "";
        this.hardware_interface = "";
        this.resources = null;
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
        int length_state = this.state.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_state >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_state >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_state >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_state >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_state; k++) {
            outbuffer[offset + k] = (byte)((this.state.getBytes())[k] & 0xFF);
        }
        offset += length_state;
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
        int length_hardware_interface = this.hardware_interface.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hardware_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hardware_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hardware_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hardware_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hardware_interface; k++) {
            outbuffer[offset + k] = (byte)((this.hardware_interface.getBytes())[k] & 0xFF);
        }
        offset += length_hardware_interface;
        int length_resources = this.resources != null ? this.resources.length : 0;
        outbuffer[offset + 0] = (byte)((length_resources >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_resources >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_resources >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_resources >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_resources; i++){
        int length_resourcesi = this.resources[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_resourcesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_resourcesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_resourcesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_resourcesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_resourcesi; k++) {
            outbuffer[offset + k] = (byte)((this.resources[i].getBytes())[k] & 0xFF);
        }
        offset += length_resourcesi;
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
        int length_state = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_state |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_state |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_state |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_state = new byte[length_state];
        for(int k= 0; k< length_state; k++){
            bytes_state[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.state = new java.lang.String(bytes_state);
        offset += length_state;
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
        int length_hardware_interface = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hardware_interface |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hardware_interface |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hardware_interface |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hardware_interface = new byte[length_hardware_interface];
        for(int k= 0; k< length_hardware_interface; k++){
            bytes_hardware_interface[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hardware_interface = new java.lang.String(bytes_hardware_interface);
        offset += length_hardware_interface;
        int length_resources = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_resources |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_resources |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_resources |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_resources > 0) {
            this.resources = new java.lang.String[length_resources];
        }
        for (int i = 0; i < length_resources; i++){
        int length_resourcesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_resourcesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_resourcesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_resourcesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_resourcesi = new byte[length_resourcesi];
        for(int k= 0; k< length_resourcesi; k++){
            bytes_resourcesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.resources[i] = new java.lang.String(bytes_resourcesi);
        offset += length_resourcesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_state = this.state.getBytes().length;
        length += 4;
        length += length_state;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        int length_hardware_interface = this.hardware_interface.getBytes().length;
        length += 4;
        length += length_hardware_interface;
        length += 4;
        int length_resources = this.resources != null ? this.resources.length : 0;
        for (int i = 0; i < length_resources; i++) {
        int length_resourcesi = this.resources[i].getBytes().length;
        length += 4;
        length += length_resourcesi;
        }
        return length;
    }

    public java.lang.String getType(){ return "controller_manager_msgs/ControllerState"; }
    public java.lang.String getMD5(){ return "182c644ba2a6ae1ad0f8c346fcea20dd"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
