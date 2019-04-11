package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class Config implements com.roslib.ros.Msg {
    public com.roslib.dynamic_reconfigure.BoolParameter[] bools;
    public com.roslib.dynamic_reconfigure.IntParameter[] ints;
    public com.roslib.dynamic_reconfigure.StrParameter[] strs;
    public com.roslib.dynamic_reconfigure.DoubleParameter[] doubles;
    public com.roslib.dynamic_reconfigure.GroupState[] groups;

    public Config() {
        this.bools = null;
        this.ints = null;
        this.strs = null;
        this.doubles = null;
        this.groups = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_bools = this.bools != null ? this.bools.length : 0;
        outbuffer[offset + 0] = (byte)((length_bools >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_bools >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_bools >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_bools >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_bools; i++){
        offset = this.bools[i].serialize(outbuffer, offset);
        }
        int length_ints = this.ints != null ? this.ints.length : 0;
        outbuffer[offset + 0] = (byte)((length_ints >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_ints >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_ints >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_ints >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_ints; i++){
        offset = this.ints[i].serialize(outbuffer, offset);
        }
        int length_strs = this.strs != null ? this.strs.length : 0;
        outbuffer[offset + 0] = (byte)((length_strs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_strs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_strs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_strs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_strs; i++){
        offset = this.strs[i].serialize(outbuffer, offset);
        }
        int length_doubles = this.doubles != null ? this.doubles.length : 0;
        outbuffer[offset + 0] = (byte)((length_doubles >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_doubles >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_doubles >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_doubles >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_doubles; i++){
        offset = this.doubles[i].serialize(outbuffer, offset);
        }
        int length_groups = this.groups != null ? this.groups.length : 0;
        outbuffer[offset + 0] = (byte)((length_groups >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_groups >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_groups >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_groups >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_groups; i++){
        offset = this.groups[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_bools = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_bools |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_bools |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_bools |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_bools > 0) {
            this.bools = new com.roslib.dynamic_reconfigure.BoolParameter[length_bools];
        }
        for (int i = 0; i < length_bools; i++){
        offset = this.bools[i].deserialize(inbuffer, offset);
        }
        int length_ints = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_ints |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_ints |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_ints |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_ints > 0) {
            this.ints = new com.roslib.dynamic_reconfigure.IntParameter[length_ints];
        }
        for (int i = 0; i < length_ints; i++){
        offset = this.ints[i].deserialize(inbuffer, offset);
        }
        int length_strs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_strs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_strs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_strs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_strs > 0) {
            this.strs = new com.roslib.dynamic_reconfigure.StrParameter[length_strs];
        }
        for (int i = 0; i < length_strs; i++){
        offset = this.strs[i].deserialize(inbuffer, offset);
        }
        int length_doubles = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_doubles |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_doubles |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_doubles |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_doubles > 0) {
            this.doubles = new com.roslib.dynamic_reconfigure.DoubleParameter[length_doubles];
        }
        for (int i = 0; i < length_doubles; i++){
        offset = this.doubles[i].deserialize(inbuffer, offset);
        }
        int length_groups = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_groups |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_groups |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_groups |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_groups > 0) {
            this.groups = new com.roslib.dynamic_reconfigure.GroupState[length_groups];
        }
        for (int i = 0; i < length_groups; i++){
        offset = this.groups[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_bools = this.bools != null ? this.bools.length : 0;
        for (int i = 0; i < length_bools; i++) {
        length += this.bools[i].serializedLength();
        }
        length += 4;
        int length_ints = this.ints != null ? this.ints.length : 0;
        for (int i = 0; i < length_ints; i++) {
        length += this.ints[i].serializedLength();
        }
        length += 4;
        int length_strs = this.strs != null ? this.strs.length : 0;
        for (int i = 0; i < length_strs; i++) {
        length += this.strs[i].serializedLength();
        }
        length += 4;
        int length_doubles = this.doubles != null ? this.doubles.length : 0;
        for (int i = 0; i < length_doubles; i++) {
        length += this.doubles[i].serializedLength();
        }
        length += 4;
        int length_groups = this.groups != null ? this.groups.length : 0;
        for (int i = 0; i < length_groups; i++) {
        length += this.groups[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/Config"; }
    public java.lang.String getMD5(){ return "38755f23d4b291864d60bfdd7d2c3637"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
