package com.roslib.gazebo_msgs;

import java.lang.*;

public class SpawnModel {

public static final java.lang.String SPAWNMODEL = "gazebo_msgs/SpawnModel";

public class SpawnModelRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String model_name;
    public java.lang.String model_xml;
    public java.lang.String robot_namespace;
    public com.roslib.geometry_msgs.Pose initial_pose;
    public java.lang.String reference_frame;

    public SpawnModelRequest() {
        this.model_name = "";
        this.model_xml = "";
        this.robot_namespace = "";
        this.initial_pose = new com.roslib.geometry_msgs.Pose();
        this.reference_frame = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_model_name = this.model_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_model_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_model_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_model_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_model_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_model_name; k++) {
            outbuffer[offset + k] = (byte)((this.model_name.getBytes())[k] & 0xFF);
        }
        offset += length_model_name;
        int length_model_xml = this.model_xml.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_model_xml >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_model_xml >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_model_xml >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_model_xml >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_model_xml; k++) {
            outbuffer[offset + k] = (byte)((this.model_xml.getBytes())[k] & 0xFF);
        }
        offset += length_model_xml;
        int length_robot_namespace = this.robot_namespace.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_robot_namespace >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_robot_namespace >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_robot_namespace >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_robot_namespace >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_robot_namespace; k++) {
            outbuffer[offset + k] = (byte)((this.robot_namespace.getBytes())[k] & 0xFF);
        }
        offset += length_robot_namespace;
        offset = this.initial_pose.serialize(outbuffer, offset);
        int length_reference_frame = this.reference_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_reference_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_reference_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_reference_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_reference_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_reference_frame; k++) {
            outbuffer[offset + k] = (byte)((this.reference_frame.getBytes())[k] & 0xFF);
        }
        offset += length_reference_frame;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_model_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_model_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_model_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_model_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_model_name = new byte[length_model_name];
        for(int k= 0; k< length_model_name; k++){
            bytes_model_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.model_name = new java.lang.String(bytes_model_name);
        offset += length_model_name;
        int length_model_xml = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_model_xml |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_model_xml |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_model_xml |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_model_xml = new byte[length_model_xml];
        for(int k= 0; k< length_model_xml; k++){
            bytes_model_xml[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.model_xml = new java.lang.String(bytes_model_xml);
        offset += length_model_xml;
        int length_robot_namespace = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_robot_namespace |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_robot_namespace |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_robot_namespace |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_robot_namespace = new byte[length_robot_namespace];
        for(int k= 0; k< length_robot_namespace; k++){
            bytes_robot_namespace[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.robot_namespace = new java.lang.String(bytes_robot_namespace);
        offset += length_robot_namespace;
        offset = this.initial_pose.deserialize(inbuffer, offset);
        int length_reference_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_reference_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_reference_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_reference_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_reference_frame = new byte[length_reference_frame];
        for(int k= 0; k< length_reference_frame; k++){
            bytes_reference_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.reference_frame = new java.lang.String(bytes_reference_frame);
        offset += length_reference_frame;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_model_name = this.model_name.getBytes().length;
        length += 4;
        length += length_model_name;
        int length_model_xml = this.model_xml.getBytes().length;
        length += 4;
        length += length_model_xml;
        int length_robot_namespace = this.robot_namespace.getBytes().length;
        length += 4;
        length += length_robot_namespace;
        length += this.initial_pose.serializedLength();
        int length_reference_frame = this.reference_frame.getBytes().length;
        length += 4;
        length += length_reference_frame;
        return length;
    }

    public java.lang.String getType() { return SPAWNMODEL; }
    public java.lang.String getMD5(){ return "da34e61c8813e52ac159e5f31fbf55be"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SpawnModelResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;

    public SpawnModelResponse() {
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

    public java.lang.String getType() { return SPAWNMODEL; }
    public java.lang.String getMD5(){ return "d59d46cc4e5a64f978a429dd7c306d30"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
