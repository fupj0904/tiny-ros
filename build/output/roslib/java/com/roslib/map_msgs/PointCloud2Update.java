package com.roslib.map_msgs;

import java.lang.*;

public class PointCloud2Update implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long type;
    public com.roslib.sensor_msgs.PointCloud2 points;
    public static final long ADD = (long)(0);
    public static final long DELETE = (long)(1);

    public PointCloud2Update() {
        this.header = new com.roslib.std_msgs.Header();
        this.type = 0;
        this.points = new com.roslib.sensor_msgs.PointCloud2();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.type >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.points.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.type   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.type |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.type |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.type |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.points.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += this.points.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "map_msgs/PointCloud2Update"; }
    public java.lang.String getMD5(){ return "e79dfbefd7336861352e1bc7148491c4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
