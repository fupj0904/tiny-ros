package com.roslib.map_msgs;

import java.lang.*;

public class GetPointMapROI {

public static final java.lang.String GETPOINTMAPROI = "map_msgs/GetPointMapROI";

public class GetPointMapROIRequest implements com.roslib.ros.Msg {
    private long __id__;
    public double x;
    public double y;
    public double z;
    public double r;
    public double l_x;
    public double l_y;
    public double l_z;

    public GetPointMapROIRequest() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.r = 0;
        this.l_x = 0;
        this.l_y = 0;
        this.l_z = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        long bits_x = Double.doubleToRawLongBits(this.x);
        outbuffer[offset + 0] = (byte)((bits_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_x >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_x >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_x >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_x >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_x >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_y = Double.doubleToRawLongBits(this.y);
        outbuffer[offset + 0] = (byte)((bits_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_y >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_y >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_y >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_y >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_y >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_z = Double.doubleToRawLongBits(this.z);
        outbuffer[offset + 0] = (byte)((bits_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_z >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_r = Double.doubleToRawLongBits(this.r);
        outbuffer[offset + 0] = (byte)((bits_r >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_r >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_r >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_r >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_r >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_r >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_r >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_r >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_l_x = Double.doubleToRawLongBits(this.l_x);
        outbuffer[offset + 0] = (byte)((bits_l_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_l_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_l_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_l_x >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_l_x >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_l_x >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_l_x >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_l_x >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_l_y = Double.doubleToRawLongBits(this.l_y);
        outbuffer[offset + 0] = (byte)((bits_l_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_l_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_l_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_l_y >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_l_y >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_l_y >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_l_y >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_l_y >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_l_z = Double.doubleToRawLongBits(this.l_z);
        outbuffer[offset + 0] = (byte)((bits_l_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_l_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_l_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_l_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_l_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_l_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_l_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_l_z >> (8 * 7)) & 0xFF);
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
        long bits_x = 0;
        bits_x |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_x |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_x |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_x |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_x |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.x = Double.longBitsToDouble(bits_x);
        offset += 8;
        long bits_y = 0;
        bits_y |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_y |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_y |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_y |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_y |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.y = Double.longBitsToDouble(bits_y);
        offset += 8;
        long bits_z = 0;
        bits_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.z = Double.longBitsToDouble(bits_z);
        offset += 8;
        long bits_r = 0;
        bits_r |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_r |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_r |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_r |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_r |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_r |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_r |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_r |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.r = Double.longBitsToDouble(bits_r);
        offset += 8;
        long bits_l_x = 0;
        bits_l_x |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_l_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_l_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_l_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_l_x |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_l_x |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_l_x |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_l_x |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.l_x = Double.longBitsToDouble(bits_l_x);
        offset += 8;
        long bits_l_y = 0;
        bits_l_y |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_l_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_l_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_l_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_l_y |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_l_y |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_l_y |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_l_y |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.l_y = Double.longBitsToDouble(bits_l_y);
        offset += 8;
        long bits_l_z = 0;
        bits_l_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_l_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_l_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_l_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_l_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_l_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_l_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_l_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.l_z = Double.longBitsToDouble(bits_l_z);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType() { return GETPOINTMAPROI; }
    public java.lang.String getMD5(){ return "c338f5616930e00a72c38486f77e9810"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetPointMapROIResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.sensor_msgs.PointCloud2 sub_map;

    public GetPointMapROIResponse() {
        this.sub_map = new com.roslib.sensor_msgs.PointCloud2();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.sub_map.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.sub_map.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.sub_map.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETPOINTMAPROI; }
    public java.lang.String getMD5(){ return "de10fb68f23987142a0ffbdb59b6e079"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
