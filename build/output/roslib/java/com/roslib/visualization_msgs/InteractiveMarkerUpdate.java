package com.roslib.visualization_msgs;

import java.lang.*;

public class InteractiveMarkerUpdate implements com.roslib.ros.Msg {
    public java.lang.String server_id;
    public long seq_num;
    public int type;
    public com.roslib.visualization_msgs.InteractiveMarker[] markers;
    public com.roslib.visualization_msgs.InteractiveMarkerPose[] poses;
    public java.lang.String[] erases;
    public static final int KEEP_ALIVE = (int)( 0);
    public static final int UPDATE = (int)( 1);

    public InteractiveMarkerUpdate() {
        this.server_id = "";
        this.seq_num = 0;
        this.type = 0;
        this.markers = null;
        this.poses = null;
        this.erases = null;
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
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_markers = this.markers != null ? this.markers.length : 0;
        outbuffer[offset + 0] = (byte)((length_markers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_markers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_markers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_markers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_markers; i++){
        offset = this.markers[i].serialize(outbuffer, offset);
        }
        int length_poses = this.poses != null ? this.poses.length : 0;
        outbuffer[offset + 0] = (byte)((length_poses >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_poses >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_poses >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_poses >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_poses; i++){
        offset = this.poses[i].serialize(outbuffer, offset);
        }
        int length_erases = this.erases != null ? this.erases.length : 0;
        outbuffer[offset + 0] = (byte)((length_erases >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_erases >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_erases >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_erases >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_erases; i++){
        int length_erasesi = this.erases[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_erasesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_erasesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_erasesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_erasesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_erasesi; k++) {
            outbuffer[offset + k] = (byte)((this.erases[i].getBytes())[k] & 0xFF);
        }
        offset += length_erasesi;
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
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
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
        int length_poses = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_poses |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_poses |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_poses |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_poses > 0) {
            this.poses = new com.roslib.visualization_msgs.InteractiveMarkerPose[length_poses];
        }
        for (int i = 0; i < length_poses; i++){
        offset = this.poses[i].deserialize(inbuffer, offset);
        }
        int length_erases = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_erases |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_erases |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_erases |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_erases > 0) {
            this.erases = new java.lang.String[length_erases];
        }
        for (int i = 0; i < length_erases; i++){
        int length_erasesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_erasesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_erasesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_erasesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_erasesi = new byte[length_erasesi];
        for(int k= 0; k< length_erasesi; k++){
            bytes_erasesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.erases[i] = new java.lang.String(bytes_erasesi);
        offset += length_erasesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_server_id = this.server_id.getBytes().length;
        length += 4;
        length += length_server_id;
        length += 8;
        length += 1;
        length += 4;
        int length_markers = this.markers != null ? this.markers.length : 0;
        for (int i = 0; i < length_markers; i++) {
        length += this.markers[i].serializedLength();
        }
        length += 4;
        int length_poses = this.poses != null ? this.poses.length : 0;
        for (int i = 0; i < length_poses; i++) {
        length += this.poses[i].serializedLength();
        }
        length += 4;
        int length_erases = this.erases != null ? this.erases.length : 0;
        for (int i = 0; i < length_erases; i++) {
        int length_erasesi = this.erases[i].getBytes().length;
        length += 4;
        length += length_erasesi;
        }
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/InteractiveMarkerUpdate"; }
    public java.lang.String getMD5(){ return "ae37189a6cc8de1bae3ccd7710af4288"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
