package com.roslib.geographic_msgs;

import java.lang.*;

public class MapFeature implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.uuid_msgs.UniqueID[] components;
    public com.roslib.geographic_msgs.KeyValue[] props;

    public MapFeature() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.components = null;
        this.props = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.id.serialize(outbuffer, offset);
        int length_components = this.components != null ? this.components.length : 0;
        outbuffer[offset + 0] = (byte)((length_components >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_components >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_components >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_components >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_components; i++){
        offset = this.components[i].serialize(outbuffer, offset);
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
        offset = this.id.deserialize(inbuffer, offset);
        int length_components = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_components |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_components |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_components |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_components > 0) {
            this.components = new com.roslib.uuid_msgs.UniqueID[length_components];
        }
        for (int i = 0; i < length_components; i++){
        offset = this.components[i].deserialize(inbuffer, offset);
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
        length += this.id.serializedLength();
        length += 4;
        int length_components = this.components != null ? this.components.length : 0;
        for (int i = 0; i < length_components; i++) {
        length += this.components[i].serializedLength();
        }
        length += 4;
        int length_props = this.props != null ? this.props.length : 0;
        for (int i = 0; i < length_props; i++) {
        length += this.props[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/MapFeature"; }
    public java.lang.String getMD5(){ return "0918d64c4dc62c7b0b3212dbc8123690"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
