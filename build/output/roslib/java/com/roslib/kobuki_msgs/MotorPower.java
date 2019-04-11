package com.roslib.kobuki_msgs;

import java.lang.*;

public class MotorPower implements com.roslib.ros.Msg {
    public int state;
    public static final int OFF = (int)( 0);
    public static final int ON = (int)( 1);

    public MotorPower() {
        this.state = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/MotorPower"; }
    public java.lang.String getMD5(){ return "6d4cfc778ab3634e27ef970c894a60a0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
