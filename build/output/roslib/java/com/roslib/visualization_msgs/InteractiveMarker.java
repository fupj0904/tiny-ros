package com.roslib.visualization_msgs;

import java.lang.*;

public class InteractiveMarker implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.geometry_msgs.Pose pose;
    public java.lang.String name;
    public java.lang.String description;
    public float scale;
    public com.roslib.visualization_msgs.MenuEntry[] menu_entries;
    public com.roslib.visualization_msgs.InteractiveMarkerControl[] controls;

    public InteractiveMarker() {
        this.header = new com.roslib.std_msgs.Header();
        this.pose = new com.roslib.geometry_msgs.Pose();
        this.name = "";
        this.description = "";
        this.scale = 0;
        this.menu_entries = null;
        this.controls = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        offset = this.pose.serialize(outbuffer, offset);
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
        int bits_scale = Float.floatToRawIntBits(scale);
        outbuffer[offset + 0] = (byte)((bits_scale >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_scale >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_scale >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_scale >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_menu_entries = this.menu_entries != null ? this.menu_entries.length : 0;
        outbuffer[offset + 0] = (byte)((length_menu_entries >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_menu_entries >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_menu_entries >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_menu_entries >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_menu_entries; i++){
        offset = this.menu_entries[i].serialize(outbuffer, offset);
        }
        int length_controls = this.controls != null ? this.controls.length : 0;
        outbuffer[offset + 0] = (byte)((length_controls >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_controls >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_controls >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_controls >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_controls; i++){
        offset = this.controls[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        offset = this.pose.deserialize(inbuffer, offset);
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
        int bits_scale = 0;
        bits_scale |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_scale |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_scale |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_scale |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.scale = Float.intBitsToFloat(bits_scale);
        offset += 4;
        int length_menu_entries = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_menu_entries |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_menu_entries |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_menu_entries |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_menu_entries > 0) {
            this.menu_entries = new com.roslib.visualization_msgs.MenuEntry[length_menu_entries];
        }
        for (int i = 0; i < length_menu_entries; i++){
        offset = this.menu_entries[i].deserialize(inbuffer, offset);
        }
        int length_controls = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_controls |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_controls |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_controls |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_controls > 0) {
            this.controls = new com.roslib.visualization_msgs.InteractiveMarkerControl[length_controls];
        }
        for (int i = 0; i < length_controls; i++){
        offset = this.controls[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += this.pose.serializedLength();
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        length += 4;
        length += 4;
        int length_menu_entries = this.menu_entries != null ? this.menu_entries.length : 0;
        for (int i = 0; i < length_menu_entries; i++) {
        length += this.menu_entries[i].serializedLength();
        }
        length += 4;
        int length_controls = this.controls != null ? this.controls.length : 0;
        for (int i = 0; i < length_controls; i++) {
        length += this.controls[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/InteractiveMarker"; }
    public java.lang.String getMD5(){ return "9ebcf376fedf5708487702be1923ba61"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
