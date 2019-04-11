package com.roslib.visualization_msgs;

import java.lang.*;

public class InteractiveMarkerControl implements com.roslib.ros.Msg {
    public java.lang.String name;
    public com.roslib.geometry_msgs.Quaternion orientation;
    public int orientation_mode;
    public int interaction_mode;
    public boolean always_visible;
    public com.roslib.visualization_msgs.Marker[] markers;
    public boolean independent_marker_orientation;
    public java.lang.String description;
    public static final int INHERIT = (int)( 0);
    public static final int FIXED = (int)( 1);
    public static final int VIEW_FACING = (int)( 2);
    public static final int NONE = (int)( 0);
    public static final int MENU = (int)( 1);
    public static final int BUTTON = (int)( 2);
    public static final int MOVE_AXIS = (int)( 3);
    public static final int MOVE_PLANE = (int)( 4);
    public static final int ROTATE_AXIS = (int)( 5);
    public static final int MOVE_ROTATE = (int)( 6);
    public static final int MOVE_3D = (int)( 7);
    public static final int ROTATE_3D = (int)( 8);
    public static final int MOVE_ROTATE_3D = (int)( 9);

    public InteractiveMarkerControl() {
        this.name = "";
        this.orientation = new com.roslib.geometry_msgs.Quaternion();
        this.orientation_mode = 0;
        this.interaction_mode = 0;
        this.always_visible = false;
        this.markers = null;
        this.independent_marker_orientation = false;
        this.description = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        offset = this.orientation.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.orientation_mode >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.interaction_mode >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((always_visible ? 0x01 : 0x00) & 0xFF);
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
        outbuffer[offset] = (byte)((independent_marker_orientation ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_description = this.description.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_description >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_description >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_description >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_description >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_description; k++) {
            outbuffer[offset + k] = (byte)((this.description.getBytes())[k] & 0xFF);
        }
        offset += length_description;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        offset = this.orientation.deserialize(inbuffer, offset);
        this.orientation_mode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.interaction_mode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.always_visible = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_markers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_markers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_markers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_markers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_markers > 0) {
            this.markers = new com.roslib.visualization_msgs.Marker[length_markers];
        }
        for (int i = 0; i < length_markers; i++){
        offset = this.markers[i].deserialize(inbuffer, offset);
        }
        this.independent_marker_orientation = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_description = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_description |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_description |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_description |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_description = new byte[length_description];
        for(int k= 0; k< length_description; k++){
            bytes_description[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.description = new java.lang.String(bytes_description);
        offset += length_description;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += this.orientation.serializedLength();
        length += 1;
        length += 1;
        length += 1;
        length += 4;
        int length_markers = this.markers != null ? this.markers.length : 0;
        for (int i = 0; i < length_markers; i++) {
        length += this.markers[i].serializedLength();
        }
        length += 1;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/InteractiveMarkerControl"; }
    public java.lang.String getMD5(){ return "22b3d411f6992b5b98c859d9077512ba"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
