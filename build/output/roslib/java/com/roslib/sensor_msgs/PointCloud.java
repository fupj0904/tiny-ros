package com.roslib.sensor_msgs;

import java.lang.*;

public class PointCloud implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Point32[] points;
    public com.roslib.sensor_msgs.ChannelFloat32[] channels;

    public PointCloud() {
        this.header = new com.roslib.std_msgs.Header();
        this.points = null;
        this.channels = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_points = this.points != null ? this.points.length : 0;
        outbuffer[offset + 0] = (byte)((length_points >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_points >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_points >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_points >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].serialize(outbuffer, offset);
        }
        int length_channels = this.channels != null ? this.channels.length : 0;
        outbuffer[offset + 0] = (byte)((length_channels >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_channels >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_channels >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_channels >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_channels; i++){
        offset = this.channels[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_points = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_points |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_points |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_points |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_points > 0) {
            this.points = new com.roslib.geometry_msgs.Point32[length_points];
        }
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].deserialize(inbuffer, offset);
        }
        int length_channels = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_channels |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_channels |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_channels |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_channels > 0) {
            this.channels = new com.roslib.sensor_msgs.ChannelFloat32[length_channels];
        }
        for (int i = 0; i < length_channels; i++){
        offset = this.channels[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_points = this.points != null ? this.points.length : 0;
        for (int i = 0; i < length_points; i++) {
        length += this.points[i].serializedLength();
        }
        length += 4;
        int length_channels = this.channels != null ? this.channels.length : 0;
        for (int i = 0; i < length_channels; i++) {
        length += this.channels[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/PointCloud"; }
    public java.lang.String getMD5(){ return "b01249148cae0106a561ab36cd1e48a8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
