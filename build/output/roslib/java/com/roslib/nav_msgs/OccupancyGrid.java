package com.roslib.nav_msgs;

import java.lang.*;

public class OccupancyGrid implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.nav_msgs.MapMetaData info;
    public byte[] data;

    public OccupancyGrid() {
        this.header = new com.roslib.std_msgs.Header();
        this.info = new com.roslib.nav_msgs.MapMetaData();
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.info.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.info.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new byte[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.info.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/OccupancyGrid"; }
    public java.lang.String getMD5(){ return "e489a26457224a97799696f3642f16a0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
