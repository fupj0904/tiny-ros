package com.roslib.geometry_msgs;

import java.lang.*;

public class WrenchStamped implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Wrench wrench;

    public WrenchStamped() {
        this.header = new com.roslib.std_msgs.Header();
        this.wrench = new com.roslib.geometry_msgs.Wrench();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.wrench.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.wrench.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.wrench.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "geometry_msgs/WrenchStamped"; }
    public java.lang.String getMD5(){ return "cf53874aa63609de4155ec8e9cf2c540"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
