package com.roslib.geometry_msgs;

import java.lang.*;

public class Vector3Stamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Vector3 vector;

    public Vector3Stamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.vector = new com.roslib.geometry_msgs.Vector3();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.vector.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.vector.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.vector.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/Vector3Stamped"; }
    public java.lang.String getMD5(){ return "4b85025eb6f70f6b1e0cefbb75f69ac2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
