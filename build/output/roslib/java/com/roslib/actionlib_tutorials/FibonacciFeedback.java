package com.roslib.actionlib_tutorials;

import java.lang.*;

public class FibonacciFeedback implements com.roslib.ros.Msg {
    public int[] sequence;

    public FibonacciFeedback() {
        this.sequence = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_sequence = this.sequence != null ? this.sequence.length : 0;
        outbuffer[offset + 0] = (byte)((length_sequence >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_sequence >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_sequence >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_sequence >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_sequence; i++){
        outbuffer[offset + 0] = (byte)((this.sequence[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.sequence[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.sequence[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.sequence[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_sequence = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_sequence |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_sequence |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_sequence |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_sequence > 0) {
            this.sequence = new int[length_sequence];
        }
        for (int i = 0; i < length_sequence; i++){
        this.sequence[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sequence[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sequence[i] |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sequence[i] |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_sequence = this.sequence != null ? this.sequence.length : 0;
        for (int i = 0; i < length_sequence; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "actionlib_tutorials/FibonacciFeedback"; }
    public java.lang.String getMD5(){ return "e59877384c55dba8de42653ce6b6bafa"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
