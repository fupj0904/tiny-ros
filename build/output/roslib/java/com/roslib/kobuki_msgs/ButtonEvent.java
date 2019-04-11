package com.roslib.kobuki_msgs;

import java.lang.*;

public class ButtonEvent implements com.roslib.ros.Msg {
    public int button;
    public int state;
    public static final int Button0 = (int)( 0);
    public static final int Button1 = (int)( 1);
    public static final int Button2 = (int)( 2);
    public static final int RELEASED = (int)( 0);
    public static final int PRESSED = (int)( 1);

    public ButtonEvent() {
        this.button = 0;
        this.state = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.button >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.button   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
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

    public java.lang.String getType(){ return "kobuki_msgs/ButtonEvent"; }
    public java.lang.String getMD5(){ return "5405980aa889259840612fd265d43413"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
