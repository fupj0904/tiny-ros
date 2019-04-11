package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class Status implements com.roslib.ros.Msg {
    public java.lang.String application_namespace;
    public java.lang.String remote_controller;
    public java.lang.String rapp_status;
    public com.roslib.rocon_app_manager_msgs.Rapp rapp;
    public com.roslib.rocon_app_manager_msgs.PublishedInterface[] published_interfaces;
    public com.roslib.rocon_std_msgs.KeyValue[] published_parameters;
    public static final java.lang.String RAPP_STOPPED = (java.lang.String)("stopped");
    public static final java.lang.String RAPP_RUNNING = (java.lang.String)("running");

    public Status() {
        this.application_namespace = "";
        this.remote_controller = "";
        this.rapp_status = "";
        this.rapp = new com.roslib.rocon_app_manager_msgs.Rapp();
        this.published_interfaces = null;
        this.published_parameters = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_application_namespace = this.application_namespace.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_application_namespace >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_application_namespace >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_application_namespace >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_application_namespace >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_application_namespace; k++) {
            outbuffer[offset + k] = (byte)((this.application_namespace.getBytes())[k] & 0xFF);
        }
        offset += length_application_namespace;
        int length_remote_controller = this.remote_controller.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remote_controller >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remote_controller >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remote_controller >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remote_controller >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remote_controller; k++) {
            outbuffer[offset + k] = (byte)((this.remote_controller.getBytes())[k] & 0xFF);
        }
        offset += length_remote_controller;
        int length_rapp_status = this.rapp_status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rapp_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rapp_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rapp_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rapp_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rapp_status; k++) {
            outbuffer[offset + k] = (byte)((this.rapp_status.getBytes())[k] & 0xFF);
        }
        offset += length_rapp_status;
        offset = this.rapp.serialize(outbuffer, offset);
        int length_published_interfaces = this.published_interfaces != null ? this.published_interfaces.length : 0;
        outbuffer[offset + 0] = (byte)((length_published_interfaces >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_published_interfaces >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_published_interfaces >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_published_interfaces >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_published_interfaces; i++){
        offset = this.published_interfaces[i].serialize(outbuffer, offset);
        }
        int length_published_parameters = this.published_parameters != null ? this.published_parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_published_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_published_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_published_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_published_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_published_parameters; i++){
        offset = this.published_parameters[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_application_namespace = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_application_namespace |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_application_namespace |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_application_namespace |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_application_namespace = new byte[length_application_namespace];
        for(int k= 0; k< length_application_namespace; k++){
            bytes_application_namespace[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.application_namespace = new java.lang.String(bytes_application_namespace);
        offset += length_application_namespace;
        int length_remote_controller = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remote_controller |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remote_controller |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remote_controller |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remote_controller = new byte[length_remote_controller];
        for(int k= 0; k< length_remote_controller; k++){
            bytes_remote_controller[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remote_controller = new java.lang.String(bytes_remote_controller);
        offset += length_remote_controller;
        int length_rapp_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rapp_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rapp_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rapp_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rapp_status = new byte[length_rapp_status];
        for(int k= 0; k< length_rapp_status; k++){
            bytes_rapp_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.rapp_status = new java.lang.String(bytes_rapp_status);
        offset += length_rapp_status;
        offset = this.rapp.deserialize(inbuffer, offset);
        int length_published_interfaces = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_published_interfaces |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_published_interfaces |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_published_interfaces |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_published_interfaces > 0) {
            this.published_interfaces = new com.roslib.rocon_app_manager_msgs.PublishedInterface[length_published_interfaces];
        }
        for (int i = 0; i < length_published_interfaces; i++){
        offset = this.published_interfaces[i].deserialize(inbuffer, offset);
        }
        int length_published_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_published_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_published_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_published_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_published_parameters > 0) {
            this.published_parameters = new com.roslib.rocon_std_msgs.KeyValue[length_published_parameters];
        }
        for (int i = 0; i < length_published_parameters; i++){
        offset = this.published_parameters[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_application_namespace = this.application_namespace.getBytes().length;
        length += 4;
        length += length_application_namespace;
        int length_remote_controller = this.remote_controller.getBytes().length;
        length += 4;
        length += length_remote_controller;
        int length_rapp_status = this.rapp_status.getBytes().length;
        length += 4;
        length += length_rapp_status;
        length += this.rapp.serializedLength();
        length += 4;
        int length_published_interfaces = this.published_interfaces != null ? this.published_interfaces.length : 0;
        for (int i = 0; i < length_published_interfaces; i++) {
        length += this.published_interfaces[i].serializedLength();
        }
        length += 4;
        int length_published_parameters = this.published_parameters != null ? this.published_parameters.length : 0;
        for (int i = 0; i < length_published_parameters; i++) {
        length += this.published_parameters[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_app_manager_msgs/Status"; }
    public java.lang.String getMD5(){ return "7d7d162a2595afe520fa85c05d723c4f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
