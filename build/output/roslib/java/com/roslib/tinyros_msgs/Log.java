package com.roslib.tinyros_msgs;

import java.lang.*;

public class Log implements com.roslib.ros.Msg {
    public int level;
    public java.lang.String msg;
    public static final int ROSDEBUG = (int)(0);
    public static final int ROSINFO = (int)(1);
    public static final int ROSWARN = (int)(2);
    public static final int ROSERROR = (int)(3);
    public static final int ROSFATAL = (int)(4);

    public Log() {
        this.level = 0;
        this.msg = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.level >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_msg = this.msg.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_msg >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_msg >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_msg >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_msg >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_msg; k++) {
            outbuffer[offset + k] = (byte)((this.msg.getBytes())[k] & 0xFF);
        }
        offset += length_msg;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.level   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_msg = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_msg |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_msg |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_msg |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_msg = new byte[length_msg];
        for(int k= 0; k< length_msg; k++){
            bytes_msg[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.msg = new java.lang.String(bytes_msg);
        offset += length_msg;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_msg = this.msg.getBytes().length;
        length += 4;
        length += length_msg;
        return length;
    }

    public java.lang.String getType(){ return "tinyros_msgs/Log"; }
    public java.lang.String getMD5(){ return "0bd74339b4d77cb15766d831a3d15eeb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
