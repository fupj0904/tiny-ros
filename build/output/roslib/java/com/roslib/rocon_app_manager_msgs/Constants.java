package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class Constants implements com.roslib.ros.Msg {
    public static final java.lang.String NO_REMOTE_CONNECTION = (java.lang.String)("none");
    public static final java.lang.String NO_REMOTE_CONTROLLER = (java.lang.String)("none");

    public Constants() {
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

    public java.lang.String getType(){ return "rocon_app_manager_msgs/Constants"; }
    public java.lang.String getMD5(){ return "23af0ebf5f5146e798c1f47e598432a5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
