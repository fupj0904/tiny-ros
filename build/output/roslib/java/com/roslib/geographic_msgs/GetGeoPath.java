package com.roslib.geographic_msgs;

import java.lang.*;

public class GetGeoPath {

public static final java.lang.String GETGEOPATH = "geographic_msgs/GetGeoPath";

public class GetGeoPathRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.geographic_msgs.GeoPoint start;
    public com.roslib.geographic_msgs.GeoPoint goal;

    public GetGeoPathRequest() {
        this.start = new com.roslib.geographic_msgs.GeoPoint();
        this.goal = new com.roslib.geographic_msgs.GeoPoint();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.start.serialize(outbuffer, offset);
        offset = this.goal.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.start.deserialize(inbuffer, offset);
        offset = this.goal.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.start.serializedLength();
        length += this.goal.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETGEOPATH; }
    public java.lang.String getMD5(){ return "1df91d11b26b696e504b2f7999a14edc"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetGeoPathResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status;
    public com.roslib.geographic_msgs.GeoPath plan;

    public GetGeoPathResponse() {
        this.success = false;
        this.status = "";
        this.plan = new com.roslib.geographic_msgs.GeoPath();
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
        int length_status = this.status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status; k++) {
            outbuffer[offset + k] = (byte)((this.status.getBytes())[k] & 0xFF);
        }
        offset += length_status;
        offset = this.plan.serialize(outbuffer, offset);
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
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status = new byte[length_status];
        for(int k= 0; k< length_status; k++){
            bytes_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status = new java.lang.String(bytes_status);
        offset += length_status;
        offset = this.plan.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status = this.status.getBytes().length;
        length += 4;
        length += length_status;
        length += this.plan.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETGEOPATH; }
    public java.lang.String getMD5(){ return "42e1f0c713192edb82c130417d2d60ef"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
