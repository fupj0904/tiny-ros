package com.roslib.kobuki_msgs;

import java.lang.*;

public class ExternalPower implements com.roslib.ros.Msg {
    public int source;
    public int state;
    public static final int PWR_3_3V1A = (int)( 0 );
    public static final int PWR_5V1A = (int)( 1 );
    public static final int PWR_12V5A = (int)( 2 );
    public static final int PWR_12V1_5A = (int)( 3 );
    public static final int OFF = (int)( 0);
    public static final int ON = (int)( 1);

    public ExternalPower() {
        this.source = 0;
        this.state = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.source >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.state >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.source   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
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

    public java.lang.String getType(){ return "kobuki_msgs/ExternalPower"; }
    public java.lang.String getMD5(){ return "b3d5c34c2a1936aba98e66b5fef1868c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
