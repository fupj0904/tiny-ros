package com.roslib.geographic_msgs;

import java.lang.*;

public class BoundingBox implements com.roslib.ros.Msg {
    public com.roslib.geographic_msgs.GeoPoint min_pt;
    public com.roslib.geographic_msgs.GeoPoint max_pt;

    public BoundingBox() {
        this.min_pt = new com.roslib.geographic_msgs.GeoPoint();
        this.max_pt = new com.roslib.geographic_msgs.GeoPoint();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.min_pt.serialize(outbuffer, offset);
        offset = this.max_pt.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.min_pt.deserialize(inbuffer, offset);
        offset = this.max_pt.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.min_pt.serializedLength();
        length += this.max_pt.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/BoundingBox"; }
    public java.lang.String getMD5(){ return "4c3f7b915ad45a82f007038781685d3b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
