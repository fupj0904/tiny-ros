package com.roslib.pcl_msgs;

import java.lang.*;

public class PointIndices implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int[] indices;

    public PointIndices() {
        this.header = new com.roslib.std_msgs.Header();
        this.indices = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_indices = this.indices != null ? this.indices.length : 0;
        outbuffer[offset + 0] = (byte)((length_indices >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_indices >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_indices >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_indices >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_indices; i++){
        outbuffer[offset + 0] = (byte)((this.indices[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.indices[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.indices[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.indices[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_indices = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_indices |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_indices |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_indices |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_indices > 0) {
            this.indices = new int[length_indices];
        }
        for (int i = 0; i < length_indices; i++){
        this.indices[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.indices[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.indices[i] |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.indices[i] |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_indices = this.indices != null ? this.indices.length : 0;
        for (int i = 0; i < length_indices; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "pcl_msgs/PointIndices"; }
    public java.lang.String getMD5(){ return "45a1791a1173815ba3ebc668b84b7bfd"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
