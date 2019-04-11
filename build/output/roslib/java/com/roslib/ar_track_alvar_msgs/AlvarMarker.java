package com.roslib.ar_track_alvar_msgs;

import java.lang.*;

public class AlvarMarker implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long id;
    public long confidence;
    public com.roslib.geometry_msgs.PoseStamped pose;

    public AlvarMarker() {
        this.header = new com.roslib.std_msgs.Header();
        this.id = 0;
        this.confidence = 0;
        this.pose = new com.roslib.geometry_msgs.PoseStamped();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.confidence >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.confidence >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.confidence >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.confidence >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.id   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.confidence   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.confidence |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.confidence |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.confidence |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "ar_track_alvar_msgs/AlvarMarker"; }
    public java.lang.String getMD5(){ return "a389782490e76984acdb73a706474d17"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
