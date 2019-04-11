package com.roslib.pcl_msgs;

import java.lang.*;

public class PolygonMesh implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.sensor_msgs.PointCloud2 cloud;
    public com.roslib.pcl_msgs.Vertices[] polygons;

    public PolygonMesh() {
        this.header = new com.roslib.std_msgs.Header();
        this.cloud = new com.roslib.sensor_msgs.PointCloud2();
        this.polygons = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.cloud.serialize(outbuffer, offset);
        int length_polygons = this.polygons != null ? this.polygons.length : 0;
        outbuffer[offset + 0] = (byte)((length_polygons >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_polygons >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_polygons >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_polygons >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_polygons; i++){
        offset = this.polygons[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.cloud.deserialize(inbuffer, offset);
        int length_polygons = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_polygons |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_polygons |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_polygons |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_polygons > 0) {
            this.polygons = new com.roslib.pcl_msgs.Vertices[length_polygons];
        }
        for (int i = 0; i < length_polygons; i++){
        offset = this.polygons[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.cloud.serializedLength();
        length += 4;
        int length_polygons = this.polygons != null ? this.polygons.length : 0;
        for (int i = 0; i < length_polygons; i++) {
        length += this.polygons[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "pcl_msgs/PolygonMesh"; }
    public java.lang.String getMD5(){ return "accd6c9f12d71e0f7952f5c272546153"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
