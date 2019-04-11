package com.roslib.yocs_msgs;

import java.lang.*;

public class Wall implements com.roslib.ros.Msg {
    public java.lang.String name;
    public float length;
    public float width;
    public float height;
    public com.roslib.geometry_msgs.PoseWithCovarianceStamped pose;

    public Wall() {
        this.name = "";
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.pose = new com.roslib.geometry_msgs.PoseWithCovarianceStamped();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        int bits_length = Float.floatToRawIntBits(length);
        outbuffer[offset + 0] = (byte)((bits_length >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_length >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_length >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_length >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_width = Float.floatToRawIntBits(width);
        outbuffer[offset + 0] = (byte)((bits_width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_width >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_height = Float.floatToRawIntBits(height);
        outbuffer[offset + 0] = (byte)((bits_height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_height >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        int bits_length = 0;
        bits_length |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_length |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_length |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_length |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.length = Float.intBitsToFloat(bits_length);
        offset += 4;
        int bits_width = 0;
        bits_width |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_width |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_width |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_width |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.width = Float.intBitsToFloat(bits_width);
        offset += 4;
        int bits_height = 0;
        bits_height |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_height |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_height |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_height |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.height = Float.intBitsToFloat(bits_height);
        offset += 4;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        length += 4;
        length += 4;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/Wall"; }
    public java.lang.String getMD5(){ return "41b81142e0480792528cb37819820c3c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
