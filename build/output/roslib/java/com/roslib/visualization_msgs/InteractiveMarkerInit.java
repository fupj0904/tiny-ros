package com.roslib.visualization_msgs;

import java.lang.*;

public class InteractiveMarkerInit implements com.roslib.ros.Msg {
    public java.lang.String server_id;
    public long seq_num;
    public com.roslib.visualization_msgs.InteractiveMarker[] markers;

    public InteractiveMarkerInit() {
        this.server_id = "";
        this.seq_num = 0;
        this.markers = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_server_id = this.server_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_server_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_server_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_server_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_server_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_server_id; k++) {
            outbuffer[offset + k] = (byte)((this.server_id.getBytes())[k] & 0xFF);
        }
        offset += length_server_id;
        outbuffer[offset + 0] = (byte)((this.seq_num >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.seq_num >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.seq_num >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.seq_num >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.seq_num >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.seq_num >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.seq_num >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.seq_num >> (8 * 7)) & 0xFF);
        offset += 8;
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
        int length_server_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_server_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_server_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_server_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_server_id = new byte[length_server_id];
        for(int k= 0; k< length_server_id; k++){
            bytes_server_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.server_id = new java.lang.String(bytes_server_id);
        offset += length_server_id;
        this.seq_num   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.seq_num |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.seq_num |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.seq_num |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.seq_num |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.seq_num |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.seq_num |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.seq_num |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        int length_markers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_markers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_markers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_markers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_markers > 0) {
            this.markers = new com.roslib.visualization_msgs.InteractiveMarker[length_markers];
        }
        for (int i = 0; i < length_markers; i++){
        offset = this.markers[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_server_id = this.server_id.getBytes().length;
        length += 4;
        length += length_server_id;
        length += 8;
        length += 4;
        int length_markers = this.markers != null ? this.markers.length : 0;
        for (int i = 0; i < length_markers; i++) {
        length += this.markers[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/InteractiveMarkerInit"; }
    public java.lang.String getMD5(){ return "b8259a8319519330ca4da698883a3e0e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
