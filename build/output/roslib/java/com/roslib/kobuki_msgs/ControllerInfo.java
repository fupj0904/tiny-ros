package com.roslib.kobuki_msgs;

import java.lang.*;

public class ControllerInfo implements com.roslib.ros.Msg {
    public int type;
    public double p_gain;
    public double i_gain;
    public double d_gain;
    public static final int DEFAULT = (int)(  0);
    public static final int USER_CONFIGURED = (int)(  1);

    public ControllerInfo() {
        this.type = 0;
        this.p_gain = 0;
        this.i_gain = 0;
        this.d_gain = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        offset += 1;
        long bits_p_gain = Double.doubleToRawLongBits(this.p_gain);
        outbuffer[offset + 0] = (byte)((bits_p_gain >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_p_gain >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_p_gain >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_p_gain >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_p_gain >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_p_gain >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_p_gain >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_p_gain >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_i_gain = Double.doubleToRawLongBits(this.i_gain);
        outbuffer[offset + 0] = (byte)((bits_i_gain >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_i_gain >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_i_gain >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_i_gain >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_i_gain >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_i_gain >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_i_gain >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_i_gain >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_d_gain = Double.doubleToRawLongBits(this.d_gain);
        outbuffer[offset + 0] = (byte)((bits_d_gain >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_d_gain >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_d_gain >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_d_gain >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_d_gain >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_d_gain >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_d_gain >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_d_gain >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        long bits_p_gain = 0;
        bits_p_gain |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_p_gain |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_p_gain |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_p_gain |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_p_gain |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_p_gain |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_p_gain |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_p_gain |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.p_gain = Double.longBitsToDouble(bits_p_gain);
        offset += 8;
        long bits_i_gain = 0;
        bits_i_gain |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_i_gain |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_i_gain |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_i_gain |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_i_gain |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_i_gain |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_i_gain |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_i_gain |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.i_gain = Double.longBitsToDouble(bits_i_gain);
        offset += 8;
        long bits_d_gain = 0;
        bits_d_gain |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_d_gain |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_d_gain |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_d_gain |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_d_gain |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_d_gain |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_d_gain |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_d_gain |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.d_gain = Double.longBitsToDouble(bits_d_gain);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/ControllerInfo"; }
    public java.lang.String getMD5(){ return "11bd612b6e09e56a0f39a15bd011efbc"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
