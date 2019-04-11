package com.roslib.geometry_msgs;

import java.lang.*;

public class Pose implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Point position;
    public com.roslib.geometry_msgs.Quaternion orientation;

    public Pose() {
        this.position = new com.roslib.geometry_msgs.Point();
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

    public java.lang.String getType(){ return "geometry_msgs/Pose"; }
    public java.lang.String getMD5(){ return "0b42fb88be8cac0efa6e446e13befcae"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
