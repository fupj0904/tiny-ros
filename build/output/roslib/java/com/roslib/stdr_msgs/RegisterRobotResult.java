package com.roslib.stdr_msgs;

import java.lang.*;

public class RegisterRobotResult implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.RobotMsg description;

    public RegisterRobotResult() {
        this.description = new com.roslib.stdr_msgs.RobotMsg();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.description.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.description.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.description.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RegisterRobotResult"; }
    public java.lang.String getMD5(){ return "712ebcaa8d452edbedd1d899868c58f8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
