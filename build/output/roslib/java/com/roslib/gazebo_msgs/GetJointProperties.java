package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetJointProperties {

public static final java.lang.String GETJOINTPROPERTIES = "gazebo_msgs/GetJointProperties";

public class GetJointPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String joint_name;

    public GetJointPropertiesRequest() {
        this.joint_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_joint_name = this.joint_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_name; k++) {
            outbuffer[offset + k] = (byte)((this.joint_name.getBytes())[k] & 0xFF);
        }
        offset += length_joint_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_joint_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_name = new byte[length_joint_name];
        for(int k= 0; k< length_joint_name; k++){
            bytes_joint_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_name = new java.lang.String(bytes_joint_name);
        offset += length_joint_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_joint_name = this.joint_name.getBytes().length;
        length += 4;
        length += length_joint_name;
        return length;
    }

    public java.lang.String getType() { return GETJOINTPROPERTIES; }
    public java.lang.String getMD5(){ return "b07a3ce5fb5aba1cfc56577c9cb3ecc6"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetJointPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public int type;
    public double[] damping;
    public double[] position;
    public double[] rate;
    public boolean success;
    public java.lang.String status_message;
    public static final int REVOLUTE = (int)( 0                );
    public static final int CONTINUOUS = (int)( 1                );
    public static final int PRISMATIC = (int)( 2                );
    public static final int FIXED = (int)( 3                );
    public static final int BALL = (int)( 4                );
    public static final int UNIVERSAL = (int)( 5                );

    public GetJointPropertiesResponse() {
        this.type = 0;
        this.damping = null;
        this.position = null;
        this.rate = null;
        this.success = false;
        this.status_message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_damping = this.damping != null ? this.damping.length : 0;
        outbuffer[offset + 0] = (byte)((length_damping >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_damping >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_damping >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_damping >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_damping; i++){
        long bits_dampingi = Double.doubleToRawLongBits(this.damping[i]);
        outbuffer[offset + 0] = (byte)((bits_dampingi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_dampingi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_dampingi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_dampingi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_dampingi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_dampingi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_dampingi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_dampingi >> (8 * 7)) & 0xFF);
        offset += 8;
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
        int length_rate = this.rate != null ? this.rate.length : 0;
        outbuffer[offset + 0] = (byte)((length_rate >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rate >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rate >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rate >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rate; i++){
        long bits_ratei = Double.doubleToRawLongBits(this.rate[i]);
        outbuffer[offset + 0] = (byte)((bits_ratei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ratei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ratei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ratei >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_ratei >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_ratei >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_ratei >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_ratei >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status_message = this.status_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_message; k++) {
            outbuffer[offset + k] = (byte)((this.status_message.getBytes())[k] & 0xFF);
        }
        offset += length_status_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_damping = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_damping |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_damping |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_damping |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_damping > 0) {
            this.damping = new double[length_damping];
        }
        for (int i = 0; i < length_damping; i++){
        long bits_dampingi = 0;
        bits_dampingi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_dampingi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_dampingi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_dampingi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_dampingi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_dampingi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_dampingi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_dampingi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.damping[i] = Double.longBitsToDouble(bits_dampingi);
        offset += 8;
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
        int length_rate = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rate |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rate |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rate |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rate > 0) {
            this.rate = new double[length_rate];
        }
        for (int i = 0; i < length_rate; i++){
        long bits_ratei = 0;
        bits_ratei |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ratei |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ratei |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ratei |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_ratei |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_ratei |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_ratei |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_ratei |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.rate[i] = Double.longBitsToDouble(bits_ratei);
        offset += 8;
        }
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_message = new byte[length_status_message];
        for(int k= 0; k< length_status_message; k++){
            bytes_status_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_message = new java.lang.String(bytes_status_message);
        offset += length_status_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        int length_damping = this.damping != null ? this.damping.length : 0;
        for (int i = 0; i < length_damping; i++) {
        length += 8;
        }
        length += 4;
        int length_position = this.position != null ? this.position.length : 0;
        for (int i = 0; i < length_position; i++) {
        length += 8;
        }
        length += 4;
        int length_rate = this.rate != null ? this.rate.length : 0;
        for (int i = 0; i < length_rate; i++) {
        length += 8;
        }
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETJOINTPROPERTIES; }
    public java.lang.String getMD5(){ return "a60fbf691ac539e1355c979ca09b4573"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
