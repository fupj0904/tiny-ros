package com.roslib.geometry_msgs;

import java.lang.*;

public class Inertia implements com.roslib.ros.Msg {
    public double m;
    public com.roslib.geometry_msgs.Vector3 com;
    public double ixx;
    public double ixy;
    public double ixz;
    public double iyy;
    public double iyz;
    public double izz;

    public Inertia() {
        this.m = 0;
        this.com = new com.roslib.geometry_msgs.Vector3();
        this.ixx = 0;
        this.ixy = 0;
        this.ixz = 0;
        this.iyy = 0;
        this.iyz = 0;
        this.izz = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_m = Double.doubleToRawLongBits(this.m);
        outbuffer[offset + 0] = (byte)((bits_m >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_m >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_m >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_m >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_m >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_m >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_m >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_m >> (8 * 7)) & 0xFF);
        offset += 8;
        offset = this.com.serialize(outbuffer, offset);
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
        long bits_m = 0;
        bits_m |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_m |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_m |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_m |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_m |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_m |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_m |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_m |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.m = Double.longBitsToDouble(bits_m);
        offset += 8;
        offset = this.com.deserialize(inbuffer, offset);
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
        length += 8;
        length += this.com.serializedLength();
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Inertia"; }
    public java.lang.String getMD5(){ return "9116c935782bc29999dad1927624dff0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
