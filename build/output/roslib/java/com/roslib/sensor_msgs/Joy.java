package com.roslib.sensor_msgs;

import java.lang.*;

public class Joy implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float[] axes;
    public int[] buttons;

    public Joy() {
        this.header = new com.roslib.std_msgs.Header();
        this.axes = null;
        this.buttons = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_axes = this.axes != null ? this.axes.length : 0;
        outbuffer[offset + 0] = (byte)((length_axes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_axes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_axes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_axes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_axes; i++){
        int bits_axesi = Float.floatToRawIntBits(axes[i]);
        outbuffer[offset + 0] = (byte)((bits_axesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_axesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_axesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_axesi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        int length_buttons = this.buttons != null ? this.buttons.length : 0;
        outbuffer[offset + 0] = (byte)((length_buttons >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_buttons >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_buttons >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_buttons >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_buttons; i++){
        outbuffer[offset + 0] = (byte)((this.buttons[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.buttons[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.buttons[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.buttons[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_axes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_axes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_axes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_axes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_axes > 0) {
            this.axes = new float[length_axes];
        }
        for (int i = 0; i < length_axes; i++){
        int bits_axesi = 0;
        bits_axesi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_axesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_axesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_axesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.axes[i] = Float.intBitsToFloat(bits_axesi);
        offset += 4;
        }
        int length_buttons = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_buttons |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_buttons |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_buttons |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_buttons > 0) {
            this.buttons = new int[length_buttons];
        }
        for (int i = 0; i < length_buttons; i++){
        this.buttons[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.buttons[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.buttons[i] |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.buttons[i] |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_axes = this.axes != null ? this.axes.length : 0;
        for (int i = 0; i < length_axes; i++) {
        length += 4;
        }
        length += 4;
        int length_buttons = this.buttons != null ? this.buttons.length : 0;
        for (int i = 0; i < length_buttons; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/Joy"; }
    public java.lang.String getMD5(){ return "da3438323dbe92a4d6e4658e06bf8da1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
