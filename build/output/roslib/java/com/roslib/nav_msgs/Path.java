package com.roslib.nav_msgs;

import java.lang.*;

public class Path implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.PoseStamped[] poses;

    public Path() {
        this.header = new com.roslib.std_msgs.Header();
        this.poses = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_poses = this.poses != null ? this.poses.length : 0;
        outbuffer[offset + 0] = (byte)((length_poses >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_poses >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_poses >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_poses >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_poses; i++){
        offset = this.poses[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_poses = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_poses |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_poses |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_poses |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_poses > 0) {
            this.poses = new com.roslib.geometry_msgs.PoseStamped[length_poses];
        }
        for (int i = 0; i < length_poses; i++){
        offset = this.poses[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_poses = this.poses != null ? this.poses.length : 0;
        for (int i = 0; i < length_poses; i++) {
        length += this.poses[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/Path"; }
    public java.lang.String getMD5(){ return "4a185240c929c496a7e0d6202e3c89af"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
