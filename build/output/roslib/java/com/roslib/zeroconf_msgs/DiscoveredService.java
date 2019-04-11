package com.roslib.zeroconf_msgs;

import java.lang.*;

public class DiscoveredService implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String type;
    public java.lang.String domain;
    public java.lang.String description;
    public java.lang.String hostname;
    public java.lang.String[] ipv4_addresses;
    public java.lang.String[] ipv6_addresses;
    public int port;
    public long cookie;
    public boolean is_local;
    public boolean our_own;
    public boolean wide_area;
    public boolean multicast;
    public boolean cached;

    public DiscoveredService() {
        this.name = "";
        this.type = "";
        this.domain = "";
        this.description = "";
        this.hostname = "";
        this.ipv4_addresses = null;
        this.ipv6_addresses = null;
        this.port = 0;
        this.cookie = 0;
        this.is_local = false;
        this.our_own = false;
        this.wide_area = false;
        this.multicast = false;
        this.cached = false;
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
        int length_domain = this.domain.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_domain >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_domain >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_domain >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_domain >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_domain; k++) {
            outbuffer[offset + k] = (byte)((this.domain.getBytes())[k] & 0xFF);
        }
        offset += length_domain;
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
        int length_hostname = this.hostname.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hostname >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hostname >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hostname >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hostname >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hostname; k++) {
            outbuffer[offset + k] = (byte)((this.hostname.getBytes())[k] & 0xFF);
        }
        offset += length_hostname;
        int length_ipv4_addresses = this.ipv4_addresses != null ? this.ipv4_addresses.length : 0;
        outbuffer[offset + 0] = (byte)((length_ipv4_addresses >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ipv4_addresses >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ipv4_addresses >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ipv4_addresses >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_ipv4_addresses; i++){
        int length_ipv4_addressesi = this.ipv4_addresses[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_ipv4_addressesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ipv4_addressesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ipv4_addressesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ipv4_addressesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_ipv4_addressesi; k++) {
            outbuffer[offset + k] = (byte)((this.ipv4_addresses[i].getBytes())[k] & 0xFF);
        }
        offset += length_ipv4_addressesi;
        }
        int length_ipv6_addresses = this.ipv6_addresses != null ? this.ipv6_addresses.length : 0;
        outbuffer[offset + 0] = (byte)((length_ipv6_addresses >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ipv6_addresses >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ipv6_addresses >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ipv6_addresses >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_ipv6_addresses; i++){
        int length_ipv6_addressesi = this.ipv6_addresses[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_ipv6_addressesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ipv6_addressesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ipv6_addressesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ipv6_addressesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_ipv6_addressesi; k++) {
            outbuffer[offset + k] = (byte)((this.ipv6_addresses[i].getBytes())[k] & 0xFF);
        }
        offset += length_ipv6_addressesi;
        }
        outbuffer[offset + 0] = (byte)((this.port >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.port >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.port >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.port >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.cookie >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.cookie >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.cookie >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.cookie >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((is_local ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((our_own ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((wide_area ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((multicast ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cached ? 0x01 : 0x00) & 0xFF);
        offset += 1;
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
        int length_domain = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_domain |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_domain |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_domain |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_domain = new byte[length_domain];
        for(int k= 0; k< length_domain; k++){
            bytes_domain[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.domain = new java.lang.String(bytes_domain);
        offset += length_domain;
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
        int length_hostname = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hostname |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hostname |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hostname |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hostname = new byte[length_hostname];
        for(int k= 0; k< length_hostname; k++){
            bytes_hostname[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hostname = new java.lang.String(bytes_hostname);
        offset += length_hostname;
        int length_ipv4_addresses = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ipv4_addresses |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ipv4_addresses |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ipv4_addresses |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_ipv4_addresses > 0) {
            this.ipv4_addresses = new java.lang.String[length_ipv4_addresses];
        }
        for (int i = 0; i < length_ipv4_addresses; i++){
        int length_ipv4_addressesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ipv4_addressesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ipv4_addressesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ipv4_addressesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_ipv4_addressesi = new byte[length_ipv4_addressesi];
        for(int k= 0; k< length_ipv4_addressesi; k++){
            bytes_ipv4_addressesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.ipv4_addresses[i] = new java.lang.String(bytes_ipv4_addressesi);
        offset += length_ipv4_addressesi;
        }
        int length_ipv6_addresses = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ipv6_addresses |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ipv6_addresses |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ipv6_addresses |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_ipv6_addresses > 0) {
            this.ipv6_addresses = new java.lang.String[length_ipv6_addresses];
        }
        for (int i = 0; i < length_ipv6_addresses; i++){
        int length_ipv6_addressesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ipv6_addressesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ipv6_addressesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ipv6_addressesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_ipv6_addressesi = new byte[length_ipv6_addressesi];
        for(int k= 0; k< length_ipv6_addressesi; k++){
            bytes_ipv6_addressesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.ipv6_addresses[i] = new java.lang.String(bytes_ipv6_addressesi);
        offset += length_ipv6_addressesi;
        }
        this.port   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.port |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.port |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.port |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.cookie   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.cookie |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.cookie |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.cookie |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.is_local = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.our_own = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.wide_area = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.multicast = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cached = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        int length_domain = this.domain.getBytes().length;
        length += 4;
        length += length_domain;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        int length_hostname = this.hostname.getBytes().length;
        length += 4;
        length += length_hostname;
        length += 4;
        int length_ipv4_addresses = this.ipv4_addresses != null ? this.ipv4_addresses.length : 0;
        for (int i = 0; i < length_ipv4_addresses; i++) {
        int length_ipv4_addressesi = this.ipv4_addresses[i].getBytes().length;
        length += 4;
        length += length_ipv4_addressesi;
        }
        length += 4;
        int length_ipv6_addresses = this.ipv6_addresses != null ? this.ipv6_addresses.length : 0;
        for (int i = 0; i < length_ipv6_addresses; i++) {
        int length_ipv6_addressesi = this.ipv6_addresses[i].getBytes().length;
        length += 4;
        length += length_ipv6_addressesi;
        }
        length += 4;
        length += 4;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "zeroconf_msgs/DiscoveredService"; }
    public java.lang.String getMD5(){ return "0884be1c5130f30d1ba7d7cc396707e2"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
