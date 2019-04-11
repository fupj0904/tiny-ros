package com.roslib.kobuki_msgs;

import java.lang.*;

public class WheelDropEvent implements com.roslib.ros.Msg {
    public int wheel;
    public int state;
    public static final int LEFT = (int)( 0);
    public static final int RIGHT = (int)( 1);
    public static final int RAISED = (int)( 0);
    public static final int DROPPED = (int)( 1);

    public WheelDropEvent() {
        this.wheel = 0;
        this.state = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.wheel >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.wheel   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/WheelDropEvent"; }
    public java.lang.String getMD5(){ return "b7ad48a8acba2e25bec947c0541b772a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
