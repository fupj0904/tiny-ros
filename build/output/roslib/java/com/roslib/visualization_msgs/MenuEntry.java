package com.roslib.visualization_msgs;

import java.lang.*;

public class MenuEntry implements com.roslib.ros.Msg {
    public long id;
    public long parent_id;
    public java.lang.String title;
    public java.lang.String command;
    public int command_type;
    public static final int FEEDBACK = (int)(0);
    public static final int ROSRUN = (int)(1);
    public static final int ROSLAUNCH = (int)(2);

    public MenuEntry() {
        this.id = 0;
        this.parent_id = 0;
        this.title = "";
        this.command = "";
        this.command_type = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.parent_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.parent_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.parent_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.parent_id >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_title = this.title.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_title >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_title >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_title >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_title >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_title; k++) {
            outbuffer[offset + k] = (byte)((this.title.getBytes())[k] & 0xFF);
        }
        offset += length_title;
        int length_command = this.command.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_command >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_command >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_command >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_command >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_command; k++) {
            outbuffer[offset + k] = (byte)((this.command.getBytes())[k] & 0xFF);
        }
        offset += length_command;
        outbuffer[offset + 0] = (byte)((this.command_type >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.id   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.parent_id   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.parent_id |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.parent_id |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.parent_id |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_title = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_title |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_title |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_title |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_title = new byte[length_title];
        for(int k= 0; k< length_title; k++){
            bytes_title[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.title = new java.lang.String(bytes_title);
        offset += length_title;
        int length_command = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_command |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_command |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_command |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_command = new byte[length_command];
        for(int k= 0; k< length_command; k++){
            bytes_command[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.command = new java.lang.String(bytes_command);
        offset += length_command;
        this.command_type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        int length_title = this.title.getBytes().length;
        length += 4;
        length += length_title;
        int length_command = this.command.getBytes().length;
        length += 4;
        length += length_command;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/MenuEntry"; }
    public java.lang.String getMD5(){ return "09ef68f346107bee9bb8f9c6b994b413"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
