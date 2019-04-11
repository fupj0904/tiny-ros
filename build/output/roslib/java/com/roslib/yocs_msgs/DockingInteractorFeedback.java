package com.roslib.yocs_msgs;

import java.lang.*;

public class DockingInteractorFeedback implements com.roslib.ros.Msg {
    public byte level;
    public java.lang.String message;
    public static final byte DEBUG = (byte)(1);
    public static final byte INFO = (byte)(2);
    public static final byte WARN = (byte)(4);
    public static final byte ERROR = (byte)(8);

    public DockingInteractorFeedback() {
        this.level = 0;
        this.message = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.level >> (8 * 0)) & 0xFF);
        offset += 1;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.level   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/DockingInteractorFeedback"; }
    public java.lang.String getMD5(){ return "4c27de6c90f41933a5a0b2ce4f3fc59f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
