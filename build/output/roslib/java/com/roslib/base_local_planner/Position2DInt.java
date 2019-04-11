package com.roslib.base_local_planner;

import java.lang.*;

public class Position2DInt implements com.roslib.ros.Msg {
    public long x;
    public long y;

    public Position2DInt() {
        this.x = 0;
        this.y = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.x >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.x >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.x >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.x >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.x >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset + 0] = (byte)((this.y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.y >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.y >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.y >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.y >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.y >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.x   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.x |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.x |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.x |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.x |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        this.y   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.y |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.y |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.y |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.y |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "base_local_planner/Position2DInt"; }
    public java.lang.String getMD5(){ return "0fe4c5b7d4e4c11b918483873774fd09"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
