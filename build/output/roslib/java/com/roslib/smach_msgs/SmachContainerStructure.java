package com.roslib.smach_msgs;

import java.lang.*;

public class SmachContainerStructure implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String path;
    public java.lang.String[] children;
    public java.lang.String[] internal_outcomes;
    public java.lang.String[] outcomes_from;
    public java.lang.String[] outcomes_to;
    public java.lang.String[] container_outcomes;

    public SmachContainerStructure() {
        this.header = new com.roslib.std_msgs.Header();
        this.path = "";
        this.children = null;
        this.internal_outcomes = null;
        this.outcomes_from = null;
        this.outcomes_to = null;
        this.container_outcomes = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_path = this.path.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_path >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_path >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_path >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_path >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_path; k++) {
            outbuffer[offset + k] = (byte)((this.path.getBytes())[k] & 0xFF);
        }
        offset += length_path;
        int length_children = this.children != null ? this.children.length : 0;
        outbuffer[offset + 0] = (byte)((length_children >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_children >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_children >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_children >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_children; i++){
        int length_childreni = this.children[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_childreni >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_childreni >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_childreni >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_childreni >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_childreni; k++) {
            outbuffer[offset + k] = (byte)((this.children[i].getBytes())[k] & 0xFF);
        }
        offset += length_childreni;
        }
        int length_internal_outcomes = this.internal_outcomes != null ? this.internal_outcomes.length : 0;
        outbuffer[offset + 0] = (byte)((length_internal_outcomes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_internal_outcomes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_internal_outcomes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_internal_outcomes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_internal_outcomes; i++){
        int length_internal_outcomesi = this.internal_outcomes[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_internal_outcomesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_internal_outcomesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_internal_outcomesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_internal_outcomesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_internal_outcomesi; k++) {
            outbuffer[offset + k] = (byte)((this.internal_outcomes[i].getBytes())[k] & 0xFF);
        }
        offset += length_internal_outcomesi;
        }
        int length_outcomes_from = this.outcomes_from != null ? this.outcomes_from.length : 0;
        outbuffer[offset + 0] = (byte)((length_outcomes_from >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_outcomes_from >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_outcomes_from >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_outcomes_from >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_outcomes_from; i++){
        int length_outcomes_fromi = this.outcomes_from[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_outcomes_fromi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_outcomes_fromi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_outcomes_fromi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_outcomes_fromi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_outcomes_fromi; k++) {
            outbuffer[offset + k] = (byte)((this.outcomes_from[i].getBytes())[k] & 0xFF);
        }
        offset += length_outcomes_fromi;
        }
        int length_outcomes_to = this.outcomes_to != null ? this.outcomes_to.length : 0;
        outbuffer[offset + 0] = (byte)((length_outcomes_to >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_outcomes_to >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_outcomes_to >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_outcomes_to >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_outcomes_to; i++){
        int length_outcomes_toi = this.outcomes_to[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_outcomes_toi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_outcomes_toi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_outcomes_toi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_outcomes_toi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_outcomes_toi; k++) {
            outbuffer[offset + k] = (byte)((this.outcomes_to[i].getBytes())[k] & 0xFF);
        }
        offset += length_outcomes_toi;
        }
        int length_container_outcomes = this.container_outcomes != null ? this.container_outcomes.length : 0;
        outbuffer[offset + 0] = (byte)((length_container_outcomes >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_container_outcomes >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_container_outcomes >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_container_outcomes >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_container_outcomes; i++){
        int length_container_outcomesi = this.container_outcomes[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_container_outcomesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_container_outcomesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_container_outcomesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_container_outcomesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_container_outcomesi; k++) {
            outbuffer[offset + k] = (byte)((this.container_outcomes[i].getBytes())[k] & 0xFF);
        }
        offset += length_container_outcomesi;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_path = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_path |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_path |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_path |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_path = new byte[length_path];
        for(int k= 0; k< length_path; k++){
            bytes_path[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.path = new java.lang.String(bytes_path);
        offset += length_path;
        int length_children = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_children |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_children |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_children |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_children > 0) {
            this.children = new java.lang.String[length_children];
        }
        for (int i = 0; i < length_children; i++){
        int length_childreni = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_childreni |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_childreni |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_childreni |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_childreni = new byte[length_childreni];
        for(int k= 0; k< length_childreni; k++){
            bytes_childreni[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.children[i] = new java.lang.String(bytes_childreni);
        offset += length_childreni;
        }
        int length_internal_outcomes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_internal_outcomes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_internal_outcomes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_internal_outcomes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_internal_outcomes > 0) {
            this.internal_outcomes = new java.lang.String[length_internal_outcomes];
        }
        for (int i = 0; i < length_internal_outcomes; i++){
        int length_internal_outcomesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_internal_outcomesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_internal_outcomesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_internal_outcomesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_internal_outcomesi = new byte[length_internal_outcomesi];
        for(int k= 0; k< length_internal_outcomesi; k++){
            bytes_internal_outcomesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.internal_outcomes[i] = new java.lang.String(bytes_internal_outcomesi);
        offset += length_internal_outcomesi;
        }
        int length_outcomes_from = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_outcomes_from |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_outcomes_from |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_outcomes_from |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_outcomes_from > 0) {
            this.outcomes_from = new java.lang.String[length_outcomes_from];
        }
        for (int i = 0; i < length_outcomes_from; i++){
        int length_outcomes_fromi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_outcomes_fromi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_outcomes_fromi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_outcomes_fromi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_outcomes_fromi = new byte[length_outcomes_fromi];
        for(int k= 0; k< length_outcomes_fromi; k++){
            bytes_outcomes_fromi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.outcomes_from[i] = new java.lang.String(bytes_outcomes_fromi);
        offset += length_outcomes_fromi;
        }
        int length_outcomes_to = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_outcomes_to |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_outcomes_to |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_outcomes_to |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_outcomes_to > 0) {
            this.outcomes_to = new java.lang.String[length_outcomes_to];
        }
        for (int i = 0; i < length_outcomes_to; i++){
        int length_outcomes_toi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_outcomes_toi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_outcomes_toi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_outcomes_toi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_outcomes_toi = new byte[length_outcomes_toi];
        for(int k= 0; k< length_outcomes_toi; k++){
            bytes_outcomes_toi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.outcomes_to[i] = new java.lang.String(bytes_outcomes_toi);
        offset += length_outcomes_toi;
        }
        int length_container_outcomes = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_container_outcomes |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_container_outcomes |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_container_outcomes |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_container_outcomes > 0) {
            this.container_outcomes = new java.lang.String[length_container_outcomes];
        }
        for (int i = 0; i < length_container_outcomes; i++){
        int length_container_outcomesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_container_outcomesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_container_outcomesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_container_outcomesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_container_outcomesi = new byte[length_container_outcomesi];
        for(int k= 0; k< length_container_outcomesi; k++){
            bytes_container_outcomesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.container_outcomes[i] = new java.lang.String(bytes_container_outcomesi);
        offset += length_container_outcomesi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_path = this.path.getBytes().length;
        length += 4;
        length += length_path;
        length += 4;
        int length_children = this.children != null ? this.children.length : 0;
        for (int i = 0; i < length_children; i++) {
        int length_childreni = this.children[i].getBytes().length;
        length += 4;
        length += length_childreni;
        }
        length += 4;
        int length_internal_outcomes = this.internal_outcomes != null ? this.internal_outcomes.length : 0;
        for (int i = 0; i < length_internal_outcomes; i++) {
        int length_internal_outcomesi = this.internal_outcomes[i].getBytes().length;
        length += 4;
        length += length_internal_outcomesi;
        }
        length += 4;
        int length_outcomes_from = this.outcomes_from != null ? this.outcomes_from.length : 0;
        for (int i = 0; i < length_outcomes_from; i++) {
        int length_outcomes_fromi = this.outcomes_from[i].getBytes().length;
        length += 4;
        length += length_outcomes_fromi;
        }
        length += 4;
        int length_outcomes_to = this.outcomes_to != null ? this.outcomes_to.length : 0;
        for (int i = 0; i < length_outcomes_to; i++) {
        int length_outcomes_toi = this.outcomes_to[i].getBytes().length;
        length += 4;
        length += length_outcomes_toi;
        }
        length += 4;
        int length_container_outcomes = this.container_outcomes != null ? this.container_outcomes.length : 0;
        for (int i = 0; i < length_container_outcomes; i++) {
        int length_container_outcomesi = this.container_outcomes[i].getBytes().length;
        length += 4;
        length += length_container_outcomesi;
        }
        return length;
    }

    public java.lang.String getType(){ return "smach_msgs/SmachContainerStructure"; }
    public java.lang.String getMD5(){ return "0209663ab13753a56b6ac1d094d07fbe"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
