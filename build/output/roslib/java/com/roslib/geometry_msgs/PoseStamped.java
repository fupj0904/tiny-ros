package com.roslib.geometry_msgs;

import java.lang.*;

public class PoseStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Pose pose;

    public PoseStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.pose = new com.roslib.geometry_msgs.Pose();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/PoseStamped"; }
    public java.lang.String getMD5(){ return "c7084e6b27c3d6e62efd9bf6d2f6540f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
