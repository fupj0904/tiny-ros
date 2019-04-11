package com.roslib.geographic_msgs;

import java.lang.*;

public class RoutePath implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.uuid_msgs.UniqueID network;
    public com.roslib.uuid_msgs.UniqueID[] segments;
    public com.roslib.geographic_msgs.KeyValue[] props;

    public RoutePath() {
        this.header = new com.roslib.std_msgs.Header();
        this.network = new com.roslib.uuid_msgs.UniqueID();
        this.segments = null;
        this.props = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.network.serialize(outbuffer, offset);
        int length_segments = this.segments != null ? this.segments.length : 0;
        outbuffer[offset + 0] = (byte)((length_segments >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_segments >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_segments >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_segments >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_segments; i++){
        offset = this.segments[i].serialize(outbuffer, offset);
        }
        int length_props = this.props != null ? this.props.length : 0;
        outbuffer[offset + 0] = (byte)((length_props >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_props >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_props >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_props >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_props; i++){
        offset = this.props[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.network.deserialize(inbuffer, offset);
        int length_segments = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_segments |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_segments |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_segments |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_segments > 0) {
            this.segments = new com.roslib.uuid_msgs.UniqueID[length_segments];
        }
        for (int i = 0; i < length_segments; i++){
        offset = this.segments[i].deserialize(inbuffer, offset);
        }
        int length_props = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_props |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_props |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_props |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_props > 0) {
            this.props = new com.roslib.geographic_msgs.KeyValue[length_props];
        }
        for (int i = 0; i < length_props; i++){
        offset = this.props[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.network.serializedLength();
        length += 4;
        int length_segments = this.segments != null ? this.segments.length : 0;
        for (int i = 0; i < length_segments; i++) {
        length += this.segments[i].serializedLength();
        }
        length += 4;
        int length_props = this.props != null ? this.props.length : 0;
        for (int i = 0; i < length_props; i++) {
        length += this.props[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/RoutePath"; }
    public java.lang.String getMD5(){ return "011ece076f38fe7a08d1179d6f3421f4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
