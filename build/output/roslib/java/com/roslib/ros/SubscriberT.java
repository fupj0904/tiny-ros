package com.roslib.ros;

public abstract class SubscriberT {
    public void callback(byte[] data) { }
    public int getEndpointType() { return 0; }

    public java.lang.String getMsgType() { return ""; }
    public java.lang.String getMsgMD5() { return ""; }

    public java.lang.String topic_ = "";

    // id_ is set by NodeHandle when we advertise
    public int id_ = -1;

    // negotiated_ is set by NodeHandle when we negotiateTopics
    public boolean negotiated_ = false;
    public boolean negotiated() { return negotiated_; }
}
