package com.roslib.gateway_msgs;

import java.lang.*;

public class ConnectionType implements com.roslib.ros.Msg {
    public static final java.lang.String PUBLISHER = (java.lang.String)(" publisher");
    public static final java.lang.String SUBSCRIBER = (java.lang.String)(" subscriber");
    public static final java.lang.String SERVICE = (java.lang.String)(" service");
    public static final java.lang.String ACTION_CLIENT = (java.lang.String)(" action_client");
    public static final java.lang.String ACTION_SERVER = (java.lang.String)(" action_server");
    public static final java.lang.String INVALID = (java.lang.String)(" invalid");

    public ConnectionType() {
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/ConnectionType"; }
    public java.lang.String getMD5(){ return "9697d475b1b978510705212920fbb97d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
