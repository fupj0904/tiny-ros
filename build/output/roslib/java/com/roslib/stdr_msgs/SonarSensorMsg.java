package com.roslib.stdr_msgs;

import java.lang.*;

public class SonarSensorMsg implements com.roslib.ros.Msg {
    public float maxRange;
    public float minRange;
    public float coneAngle;
    public float frequency;
    public com.roslib.stdr_msgs.Noise noise;
    public java.lang.String frame_id;
    public com.roslib.geometry_msgs.Pose2D pose;

    public SonarSensorMsg() {
        this.maxRange = 0;
        this.minRange = 0;
        this.coneAngle = 0;
        this.frequency = 0;
        this.noise = new com.roslib.stdr_msgs.Noise();
        this.frame_id = "";
        this.pose = new com.roslib.geometry_msgs.Pose2D();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int bits_maxRange = Float.floatToRawIntBits(maxRange);
        outbuffer[offset + 0] = (byte)((bits_maxRange >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_maxRange >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_maxRange >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_maxRange >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_minRange = Float.floatToRawIntBits(minRange);
        outbuffer[offset + 0] = (byte)((bits_minRange >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_minRange >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_minRange >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_minRange >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_coneAngle = Float.floatToRawIntBits(coneAngle);
        outbuffer[offset + 0] = (byte)((bits_coneAngle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_coneAngle >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_coneAngle >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_coneAngle >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_frequency = Float.floatToRawIntBits(frequency);
        outbuffer[offset + 0] = (byte)((bits_frequency >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_frequency >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_frequency >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_frequency >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.noise.serialize(outbuffer, offset);
        int length_frame_id = this.frame_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_frame_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_frame_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_frame_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_frame_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_frame_id; k++) {
            outbuffer[offset + k] = (byte)((this.frame_id.getBytes())[k] & 0xFF);
        }
        offset += length_frame_id;
        offset = this.pose.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int bits_maxRange = 0;
        bits_maxRange |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_maxRange |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_maxRange |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_maxRange |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.maxRange = Float.intBitsToFloat(bits_maxRange);
        offset += 4;
        int bits_minRange = 0;
        bits_minRange |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_minRange |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_minRange |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_minRange |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.minRange = Float.intBitsToFloat(bits_minRange);
        offset += 4;
        int bits_coneAngle = 0;
        bits_coneAngle |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_coneAngle |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_coneAngle |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_coneAngle |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.coneAngle = Float.intBitsToFloat(bits_coneAngle);
        offset += 4;
        int bits_frequency = 0;
        bits_frequency |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_frequency |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_frequency |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_frequency |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.frequency = Float.intBitsToFloat(bits_frequency);
        offset += 4;
        offset = this.noise.deserialize(inbuffer, offset);
        int length_frame_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_frame_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_frame_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_frame_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_frame_id = new byte[length_frame_id];
        for(int k= 0; k< length_frame_id; k++){
            bytes_frame_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.frame_id = new java.lang.String(bytes_frame_id);
        offset += length_frame_id;
        offset = this.pose.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += this.noise.serializedLength();
        int length_frame_id = this.frame_id.getBytes().length;
        length += 4;
        length += length_frame_id;
        length += this.pose.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/SonarSensorMsg"; }
    public java.lang.String getMD5(){ return "102d6e7675eae86322ec6d9fd6011505"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
