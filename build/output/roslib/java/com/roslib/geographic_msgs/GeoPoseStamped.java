package com.roslib.geographic_msgs;

import java.lang.*;

public class GeoPoseStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geographic_msgs.GeoPose pose;

    public GeoPoseStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.pose = new com.roslib.geographic_msgs.GeoPose();
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

    public java.lang.String getType(){ return "geographic_msgs/GeoPoseStamped"; }
    public java.lang.String getMD5(){ return "70653ffa126d889281678d1a5f5a3079"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
