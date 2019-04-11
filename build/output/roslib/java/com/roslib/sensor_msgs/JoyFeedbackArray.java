package com.roslib.sensor_msgs;

import java.lang.*;

public class JoyFeedbackArray implements com.roslib.ros.Msg {
    public com.roslib.sensor_msgs.JoyFeedback[] array;

    public JoyFeedbackArray() {
        this.array = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_array = this.array != null ? this.array.length : 0;
        outbuffer[offset + 0] = (byte)((length_array >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_array >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_array >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_array >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_array; i++){
        offset = this.array[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_array = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_array |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_array |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_array |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_array > 0) {
            this.array = new com.roslib.sensor_msgs.JoyFeedback[length_array];
        }
        for (int i = 0; i < length_array; i++){
        offset = this.array[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_array = this.array != null ? this.array.length : 0;
        for (int i = 0; i < length_array; i++) {
        length += this.array[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/JoyFeedbackArray"; }
    public java.lang.String getMD5(){ return "45361e458d526d5670706a9f083819b6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
