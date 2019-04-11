package com.roslib.yocs_msgs;

import java.lang.*;

public class ARPairList implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.ARPair[] pairs;

    public ARPairList() {
        this.pairs = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_pairs = this.pairs != null ? this.pairs.length : 0;
        outbuffer[offset + 0] = (byte)((length_pairs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pairs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pairs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pairs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_pairs; i++){
        offset = this.pairs[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_pairs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pairs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pairs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pairs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_pairs > 0) {
            this.pairs = new com.roslib.yocs_msgs.ARPair[length_pairs];
        }
        for (int i = 0; i < length_pairs; i++){
        offset = this.pairs[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_pairs = this.pairs != null ? this.pairs.length : 0;
        for (int i = 0; i < length_pairs; i++) {
        length += this.pairs[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/ARPairList"; }
    public java.lang.String getMD5(){ return "9f324f032aab0909e1d056828d91f411"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
