package com.roslib.stdr_msgs;

import java.lang.*;

public class SpawnRobotResult implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.RobotIndexedMsg indexedDescription;
    public java.lang.String message;

    public SpawnRobotResult() {
        this.indexedDescription = new com.roslib.stdr_msgs.RobotIndexedMsg();
        this.message = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.indexedDescription.serialize(outbuffer, offset);
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
        offset = this.indexedDescription.deserialize(inbuffer, offset);
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
        length += this.indexedDescription.serializedLength();
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/SpawnRobotResult"; }
    public java.lang.String getMD5(){ return "663424c699efebf9492f5ef20d54cccd"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
