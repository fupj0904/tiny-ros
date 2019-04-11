package com.roslib.nav_msgs;

import java.lang.*;

public class GetMapResult implements com.roslib.ros.Msg {
    public com.roslib.nav_msgs.OccupancyGrid map;

    public GetMapResult() {
        this.map = new com.roslib.nav_msgs.OccupancyGrid();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.map.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.map.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.map.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/GetMapResult"; }
    public java.lang.String getMD5(){ return "dd8eb0759b1a400b141d7f3238732c4d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
