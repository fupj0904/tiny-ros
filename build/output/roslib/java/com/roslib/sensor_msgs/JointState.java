package com.roslib.sensor_msgs;

import java.lang.*;

public class JointState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String[] name;
    public double[] position;
    public double[] velocity;
    public double[] effort;

    public JointState() {
        this.header = new com.roslib.std_msgs.Header();
        this.name = null;
        this.position = null;
        this.velocity = null;
        this.effort = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_name = this.name != null ? this.name.length : 0;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_name; i++){
        int length_namei = this.name[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_namei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_namei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_namei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_namei >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_namei; k++) {
            outbuffer[offset + k] = (byte)((this.name[i].getBytes())[k] & 0xFF);
        }
        offset += length_namei;
        }
        int length_position = this.position != null ? this.position.length : 0;
        outbuffer[offset + 0] = (byte)((length_position >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_position >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_position >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_position >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_position; i++){
        long bits_positioni = Double.doubleToRawLongBits(this.position[i]);
        outbuffer[offset + 0] = (byte)((bits_positioni >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_positioni >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_positioni >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_positioni >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_positioni >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_positioni >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_positioni >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_positioni >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_velocity = this.velocity != null ? this.velocity.length : 0;
        outbuffer[offset + 0] = (byte)((length_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_velocity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_velocity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_velocity >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_velocity; i++){
        long bits_velocityi = Double.doubleToRawLongBits(this.velocity[i]);
        outbuffer[offset + 0] = (byte)((bits_velocityi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_velocityi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_velocityi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_velocityi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_velocityi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_velocityi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_velocityi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_velocityi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_effort = this.effort != null ? this.effort.length : 0;
        outbuffer[offset + 0] = (byte)((length_effort >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_effort >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_effort >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_effort >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_effort; i++){
        long bits_efforti = Double.doubleToRawLongBits(this.effort[i]);
        outbuffer[offset + 0] = (byte)((bits_efforti >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_efforti >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_efforti >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_efforti >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_efforti >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_efforti >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_efforti >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_efforti >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_name > 0) {
            this.name = new java.lang.String[length_name];
        }
        for (int i = 0; i < length_name; i++){
        int length_namei = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_namei |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_namei |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_namei |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_namei = new byte[length_namei];
        for(int k= 0; k< length_namei; k++){
            bytes_namei[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name[i] = new java.lang.String(bytes_namei);
        offset += length_namei;
        }
        int length_position = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_position |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_position |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_position |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_position > 0) {
            this.position = new double[length_position];
        }
        for (int i = 0; i < length_position; i++){
        long bits_positioni = 0;
        bits_positioni |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_positioni |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_positioni |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_positioni |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_positioni |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_positioni |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_positioni |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_positioni |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.position[i] = Double.longBitsToDouble(bits_positioni);
        offset += 8;
        }
        int length_velocity = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_velocity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_velocity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_velocity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_velocity > 0) {
            this.velocity = new double[length_velocity];
        }
        for (int i = 0; i < length_velocity; i++){
        long bits_velocityi = 0;
        bits_velocityi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_velocityi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_velocityi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_velocityi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_velocityi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_velocityi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_velocityi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_velocityi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.velocity[i] = Double.longBitsToDouble(bits_velocityi);
        offset += 8;
        }
        int length_effort = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_effort |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_effort |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_effort |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_effort > 0) {
            this.effort = new double[length_effort];
        }
        for (int i = 0; i < length_effort; i++){
        long bits_efforti = 0;
        bits_efforti |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_efforti |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_efforti |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_efforti |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_efforti |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_efforti |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_efforti |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_efforti |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.effort[i] = Double.longBitsToDouble(bits_efforti);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_name = this.name != null ? this.name.length : 0;
        for (int i = 0; i < length_name; i++) {
        int length_namei = this.name[i].getBytes().length;
        length += 4;
        length += length_namei;
        }
        length += 4;
        int length_position = this.position != null ? this.position.length : 0;
        for (int i = 0; i < length_position; i++) {
        length += 8;
        }
        length += 4;
        int length_velocity = this.velocity != null ? this.velocity.length : 0;
        for (int i = 0; i < length_velocity; i++) {
        length += 8;
        }
        length += 4;
        int length_effort = this.effort != null ? this.effort.length : 0;
        for (int i = 0; i < length_effort; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/JointState"; }
    public java.lang.String getMD5(){ return "6df7130a6d6a4c2f2037ce4a6e061fb9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
