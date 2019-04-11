package com.roslib.geometry_msgs;

import java.lang.*;

public class PointStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Point point;

    public PointStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.point = new com.roslib.geometry_msgs.Point();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.point.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.point.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.point.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/PointStamped"; }
    public java.lang.String getMD5(){ return "d34e83bdbef7bf4b617a6293aab8390e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
