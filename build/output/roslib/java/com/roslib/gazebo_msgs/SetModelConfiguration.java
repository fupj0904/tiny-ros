package com.roslib.gazebo_msgs;

import java.lang.*;

public class SetModelConfiguration {

public static final java.lang.String SETMODELCONFIGURATION = "gazebo_msgs/SetModelConfiguration";

public class SetModelConfigurationRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String model_name;
    public java.lang.String urdf_param_name;
    public java.lang.String[] joint_names;
    public double[] joint_positions;

    public SetModelConfigurationRequest() {
        this.model_name = "";
        this.urdf_param_name = "";
        this.joint_names = null;
        this.joint_positions = null;
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
        int length_urdf_param_name = this.urdf_param_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_urdf_param_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_urdf_param_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_urdf_param_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_urdf_param_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_urdf_param_name; k++) {
            outbuffer[offset + k] = (byte)((this.urdf_param_name.getBytes())[k] & 0xFF);
        }
        offset += length_urdf_param_name;
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
        int length_joint_positions = this.joint_positions != null ? this.joint_positions.length : 0;
        outbuffer[offset + 0] = (byte)((length_joint_positions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_positions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_positions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_positions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_joint_positions; i++){
        long bits_joint_positionsi = Double.doubleToRawLongBits(this.joint_positions[i]);
        outbuffer[offset + 0] = (byte)((bits_joint_positionsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_joint_positionsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_joint_positionsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_joint_positionsi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_joint_positionsi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_joint_positionsi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_joint_positionsi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_joint_positionsi >> (8 * 7)) & 0xFF);
        offset += 8;
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
        int length_urdf_param_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_urdf_param_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_urdf_param_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_urdf_param_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_urdf_param_name = new byte[length_urdf_param_name];
        for(int k= 0; k< length_urdf_param_name; k++){
            bytes_urdf_param_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.urdf_param_name = new java.lang.String(bytes_urdf_param_name);
        offset += length_urdf_param_name;
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
        int length_joint_positions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_positions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_positions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_positions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_joint_positions > 0) {
            this.joint_positions = new double[length_joint_positions];
        }
        for (int i = 0; i < length_joint_positions; i++){
        long bits_joint_positionsi = 0;
        bits_joint_positionsi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_joint_positionsi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_joint_positionsi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_joint_positionsi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_joint_positionsi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_joint_positionsi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_joint_positionsi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_joint_positionsi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.joint_positions[i] = Double.longBitsToDouble(bits_joint_positionsi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_model_name = this.model_name.getBytes().length;
        length += 4;
        length += length_model_name;
        int length_urdf_param_name = this.urdf_param_name.getBytes().length;
        length += 4;
        length += length_urdf_param_name;
        length += 4;
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        for (int i = 0; i < length_joint_names; i++) {
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        length += 4;
        length += length_joint_namesi;
        }
        length += 4;
        int length_joint_positions = this.joint_positions != null ? this.joint_positions.length : 0;
        for (int i = 0; i < length_joint_positions; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType() { return SETMODELCONFIGURATION; }
    public java.lang.String getMD5(){ return "74db6184ae83468b540d4c02d244ada7"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetModelConfigurationResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public SetModelConfigurationResponse() {
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
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return SETMODELCONFIGURATION; }
    public java.lang.String getMD5(){ return "6f12aefa315c8b37040d5d47471e39ee"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
