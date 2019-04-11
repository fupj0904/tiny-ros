package com.roslib.control_msgs;

import java.lang.*;

public class JointTolerance implements com.roslib.ros.Msg {
    public java.lang.String name;
    public double position;
    public double velocity;
    public double acceleration;

    public JointTolerance() {
        this.name = "";
        this.position = 0;
        this.velocity = 0;
        this.acceleration = 0;
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
        long bits_position = Double.doubleToRawLongBits(this.position);
        outbuffer[offset + 0] = (byte)((bits_position >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_position >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_position >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_position >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_position >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_position >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_position >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_position >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_velocity = Double.doubleToRawLongBits(this.velocity);
        outbuffer[offset + 0] = (byte)((bits_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_velocity >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_velocity >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_velocity >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_velocity >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_velocity >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_acceleration = Double.doubleToRawLongBits(this.acceleration);
        outbuffer[offset + 0] = (byte)((bits_acceleration >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_acceleration >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_acceleration >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_acceleration >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_acceleration >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_acceleration >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_acceleration >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_acceleration >> (8 * 7)) & 0xFF);
        offset += 8;
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
        long bits_position = 0;
        bits_position |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_position |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_position |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_position |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_position |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_position |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_position |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_position |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.position = Double.longBitsToDouble(bits_position);
        offset += 8;
        long bits_velocity = 0;
        bits_velocity |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_velocity |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_velocity |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_velocity |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_velocity |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_velocity |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_velocity |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_velocity |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.velocity = Double.longBitsToDouble(bits_velocity);
        offset += 8;
        long bits_acceleration = 0;
        bits_acceleration |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_acceleration |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_acceleration |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_acceleration |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_acceleration |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_acceleration |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_acceleration |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_acceleration |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.acceleration = Double.longBitsToDouble(bits_acceleration);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/JointTolerance"; }
    public java.lang.String getMD5(){ return "d5558a563bc9e5cadbb6638fb71c6e0f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
