package com.roslib.geographic_msgs;

import java.lang.*;

public class RouteSegment implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.uuid_msgs.UniqueID start;
    public com.roslib.uuid_msgs.UniqueID end;
    public com.roslib.geographic_msgs.KeyValue[] props;

    public RouteSegment() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.start = new com.roslib.uuid_msgs.UniqueID();
        this.end = new com.roslib.uuid_msgs.UniqueID();
        this.props = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.id.serialize(outbuffer, offset);
        offset = this.start.serialize(outbuffer, offset);
        offset = this.end.serialize(outbuffer, offset);
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
        offset = this.id.deserialize(inbuffer, offset);
        offset = this.start.deserialize(inbuffer, offset);
        offset = this.end.deserialize(inbuffer, offset);
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
        length += this.id.serializedLength();
        length += this.start.serializedLength();
        length += this.end.serializedLength();
        length += 4;
        int length_props = this.props != null ? this.props.length : 0;
        for (int i = 0; i < length_props; i++) {
        length += this.props[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/RouteSegment"; }
    public java.lang.String getMD5(){ return "0f1dca004a7ea17e6f7b93d529deb745"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
