package com.roslib.gazebo_msgs;

import java.lang.*;

public class JointRequest {

public static final java.lang.String JOINTREQUEST = "gazebo_msgs/JointRequest";

public class JointRequestRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String joint_name;

    public JointRequestRequest() {
        this.joint_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_joint_name = this.joint_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_name; k++) {
            outbuffer[offset + k] = (byte)((this.joint_name.getBytes())[k] & 0xFF);
        }
        offset += length_joint_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_joint_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_name = new byte[length_joint_name];
        for(int k= 0; k< length_joint_name; k++){
            bytes_joint_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_name = new java.lang.String(bytes_joint_name);
        offset += length_joint_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_joint_name = this.joint_name.getBytes().length;
        length += 4;
        length += length_joint_name;
        return length;
    }

    public java.lang.String getType() { return JOINTREQUEST; }
    public java.lang.String getMD5(){ return "e0bdc37edb92be07f3069573364a169f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class JointRequestResponse implements com.roslib.ros.Msg {
    private long __id__;

    public JointRequestResponse() {
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

    public java.lang.String getType() { return JOINTREQUEST; }
    public java.lang.String getMD5(){ return "ac5876a62df51a76c2828bb62894779d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
