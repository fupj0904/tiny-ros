package com.roslib.kobuki_msgs;

import java.lang.*;

public class CliffEvent implements com.roslib.ros.Msg {
    public int sensor;
    public int state;
    public int bottom;
    public static final int LEFT = (int)( 0);
    public static final int CENTER = (int)( 1);
    public static final int RIGHT = (int)( 2);
    public static final int FLOOR = (int)( 0);
    public static final int CLIFF = (int)( 1);

    public CliffEvent() {
        this.sensor = 0;
        this.state = 0;
        this.bottom = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.sensor >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.bottom >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.bottom >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.sensor   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.bottom   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.bottom |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 1;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/CliffEvent"; }
    public java.lang.String getMD5(){ return "41e86efa26147130bc5a3999d1f5b8eb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
