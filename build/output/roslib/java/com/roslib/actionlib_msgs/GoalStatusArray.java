package com.roslib.actionlib_msgs;

import java.lang.*;

public class GoalStatusArray implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.actionlib_msgs.GoalStatus[] status_list;

    public GoalStatusArray() {
        this.header = new com.roslib.std_msgs.Header();
        this.status_list = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_status_list = this.status_list != null ? this.status_list.length : 0;
        outbuffer[offset + 0] = (byte)((length_status_list >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_list >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_list >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_list >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_status_list; i++){
        offset = this.status_list[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_status_list = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_list |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_list |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_list |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_status_list > 0) {
            this.status_list = new com.roslib.actionlib_msgs.GoalStatus[length_status_list];
        }
        for (int i = 0; i < length_status_list; i++){
        offset = this.status_list[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_status_list = this.status_list != null ? this.status_list.length : 0;
        for (int i = 0; i < length_status_list; i++) {
        length += this.status_list[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "actionlib_msgs/GoalStatusArray"; }
    public java.lang.String getMD5(){ return "53f6501f7c14f5f3963638de4bbe3a71"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
