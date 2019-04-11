package com.roslib.sensor_msgs;

import java.lang.*;

public class RegionOfInterest implements com.roslib.ros.Msg {
    public long x_offset;
    public long y_offset;
    public long height;
    public long width;
    public boolean do_rectify;

    public RegionOfInterest() {
        this.x_offset = 0;
        this.y_offset = 0;
        this.height = 0;
        this.width = 0;
        this.do_rectify = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.x_offset >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.x_offset >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.x_offset >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.x_offset >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.y_offset >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.y_offset >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.y_offset >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.y_offset >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.height >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.width >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((do_rectify ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.x_offset   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.x_offset |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.x_offset |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.x_offset |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.y_offset   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.y_offset |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.y_offset |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.y_offset |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.height   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.width   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.do_rectify = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/RegionOfInterest"; }
    public java.lang.String getMD5(){ return "8370dc286f915405c906299aef5bb442"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
