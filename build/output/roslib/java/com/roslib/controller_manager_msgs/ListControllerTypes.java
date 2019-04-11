package com.roslib.controller_manager_msgs;

import java.lang.*;

public class ListControllerTypes {

public static final java.lang.String LISTCONTROLLERTYPES = "controller_manager_msgs/ListControllerTypes";

public class ListControllerTypesRequest implements com.roslib.ros.Msg {
    private long __id__;

    public ListControllerTypesRequest() {
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

    public java.lang.String getType() { return LISTCONTROLLERTYPES; }
    public java.lang.String getMD5(){ return "4a65ad8e3c63a3d4d9b56e572d01fcaf"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ListControllerTypesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] types;
    public java.lang.String[] base_classes;

    public ListControllerTypesResponse() {
        this.types = null;
        this.base_classes = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_types = this.types != null ? this.types.length : 0;
        outbuffer[offset + 0] = (byte)((length_types >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_types >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_types >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_types >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_types; i++){
        int length_typesi = this.types[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_typesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_typesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_typesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_typesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_typesi; k++) {
            outbuffer[offset + k] = (byte)((this.types[i].getBytes())[k] & 0xFF);
        }
        offset += length_typesi;
        }
        int length_base_classes = this.base_classes != null ? this.base_classes.length : 0;
        outbuffer[offset + 0] = (byte)((length_base_classes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_base_classes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_base_classes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_base_classes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_base_classes; i++){
        int length_base_classesi = this.base_classes[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_base_classesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_base_classesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_base_classesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_base_classesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_base_classesi; k++) {
            outbuffer[offset + k] = (byte)((this.base_classes[i].getBytes())[k] & 0xFF);
        }
        offset += length_base_classesi;
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
        int length_types = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_types |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_types |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_types |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_types > 0) {
            this.types = new java.lang.String[length_types];
        }
        for (int i = 0; i < length_types; i++){
        int length_typesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_typesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_typesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_typesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_typesi = new byte[length_typesi];
        for(int k= 0; k< length_typesi; k++){
            bytes_typesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.types[i] = new java.lang.String(bytes_typesi);
        offset += length_typesi;
        }
        int length_base_classes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_base_classes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_base_classes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_base_classes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_base_classes > 0) {
            this.base_classes = new java.lang.String[length_base_classes];
        }
        for (int i = 0; i < length_base_classes; i++){
        int length_base_classesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_base_classesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_base_classesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_base_classesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_base_classesi = new byte[length_base_classesi];
        for(int k= 0; k< length_base_classesi; k++){
            bytes_base_classesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.base_classes[i] = new java.lang.String(bytes_base_classesi);
        offset += length_base_classesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_types = this.types != null ? this.types.length : 0;
        for (int i = 0; i < length_types; i++) {
        int length_typesi = this.types[i].getBytes().length;
        length += 4;
        length += length_typesi;
        }
        length += 4;
        int length_base_classes = this.base_classes != null ? this.base_classes.length : 0;
        for (int i = 0; i < length_base_classes; i++) {
        int length_base_classesi = this.base_classes[i].getBytes().length;
        length += 4;
        length += length_base_classesi;
        }
        return length;
    }

    public java.lang.String getType() { return LISTCONTROLLERTYPES; }
    public java.lang.String getMD5(){ return "092ad8d0c7a66451e4119ead8c71d1dd"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
