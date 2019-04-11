package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetWorldProperties {

public static final java.lang.String GETWORLDPROPERTIES = "gazebo_msgs/GetWorldProperties";

public class GetWorldPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetWorldPropertiesRequest() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return GETWORLDPROPERTIES; }
    public java.lang.String getMD5(){ return "3aa5de7106eec5dae41ad1c9ae681123"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetWorldPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public double sim_time;
    public java.lang.String[] model_names;
    public boolean rendering_enabled;
    public boolean success;
    public java.lang.String status_message;

    public GetWorldPropertiesResponse() {
        this.sim_time = 0;
        this.model_names = null;
        this.rendering_enabled = false;
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
        long bits_sim_time = Double.doubleToRawLongBits(this.sim_time);
        outbuffer[offset + 0] = (byte)((bits_sim_time >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_sim_time >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_sim_time >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_sim_time >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_sim_time >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_sim_time >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_sim_time >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_sim_time >> (8 * 7)) & 0xFF);
        offset += 8;
        int length_model_names = this.model_names != null ? this.model_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_model_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_model_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_model_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_model_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_model_names; i++){
        int length_model_namesi = this.model_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_model_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_model_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_model_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_model_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_model_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.model_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_model_namesi;
        }
        outbuffer[offset] = (byte)((rendering_enabled ? 0x01 : 0x00) & 0xFF);
        offset += 1;
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
        long bits_sim_time = 0;
        bits_sim_time |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_sim_time |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_sim_time |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_sim_time |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_sim_time |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_sim_time |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_sim_time |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_sim_time |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.sim_time = Double.longBitsToDouble(bits_sim_time);
        offset += 8;
        int length_model_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_model_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_model_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_model_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_model_names > 0) {
            this.model_names = new java.lang.String[length_model_names];
        }
        for (int i = 0; i < length_model_names; i++){
        int length_model_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_model_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_model_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_model_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_model_namesi = new byte[length_model_namesi];
        for(int k= 0; k< length_model_namesi; k++){
            bytes_model_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.model_names[i] = new java.lang.String(bytes_model_namesi);
        offset += length_model_namesi;
        }
        this.rendering_enabled = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
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
        length += 8;
        length += 4;
        int length_model_names = this.model_names != null ? this.model_names.length : 0;
        for (int i = 0; i < length_model_names; i++) {
        int length_model_namesi = this.model_names[i].getBytes().length;
        length += 4;
        length += length_model_namesi;
        }
        length += 1;
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETWORLDPROPERTIES; }
    public java.lang.String getMD5(){ return "fe944c1c210919291ad14bc43b6c10cf"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
