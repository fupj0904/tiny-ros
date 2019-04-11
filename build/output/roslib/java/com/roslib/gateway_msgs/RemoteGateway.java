package com.roslib.gateway_msgs;

import java.lang.*;

public class RemoteGateway implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String ip;
    public boolean firewall;
    public com.roslib.gateway_msgs.ConnectionStatistics conn_stats;
    public com.roslib.gateway_msgs.Rule[] public_interface;
    public com.roslib.gateway_msgs.RemoteRule[] flipped_interface;
    public com.roslib.gateway_msgs.RemoteRule[] pulled_interface;
    public static final byte WIRED = (byte)( 1);
    public static final byte WIRELESS = (byte)( 2);

    public RemoteGateway() {
        this.name = "";
        this.ip = "";
        this.firewall = false;
        this.conn_stats = new com.roslib.gateway_msgs.ConnectionStatistics();
        this.public_interface = null;
        this.flipped_interface = null;
        this.pulled_interface = null;
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
        int length_ip = this.ip.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_ip >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ip >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ip >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ip >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_ip; k++) {
            outbuffer[offset + k] = (byte)((this.ip.getBytes())[k] & 0xFF);
        }
        offset += length_ip;
        outbuffer[offset] = (byte)((firewall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        offset = this.conn_stats.serialize(outbuffer, offset);
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        outbuffer[offset + 0] = (byte)((length_public_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_public_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_public_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_public_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_public_interface; i++){
        offset = this.public_interface[i].serialize(outbuffer, offset);
        }
        int length_flipped_interface = this.flipped_interface != null ? this.flipped_interface.length : 0;
        outbuffer[offset + 0] = (byte)((length_flipped_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_flipped_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_flipped_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_flipped_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_flipped_interface; i++){
        offset = this.flipped_interface[i].serialize(outbuffer, offset);
        }
        int length_pulled_interface = this.pulled_interface != null ? this.pulled_interface.length : 0;
        outbuffer[offset + 0] = (byte)((length_pulled_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pulled_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pulled_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pulled_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_pulled_interface; i++){
        offset = this.pulled_interface[i].serialize(outbuffer, offset);
        }
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
        int length_ip = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ip |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ip |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ip |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_ip = new byte[length_ip];
        for(int k= 0; k< length_ip; k++){
            bytes_ip[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.ip = new java.lang.String(bytes_ip);
        offset += length_ip;
        this.firewall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        offset = this.conn_stats.deserialize(inbuffer, offset);
        int length_public_interface = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_public_interface |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_public_interface |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_public_interface |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_public_interface > 0) {
            this.public_interface = new com.roslib.gateway_msgs.Rule[length_public_interface];
        }
        for (int i = 0; i < length_public_interface; i++){
        offset = this.public_interface[i].deserialize(inbuffer, offset);
        }
        int length_flipped_interface = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_flipped_interface |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_flipped_interface |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_flipped_interface |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_flipped_interface > 0) {
            this.flipped_interface = new com.roslib.gateway_msgs.RemoteRule[length_flipped_interface];
        }
        for (int i = 0; i < length_flipped_interface; i++){
        offset = this.flipped_interface[i].deserialize(inbuffer, offset);
        }
        int length_pulled_interface = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pulled_interface |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pulled_interface |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pulled_interface |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_pulled_interface > 0) {
            this.pulled_interface = new com.roslib.gateway_msgs.RemoteRule[length_pulled_interface];
        }
        for (int i = 0; i < length_pulled_interface; i++){
        offset = this.pulled_interface[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_ip = this.ip.getBytes().length;
        length += 4;
        length += length_ip;
        length += 1;
        length += this.conn_stats.serializedLength();
        length += 4;
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        for (int i = 0; i < length_public_interface; i++) {
        length += this.public_interface[i].serializedLength();
        }
        length += 4;
        int length_flipped_interface = this.flipped_interface != null ? this.flipped_interface.length : 0;
        for (int i = 0; i < length_flipped_interface; i++) {
        length += this.flipped_interface[i].serializedLength();
        }
        length += 4;
        int length_pulled_interface = this.pulled_interface != null ? this.pulled_interface.length : 0;
        for (int i = 0; i < length_pulled_interface; i++) {
        length += this.pulled_interface[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/RemoteGateway"; }
    public java.lang.String getMD5(){ return "1faac3dab531742a4ef19d57505285ec"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
