package com.roslib.stdr_msgs;

import java.lang.*;

public class RegisterGui {

public static final java.lang.String REGISTERGUI = "stdr_msgs/RegisterGui";

public class RegisterGuiRequest implements com.roslib.ros.Msg {
    private long __id__;

    public RegisterGuiRequest() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return REGISTERGUI; }
    public java.lang.String getMD5(){ return "34ee8b17d86943c3d7402445dc5adcb5"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class RegisterGuiResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.stdr_msgs.RobotIndexedMsg[] robots;

    public RegisterGuiResponse() {
        this.robots = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_robots = this.robots != null ? this.robots.length : 0;
        outbuffer[offset + 0] = (byte)((length_robots >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_robots >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_robots >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_robots >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_robots; i++){
        offset = this.robots[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_robots = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_robots |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_robots |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_robots |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_robots > 0) {
            this.robots = new com.roslib.stdr_msgs.RobotIndexedMsg[length_robots];
        }
        for (int i = 0; i < length_robots; i++){
        offset = this.robots[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_robots = this.robots != null ? this.robots.length : 0;
        for (int i = 0; i < length_robots; i++) {
        length += this.robots[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return REGISTERGUI; }
    public java.lang.String getMD5(){ return "5e88c4fe322667ff3c1db8a867832365"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
