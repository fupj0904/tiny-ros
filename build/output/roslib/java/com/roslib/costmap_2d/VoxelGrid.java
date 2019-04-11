package com.roslib.costmap_2d;

import java.lang.*;

public class VoxelGrid implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long[] data;
    public com.roslib.geometry_msgs.Point32 origin;
    public com.roslib.geometry_msgs.Vector3 resolutions;
    public long size_x;
    public long size_y;
    public long size_z;

    public VoxelGrid() {
        this.header = new com.roslib.std_msgs.Header();
        this.data = null;
        this.origin = new com.roslib.geometry_msgs.Point32();
        this.resolutions = new com.roslib.geometry_msgs.Vector3();
        this.size_x = 0;
        this.size_y = 0;
        this.size_z = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.data[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.data[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.data[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        offset = this.origin.serialize(outbuffer, offset);
        offset = this.resolutions.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.size_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.size_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.size_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.size_x >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.size_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.size_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.size_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.size_y >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.size_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.size_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.size_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.size_z >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new long[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.data[i] |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.data[i] |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.data[i] |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
        offset = this.origin.deserialize(inbuffer, offset);
        offset = this.resolutions.deserialize(inbuffer, offset);
        this.size_x   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.size_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.size_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.size_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.size_y   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.size_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.size_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.size_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.size_z   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.size_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.size_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.size_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 4;
        }
        length += this.origin.serializedLength();
        length += this.resolutions.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "costmap_2d/VoxelGrid"; }
    public java.lang.String getMD5(){ return "666cbe506ecab29e233563e3aa952db5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
