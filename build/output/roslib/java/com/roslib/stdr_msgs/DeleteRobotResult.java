package com.roslib.stdr_msgs;

import java.lang.*;

public class DeleteRobotResult implements com.roslib.ros.Msg {
    public boolean success;

    public DeleteRobotResult() {
        this.success = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/DeleteRobotResult"; }
    public java.lang.String getMD5(){ return "d1a6379e75d0f8914656d3082f0e99a4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
