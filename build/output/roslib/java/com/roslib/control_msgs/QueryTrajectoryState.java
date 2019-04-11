package com.roslib.control_msgs;

import java.lang.*;

public class QueryTrajectoryState {

public static final java.lang.String QUERYTRAJECTORYSTATE = "control_msgs/QueryTrajectoryState";

public class QueryTrajectoryStateRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.ros.Time time;

    public QueryTrajectoryStateRequest() {
        this.time = new com.roslib.ros.Time();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return QUERYTRAJECTORYSTATE; }
    public java.lang.String getMD5(){ return "f0a229bfb91bf05eb8a0dca02b9e560e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class QueryTrajectoryStateResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] name;
    public double[] position;
    public double[] velocity;
    public double[] acceleration;

    public QueryTrajectoryStateResponse() {
        this.name = null;
        this.position = null;
        this.velocity = null;
        this.acceleration = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        int length_acceleration = this.acceleration != null ? this.acceleration.length : 0;
        outbuffer[offset + 0] = (byte)((length_acceleration >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_acceleration >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_acceleration >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_acceleration >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_acceleration; i++){
        long bits_accelerationi = Double.doubleToRawLongBits(this.acceleration[i]);
        outbuffer[offset + 0] = (byte)((bits_accelerationi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_accelerationi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_accelerationi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_accelerationi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_accelerationi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_accelerationi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_accelerationi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_accelerationi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
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
        int length_acceleration = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_acceleration |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_acceleration |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_acceleration |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_acceleration > 0) {
            this.acceleration = new double[length_acceleration];
        }
        for (int i = 0; i < length_acceleration; i++){
        long bits_accelerationi = 0;
        bits_accelerationi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_accelerationi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_accelerationi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_accelerationi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_accelerationi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_accelerationi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_accelerationi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_accelerationi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.acceleration[i] = Double.longBitsToDouble(bits_accelerationi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
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
        int length_acceleration = this.acceleration != null ? this.acceleration.length : 0;
        for (int i = 0; i < length_acceleration; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType() { return QUERYTRAJECTORYSTATE; }
    public java.lang.String getMD5(){ return "c3c1aaf46de8952746d067ac8657a66e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
