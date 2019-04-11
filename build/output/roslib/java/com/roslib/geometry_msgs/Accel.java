package com.roslib.geometry_msgs;

import java.lang.*;

public class Accel implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Vector3 linear;
    public com.roslib.geometry_msgs.Vector3 angular;

    public Accel() {
        this.linear = new com.roslib.geometry_msgs.Vector3();
        this.angular = new com.roslib.geometry_msgs.Vector3();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.linear.serialize(outbuffer, offset);
        offset = this.angular.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.linear.deserialize(inbuffer, offset);
        offset = this.angular.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.linear.serializedLength();
        length += this.angular.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Accel"; }
    public java.lang.String getMD5(){ return "580cbad5f3bd2e9f0ca71e14b7ab1b0f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
