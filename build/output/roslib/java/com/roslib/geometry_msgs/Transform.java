package com.roslib.geometry_msgs;

import java.lang.*;

public class Transform implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Vector3 translation;
    public com.roslib.geometry_msgs.Quaternion rotation;

    public Transform() {
        this.translation = new com.roslib.geometry_msgs.Vector3();
        this.rotation = new com.roslib.geometry_msgs.Quaternion();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.translation.serialize(outbuffer, offset);
        offset = this.rotation.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.translation.deserialize(inbuffer, offset);
        offset = this.rotation.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.translation.serializedLength();
        length += this.rotation.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Transform"; }
    public java.lang.String getMD5(){ return "2526ee1b1cc2e723e386c3c1b048ba72"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
