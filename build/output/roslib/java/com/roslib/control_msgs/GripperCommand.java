package com.roslib.control_msgs;

import java.lang.*;

public class GripperCommand implements com.roslib.ros.Msg {
    public double position;
    public double max_effort;

    public GripperCommand() {
        this.position = 0;
        this.max_effort = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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
        long bits_max_effort = Double.doubleToRawLongBits(this.max_effort);
        outbuffer[offset + 0] = (byte)((bits_max_effort >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_effort >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_effort >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_effort >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_max_effort >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_max_effort >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_max_effort >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_max_effort >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
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
        long bits_max_effort = 0;
        bits_max_effort |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_effort |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_effort |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_effort |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_max_effort |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_max_effort |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_max_effort |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_max_effort |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.max_effort = Double.longBitsToDouble(bits_max_effort);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/GripperCommand"; }
    public java.lang.String getMD5(){ return "2475e742ee2a921d5d31ee080d36171a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
