package com.roslib.nav_msgs;

import java.lang.*;

public class MapMetaData implements com.roslib.ros.Msg {
    public com.roslib.ros.Time map_load_time;
    public float resolution;
    public long width;
    public long height;
    public com.roslib.geometry_msgs.Pose origin;

    public MapMetaData() {
        this.map_load_time = new com.roslib.ros.Time();
        this.resolution = 0;
        this.width = 0;
        this.height = 0;
        this.origin = new com.roslib.geometry_msgs.Pose();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.map_load_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.map_load_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.map_load_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.map_load_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.map_load_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.map_load_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.map_load_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.map_load_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_resolution = Float.floatToRawIntBits(resolution);
        outbuffer[offset + 0] = (byte)((bits_resolution >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_resolution >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_resolution >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_resolution >> (8 * 3)) & 0xFF);
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
        offset = this.origin.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.map_load_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.map_load_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.map_load_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.map_load_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.map_load_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.map_load_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.map_load_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.map_load_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int bits_resolution = 0;
        bits_resolution |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_resolution |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_resolution |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_resolution |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.resolution = Float.intBitsToFloat(bits_resolution);
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
        offset = this.origin.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += this.origin.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/MapMetaData"; }
    public java.lang.String getMD5(){ return "328f5a1f2242fff4676d48189bd8b309"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
