package com.roslib.stdr_msgs;

import java.lang.*;

public class FootprintMsg implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Point[] points;
    public float radius;

    public FootprintMsg() {
        this.points = null;
        this.radius = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_points = this.points != null ? this.points.length : 0;
        outbuffer[offset + 0] = (byte)((length_points >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_points >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_points >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_points >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].serialize(outbuffer, offset);
        }
        int bits_radius = Float.floatToRawIntBits(radius);
        outbuffer[offset + 0] = (byte)((bits_radius >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_radius >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_radius >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_radius >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_points = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_points |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_points |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_points |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_points > 0) {
            this.points = new com.roslib.geometry_msgs.Point[length_points];
        }
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].deserialize(inbuffer, offset);
        }
        int bits_radius = 0;
        bits_radius |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_radius |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_radius |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_radius |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.radius = Float.intBitsToFloat(bits_radius);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_points = this.points != null ? this.points.length : 0;
        for (int i = 0; i < length_points; i++) {
        length += this.points[i].serializedLength();
        }
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/FootprintMsg"; }
    public java.lang.String getMD5(){ return "458c3cd311d2fbd1a2c6093ea4ac535c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
