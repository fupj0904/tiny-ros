package com.roslib.kobuki_msgs;

import java.lang.*;

public class AutoDockingResult implements com.roslib.ros.Msg {
    public java.lang.String text;

    public AutoDockingResult() {
        this.text = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_text = this.text.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_text >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_text >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_text >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_text >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_text; k++) {
            outbuffer[offset + k] = (byte)((this.text.getBytes())[k] & 0xFF);
        }
        offset += length_text;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_text = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_text |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_text |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_text |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_text = new byte[length_text];
        for(int k= 0; k< length_text; k++){
            bytes_text[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.text = new java.lang.String(bytes_text);
        offset += length_text;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_text = this.text.getBytes().length;
        length += 4;
        length += length_text;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/AutoDockingResult"; }
    public java.lang.String getMD5(){ return "dcd76d966f035bd985077b34060df94b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
