package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigationControl implements com.roslib.ros.Msg {
    public byte control;
    public java.lang.String goal_name;
    public static final byte STOP = (byte)( 0);
    public static final byte START = (byte)( 1);
    public static final byte PAUSE = (byte)( 2);

    public NavigationControl() {
        this.control = 0;
        this.goal_name = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.control >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_goal_name = this.goal_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_goal_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_goal_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_goal_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_goal_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_goal_name; k++) {
            outbuffer[offset + k] = (byte)((this.goal_name.getBytes())[k] & 0xFF);
        }
        offset += length_goal_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.control   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_goal_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_goal_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_goal_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_goal_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_goal_name = new byte[length_goal_name];
        for(int k= 0; k< length_goal_name; k++){
            bytes_goal_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.goal_name = new java.lang.String(bytes_goal_name);
        offset += length_goal_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_goal_name = this.goal_name.getBytes().length;
        length += 4;
        length += length_goal_name;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/NavigationControl"; }
    public java.lang.String getMD5(){ return "e89d714827cca12eacf26bc720abc724"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
