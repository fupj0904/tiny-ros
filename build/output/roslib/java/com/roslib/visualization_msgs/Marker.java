package com.roslib.visualization_msgs;

import java.lang.*;

public class Marker implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String ns;
    public int id;
    public int type;
    public int action;
    public com.roslib.geometry_msgs.Pose pose;
    public com.roslib.geometry_msgs.Vector3 scale;
    public com.roslib.std_msgs.ColorRGBA color;
    public com.roslib.ros.Duration lifetime;
    public boolean frame_locked;
    public com.roslib.geometry_msgs.Point[] points;
    public com.roslib.std_msgs.ColorRGBA[] colors;
    public java.lang.String text;
    public java.lang.String mesh_resource;
    public boolean mesh_use_embedded_materials;
    public static final int ARROW = (int)(0);
    public static final int CUBE = (int)(1);
    public static final int SPHERE = (int)(2);
    public static final int CYLINDER = (int)(3);
    public static final int LINE_STRIP = (int)(4);
    public static final int LINE_LIST = (int)(5);
    public static final int CUBE_LIST = (int)(6);
    public static final int SPHERE_LIST = (int)(7);
    public static final int POINTS = (int)(8);
    public static final int TEXT_VIEW_FACING = (int)(9);
    public static final int MESH_RESOURCE = (int)(10);
    public static final int TRIANGLE_LIST = (int)(11);
    public static final int ADD = (int)(0);
    public static final int MODIFY = (int)(0);
    public static final int DELETE = (int)(2);

    public Marker() {
        this.header = new com.roslib.std_msgs.Header();
        this.ns = "";
        this.id = 0;
        this.type = 0;
        this.action = 0;
        this.pose = new com.roslib.geometry_msgs.Pose();
        this.scale = new com.roslib.geometry_msgs.Vector3();
        this.color = new com.roslib.std_msgs.ColorRGBA();
        this.lifetime = new com.roslib.ros.Duration();
        this.frame_locked = false;
        this.points = null;
        this.colors = null;
        this.text = "";
        this.mesh_resource = "";
        this.mesh_use_embedded_materials = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_ns = this.ns.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_ns >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ns >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ns >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ns >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_ns; k++) {
            outbuffer[offset + k] = (byte)((this.ns.getBytes())[k] & 0xFF);
        }
        offset += length_ns;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.type >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.action >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.action >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.action >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.action >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.pose.serialize(outbuffer, offset);
        offset = this.scale.serialize(outbuffer, offset);
        offset = this.color.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.lifetime.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.lifetime.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.lifetime.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.lifetime.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.lifetime.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.lifetime.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.lifetime.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.lifetime.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((frame_locked ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_points = this.points != null ? this.points.length : 0;
        outbuffer[offset + 0] = (byte)((length_points >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_points >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_points >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_points >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].serialize(outbuffer, offset);
        }
        int length_colors = this.colors != null ? this.colors.length : 0;
        outbuffer[offset + 0] = (byte)((length_colors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_colors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_colors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_colors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_colors; i++){
        offset = this.colors[i].serialize(outbuffer, offset);
        }
        int length_text = this.text.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_text >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_text >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_text >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_text >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_text; k++) {
            outbuffer[offset + k] = (byte)((this.text.getBytes())[k] & 0xFF);
        }
        offset += length_text;
        int length_mesh_resource = this.mesh_resource.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_mesh_resource >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_mesh_resource >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_mesh_resource >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_mesh_resource >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_mesh_resource; k++) {
            outbuffer[offset + k] = (byte)((this.mesh_resource.getBytes())[k] & 0xFF);
        }
        offset += length_mesh_resource;
        outbuffer[offset] = (byte)((mesh_use_embedded_materials ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_ns = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ns |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ns |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ns |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_ns = new byte[length_ns];
        for(int k= 0; k< length_ns; k++){
            bytes_ns[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.ns = new java.lang.String(bytes_ns);
        offset += length_ns;
        this.id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.action   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.action |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.action |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.action |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.pose.deserialize(inbuffer, offset);
        offset = this.scale.deserialize(inbuffer, offset);
        offset = this.color.deserialize(inbuffer, offset);
        this.lifetime.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.lifetime.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.lifetime.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.lifetime.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.lifetime.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.lifetime.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.lifetime.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.lifetime.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.frame_locked = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_points = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_points |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_points |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_points |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_points > 0) {
            this.points = new com.roslib.geometry_msgs.Point[length_points];
        }
        for (int i = 0; i < length_points; i++){
        offset = this.points[i].deserialize(inbuffer, offset);
        }
        int length_colors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_colors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_colors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_colors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_colors > 0) {
            this.colors = new com.roslib.std_msgs.ColorRGBA[length_colors];
        }
        for (int i = 0; i < length_colors; i++){
        offset = this.colors[i].deserialize(inbuffer, offset);
        }
        int length_text = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_text |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_text |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_text |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_text = new byte[length_text];
        for(int k= 0; k< length_text; k++){
            bytes_text[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.text = new java.lang.String(bytes_text);
        offset += length_text;
        int length_mesh_resource = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_mesh_resource |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_mesh_resource |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_mesh_resource |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_mesh_resource = new byte[length_mesh_resource];
        for(int k= 0; k< length_mesh_resource; k++){
            bytes_mesh_resource[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.mesh_resource = new java.lang.String(bytes_mesh_resource);
        offset += length_mesh_resource;
        this.mesh_use_embedded_materials = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_ns = this.ns.getBytes().length;
        length += 4;
        length += length_ns;
        length += 4;
        length += 4;
        length += 4;
        length += this.pose.serializedLength();
        length += this.scale.serializedLength();
        length += this.color.serializedLength();
        length += 4;
        length += 4;
        length += 1;
        length += 4;
        int length_points = this.points != null ? this.points.length : 0;
        for (int i = 0; i < length_points; i++) {
        length += this.points[i].serializedLength();
        }
        length += 4;
        int length_colors = this.colors != null ? this.colors.length : 0;
        for (int i = 0; i < length_colors; i++) {
        length += this.colors[i].serializedLength();
        }
        int length_text = this.text.getBytes().length;
        length += 4;
        length += length_text;
        int length_mesh_resource = this.mesh_resource.getBytes().length;
        length += 4;
        length += length_mesh_resource;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "visualization_msgs/Marker"; }
    public java.lang.String getMD5(){ return "666484e5c1e264d98a42c3b7c44c0ac3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
