package com.roslib.geometry_msgs;

import java.lang.*;

public class PoseWithCovarianceStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.PoseWithCovariance pose;

    public PoseWithCovarianceStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.pose = new com.roslib.geometry_msgs.PoseWithCovariance();
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

    public java.lang.String getType(){ return "geometry_msgs/PoseWithCovarianceStamped"; }
    public java.lang.String getMD5(){ return "14ff1431078f35103bf1b202333b4704"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
