package com.roslib.geometry_msgs;

import java.lang.*;

public class TwistStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Twist twist;

    public TwistStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.twist = new com.roslib.geometry_msgs.Twist();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.twist.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.twist.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.twist.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/TwistStamped"; }
    public java.lang.String getMD5(){ return "2e3e0a57a69306091cb5c65e92d048e1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
