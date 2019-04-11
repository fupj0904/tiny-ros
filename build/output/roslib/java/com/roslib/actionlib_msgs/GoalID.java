package com.roslib.actionlib_msgs;

import java.lang.*;

public class GoalID implements com.roslib.ros.Msg {
    public com.roslib.ros.Time stamp;
    public java.lang.String id;

    public GoalID() {
        this.stamp = new com.roslib.ros.Time();
        this.id = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.stamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_id = this.id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_id; k++) {
            outbuffer[offset + k] = (byte)((this.id.getBytes())[k] & 0xFF);
        }
        offset += length_id;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.stamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_id = new byte[length_id];
        for(int k= 0; k< length_id; k++){
            bytes_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.id = new java.lang.String(bytes_id);
        offset += length_id;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        int length_id = this.id.getBytes().length;
        length += 4;
        length += length_id;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_msgs/GoalID"; }
    public java.lang.String getMD5(){ return "a6cee90e5a185f4cb050de49bc4fa1f4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
