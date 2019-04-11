package com.roslib.geometry_msgs;

import java.lang.*;

public class QuaternionStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Quaternion quaternion;

    public QuaternionStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.quaternion = new com.roslib.geometry_msgs.Quaternion();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.quaternion.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.quaternion.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.quaternion.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/QuaternionStamped"; }
    public java.lang.String getMD5(){ return "69e39922feb9ec6eaf93755f93fce2cf"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
