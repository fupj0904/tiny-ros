package com.roslib.realsense_camera;

import java.lang.*;

public class CameraConfiguration {

public static final java.lang.String CAMERACONFIGURATION = "realsense_camera/CameraConfiguration";

public class CameraConfigurationRequest implements com.roslib.ros.Msg {
    private long __id__;

    public CameraConfigurationRequest() {
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

    public java.lang.String getType() { return CAMERACONFIGURATION; }
    public java.lang.String getMD5(){ return "28471fe1557925ee1d31a917d071e2a6"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class CameraConfigurationResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String configuration_str;

    public CameraConfigurationResponse() {
        this.configuration_str = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_configuration_str = this.configuration_str.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_configuration_str >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_configuration_str >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_configuration_str >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_configuration_str >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_configuration_str; k++) {
            outbuffer[offset + k] = (byte)((this.configuration_str.getBytes())[k] & 0xFF);
        }
        offset += length_configuration_str;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_configuration_str = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_configuration_str |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_configuration_str |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_configuration_str |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_configuration_str = new byte[length_configuration_str];
        for(int k= 0; k< length_configuration_str; k++){
            bytes_configuration_str[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.configuration_str = new java.lang.String(bytes_configuration_str);
        offset += length_configuration_str;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_configuration_str = this.configuration_str.getBytes().length;
        length += 4;
        length += length_configuration_str;
        return length;
    }

    public java.lang.String getType() { return CAMERACONFIGURATION; }
    public java.lang.String getMD5(){ return "400dcbea991e5cafc404dbc95076e623"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
