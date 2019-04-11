package com.roslib.visualization_msgs;

import java.lang.*;

public class InteractiveMarkerFeedback implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String client_id;
    public java.lang.String marker_name;
    public java.lang.String control_name;
    public int event_type;
    public com.roslib.geometry_msgs.Pose pose;
    public long menu_entry_id;
    public com.roslib.geometry_msgs.Point mouse_point;
    public boolean mouse_point_valid;
    public static final int KEEP_ALIVE = (int)( 0);
    public static final int POSE_UPDATE = (int)( 1);
    public static final int MENU_SELECT = (int)( 2);
    public static final int BUTTON_CLICK = (int)( 3);
    public static final int MOUSE_DOWN = (int)( 4);
    public static final int MOUSE_UP = (int)( 5);

    public InteractiveMarkerFeedback() {
        this.header = new com.roslib.std_msgs.Header();
        this.client_id = "";
        this.marker_name = "";
        this.control_name = "";
        this.event_type = 0;
        this.pose = new com.roslib.geometry_msgs.Pose();
        this.menu_entry_id = 0;
        this.mouse_point = new com.roslib.geometry_msgs.Point();
        this.mouse_point_valid = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_client_id = this.client_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_client_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_client_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_client_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_client_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_client_id; k++) {
            outbuffer[offset + k] = (byte)((this.client_id.getBytes())[k] & 0xFF);
        }
        offset += length_client_id;
        int length_marker_name = this.marker_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_marker_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_marker_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_marker_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_marker_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_marker_name; k++) {
            outbuffer[offset + k] = (byte)((this.marker_name.getBytes())[k] & 0xFF);
        }
        offset += length_marker_name;
        int length_control_name = this.control_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_control_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_control_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_control_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_control_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_control_name; k++) {
            outbuffer[offset + k] = (byte)((this.control_name.getBytes())[k] & 0xFF);
        }
        offset += length_control_name;
        outbuffer[offset + 0] = (byte)((this.event_type >> (8 * 0)) & 0xFF);
        offset += 1;
        offset = this.pose.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.menu_entry_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.menu_entry_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.menu_entry_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.menu_entry_id >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.mouse_point.serialize(outbuffer, offset);
        outbuffer[offset] = (byte)((mouse_point_valid ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_client_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_client_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_client_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_client_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_client_id = new byte[length_client_id];
        for(int k= 0; k< length_client_id; k++){
            bytes_client_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.client_id = new java.lang.String(bytes_client_id);
        offset += length_client_id;
        int length_marker_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_marker_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_marker_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_marker_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_marker_name = new byte[length_marker_name];
        for(int k= 0; k< length_marker_name; k++){
            bytes_marker_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.marker_name = new java.lang.String(bytes_marker_name);
        offset += length_marker_name;
        int length_control_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_control_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_control_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_control_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_control_name = new byte[length_control_name];
        for(int k= 0; k< length_control_name; k++){
            bytes_control_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.control_name = new java.lang.String(bytes_control_name);
        offset += length_control_name;
        this.event_type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        offset = this.pose.deserialize(inbuffer, offset);
        this.menu_entry_id   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.menu_entry_id |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.menu_entry_id |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.menu_entry_id |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.mouse_point.deserialize(inbuffer, offset);
        this.mouse_point_valid = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_client_id = this.client_id.getBytes().length;
        length += 4;
        length += length_client_id;
        int length_marker_name = this.marker_name.getBytes().length;
        length += 4;
        length += length_marker_name;
        int length_control_name = this.control_name.getBytes().length;
        length += 4;
        length += length_control_name;
        length += 1;
        length += this.pose.serializedLength();
        length += 4;
        length += this.mouse_point.serializedLength();
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/InteractiveMarkerFeedback"; }
    public java.lang.String getMD5(){ return "2b2c717ae73a04857e91f4992896e58f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
