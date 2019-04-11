package com.roslib.yocs_msgs;

import java.lang.*;

public class Trajectory implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String name;
    public com.roslib.yocs_msgs.Waypoint[] waypoints;

    public Trajectory() {
        this.header = new com.roslib.std_msgs.Header();
        this.name = "";
        this.waypoints = null;
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
        int length_waypoints = this.waypoints != null ? this.waypoints.length : 0;
        outbuffer[offset + 0] = (byte)((length_waypoints >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_waypoints >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_waypoints >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_waypoints >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_waypoints; i++){
        offset = this.waypoints[i].serialize(outbuffer, offset);
        }
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
        int length_waypoints = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_waypoints |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_waypoints |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_waypoints |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_waypoints > 0) {
            this.waypoints = new com.roslib.yocs_msgs.Waypoint[length_waypoints];
        }
        for (int i = 0; i < length_waypoints; i++){
        offset = this.waypoints[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        int length_waypoints = this.waypoints != null ? this.waypoints.length : 0;
        for (int i = 0; i < length_waypoints; i++) {
        length += this.waypoints[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/Trajectory"; }
    public java.lang.String getMD5(){ return "52146ac088d5e0d95e40495c4aa0795b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
