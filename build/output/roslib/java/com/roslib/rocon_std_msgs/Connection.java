package com.roslib.rocon_std_msgs;

import java.lang.*;

public class Connection implements com.roslib.ros.Msg {
    public java.lang.String type;
    public java.lang.String name;
    public java.lang.String node;
    public java.lang.String type_info;
    public java.lang.String xmlrpc_uri;
    public static final java.lang.String PUBLISHER = (java.lang.String)(" publisher");
    public static final java.lang.String SUBSCRIBER = (java.lang.String)(" subscriber");
    public static final java.lang.String SERVICE = (java.lang.String)(" service");
    public static final java.lang.String ACTION_CLIENT = (java.lang.String)(" action_client");
    public static final java.lang.String ACTION_SERVER = (java.lang.String)(" action_server");
    public static final java.lang.String INVALID = (java.lang.String)(" invalid");

    public Connection() {
        this.type = "";
        this.name = "";
        this.node = "";
        this.type_info = "";
        this.xmlrpc_uri = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
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
        int length_node = this.node.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_node >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_node >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_node >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_node >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_node; k++) {
            outbuffer[offset + k] = (byte)((this.node.getBytes())[k] & 0xFF);
        }
        offset += length_node;
        int length_type_info = this.type_info.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type_info >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type_info >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type_info >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type_info >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type_info; k++) {
            outbuffer[offset + k] = (byte)((this.type_info.getBytes())[k] & 0xFF);
        }
        offset += length_type_info;
        int length_xmlrpc_uri = this.xmlrpc_uri.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_xmlrpc_uri >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_xmlrpc_uri >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_xmlrpc_uri >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_xmlrpc_uri >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_xmlrpc_uri; k++) {
            outbuffer[offset + k] = (byte)((this.xmlrpc_uri.getBytes())[k] & 0xFF);
        }
        offset += length_xmlrpc_uri;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
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
        int length_node = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_node |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_node |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_node |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_node = new byte[length_node];
        for(int k= 0; k< length_node; k++){
            bytes_node[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.node = new java.lang.String(bytes_node);
        offset += length_node;
        int length_type_info = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type_info |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type_info |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type_info |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type_info = new byte[length_type_info];
        for(int k= 0; k< length_type_info; k++){
            bytes_type_info[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type_info = new java.lang.String(bytes_type_info);
        offset += length_type_info;
        int length_xmlrpc_uri = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_xmlrpc_uri |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_xmlrpc_uri |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_xmlrpc_uri |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_xmlrpc_uri = new byte[length_xmlrpc_uri];
        for(int k= 0; k< length_xmlrpc_uri; k++){
            bytes_xmlrpc_uri[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.xmlrpc_uri = new java.lang.String(bytes_xmlrpc_uri);
        offset += length_xmlrpc_uri;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_node = this.node.getBytes().length;
        length += 4;
        length += length_node;
        int length_type_info = this.type_info.getBytes().length;
        length += 4;
        length += length_type_info;
        int length_xmlrpc_uri = this.xmlrpc_uri.getBytes().length;
        length += 4;
        length += length_xmlrpc_uri;
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/Connection"; }
    public java.lang.String getMD5(){ return "64381366d1e1e16de09ee4d0d4609551"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
