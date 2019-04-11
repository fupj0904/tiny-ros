package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class IncompatibleRappList implements com.roslib.ros.Msg {
    public java.lang.String[] blacklisted_rapps;
    public java.lang.String[] non_whitelisted_rapps;
    public java.lang.String[] platform_incompatible_rapps;
    public java.lang.String[] capabilities_incompatible_rapps;

    public IncompatibleRappList() {
        this.blacklisted_rapps = null;
        this.non_whitelisted_rapps = null;
        this.platform_incompatible_rapps = null;
        this.capabilities_incompatible_rapps = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_blacklisted_rapps = this.blacklisted_rapps != null ? this.blacklisted_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_blacklisted_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_blacklisted_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_blacklisted_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_blacklisted_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_blacklisted_rapps; i++){
        int length_blacklisted_rappsi = this.blacklisted_rapps[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_blacklisted_rappsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_blacklisted_rappsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_blacklisted_rappsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_blacklisted_rappsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_blacklisted_rappsi; k++) {
            outbuffer[offset + k] = (byte)((this.blacklisted_rapps[i].getBytes())[k] & 0xFF);
        }
        offset += length_blacklisted_rappsi;
        }
        int length_non_whitelisted_rapps = this.non_whitelisted_rapps != null ? this.non_whitelisted_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_non_whitelisted_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_non_whitelisted_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_non_whitelisted_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_non_whitelisted_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_non_whitelisted_rapps; i++){
        int length_non_whitelisted_rappsi = this.non_whitelisted_rapps[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_non_whitelisted_rappsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_non_whitelisted_rappsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_non_whitelisted_rappsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_non_whitelisted_rappsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_non_whitelisted_rappsi; k++) {
            outbuffer[offset + k] = (byte)((this.non_whitelisted_rapps[i].getBytes())[k] & 0xFF);
        }
        offset += length_non_whitelisted_rappsi;
        }
        int length_platform_incompatible_rapps = this.platform_incompatible_rapps != null ? this.platform_incompatible_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_platform_incompatible_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_platform_incompatible_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_platform_incompatible_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_platform_incompatible_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_platform_incompatible_rapps; i++){
        int length_platform_incompatible_rappsi = this.platform_incompatible_rapps[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_platform_incompatible_rappsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_platform_incompatible_rappsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_platform_incompatible_rappsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_platform_incompatible_rappsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_platform_incompatible_rappsi; k++) {
            outbuffer[offset + k] = (byte)((this.platform_incompatible_rapps[i].getBytes())[k] & 0xFF);
        }
        offset += length_platform_incompatible_rappsi;
        }
        int length_capabilities_incompatible_rapps = this.capabilities_incompatible_rapps != null ? this.capabilities_incompatible_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_capabilities_incompatible_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_capabilities_incompatible_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_capabilities_incompatible_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_capabilities_incompatible_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_capabilities_incompatible_rapps; i++){
        int length_capabilities_incompatible_rappsi = this.capabilities_incompatible_rapps[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_capabilities_incompatible_rappsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_capabilities_incompatible_rappsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_capabilities_incompatible_rappsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_capabilities_incompatible_rappsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_capabilities_incompatible_rappsi; k++) {
            outbuffer[offset + k] = (byte)((this.capabilities_incompatible_rapps[i].getBytes())[k] & 0xFF);
        }
        offset += length_capabilities_incompatible_rappsi;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_blacklisted_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_blacklisted_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_blacklisted_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_blacklisted_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_blacklisted_rapps > 0) {
            this.blacklisted_rapps = new java.lang.String[length_blacklisted_rapps];
        }
        for (int i = 0; i < length_blacklisted_rapps; i++){
        int length_blacklisted_rappsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_blacklisted_rappsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_blacklisted_rappsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_blacklisted_rappsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_blacklisted_rappsi = new byte[length_blacklisted_rappsi];
        for(int k= 0; k< length_blacklisted_rappsi; k++){
            bytes_blacklisted_rappsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.blacklisted_rapps[i] = new java.lang.String(bytes_blacklisted_rappsi);
        offset += length_blacklisted_rappsi;
        }
        int length_non_whitelisted_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_non_whitelisted_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_non_whitelisted_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_non_whitelisted_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_non_whitelisted_rapps > 0) {
            this.non_whitelisted_rapps = new java.lang.String[length_non_whitelisted_rapps];
        }
        for (int i = 0; i < length_non_whitelisted_rapps; i++){
        int length_non_whitelisted_rappsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_non_whitelisted_rappsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_non_whitelisted_rappsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_non_whitelisted_rappsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_non_whitelisted_rappsi = new byte[length_non_whitelisted_rappsi];
        for(int k= 0; k< length_non_whitelisted_rappsi; k++){
            bytes_non_whitelisted_rappsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.non_whitelisted_rapps[i] = new java.lang.String(bytes_non_whitelisted_rappsi);
        offset += length_non_whitelisted_rappsi;
        }
        int length_platform_incompatible_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_platform_incompatible_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_platform_incompatible_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_platform_incompatible_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_platform_incompatible_rapps > 0) {
            this.platform_incompatible_rapps = new java.lang.String[length_platform_incompatible_rapps];
        }
        for (int i = 0; i < length_platform_incompatible_rapps; i++){
        int length_platform_incompatible_rappsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_platform_incompatible_rappsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_platform_incompatible_rappsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_platform_incompatible_rappsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_platform_incompatible_rappsi = new byte[length_platform_incompatible_rappsi];
        for(int k= 0; k< length_platform_incompatible_rappsi; k++){
            bytes_platform_incompatible_rappsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.platform_incompatible_rapps[i] = new java.lang.String(bytes_platform_incompatible_rappsi);
        offset += length_platform_incompatible_rappsi;
        }
        int length_capabilities_incompatible_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_capabilities_incompatible_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_capabilities_incompatible_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_capabilities_incompatible_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_capabilities_incompatible_rapps > 0) {
            this.capabilities_incompatible_rapps = new java.lang.String[length_capabilities_incompatible_rapps];
        }
        for (int i = 0; i < length_capabilities_incompatible_rapps; i++){
        int length_capabilities_incompatible_rappsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_capabilities_incompatible_rappsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_capabilities_incompatible_rappsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_capabilities_incompatible_rappsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_capabilities_incompatible_rappsi = new byte[length_capabilities_incompatible_rappsi];
        for(int k= 0; k< length_capabilities_incompatible_rappsi; k++){
            bytes_capabilities_incompatible_rappsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.capabilities_incompatible_rapps[i] = new java.lang.String(bytes_capabilities_incompatible_rappsi);
        offset += length_capabilities_incompatible_rappsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_blacklisted_rapps = this.blacklisted_rapps != null ? this.blacklisted_rapps.length : 0;
        for (int i = 0; i < length_blacklisted_rapps; i++) {
        int length_blacklisted_rappsi = this.blacklisted_rapps[i].getBytes().length;
        length += 4;
        length += length_blacklisted_rappsi;
        }
        length += 4;
        int length_non_whitelisted_rapps = this.non_whitelisted_rapps != null ? this.non_whitelisted_rapps.length : 0;
        for (int i = 0; i < length_non_whitelisted_rapps; i++) {
        int length_non_whitelisted_rappsi = this.non_whitelisted_rapps[i].getBytes().length;
        length += 4;
        length += length_non_whitelisted_rappsi;
        }
        length += 4;
        int length_platform_incompatible_rapps = this.platform_incompatible_rapps != null ? this.platform_incompatible_rapps.length : 0;
        for (int i = 0; i < length_platform_incompatible_rapps; i++) {
        int length_platform_incompatible_rappsi = this.platform_incompatible_rapps[i].getBytes().length;
        length += 4;
        length += length_platform_incompatible_rappsi;
        }
        length += 4;
        int length_capabilities_incompatible_rapps = this.capabilities_incompatible_rapps != null ? this.capabilities_incompatible_rapps.length : 0;
        for (int i = 0; i < length_capabilities_incompatible_rapps; i++) {
        int length_capabilities_incompatible_rappsi = this.capabilities_incompatible_rapps[i].getBytes().length;
        length += 4;
        length += length_capabilities_incompatible_rappsi;
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_app_manager_msgs/IncompatibleRappList"; }
    public java.lang.String getMD5(){ return "7d3e56cc8fe82c894be391dc498f976f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
