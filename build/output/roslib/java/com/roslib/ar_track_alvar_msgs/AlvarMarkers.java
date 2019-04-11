package com.roslib.ar_track_alvar_msgs;

import java.lang.*;

public class AlvarMarkers implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.ar_track_alvar_msgs.AlvarMarker[] markers;

    public AlvarMarkers() {
        this.header = new com.roslib.std_msgs.Header();
        this.markers = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_markers = this.markers != null ? this.markers.length : 0;
        outbuffer[offset + 0] = (byte)((length_markers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_markers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_markers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_markers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_markers; i++){
        offset = this.markers[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_markers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_markers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_markers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_markers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_markers > 0) {
            this.markers = new com.roslib.ar_track_alvar_msgs.AlvarMarker[length_markers];
        }
        for (int i = 0; i < length_markers; i++){
        offset = this.markers[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_markers = this.markers != null ? this.markers.length : 0;
        for (int i = 0; i < length_markers; i++) {
        length += this.markers[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "ar_track_alvar_msgs/AlvarMarkers"; }
    public java.lang.String getMD5(){ return "bcd4829ccad37edc2d27a0e05102a61c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
