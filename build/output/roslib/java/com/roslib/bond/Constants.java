package com.roslib.bond;

import java.lang.*;

public class Constants implements com.roslib.ros.Msg {
    public static final float DEAD_PUBLISH_PERIOD = (float)( 0.05);
    public static final float DEFAULT_CONNECT_TIMEOUT = (float)( 10.0);
    public static final float DEFAULT_HEARTBEAT_TIMEOUT = (float)( 4.0);
    public static final float DEFAULT_DISCONNECT_TIMEOUT = (float)( 2.0);
    public static final float DEFAULT_HEARTBEAT_PERIOD = (float)( 1.0);
    public static final java.lang.String DISABLE_HEARTBEAT_TIMEOUT_PARAM = (java.lang.String)("/bond_disable_heartbeat_timeout");

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

    public java.lang.String getType(){ return "bond/Constants"; }
    public java.lang.String getMD5(){ return "91c985726216167511e32115d0b8711e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
