package com.roslib.map_msgs;

import java.lang.*;

public class OccupancyGridUpdate implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int x;
    public int y;
    public long width;
    public long height;
    public byte[] data;

    public OccupancyGridUpdate() {
        this.header = new com.roslib.std_msgs.Header();
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.data = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.x >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.y >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.width >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.height >> (8 * 3)) & 0xFF);
        offset += 4;
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
        this.x   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.x |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.x |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.x |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.y   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.y |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.y |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.y |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.width   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.height   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        return length;
    }

    public java.lang.String getType(){ return "map_msgs/OccupancyGridUpdate"; }
    public java.lang.String getMD5(){ return "159b2d7856932f2e2cad9b082ed99ec2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
