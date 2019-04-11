package com.roslib.gazebo_msgs;

import java.lang.*;

public class ModelState implements com.roslib.ros.Msg {
    public java.lang.String model_name;
    public com.roslib.geometry_msgs.Pose pose;
    public com.roslib.geometry_msgs.Twist twist;
    public java.lang.String reference_frame;

    public ModelState() {
        this.model_name = "";
        this.pose = new com.roslib.geometry_msgs.Pose();
        this.twist = new com.roslib.geometry_msgs.Twist();
        this.reference_frame = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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
        offset = this.pose.serialize(outbuffer, offset);
        offset = this.twist.serialize(outbuffer, offset);
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
        offset = this.pose.deserialize(inbuffer, offset);
        offset = this.twist.deserialize(inbuffer, offset);
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
        length += this.pose.serializedLength();
        length += this.twist.serializedLength();
        int length_reference_frame = this.reference_frame.getBytes().length;
        length += 4;
        length += length_reference_frame;
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/ModelState"; }
    public java.lang.String getMD5(){ return "dee4d802363b4d6bd1ed61e20c2c4635"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
