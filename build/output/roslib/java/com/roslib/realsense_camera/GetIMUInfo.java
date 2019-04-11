package com.roslib.realsense_camera;

import java.lang.*;

public class GetIMUInfo {

public static final java.lang.String GETIMUINFO = "realsense_camera/GetIMUInfo";

public class GetIMUInfoRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetIMUInfoRequest() {
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

    public java.lang.String getType() { return GETIMUINFO; }
    public java.lang.String getMD5(){ return "7537daaa8c5d70fd63c63d2b41bb575e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetIMUInfoResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.realsense_camera.IMUInfo accel;
    public com.roslib.realsense_camera.IMUInfo gyro;

    public GetIMUInfoResponse() {
        this.accel = new com.roslib.realsense_camera.IMUInfo();
        this.gyro = new com.roslib.realsense_camera.IMUInfo();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.accel.serialize(outbuffer, offset);
        offset = this.gyro.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.accel.deserialize(inbuffer, offset);
        offset = this.gyro.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.accel.serializedLength();
        length += this.gyro.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETIMUINFO; }
    public java.lang.String getMD5(){ return "670a08d21d3e09a183da069621276c4c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
