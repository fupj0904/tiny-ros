package com.roslib.geometry_msgs;

import java.lang.*;

public class AccelStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Accel accel;

    public AccelStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.accel = new com.roslib.geometry_msgs.Accel();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.accel.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.accel.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.accel.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/AccelStamped"; }
    public java.lang.String getMD5(){ return "fa35432963826361a1073b1df905a559"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
