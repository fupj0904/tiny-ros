package com.roslib.control_msgs;

import java.lang.*;

public class SingleJointPositionFeedback implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public double position;
    public double velocity;
    public double error;

    public SingleJointPositionFeedback() {
        this.header = new com.roslib.std_msgs.Header();
        this.position = 0;
        this.velocity = 0;
        this.error = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
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
        long bits_error = Double.doubleToRawLongBits(this.error);
        outbuffer[offset + 0] = (byte)((bits_error >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_error >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_error >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_error >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_error >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_error >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_error >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_error >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
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
        long bits_error = 0;
        bits_error |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_error |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_error |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_error |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_error |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_error |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_error |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_error |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.error = Double.longBitsToDouble(bits_error);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/SingleJointPositionFeedback"; }
    public java.lang.String getMD5(){ return "2e483e2021ecc629bd206cea35b9145d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
