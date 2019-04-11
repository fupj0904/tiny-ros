package com.roslib.kobuki_msgs;

import java.lang.*;

public class VersionInfo implements com.roslib.ros.Msg {
    public java.lang.String hardware;
    public java.lang.String firmware;
    public java.lang.String software;
    public long[] udid;
    public long features;
    public static final long SMOOTH_MOVE_START = (long)( 0000000000000001);
    public static final long GYROSCOPE_3D_DATA = (long)( 0000000000000002);

    public VersionInfo() {
        this.hardware = "";
        this.firmware = "";
        this.software = "";
        this.udid = null;
        this.features = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_hardware = this.hardware.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hardware >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hardware >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hardware >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hardware >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hardware; k++) {
            outbuffer[offset + k] = (byte)((this.hardware.getBytes())[k] & 0xFF);
        }
        offset += length_hardware;
        int length_firmware = this.firmware.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_firmware >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_firmware >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_firmware >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_firmware >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_firmware; k++) {
            outbuffer[offset + k] = (byte)((this.firmware.getBytes())[k] & 0xFF);
        }
        offset += length_firmware;
        int length_software = this.software.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_software >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_software >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_software >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_software >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_software; k++) {
            outbuffer[offset + k] = (byte)((this.software.getBytes())[k] & 0xFF);
        }
        offset += length_software;
        int length_udid = this.udid != null ? this.udid.length : 0;
        outbuffer[offset + 0] = (byte)((length_udid >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_udid >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_udid >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_udid >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_udid; i++){
        outbuffer[offset + 0] = (byte)((this.udid[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.udid[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.udid[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.udid[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        outbuffer[offset + 0] = (byte)((this.features >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.features >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.features >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.features >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.features >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.features >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.features >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.features >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_hardware = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hardware |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hardware |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hardware |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hardware = new byte[length_hardware];
        for(int k= 0; k< length_hardware; k++){
            bytes_hardware[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hardware = new java.lang.String(bytes_hardware);
        offset += length_hardware;
        int length_firmware = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_firmware |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_firmware |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_firmware |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_firmware = new byte[length_firmware];
        for(int k= 0; k< length_firmware; k++){
            bytes_firmware[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.firmware = new java.lang.String(bytes_firmware);
        offset += length_firmware;
        int length_software = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_software |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_software |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_software |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_software = new byte[length_software];
        for(int k= 0; k< length_software; k++){
            bytes_software[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.software = new java.lang.String(bytes_software);
        offset += length_software;
        int length_udid = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_udid |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_udid |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_udid |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_udid > 0) {
            this.udid = new long[length_udid];
        }
        for (int i = 0; i < length_udid; i++){
        this.udid[i]   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.udid[i] |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.udid[i] |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.udid[i] |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        this.features   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.features |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.features |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.features |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.features |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.features |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.features |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.features |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_hardware = this.hardware.getBytes().length;
        length += 4;
        length += length_hardware;
        int length_firmware = this.firmware.getBytes().length;
        length += 4;
        length += length_firmware;
        int length_software = this.software.getBytes().length;
        length += 4;
        length += length_software;
        length += 4;
        int length_udid = this.udid != null ? this.udid.length : 0;
        for (int i = 0; i < length_udid; i++) {
        length += 4;
        }
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/VersionInfo"; }
    public java.lang.String getMD5(){ return "b9b24437c2dd0ce7c650423f9e01437f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
