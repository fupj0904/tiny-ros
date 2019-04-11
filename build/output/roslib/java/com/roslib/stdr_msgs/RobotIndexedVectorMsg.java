package com.roslib.stdr_msgs;

import java.lang.*;

public class RobotIndexedVectorMsg implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.RobotIndexedMsg[] robots;

    public RobotIndexedVectorMsg() {
        this.robots = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_robots = this.robots != null ? this.robots.length : 0;
        outbuffer[offset + 0] = (byte)((length_robots >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_robots >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_robots >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_robots >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_robots; i++){
        offset = this.robots[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_robots = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_robots |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_robots |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_robots |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_robots > 0) {
            this.robots = new com.roslib.stdr_msgs.RobotIndexedMsg[length_robots];
        }
        for (int i = 0; i < length_robots; i++){
        offset = this.robots[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_robots = this.robots != null ? this.robots.length : 0;
        for (int i = 0; i < length_robots; i++) {
        length += this.robots[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RobotIndexedVectorMsg"; }
    public java.lang.String getMD5(){ return "cf4983a2f558984ecb57bad05aaea466"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
