package com.roslib.geographic_msgs;

import java.lang.*;

public class GeographicMapChanges implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geographic_msgs.GeographicMap diffs;
    public com.roslib.uuid_msgs.UniqueID[] deletes;

    public GeographicMapChanges() {
        this.header = new com.roslib.std_msgs.Header();
        this.diffs = new com.roslib.geographic_msgs.GeographicMap();
        this.deletes = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.diffs.serialize(outbuffer, offset);
        int length_deletes = this.deletes != null ? this.deletes.length : 0;
        outbuffer[offset + 0] = (byte)((length_deletes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_deletes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_deletes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_deletes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_deletes; i++){
        offset = this.deletes[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.diffs.deserialize(inbuffer, offset);
        int length_deletes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_deletes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_deletes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_deletes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_deletes > 0) {
            this.deletes = new com.roslib.uuid_msgs.UniqueID[length_deletes];
        }
        for (int i = 0; i < length_deletes; i++){
        offset = this.deletes[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.diffs.serializedLength();
        length += 4;
        int length_deletes = this.deletes != null ? this.deletes.length : 0;
        for (int i = 0; i < length_deletes; i++) {
        length += this.deletes[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/GeographicMapChanges"; }
    public java.lang.String getMD5(){ return "22850af41937c16d27d19012b55866e1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
