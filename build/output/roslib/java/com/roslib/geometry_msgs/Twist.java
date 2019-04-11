package com.roslib.geometry_msgs;

import java.lang.*;

public class Twist implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Vector3 linear;
    public com.roslib.geometry_msgs.Vector3 angular;

    public Twist() {
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

    public java.lang.String getType(){ return "geometry_msgs/Twist"; }
    public java.lang.String getMD5(){ return "29e7e4839b73f684ad08b19dc12c9c70"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
