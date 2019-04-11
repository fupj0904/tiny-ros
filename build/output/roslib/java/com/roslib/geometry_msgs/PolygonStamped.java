package com.roslib.geometry_msgs;

import java.lang.*;

public class PolygonStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Polygon polygon;

    public PolygonStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.polygon = new com.roslib.geometry_msgs.Polygon();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.polygon.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.polygon.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.polygon.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/PolygonStamped"; }
    public java.lang.String getMD5(){ return "33bdf94066425e572879b25c9a51ed50"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
