package com.roslib.std_msgs;

import java.lang.*;

public class MultiArrayLayout implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.MultiArrayDimension[] dim;
    public long data_offset;

    public MultiArrayLayout() {
        this.dim = null;
        this.data_offset = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_dim = this.dim != null ? this.dim.length : 0;
        outbuffer[offset + 0] = (byte)((length_dim >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_dim >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_dim >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_dim >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_dim; i++){
        offset = this.dim[i].serialize(outbuffer, offset);
        }
        outbuffer[offset + 0] = (byte)((this.data_offset >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data_offset >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data_offset >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data_offset >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_dim = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_dim |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_dim |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_dim |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_dim > 0) {
            this.dim = new com.roslib.std_msgs.MultiArrayDimension[length_dim];
        }
        for (int i = 0; i < length_dim; i++){
        offset = this.dim[i].deserialize(inbuffer, offset);
        }
        this.data_offset   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data_offset |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data_offset |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data_offset |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_dim = this.dim != null ? this.dim.length : 0;
        for (int i = 0; i < length_dim; i++) {
        length += this.dim[i].serializedLength();
        }
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/MultiArrayLayout"; }
    public java.lang.String getMD5(){ return "f40f0b5b285a93ca167c98c1012a989a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
