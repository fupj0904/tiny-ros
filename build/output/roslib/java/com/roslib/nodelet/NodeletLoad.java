package com.roslib.nodelet;

import java.lang.*;

public class NodeletLoad {

public static final java.lang.String NODELETLOAD = "nodelet/NodeletLoad";

public class NodeletLoadRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String name;
    public java.lang.String type;
    public java.lang.String[] remap_source_args;
    public java.lang.String[] remap_target_args;
    public java.lang.String[] my_argv;
    public java.lang.String bond_id;

    public NodeletLoadRequest() {
        this.name = "";
        this.type = "";
        this.remap_source_args = null;
        this.remap_target_args = null;
        this.my_argv = null;
        this.bond_id = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        int length_remap_source_args = this.remap_source_args != null ? this.remap_source_args.length : 0;
        outbuffer[offset + 0] = (byte)((length_remap_source_args >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_source_args >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_source_args >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_source_args >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_remap_source_args; i++){
        int length_remap_source_argsi = this.remap_source_args[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remap_source_argsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_source_argsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_source_argsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_source_argsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remap_source_argsi; k++) {
            outbuffer[offset + k] = (byte)((this.remap_source_args[i].getBytes())[k] & 0xFF);
        }
        offset += length_remap_source_argsi;
        }
        int length_remap_target_args = this.remap_target_args != null ? this.remap_target_args.length : 0;
        outbuffer[offset + 0] = (byte)((length_remap_target_args >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_target_args >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_target_args >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_target_args >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_remap_target_args; i++){
        int length_remap_target_argsi = this.remap_target_args[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_remap_target_argsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remap_target_argsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remap_target_argsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remap_target_argsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_remap_target_argsi; k++) {
            outbuffer[offset + k] = (byte)((this.remap_target_args[i].getBytes())[k] & 0xFF);
        }
        offset += length_remap_target_argsi;
        }
        int length_my_argv = this.my_argv != null ? this.my_argv.length : 0;
        outbuffer[offset + 0] = (byte)((length_my_argv >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_my_argv >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_my_argv >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_my_argv >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_my_argv; i++){
        int length_my_argvi = this.my_argv[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_my_argvi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_my_argvi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_my_argvi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_my_argvi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_my_argvi; k++) {
            outbuffer[offset + k] = (byte)((this.my_argv[i].getBytes())[k] & 0xFF);
        }
        offset += length_my_argvi;
        }
        int length_bond_id = this.bond_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_bond_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_bond_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_bond_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_bond_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_bond_id; k++) {
            outbuffer[offset + k] = (byte)((this.bond_id.getBytes())[k] & 0xFF);
        }
        offset += length_bond_id;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        int length_remap_source_args = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_source_args |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_source_args |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_source_args |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_remap_source_args > 0) {
            this.remap_source_args = new java.lang.String[length_remap_source_args];
        }
        for (int i = 0; i < length_remap_source_args; i++){
        int length_remap_source_argsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_source_argsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_source_argsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_source_argsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remap_source_argsi = new byte[length_remap_source_argsi];
        for(int k= 0; k< length_remap_source_argsi; k++){
            bytes_remap_source_argsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remap_source_args[i] = new java.lang.String(bytes_remap_source_argsi);
        offset += length_remap_source_argsi;
        }
        int length_remap_target_args = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_target_args |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_target_args |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_target_args |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_remap_target_args > 0) {
            this.remap_target_args = new java.lang.String[length_remap_target_args];
        }
        for (int i = 0; i < length_remap_target_args; i++){
        int length_remap_target_argsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remap_target_argsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remap_target_argsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remap_target_argsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_remap_target_argsi = new byte[length_remap_target_argsi];
        for(int k= 0; k< length_remap_target_argsi; k++){
            bytes_remap_target_argsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.remap_target_args[i] = new java.lang.String(bytes_remap_target_argsi);
        offset += length_remap_target_argsi;
        }
        int length_my_argv = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_my_argv |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_my_argv |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_my_argv |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_my_argv > 0) {
            this.my_argv = new java.lang.String[length_my_argv];
        }
        for (int i = 0; i < length_my_argv; i++){
        int length_my_argvi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_my_argvi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_my_argvi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_my_argvi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_my_argvi = new byte[length_my_argvi];
        for(int k= 0; k< length_my_argvi; k++){
            bytes_my_argvi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.my_argv[i] = new java.lang.String(bytes_my_argvi);
        offset += length_my_argvi;
        }
        int length_bond_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_bond_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_bond_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_bond_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_bond_id = new byte[length_bond_id];
        for(int k= 0; k< length_bond_id; k++){
            bytes_bond_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.bond_id = new java.lang.String(bytes_bond_id);
        offset += length_bond_id;
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
        length += 4;
        int length_remap_source_args = this.remap_source_args != null ? this.remap_source_args.length : 0;
        for (int i = 0; i < length_remap_source_args; i++) {
        int length_remap_source_argsi = this.remap_source_args[i].getBytes().length;
        length += 4;
        length += length_remap_source_argsi;
        }
        length += 4;
        int length_remap_target_args = this.remap_target_args != null ? this.remap_target_args.length : 0;
        for (int i = 0; i < length_remap_target_args; i++) {
        int length_remap_target_argsi = this.remap_target_args[i].getBytes().length;
        length += 4;
        length += length_remap_target_argsi;
        }
        length += 4;
        int length_my_argv = this.my_argv != null ? this.my_argv.length : 0;
        for (int i = 0; i < length_my_argv; i++) {
        int length_my_argvi = this.my_argv[i].getBytes().length;
        length += 4;
        length += length_my_argvi;
        }
        int length_bond_id = this.bond_id.getBytes().length;
        length += 4;
        length += length_bond_id;
        return length;
    }

    public java.lang.String getType() { return NODELETLOAD; }
    public java.lang.String getMD5(){ return "8e40730c73789e0d995e519879f8bcba"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class NodeletLoadResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;

    public NodeletLoadResponse() {
        this.success = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return NODELETLOAD; }
    public java.lang.String getMD5(){ return "5721dcf6c6038677300f35810d4f0b1c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
