package com.roslib.gateway_msgs;

import java.lang.*;

public class GatewayInfo implements com.roslib.ros.Msg {
    public java.lang.String name;
    public boolean connected;
    public java.lang.String ip;
    public java.lang.String[] hub_names;
    public java.lang.String[] hub_uris;
    public boolean firewall;
    public com.roslib.gateway_msgs.Rule[] public_watchlist;
    public com.roslib.gateway_msgs.Rule[] public_interface;
    public com.roslib.gateway_msgs.RemoteRuleWithStatus[] flipped_connections;
    public com.roslib.gateway_msgs.RemoteRule[] flip_watchlist;
    public com.roslib.gateway_msgs.RemoteRule[] flipped_in_connections;
    public com.roslib.gateway_msgs.RemoteRule[] pull_watchlist;
    public com.roslib.gateway_msgs.RemoteRule[] pulled_connections;

    public GatewayInfo() {
        this.name = "";
        this.connected = false;
        this.ip = "";
        this.hub_names = null;
        this.hub_uris = null;
        this.firewall = false;
        this.public_watchlist = null;
        this.public_interface = null;
        this.flipped_connections = null;
        this.flip_watchlist = null;
        this.flipped_in_connections = null;
        this.pull_watchlist = null;
        this.pulled_connections = null;
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
        outbuffer[offset] = (byte)((connected ? 0x01 : 0x00) & 0xFF);
        offset += 1;
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
        int length_hub_names = this.hub_names != null ? this.hub_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_hub_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hub_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hub_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hub_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_hub_names; i++){
        int length_hub_namesi = this.hub_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hub_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hub_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hub_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hub_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hub_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.hub_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_hub_namesi;
        }
        int length_hub_uris = this.hub_uris != null ? this.hub_uris.length : 0;
        outbuffer[offset + 0] = (byte)((length_hub_uris >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hub_uris >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hub_uris >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hub_uris >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_hub_uris; i++){
        int length_hub_urisi = this.hub_uris[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hub_urisi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hub_urisi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hub_urisi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hub_urisi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hub_urisi; k++) {
            outbuffer[offset + k] = (byte)((this.hub_uris[i].getBytes())[k] & 0xFF);
        }
        offset += length_hub_urisi;
        }
        outbuffer[offset] = (byte)((firewall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_public_watchlist = this.public_watchlist != null ? this.public_watchlist.length : 0;
        outbuffer[offset + 0] = (byte)((length_public_watchlist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_public_watchlist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_public_watchlist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_public_watchlist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_public_watchlist; i++){
        offset = this.public_watchlist[i].serialize(outbuffer, offset);
        }
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        outbuffer[offset + 0] = (byte)((length_public_interface >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_public_interface >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_public_interface >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_public_interface >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_public_interface; i++){
        offset = this.public_interface[i].serialize(outbuffer, offset);
        }
        int length_flipped_connections = this.flipped_connections != null ? this.flipped_connections.length : 0;
        outbuffer[offset + 0] = (byte)((length_flipped_connections >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_flipped_connections >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_flipped_connections >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_flipped_connections >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_flipped_connections; i++){
        offset = this.flipped_connections[i].serialize(outbuffer, offset);
        }
        int length_flip_watchlist = this.flip_watchlist != null ? this.flip_watchlist.length : 0;
        outbuffer[offset + 0] = (byte)((length_flip_watchlist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_flip_watchlist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_flip_watchlist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_flip_watchlist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_flip_watchlist; i++){
        offset = this.flip_watchlist[i].serialize(outbuffer, offset);
        }
        int length_flipped_in_connections = this.flipped_in_connections != null ? this.flipped_in_connections.length : 0;
        outbuffer[offset + 0] = (byte)((length_flipped_in_connections >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_flipped_in_connections >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_flipped_in_connections >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_flipped_in_connections >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_flipped_in_connections; i++){
        offset = this.flipped_in_connections[i].serialize(outbuffer, offset);
        }
        int length_pull_watchlist = this.pull_watchlist != null ? this.pull_watchlist.length : 0;
        outbuffer[offset + 0] = (byte)((length_pull_watchlist >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pull_watchlist >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pull_watchlist >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pull_watchlist >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_pull_watchlist; i++){
        offset = this.pull_watchlist[i].serialize(outbuffer, offset);
        }
        int length_pulled_connections = this.pulled_connections != null ? this.pulled_connections.length : 0;
        outbuffer[offset + 0] = (byte)((length_pulled_connections >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pulled_connections >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pulled_connections >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pulled_connections >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_pulled_connections; i++){
        offset = this.pulled_connections[i].serialize(outbuffer, offset);
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
        this.connected = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
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
        int length_hub_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hub_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hub_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hub_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_hub_names > 0) {
            this.hub_names = new java.lang.String[length_hub_names];
        }
        for (int i = 0; i < length_hub_names; i++){
        int length_hub_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hub_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hub_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hub_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hub_namesi = new byte[length_hub_namesi];
        for(int k= 0; k< length_hub_namesi; k++){
            bytes_hub_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hub_names[i] = new java.lang.String(bytes_hub_namesi);
        offset += length_hub_namesi;
        }
        int length_hub_uris = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hub_uris |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hub_uris |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hub_uris |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_hub_uris > 0) {
            this.hub_uris = new java.lang.String[length_hub_uris];
        }
        for (int i = 0; i < length_hub_uris; i++){
        int length_hub_urisi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hub_urisi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hub_urisi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hub_urisi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hub_urisi = new byte[length_hub_urisi];
        for(int k= 0; k< length_hub_urisi; k++){
            bytes_hub_urisi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hub_uris[i] = new java.lang.String(bytes_hub_urisi);
        offset += length_hub_urisi;
        }
        this.firewall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_public_watchlist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_public_watchlist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_public_watchlist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_public_watchlist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_public_watchlist > 0) {
            this.public_watchlist = new com.roslib.gateway_msgs.Rule[length_public_watchlist];
        }
        for (int i = 0; i < length_public_watchlist; i++){
        offset = this.public_watchlist[i].deserialize(inbuffer, offset);
        }
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
        int length_flipped_connections = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_flipped_connections |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_flipped_connections |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_flipped_connections |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_flipped_connections > 0) {
            this.flipped_connections = new com.roslib.gateway_msgs.RemoteRuleWithStatus[length_flipped_connections];
        }
        for (int i = 0; i < length_flipped_connections; i++){
        offset = this.flipped_connections[i].deserialize(inbuffer, offset);
        }
        int length_flip_watchlist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_flip_watchlist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_flip_watchlist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_flip_watchlist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_flip_watchlist > 0) {
            this.flip_watchlist = new com.roslib.gateway_msgs.RemoteRule[length_flip_watchlist];
        }
        for (int i = 0; i < length_flip_watchlist; i++){
        offset = this.flip_watchlist[i].deserialize(inbuffer, offset);
        }
        int length_flipped_in_connections = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_flipped_in_connections |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_flipped_in_connections |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_flipped_in_connections |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_flipped_in_connections > 0) {
            this.flipped_in_connections = new com.roslib.gateway_msgs.RemoteRule[length_flipped_in_connections];
        }
        for (int i = 0; i < length_flipped_in_connections; i++){
        offset = this.flipped_in_connections[i].deserialize(inbuffer, offset);
        }
        int length_pull_watchlist = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pull_watchlist |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pull_watchlist |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pull_watchlist |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_pull_watchlist > 0) {
            this.pull_watchlist = new com.roslib.gateway_msgs.RemoteRule[length_pull_watchlist];
        }
        for (int i = 0; i < length_pull_watchlist; i++){
        offset = this.pull_watchlist[i].deserialize(inbuffer, offset);
        }
        int length_pulled_connections = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pulled_connections |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pulled_connections |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pulled_connections |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_pulled_connections > 0) {
            this.pulled_connections = new com.roslib.gateway_msgs.RemoteRule[length_pulled_connections];
        }
        for (int i = 0; i < length_pulled_connections; i++){
        offset = this.pulled_connections[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 1;
        int length_ip = this.ip.getBytes().length;
        length += 4;
        length += length_ip;
        length += 4;
        int length_hub_names = this.hub_names != null ? this.hub_names.length : 0;
        for (int i = 0; i < length_hub_names; i++) {
        int length_hub_namesi = this.hub_names[i].getBytes().length;
        length += 4;
        length += length_hub_namesi;
        }
        length += 4;
        int length_hub_uris = this.hub_uris != null ? this.hub_uris.length : 0;
        for (int i = 0; i < length_hub_uris; i++) {
        int length_hub_urisi = this.hub_uris[i].getBytes().length;
        length += 4;
        length += length_hub_urisi;
        }
        length += 1;
        length += 4;
        int length_public_watchlist = this.public_watchlist != null ? this.public_watchlist.length : 0;
        for (int i = 0; i < length_public_watchlist; i++) {
        length += this.public_watchlist[i].serializedLength();
        }
        length += 4;
        int length_public_interface = this.public_interface != null ? this.public_interface.length : 0;
        for (int i = 0; i < length_public_interface; i++) {
        length += this.public_interface[i].serializedLength();
        }
        length += 4;
        int length_flipped_connections = this.flipped_connections != null ? this.flipped_connections.length : 0;
        for (int i = 0; i < length_flipped_connections; i++) {
        length += this.flipped_connections[i].serializedLength();
        }
        length += 4;
        int length_flip_watchlist = this.flip_watchlist != null ? this.flip_watchlist.length : 0;
        for (int i = 0; i < length_flip_watchlist; i++) {
        length += this.flip_watchlist[i].serializedLength();
        }
        length += 4;
        int length_flipped_in_connections = this.flipped_in_connections != null ? this.flipped_in_connections.length : 0;
        for (int i = 0; i < length_flipped_in_connections; i++) {
        length += this.flipped_in_connections[i].serializedLength();
        }
        length += 4;
        int length_pull_watchlist = this.pull_watchlist != null ? this.pull_watchlist.length : 0;
        for (int i = 0; i < length_pull_watchlist; i++) {
        length += this.pull_watchlist[i].serializedLength();
        }
        length += 4;
        int length_pulled_connections = this.pulled_connections != null ? this.pulled_connections.length : 0;
        for (int i = 0; i < length_pulled_connections; i++) {
        length += this.pulled_connections[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/GatewayInfo"; }
    public java.lang.String getMD5(){ return "4f7a5139edcaf513230dc74da5297dd0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
