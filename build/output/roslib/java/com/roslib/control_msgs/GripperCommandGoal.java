package com.roslib.control_msgs;

import java.lang.*;

public class GripperCommandGoal implements com.roslib.ros.Msg {
    public com.roslib.control_msgs.GripperCommand command;

    public GripperCommandGoal() {
        this.command = new com.roslib.control_msgs.GripperCommand();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.command.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.command.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.command.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/GripperCommandGoal"; }
    public java.lang.String getMD5(){ return "5670ecdaa77baf5db3c8135a6ed2d62a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
