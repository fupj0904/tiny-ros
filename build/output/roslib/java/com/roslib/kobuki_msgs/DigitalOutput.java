package com.roslib.kobuki_msgs;

import java.lang.*;

public class DigitalOutput implements com.roslib.ros.Msg {
    public boolean[] values;
    public boolean[] mask;

    public DigitalOutput() {
        this.values = new boolean[4];
        this.mask = new boolean[4];
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        for (int i = 0; i < 4; i++){
        outbuffer[offset] = (byte)((values[i] ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        }
        for (int i = 0; i < 4; i++){
        outbuffer[offset] = (byte)((mask[i] ? 0x01 : 0x00) & 0xFF);
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
        for(int i = 0; i < 4; i++){
        this.mask[i] = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        for (int i = 0; i < 4; i++){
        length += 1;
        }
        for (int i = 0; i < 4; i++){
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/DigitalOutput"; }
    public java.lang.String getMD5(){ return "06302868f9c61f3d3a4570e5ee9e42a1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
