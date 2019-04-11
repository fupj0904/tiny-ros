package com.roslib.map_msgs;

import java.lang.*;

public class ProjectedMap implements com.roslib.ros.Msg {
    public com.roslib.nav_msgs.OccupancyGrid map;
    public double min_z;
    public double max_z;

    public ProjectedMap() {
        this.map = new com.roslib.nav_msgs.OccupancyGrid();
        this.min_z = 0;
        this.max_z = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.map.serialize(outbuffer, offset);
        long bits_min_z = Double.doubleToRawLongBits(this.min_z);
        outbuffer[offset + 0] = (byte)((bits_min_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_min_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_min_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_min_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_min_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_min_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_min_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_min_z >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_max_z = Double.doubleToRawLongBits(this.max_z);
        outbuffer[offset + 0] = (byte)((bits_max_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_max_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_max_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_max_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_max_z >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.map.deserialize(inbuffer, offset);
        long bits_min_z = 0;
        bits_min_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_min_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_min_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_min_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_min_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_min_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_min_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_min_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.min_z = Double.longBitsToDouble(bits_min_z);
        offset += 8;
        long bits_max_z = 0;
        bits_max_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_max_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_max_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_max_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_max_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.max_z = Double.longBitsToDouble(bits_max_z);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.map.serializedLength();
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "map_msgs/ProjectedMap"; }
    public java.lang.String getMD5(){ return "cbd5598c259cc16f5aa07335587a7367"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
