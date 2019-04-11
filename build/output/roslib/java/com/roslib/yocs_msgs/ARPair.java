package com.roslib.yocs_msgs;

import java.lang.*;

public class ARPair implements com.roslib.ros.Msg {
    public short left_id;
    public short right_id;
    public float baseline;
    public float target_offset;
    public java.lang.String target_frame;

    public ARPair() {
        this.left_id = 0;
        this.right_id = 0;
        this.baseline = 0;
        this.target_offset = 0;
        this.target_frame = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.left_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.left_id >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.right_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.right_id >> (8 * 1)) & 0xFF);
        offset += 2;
        int bits_baseline = Float.floatToRawIntBits(baseline);
        outbuffer[offset + 0] = (byte)((bits_baseline >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_baseline >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_baseline >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_baseline >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_target_offset = Float.floatToRawIntBits(target_offset);
        outbuffer[offset + 0] = (byte)((bits_target_offset >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_target_offset >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_target_offset >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_target_offset >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_target_frame = this.target_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_target_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_target_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_target_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_target_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_target_frame; k++) {
            outbuffer[offset + k] = (byte)((this.target_frame.getBytes())[k] & 0xFF);
        }
        offset += length_target_frame;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.left_id   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.left_id |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.right_id   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.right_id |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        int bits_baseline = 0;
        bits_baseline |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_baseline |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_baseline |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_baseline |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.baseline = Float.intBitsToFloat(bits_baseline);
        offset += 4;
        int bits_target_offset = 0;
        bits_target_offset |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_target_offset |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_target_offset |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_target_offset |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.target_offset = Float.intBitsToFloat(bits_target_offset);
        offset += 4;
        int length_target_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_target_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_target_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_target_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_target_frame = new byte[length_target_frame];
        for(int k= 0; k< length_target_frame; k++){
            bytes_target_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.target_frame = new java.lang.String(bytes_target_frame);
        offset += length_target_frame;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 2;
        length += 2;
        length += 4;
        length += 4;
        int length_target_frame = this.target_frame.getBytes().length;
        length += 4;
        length += length_target_frame;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/ARPair"; }
    public java.lang.String getMD5(){ return "b62211da078ffe8d7d6bc29aa7484206"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
