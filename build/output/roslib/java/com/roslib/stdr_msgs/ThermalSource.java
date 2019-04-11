package com.roslib.stdr_msgs;

import java.lang.*;

public class ThermalSource implements com.roslib.ros.Msg {
    public java.lang.String id;
    public float degrees;
    public com.roslib.geometry_msgs.Pose2D pose;

    public ThermalSource() {
        this.id = "";
        this.degrees = 0;
        this.pose = new com.roslib.geometry_msgs.Pose2D();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_id = this.id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_id; k++) {
            outbuffer[offset + k] = (byte)((this.id.getBytes())[k] & 0xFF);
        }
        offset += length_id;
        int bits_degrees = Float.floatToRawIntBits(degrees);
        outbuffer[offset + 0] = (byte)((bits_degrees >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_degrees >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_degrees >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_degrees >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_id = new byte[length_id];
        for(int k= 0; k< length_id; k++){
            bytes_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.id = new java.lang.String(bytes_id);
        offset += length_id;
        int bits_degrees = 0;
        bits_degrees |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_degrees |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_degrees |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_degrees |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.degrees = Float.intBitsToFloat(bits_degrees);
        offset += 4;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_id = this.id.getBytes().length;
        length += 4;
        length += length_id;
        length += 4;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/ThermalSource"; }
    public java.lang.String getMD5(){ return "13e93a241b8c9769fa754355abb0a85b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
