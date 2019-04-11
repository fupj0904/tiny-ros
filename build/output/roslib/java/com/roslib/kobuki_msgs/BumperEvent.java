package com.roslib.kobuki_msgs;

import java.lang.*;

public class BumperEvent implements com.roslib.ros.Msg {
    public int bumper;
    public int state;
    public static final int LEFT = (int)( 0);
    public static final int CENTER = (int)( 1);
    public static final int RIGHT = (int)( 2);
    public static final int RELEASED = (int)( 0);
    public static final int PRESSED = (int)( 1);

    public BumperEvent() {
        this.bumper = 0;
        this.state = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.bumper >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.bumper   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
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

    public java.lang.String getType(){ return "kobuki_msgs/BumperEvent"; }
    public java.lang.String getMD5(){ return "de83a6df6aac6b712e97d5eb5fc77d0f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
