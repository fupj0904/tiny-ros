package com.roslib.zeroconf_msgs;

import java.lang.*;

public class Protocols implements com.roslib.ros.Msg {
    public static final byte UNSPECIFIED = (byte)( 0);
    public static final byte IPV4 = (byte)( 1);
    public static final byte IPV6 = (byte)( 2);

    public Protocols() {
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

    public java.lang.String getType(){ return "zeroconf_msgs/Protocols"; }
    public java.lang.String getMD5(){ return "52d57f3583983a923c69b61a3f4aa84a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
