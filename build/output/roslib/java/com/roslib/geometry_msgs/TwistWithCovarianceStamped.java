package com.roslib.geometry_msgs;

import java.lang.*;

public class TwistWithCovarianceStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.TwistWithCovariance twist;

    public TwistWithCovarianceStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.twist = new com.roslib.geometry_msgs.TwistWithCovariance();
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

    public java.lang.String getType(){ return "geometry_msgs/TwistWithCovarianceStamped"; }
    public java.lang.String getMD5(){ return "2cbcab62cac39de1d1d01785b99ba778"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
