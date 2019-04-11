package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class StartRapp {

public static final java.lang.String STARTRAPP = "rocon_app_manager_msgs/StartRapp";

public class StartRappRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String name;
    public com.roslib.rocon_std_msgs.Remapping[] remappings;
    public com.roslib.rocon_std_msgs.KeyValue[] parameters;

    public StartRappRequest() {
        this.name = "";
        this.remappings = null;
        this.parameters = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        outbuffer[offset + 0] = (byte)((length_remappings >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remappings >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remappings >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remappings >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_remappings; i++){
        offset = this.remappings[i].serialize(outbuffer, offset);
        }
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].serialize(outbuffer, offset);
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
        if(length_parameters > 0) {
            this.parameters = new com.roslib.rocon_std_msgs.KeyValue[length_parameters];
        }
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        for (int i = 0; i < length_remappings; i++) {
        length += this.remappings[i].serializedLength();
        }
        length += 4;
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        for (int i = 0; i < length_parameters; i++) {
        length += this.parameters[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return STARTRAPP; }
    public java.lang.String getMD5(){ return "2eaec26ef60b532b917d3178d15d80cc"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class StartRappResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean started;
    public int error_code;
    public java.lang.String message;
    public java.lang.String application_namespace;

    public StartRappResponse() {
        this.started = false;
        this.error_code = 0;
        this.message = "";
        this.application_namespace = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((started ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.error_code >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.error_code >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.error_code >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.error_code >> (8 * 3)) & 0xFF);
        offset += 4;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.started = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.error_code   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.error_code |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.error_code |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.error_code |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        int length_application_namespace = this.application_namespace.getBytes().length;
        length += 4;
        length += length_application_namespace;
        return length;
    }

    public java.lang.String getType() { return STARTRAPP; }
    public java.lang.String getMD5(){ return "b7e1003869c3c4ba393ee250a9c6543e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
