package com.roslib.stdr_msgs;

import java.lang.*;

public class RfidSensorMeasurementMsg implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String[] rfid_tags_ids;
    public java.lang.String[] rfid_tags_msgs;
    public float[] rfid_tags_dbs;

    public RfidSensorMeasurementMsg() {
        this.header = new com.roslib.std_msgs.Header();
        this.rfid_tags_ids = null;
        this.rfid_tags_msgs = null;
        this.rfid_tags_dbs = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_rfid_tags_ids = this.rfid_tags_ids != null ? this.rfid_tags_ids.length : 0;
        outbuffer[offset + 0] = (byte)((length_rfid_tags_ids >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags_ids >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags_ids >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags_ids >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rfid_tags_ids; i++){
        int length_rfid_tags_idsi = this.rfid_tags_ids[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rfid_tags_idsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags_idsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags_idsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags_idsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rfid_tags_idsi; k++) {
            outbuffer[offset + k] = (byte)((this.rfid_tags_ids[i].getBytes())[k] & 0xFF);
        }
        offset += length_rfid_tags_idsi;
        }
        int length_rfid_tags_msgs = this.rfid_tags_msgs != null ? this.rfid_tags_msgs.length : 0;
        outbuffer[offset + 0] = (byte)((length_rfid_tags_msgs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags_msgs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags_msgs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags_msgs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rfid_tags_msgs; i++){
        int length_rfid_tags_msgsi = this.rfid_tags_msgs[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rfid_tags_msgsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags_msgsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags_msgsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags_msgsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rfid_tags_msgsi; k++) {
            outbuffer[offset + k] = (byte)((this.rfid_tags_msgs[i].getBytes())[k] & 0xFF);
        }
        offset += length_rfid_tags_msgsi;
        }
        int length_rfid_tags_dbs = this.rfid_tags_dbs != null ? this.rfid_tags_dbs.length : 0;
        outbuffer[offset + 0] = (byte)((length_rfid_tags_dbs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags_dbs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags_dbs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags_dbs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rfid_tags_dbs; i++){
        int bits_rfid_tags_dbsi = Float.floatToRawIntBits(rfid_tags_dbs[i]);
        outbuffer[offset + 0] = (byte)((bits_rfid_tags_dbsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_rfid_tags_dbsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_rfid_tags_dbsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_rfid_tags_dbsi >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_rfid_tags_ids = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags_ids |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags_ids |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags_ids |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rfid_tags_ids > 0) {
            this.rfid_tags_ids = new java.lang.String[length_rfid_tags_ids];
        }
        for (int i = 0; i < length_rfid_tags_ids; i++){
        int length_rfid_tags_idsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags_idsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags_idsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags_idsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rfid_tags_idsi = new byte[length_rfid_tags_idsi];
        for(int k= 0; k< length_rfid_tags_idsi; k++){
            bytes_rfid_tags_idsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.rfid_tags_ids[i] = new java.lang.String(bytes_rfid_tags_idsi);
        offset += length_rfid_tags_idsi;
        }
        int length_rfid_tags_msgs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags_msgs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags_msgs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags_msgs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rfid_tags_msgs > 0) {
            this.rfid_tags_msgs = new java.lang.String[length_rfid_tags_msgs];
        }
        for (int i = 0; i < length_rfid_tags_msgs; i++){
        int length_rfid_tags_msgsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags_msgsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags_msgsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags_msgsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rfid_tags_msgsi = new byte[length_rfid_tags_msgsi];
        for(int k= 0; k< length_rfid_tags_msgsi; k++){
            bytes_rfid_tags_msgsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.rfid_tags_msgs[i] = new java.lang.String(bytes_rfid_tags_msgsi);
        offset += length_rfid_tags_msgsi;
        }
        int length_rfid_tags_dbs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags_dbs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags_dbs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags_dbs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rfid_tags_dbs > 0) {
            this.rfid_tags_dbs = new float[length_rfid_tags_dbs];
        }
        for (int i = 0; i < length_rfid_tags_dbs; i++){
        int bits_rfid_tags_dbsi = 0;
        bits_rfid_tags_dbsi |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_rfid_tags_dbsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_rfid_tags_dbsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_rfid_tags_dbsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.rfid_tags_dbs[i] = Float.intBitsToFloat(bits_rfid_tags_dbsi);
        offset += 4;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_rfid_tags_ids = this.rfid_tags_ids != null ? this.rfid_tags_ids.length : 0;
        for (int i = 0; i < length_rfid_tags_ids; i++) {
        int length_rfid_tags_idsi = this.rfid_tags_ids[i].getBytes().length;
        length += 4;
        length += length_rfid_tags_idsi;
        }
        length += 4;
        int length_rfid_tags_msgs = this.rfid_tags_msgs != null ? this.rfid_tags_msgs.length : 0;
        for (int i = 0; i < length_rfid_tags_msgs; i++) {
        int length_rfid_tags_msgsi = this.rfid_tags_msgs[i].getBytes().length;
        length += 4;
        length += length_rfid_tags_msgsi;
        }
        length += 4;
        int length_rfid_tags_dbs = this.rfid_tags_dbs != null ? this.rfid_tags_dbs.length : 0;
        for (int i = 0; i < length_rfid_tags_dbs; i++) {
        length += 4;
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RfidSensorMeasurementMsg"; }
    public java.lang.String getMD5(){ return "0801c472d65be704d1dfd81bba9505e0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
