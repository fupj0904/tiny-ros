package com.roslib.stdr_msgs;

import java.lang.*;

public class SpawnRobotGoal implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.RobotMsg description;

    public SpawnRobotGoal() {
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

    public java.lang.String getType(){ return "stdr_msgs/SpawnRobotGoal"; }
    public java.lang.String getMD5(){ return "e33be27c4defdaf4af3acd69d4b768da"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
