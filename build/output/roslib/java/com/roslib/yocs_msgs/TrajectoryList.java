package com.roslib.yocs_msgs;

import java.lang.*;

public class TrajectoryList implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.Trajectory[] trajectories;

    public TrajectoryList() {
        this.trajectories = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_trajectories = this.trajectories != null ? this.trajectories.length : 0;
        outbuffer[offset + 0] = (byte)((length_trajectories >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_trajectories >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_trajectories >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_trajectories >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_trajectories; i++){
        offset = this.trajectories[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_trajectories = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_trajectories |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_trajectories |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_trajectories |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_trajectories > 0) {
            this.trajectories = new com.roslib.yocs_msgs.Trajectory[length_trajectories];
        }
        for (int i = 0; i < length_trajectories; i++){
        offset = this.trajectories[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_trajectories = this.trajectories != null ? this.trajectories.length : 0;
        for (int i = 0; i < length_trajectories; i++) {
        length += this.trajectories[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/TrajectoryList"; }
    public java.lang.String getMD5(){ return "6d42390698ecc2abdacf46452ad3f4c2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
