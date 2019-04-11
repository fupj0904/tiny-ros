package com.roslib.gazebo_msgs;

import java.lang.*;

public class SetJointProperties {

public static final java.lang.String SETJOINTPROPERTIES = "gazebo_msgs/SetJointProperties";

public class SetJointPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String joint_name;
    public com.roslib.gazebo_msgs.ODEJointProperties ode_joint_config;

    public SetJointPropertiesRequest() {
        this.joint_name = "";
        this.ode_joint_config = new com.roslib.gazebo_msgs.ODEJointProperties();
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
        offset = this.ode_joint_config.serialize(outbuffer, offset);
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
        offset = this.ode_joint_config.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_joint_name = this.joint_name.getBytes().length;
        length += 4;
        length += length_joint_name;
        length += this.ode_joint_config.serializedLength();
        return length;
    }

    public java.lang.String getType() { return SETJOINTPROPERTIES; }
    public java.lang.String getMD5(){ return "e9063603bda4e7bdd2b5530ad7705661"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetJointPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public SetJointPropertiesResponse() {
        this.success = false;
        this.status_message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status_message = this.status_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_message; k++) {
            outbuffer[offset + k] = (byte)((this.status_message.getBytes())[k] & 0xFF);
        }
        offset += length_status_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_message = new byte[length_status_message];
        for(int k= 0; k< length_status_message; k++){
            bytes_status_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_message = new java.lang.String(bytes_status_message);
        offset += length_status_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return SETJOINTPROPERTIES; }
    public java.lang.String getMD5(){ return "7e8650b70fd2dfc24b249dddf8f45cee"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
