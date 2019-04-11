package com.roslib.tf2_msgs;

import java.lang.*;

public class LookupTransformResult implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.TransformStamped transform;
    public com.roslib.tf2_msgs.TF2Error error;

    public LookupTransformResult() {
        this.transform = new com.roslib.geometry_msgs.TransformStamped();
        this.error = new com.roslib.tf2_msgs.TF2Error();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.transform.serialize(outbuffer, offset);
        offset = this.error.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.transform.deserialize(inbuffer, offset);
        offset = this.error.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.transform.serializedLength();
        length += this.error.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "tf2_msgs/LookupTransformResult"; }
    public java.lang.String getMD5(){ return "7be4fc6719f512bc94491db1ccda6aee"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
