package com.roslib.controller_manager_msgs;

import java.lang.*;

public class SwitchController {

public static final java.lang.String SWITCHCONTROLLER = "controller_manager_msgs/SwitchController";

public class SwitchControllerRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] start_controllers;
    public java.lang.String[] stop_controllers;
    public int strictness;
    public static final int BEST_EFFORT = (int)(1);
    public static final int STRICT = (int)(2);

    public SwitchControllerRequest() {
        this.start_controllers = null;
        this.stop_controllers = null;
        this.strictness = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_start_controllers = this.start_controllers != null ? this.start_controllers.length : 0;
        outbuffer[offset + 0] = (byte)((length_start_controllers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_start_controllers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_start_controllers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_start_controllers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_start_controllers; i++){
        int length_start_controllersi = this.start_controllers[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_start_controllersi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_start_controllersi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_start_controllersi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_start_controllersi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_start_controllersi; k++) {
            outbuffer[offset + k] = (byte)((this.start_controllers[i].getBytes())[k] & 0xFF);
        }
        offset += length_start_controllersi;
        }
        int length_stop_controllers = this.stop_controllers != null ? this.stop_controllers.length : 0;
        outbuffer[offset + 0] = (byte)((length_stop_controllers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_stop_controllers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_stop_controllers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_stop_controllers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_stop_controllers; i++){
        int length_stop_controllersi = this.stop_controllers[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_stop_controllersi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_stop_controllersi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_stop_controllersi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_stop_controllersi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_stop_controllersi; k++) {
            outbuffer[offset + k] = (byte)((this.stop_controllers[i].getBytes())[k] & 0xFF);
        }
        offset += length_stop_controllersi;
        }
        outbuffer[offset + 0] = (byte)((this.strictness >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.strictness >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.strictness >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.strictness >> (8 * 3)) & 0xFF);
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
        int length_start_controllers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_start_controllers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_start_controllers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_start_controllers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_start_controllers > 0) {
            this.start_controllers = new java.lang.String[length_start_controllers];
        }
        for (int i = 0; i < length_start_controllers; i++){
        int length_start_controllersi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_start_controllersi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_start_controllersi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_start_controllersi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_start_controllersi = new byte[length_start_controllersi];
        for(int k= 0; k< length_start_controllersi; k++){
            bytes_start_controllersi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.start_controllers[i] = new java.lang.String(bytes_start_controllersi);
        offset += length_start_controllersi;
        }
        int length_stop_controllers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_stop_controllers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_stop_controllers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_stop_controllers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_stop_controllers > 0) {
            this.stop_controllers = new java.lang.String[length_stop_controllers];
        }
        for (int i = 0; i < length_stop_controllers; i++){
        int length_stop_controllersi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_stop_controllersi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_stop_controllersi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_stop_controllersi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_stop_controllersi = new byte[length_stop_controllersi];
        for(int k= 0; k< length_stop_controllersi; k++){
            bytes_stop_controllersi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.stop_controllers[i] = new java.lang.String(bytes_stop_controllersi);
        offset += length_stop_controllersi;
        }
        this.strictness   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.strictness |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.strictness |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.strictness |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_start_controllers = this.start_controllers != null ? this.start_controllers.length : 0;
        for (int i = 0; i < length_start_controllers; i++) {
        int length_start_controllersi = this.start_controllers[i].getBytes().length;
        length += 4;
        length += length_start_controllersi;
        }
        length += 4;
        int length_stop_controllers = this.stop_controllers != null ? this.stop_controllers.length : 0;
        for (int i = 0; i < length_stop_controllers; i++) {
        int length_stop_controllersi = this.stop_controllers[i].getBytes().length;
        length += 4;
        length += length_stop_controllersi;
        }
        length += 4;
        return length;
    }

    public java.lang.String getType() { return SWITCHCONTROLLER; }
    public java.lang.String getMD5(){ return "0c0af5941992750b2d762e052687d1e9"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SwitchControllerResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean ok;

    public SwitchControllerResponse() {
        this.ok = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((ok ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.ok = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return SWITCHCONTROLLER; }
    public java.lang.String getMD5(){ return "42f2a4f50652ae85d62ea53f1d1a20f8"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
