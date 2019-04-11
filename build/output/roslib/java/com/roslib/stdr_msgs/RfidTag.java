package com.roslib.stdr_msgs;

import java.lang.*;

public class RfidTag implements com.roslib.ros.Msg {
    public java.lang.String tag_id;
    public java.lang.String message;
    public com.roslib.geometry_msgs.Pose2D pose;

    public RfidTag() {
        this.tag_id = "";
        this.message = "";
        this.pose = new com.roslib.geometry_msgs.Pose2D();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_tag_id = this.tag_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_tag_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_tag_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_tag_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_tag_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_tag_id; k++) {
            outbuffer[offset + k] = (byte)((this.tag_id.getBytes())[k] & 0xFF);
        }
        offset += length_tag_id;
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_tag_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_tag_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_tag_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_tag_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_tag_id = new byte[length_tag_id];
        for(int k= 0; k< length_tag_id; k++){
            bytes_tag_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.tag_id = new java.lang.String(bytes_tag_id);
        offset += length_tag_id;
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_tag_id = this.tag_id.getBytes().length;
        length += 4;
        length += length_tag_id;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RfidTag"; }
    public java.lang.String getMD5(){ return "09ecfc42ea38e7368b58ae1c00fc4b29"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
