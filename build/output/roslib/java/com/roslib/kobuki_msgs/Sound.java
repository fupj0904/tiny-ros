package com.roslib.kobuki_msgs;

import java.lang.*;

public class Sound implements com.roslib.ros.Msg {
    public int value;
    public static final int ON = (int)( 0);
    public static final int OFF = (int)( 1);
    public static final int RECHARGE = (int)( 2);
    public static final int BUTTON = (int)( 3);
    public static final int ERROR = (int)( 4);
    public static final int CLEANINGSTART = (int)( 5);
    public static final int CLEANINGEND = (int)( 6);

    public Sound() {
        this.value = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.value >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.value   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/Sound"; }
    public java.lang.String getMD5(){ return "86651666c3b1d71b7eadff2245713094"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
