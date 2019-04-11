package com.roslib.controller_manager_msgs;

import java.lang.*;

public class ListControllers {

public static final java.lang.String LISTCONTROLLERS = "controller_manager_msgs/ListControllers";

public class ListControllersRequest implements com.roslib.ros.Msg {
    private long __id__;

    public ListControllersRequest() {
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

    public java.lang.String getType() { return LISTCONTROLLERS; }
    public java.lang.String getMD5(){ return "59ff74cc43d5bccacc4d9e9578046054"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ListControllersResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.controller_manager_msgs.ControllerState[] controller;

    public ListControllersResponse() {
        this.controller = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_controller = this.controller != null ? this.controller.length : 0;
        outbuffer[offset + 0] = (byte)((length_controller >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_controller >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_controller >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_controller >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_controller; i++){
        offset = this.controller[i].serialize(outbuffer, offset);
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
        int length_controller = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_controller |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_controller |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_controller |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_controller > 0) {
            this.controller = new com.roslib.controller_manager_msgs.ControllerState[length_controller];
        }
        for (int i = 0; i < length_controller; i++){
        offset = this.controller[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_controller = this.controller != null ? this.controller.length : 0;
        for (int i = 0; i < length_controller; i++) {
        length += this.controller[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return LISTCONTROLLERS; }
    public java.lang.String getMD5(){ return "18835883c0c6a95925a6392e5dadb2a4"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
