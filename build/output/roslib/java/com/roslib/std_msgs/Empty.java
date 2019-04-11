package com.roslib.std_msgs;

import java.lang.*;

public class Empty implements com.roslib.ros.Msg {

    public Empty() {
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Empty"; }
    public java.lang.String getMD5(){ return "140bdcb7bbc50b4a936e90ff2350c8d3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
