package com.roslib.nav_msgs;

import java.lang.*;

public class Odometry implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String child_frame_id;
    public com.roslib.geometry_msgs.PoseWithCovariance pose;
    public com.roslib.geometry_msgs.TwistWithCovariance twist;

    public Odometry() {
        this.header = new com.roslib.std_msgs.Header();
        this.child_frame_id = "";
        this.pose = new com.roslib.geometry_msgs.PoseWithCovariance();
        this.twist = new com.roslib.geometry_msgs.TwistWithCovariance();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_child_frame_id = this.child_frame_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_child_frame_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_child_frame_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_child_frame_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_child_frame_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_child_frame_id; k++) {
            outbuffer[offset + k] = (byte)((this.child_frame_id.getBytes())[k] & 0xFF);
        }
        offset += length_child_frame_id;
        offset = this.pose.serialize(outbuffer, offset);
        offset = this.twist.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_child_frame_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_child_frame_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_child_frame_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_child_frame_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_child_frame_id = new byte[length_child_frame_id];
        for(int k= 0; k< length_child_frame_id; k++){
            bytes_child_frame_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.child_frame_id = new java.lang.String(bytes_child_frame_id);
        offset += length_child_frame_id;
        offset = this.pose.deserialize(inbuffer, offset);
        offset = this.twist.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_child_frame_id = this.child_frame_id.getBytes().length;
        length += 4;
        length += length_child_frame_id;
        length += this.pose.serializedLength();
        length += this.twist.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/Odometry"; }
    public java.lang.String getMD5(){ return "8fbd8c2e0caeb7be9b30b66a3e735193"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
