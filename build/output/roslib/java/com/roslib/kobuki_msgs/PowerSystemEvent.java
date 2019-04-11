package com.roslib.kobuki_msgs;

import java.lang.*;

public class PowerSystemEvent implements com.roslib.ros.Msg {
    public int event;
    public static final int UNPLUGGED = (int)( 0);
    public static final int PLUGGED_TO_ADAPTER = (int)( 1);
    public static final int PLUGGED_TO_DOCKBASE = (int)( 2);
    public static final int CHARGE_COMPLETED = (int)( 3);
    public static final int BATTERY_LOW = (int)( 4);
    public static final int BATTERY_CRITICAL = (int)( 5);

    public PowerSystemEvent() {
        this.event = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.event >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.event   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/PowerSystemEvent"; }
    public java.lang.String getMD5(){ return "9cb4b9f509fbcaef2884086f7e6d121d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
