package com.roslib.geometry_msgs;

import java.lang.*;

public class InertiaStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Inertia inertia;

    public InertiaStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.inertia = new com.roslib.geometry_msgs.Inertia();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.inertia.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.inertia.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.inertia.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/InertiaStamped"; }
    public java.lang.String getMD5(){ return "2b3c9b263c59f65da44508cd041d18a0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
