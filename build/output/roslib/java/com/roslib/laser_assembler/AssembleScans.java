package com.roslib.laser_assembler;

import java.lang.*;

public class AssembleScans {

public static final java.lang.String ASSEMBLESCANS = "laser_assembler/AssembleScans";

public class AssembleScansRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.ros.Time begin;
    public com.roslib.ros.Time end;

    public AssembleScansRequest() {
        this.begin = new com.roslib.ros.Time();
        this.end = new com.roslib.ros.Time();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.begin.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.begin.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.begin.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.begin.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.begin.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.begin.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.begin.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.begin.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.end.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.end.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.end.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.end.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.end.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.end.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.end.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.end.nsec >> (8 * 3)) & 0xFF);
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
        this.begin.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.begin.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.begin.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.begin.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.begin.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.begin.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.begin.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.begin.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.end.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.end.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.end.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.end.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.end.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.end.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.end.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.end.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return ASSEMBLESCANS; }
    public java.lang.String getMD5(){ return "191273ccf43a9edb786a7993ff4d6a58"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AssembleScansResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.sensor_msgs.PointCloud cloud;

    public AssembleScansResponse() {
        this.cloud = new com.roslib.sensor_msgs.PointCloud();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.cloud.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.cloud.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.cloud.serializedLength();
        return length;
    }

    public java.lang.String getType() { return ASSEMBLESCANS; }
    public java.lang.String getMD5(){ return "8c15b011ee1551b6a6ae73c1b716d733"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
