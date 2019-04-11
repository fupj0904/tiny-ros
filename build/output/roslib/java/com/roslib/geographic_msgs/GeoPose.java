package com.roslib.geographic_msgs;

import java.lang.*;

public class GeoPose implements com.roslib.ros.Msg {
    public com.roslib.geographic_msgs.GeoPoint position;
    public com.roslib.geometry_msgs.Quaternion orientation;

    public GeoPose() {
        this.position = new com.roslib.geographic_msgs.GeoPoint();
        this.orientation = new com.roslib.geometry_msgs.Quaternion();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.position.serialize(outbuffer, offset);
        offset = this.orientation.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.position.deserialize(inbuffer, offset);
        offset = this.orientation.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.position.serializedLength();
        length += this.orientation.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/GeoPose"; }
    public java.lang.String getMD5(){ return "c4faca1a2d887f6b05e3857eb0b5bce0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
