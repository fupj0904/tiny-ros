package com.roslib.turtlebot_actions;

import java.lang.*;

public class FindFiducialResult implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.PoseStamped pose;

    public FindFiducialResult() {
        this.pose = new com.roslib.geometry_msgs.PoseStamped();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "turtlebot_actions/FindFiducialResult"; }
    public java.lang.String getMD5(){ return "8653d7a7ef2bd0fc436f0be9b4dbd842"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
