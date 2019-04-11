package com.roslib.geometry_msgs;

import java.lang.*;

public class Wrench implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Vector3 force;
    public com.roslib.geometry_msgs.Vector3 torque;

    public Wrench() {
        this.force = new com.roslib.geometry_msgs.Vector3();
        this.torque = new com.roslib.geometry_msgs.Vector3();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.force.serialize(outbuffer, offset);
        offset = this.torque.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.force.deserialize(inbuffer, offset);
        offset = this.torque.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.force.serializedLength();
        length += this.torque.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Wrench"; }
    public java.lang.String getMD5(){ return "02d01d4a8dc253c7b42d4c9866201aee"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
