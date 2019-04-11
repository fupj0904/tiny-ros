package com.roslib.yocs_msgs;

import java.lang.*;

public class WaypointList implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.Waypoint[] waypoints;

    public WaypointList() {
        this.waypoints = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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
        length += 4;
        int length_waypoints = this.waypoints != null ? this.waypoints.length : 0;
        for (int i = 0; i < length_waypoints; i++) {
        length += this.waypoints[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/WaypointList"; }
    public java.lang.String getMD5(){ return "0c2027532646456c4831c28399620cd0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
