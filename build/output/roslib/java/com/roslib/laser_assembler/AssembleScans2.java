package com.roslib.laser_assembler;

import java.lang.*;

public class AssembleScans2 {

public static final java.lang.String ASSEMBLESCANS2 = "laser_assembler/AssembleScans2";

public class AssembleScans2Request implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.ros.Time begin;
    public com.roslib.ros.Time end;

    public AssembleScans2Request() {
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

    public java.lang.String getType() { return ASSEMBLESCANS2; }
    public java.lang.String getMD5(){ return "28f746e96e92cbc096c4a0f9ae6548ce"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AssembleScans2Response implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.sensor_msgs.PointCloud2 cloud;

    public AssembleScans2Response() {
        this.cloud = new com.roslib.sensor_msgs.PointCloud2();
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

    public java.lang.String getType() { return ASSEMBLESCANS2; }
    public java.lang.String getMD5(){ return "52e2dc00495ee4e90aa6eb79646eec3b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
