package com.roslib.visualization_msgs;

import java.lang.*;

public class ImageMarker implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String ns;
    public int id;
    public int type;
    public int action;
    public com.roslib.geometry_msgs.Point position;
    public float scale;
    public com.roslib.std_msgs.ColorRGBA outline_color;
    public int filled;
    public com.roslib.std_msgs.ColorRGBA fill_color;
    public com.roslib.ros.Duration lifetime;
    public com.roslib.geometry_msgs.Point[] points;
    public com.roslib.std_msgs.ColorRGBA[] outline_colors;
    public static final int CIRCLE = (int)(0);
    public static final int LINE_STRIP = (int)(1);
    public static final int LINE_LIST = (int)(2);
    public static final int POLYGON = (int)(3);
    public static final int POINTS = (int)(4);
    public static final int ADD = (int)(0);
    public static final int REMOVE = (int)(1);

    public ImageMarker() {
        this.header = new com.roslib.std_msgs.Header();
        this.ns = "";
        this.id = 0;
        this.type = 0;
        this.action = 0;
        this.position = new com.roslib.geometry_msgs.Point();
        this.scale = 0;
        this.outline_color = new com.roslib.std_msgs.ColorRGBA();
        this.filled = 0;
        this.fill_color = new com.roslib.std_msgs.ColorRGBA();
        this.lifetime = new com.roslib.ros.Duration();
        this.points = null;
        this.outline_colors = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_ns = this.ns.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_ns >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ns >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ns >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ns >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_ns; k++) {
            outbuffer[offset + k] = (byte)((this.ns.getBytes())[k] & 0xFF);
        }
        offset += length_ns;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.type >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.action >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.action >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.action >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.action >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.position.serialize(outbuffer, offset);
        int bits_scale = Float.floatToRawIntBits(scale);
        outbuffer[offset + 0] = (byte)((bits_scale >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_scale >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_scale >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_scale >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.outline_color.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.filled >> (8 * 0)) & 0xFF);
        offset += 1;
        offset = this.fill_color.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.lifetime.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.lifetime.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.lifetime.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.lifetime.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.lifetime.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.lifetime.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.lifetime.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.lifetime.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_points = this.points != null ? this.points.length : 0;
        outbuffer[offset + 0] = (byte)((length_points >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_points >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_points >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_points >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].serialize(outbuffer, offset);
        }
        int length_outline_colors = this.outline_colors != null ? this.outline_colors.length : 0;
        outbuffer[offset + 0] = (byte)((length_outline_colors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_outline_colors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_outline_colors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_outline_colors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_outline_colors; i++){
        offset = this.outline_colors[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_ns = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ns |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ns |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ns |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_ns = new byte[length_ns];
        for(int k= 0; k< length_ns; k++){
            bytes_ns[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.ns = new java.lang.String(bytes_ns);
        offset += length_ns;
        this.id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.action   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.action |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.action |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.action |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.position.deserialize(inbuffer, offset);
        int bits_scale = 0;
        bits_scale |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_scale |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_scale |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_scale |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.scale = Float.intBitsToFloat(bits_scale);
        offset += 4;
        offset = this.outline_color.deserialize(inbuffer, offset);
        this.filled   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        offset = this.fill_color.deserialize(inbuffer, offset);
        this.lifetime.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.lifetime.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.lifetime.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.lifetime.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.lifetime.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.lifetime.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.lifetime.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.lifetime.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        int length_outline_colors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_outline_colors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_outline_colors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_outline_colors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_outline_colors > 0) {
            this.outline_colors = new com.roslib.std_msgs.ColorRGBA[length_outline_colors];
        }
        for (int i = 0; i < length_outline_colors; i++){
        offset = this.outline_colors[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_ns = this.ns.getBytes().length;
        length += 4;
        length += length_ns;
        length += 4;
        length += 4;
        length += 4;
        length += this.position.serializedLength();
        length += 4;
        length += this.outline_color.serializedLength();
        length += 1;
        length += this.fill_color.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        int length_points = this.points != null ? this.points.length : 0;
        for (int i = 0; i < length_points; i++) {
        length += this.points[i].serializedLength();
        }
        length += 4;
        int length_outline_colors = this.outline_colors != null ? this.outline_colors.length : 0;
        for (int i = 0; i < length_outline_colors; i++) {
        length += this.outline_colors[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/ImageMarker"; }
    public java.lang.String getMD5(){ return "453bce92c8194bc4489b79af1cdf861e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
