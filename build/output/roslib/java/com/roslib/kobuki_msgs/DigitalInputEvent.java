package com.roslib.kobuki_msgs;

import java.lang.*;

public class DigitalInputEvent implements com.roslib.ros.Msg {
    public boolean[] values;

    public DigitalInputEvent() {
        this.values = new boolean[4];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        for (int i = 0; i < 4; i++){
        outbuffer[offset] = (byte)((values[i] ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        for(int i = 0; i < 4; i++){
        this.values[i] = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        for (int i = 0; i < 4; i++){
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/DigitalInputEvent"; }
    public java.lang.String getMD5(){ return "bcce3ae3a835d3fda97c7d776a01a5ea"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
