package com.roslib.kobuki_msgs;

import java.lang.*;

public class RobotStateEvent implements com.roslib.ros.Msg {
    public int state;
    public static final int ONLINE = (int)( 1);
    public static final int OFFLINE = (int)( 0);

    public RobotStateEvent() {
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

    public java.lang.String getType(){ return "kobuki_msgs/RobotStateEvent"; }
    public java.lang.String getMD5(){ return "66e902a3df74a79bd235312e1597a411"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
