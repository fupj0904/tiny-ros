package com.roslib.geographic_msgs;

import java.lang.*;

public class GeoPointStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geographic_msgs.GeoPoint position;

    public GeoPointStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.position = new com.roslib.geographic_msgs.GeoPoint();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.position.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.position.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.position.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/GeoPointStamped"; }
    public java.lang.String getMD5(){ return "dadb5b34df82af9cc7e9649bdd3220d5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
