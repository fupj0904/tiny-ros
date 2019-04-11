package com.roslib.gazebo_msgs;

import java.lang.*;

public class SetLinkProperties {

public static final java.lang.String SETLINKPROPERTIES = "gazebo_msgs/SetLinkProperties";

public class SetLinkPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String link_name;
    public com.roslib.geometry_msgs.Pose com;
    public boolean gravity_mode;
    public double mass;
    public double ixx;
    public double ixy;
    public double ixz;
    public double iyy;
    public double iyz;
    public double izz;

    public SetLinkPropertiesRequest() {
        this.link_name = "";
        this.com = new com.roslib.geometry_msgs.Pose();
        this.gravity_mode = false;
        this.mass = 0;
        this.ixx = 0;
        this.ixy = 0;
        this.ixz = 0;
        this.iyy = 0;
        this.iyz = 0;
        this.izz = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_link_name = this.link_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_link_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_link_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_link_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_link_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_link_name; k++) {
            outbuffer[offset + k] = (byte)((this.link_name.getBytes())[k] & 0xFF);
        }
        offset += length_link_name;
        offset = this.com.serialize(outbuffer, offset);
        outbuffer[offset] = (byte)((gravity_mode ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        long bits_mass = Double.doubleToRawLongBits(this.mass);
        outbuffer[offset + 0] = (byte)((bits_mass >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_mass >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_mass >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_mass >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_mass >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_mass >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_mass >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_mass >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_ixx = Double.doubleToRawLongBits(this.ixx);
        outbuffer[offset + 0] = (byte)((bits_ixx >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ixx >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ixx >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ixx >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_ixx >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_ixx >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_ixx >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_ixx >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_ixy = Double.doubleToRawLongBits(this.ixy);
        outbuffer[offset + 0] = (byte)((bits_ixy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ixy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ixy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ixy >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_ixy >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_ixy >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_ixy >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_ixy >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_ixz = Double.doubleToRawLongBits(this.ixz);
        outbuffer[offset + 0] = (byte)((bits_ixz >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ixz >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ixz >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ixz >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_ixz >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_ixz >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_ixz >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_ixz >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_iyy = Double.doubleToRawLongBits(this.iyy);
        outbuffer[offset + 0] = (byte)((bits_iyy >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_iyy >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_iyy >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_iyy >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_iyy >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_iyy >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_iyy >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_iyy >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_iyz = Double.doubleToRawLongBits(this.iyz);
        outbuffer[offset + 0] = (byte)((bits_iyz >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_iyz >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_iyz >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_iyz >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_iyz >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_iyz >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_iyz >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_iyz >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_izz = Double.doubleToRawLongBits(this.izz);
        outbuffer[offset + 0] = (byte)((bits_izz >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_izz >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_izz >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_izz >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_izz >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_izz >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_izz >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_izz >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_link_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_link_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_link_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_link_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_link_name = new byte[length_link_name];
        for(int k= 0; k< length_link_name; k++){
            bytes_link_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.link_name = new java.lang.String(bytes_link_name);
        offset += length_link_name;
        offset = this.com.deserialize(inbuffer, offset);
        this.gravity_mode = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        long bits_mass = 0;
        bits_mass |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_mass |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_mass |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_mass |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_mass |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_mass |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_mass |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_mass |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.mass = Double.longBitsToDouble(bits_mass);
        offset += 8;
        long bits_ixx = 0;
        bits_ixx |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ixx |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ixx |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ixx |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_ixx |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_ixx |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_ixx |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_ixx |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.ixx = Double.longBitsToDouble(bits_ixx);
        offset += 8;
        long bits_ixy = 0;
        bits_ixy |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ixy |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ixy |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ixy |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_ixy |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_ixy |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_ixy |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_ixy |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.ixy = Double.longBitsToDouble(bits_ixy);
        offset += 8;
        long bits_ixz = 0;
        bits_ixz |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ixz |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ixz |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ixz |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_ixz |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_ixz |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_ixz |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_ixz |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.ixz = Double.longBitsToDouble(bits_ixz);
        offset += 8;
        long bits_iyy = 0;
        bits_iyy |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_iyy |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_iyy |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_iyy |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_iyy |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_iyy |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_iyy |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_iyy |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.iyy = Double.longBitsToDouble(bits_iyy);
        offset += 8;
        long bits_iyz = 0;
        bits_iyz |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_iyz |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_iyz |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_iyz |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_iyz |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_iyz |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_iyz |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_iyz |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.iyz = Double.longBitsToDouble(bits_iyz);
        offset += 8;
        long bits_izz = 0;
        bits_izz |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_izz |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_izz |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_izz |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_izz |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_izz |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_izz |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_izz |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.izz = Double.longBitsToDouble(bits_izz);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_link_name = this.link_name.getBytes().length;
        length += 4;
        length += length_link_name;
        length += this.com.serializedLength();
        length += 1;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType() { return SETLINKPROPERTIES; }
    public java.lang.String getMD5(){ return "03d7e308476601832a9e1ce9d7eab722"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetLinkPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public SetLinkPropertiesResponse() {
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

    public java.lang.String getType() { return SETLINKPROPERTIES; }
    public java.lang.String getMD5(){ return "777dea05607e1bca37e3206f97801d89"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
