package com.roslib.gateway_msgs;

import java.lang.*;

public class Rule implements com.roslib.ros.Msg {
    public java.lang.String type;
    public java.lang.String name;
    public java.lang.String node;

    public Rule() {
        this.type = "";
        this.name = "";
        this.node = "";
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
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/Rule"; }
    public java.lang.String getMD5(){ return "095dec138d4e33a48c2d6a15905c155f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
