package com.roslib.yocs_msgs;

import java.lang.*;

public class Waypoint implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String name;
    public com.roslib.geometry_msgs.Pose pose;

    public Waypoint() {
        this.header = new com.roslib.std_msgs.Header();
        this.name = "";
        this.pose = new com.roslib.geometry_msgs.Pose();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/Waypoint"; }
    public java.lang.String getMD5(){ return "63c2d90f66614e6269eaa689171bfd56"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
