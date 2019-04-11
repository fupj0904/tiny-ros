package com.roslib.yocs_msgs;

import java.lang.*;

public class WallList implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.Wall[] obstacles;

    public WallList() {
        this.obstacles = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_obstacles = this.obstacles != null ? this.obstacles.length : 0;
        outbuffer[offset + 0] = (byte)((length_obstacles >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_obstacles >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_obstacles >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_obstacles >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_obstacles; i++){
        offset = this.obstacles[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_obstacles = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_obstacles |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_obstacles |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_obstacles |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_obstacles > 0) {
            this.obstacles = new com.roslib.yocs_msgs.Wall[length_obstacles];
        }
        for (int i = 0; i < length_obstacles; i++){
        offset = this.obstacles[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_obstacles = this.obstacles != null ? this.obstacles.length : 0;
        for (int i = 0; i < length_obstacles; i++) {
        length += this.obstacles[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/WallList"; }
    public java.lang.String getMD5(){ return "41ce5e15bbcd7cce8bc9d07b502878f8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
