package com.roslib.create_node;

import java.lang.*;

public class RoombaSensorState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int bumps_wheeldrops;
    public boolean wall;
    public boolean cliff_left;
    public boolean cliff_front_left;
    public boolean cliff_front_right;
    public boolean cliff_right;
    public boolean virtual_wall;
    public int motor_overcurrents;
    public int dirt_detector_left;
    public int dirt_detector_right;
    public int remote_opcode;
    public int buttons;
    public short distance;
    public short angle;
    public int charging_state;
    public int voltage;
    public short current;
    public byte temperature;
    public int charge;
    public int capacity;
    public static final int CHARGING_NOT_CHARGING = (int)( 0);
    public static final int CHARGING_CHARGING_RECOVERY = (int)( 1);
    public static final int CHARGING_CHARGING = (int)( 2);
    public static final int CHARGING_TRICKLE_CHARGING = (int)( 3);
    public static final int CHARGING_WAITING = (int)( 4);
    public static final int CHARGING_CHARGING_ERROR = (int)( 5);

    public RoombaSensorState() {
        this.header = new com.roslib.std_msgs.Header();
        this.bumps_wheeldrops = 0;
        this.wall = false;
        this.cliff_left = false;
        this.cliff_front_left = false;
        this.cliff_front_right = false;
        this.cliff_right = false;
        this.virtual_wall = false;
        this.motor_overcurrents = 0;
        this.dirt_detector_left = 0;
        this.dirt_detector_right = 0;
        this.remote_opcode = 0;
        this.buttons = 0;
        this.distance = 0;
        this.angle = 0;
        this.charging_state = 0;
        this.voltage = 0;
        this.current = 0;
        this.temperature = 0;
        this.charge = 0;
        this.capacity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.bumps_wheeldrops >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((wall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_left ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_front_left ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_front_right ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_right ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((virtual_wall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.motor_overcurrents >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.dirt_detector_left >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.dirt_detector_right >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.remote_opcode >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.buttons >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.distance >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.angle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.angle >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.charging_state >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.voltage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.voltage >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.current >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.current >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.temperature >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.charge >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.charge >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.capacity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.capacity >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.bumps_wheeldrops   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.wall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_left = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_front_left = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_front_right = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_right = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.virtual_wall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.motor_overcurrents   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.dirt_detector_left   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.dirt_detector_right   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.remote_opcode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.buttons   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.distance   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.distance |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.angle   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.angle |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.charging_state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.voltage   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.voltage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.current   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.current |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.temperature   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.charge   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.charge |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.capacity   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.capacity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 2;
        length += 2;
        length += 1;
        length += 2;
        length += 2;
        length += 1;
        length += 2;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "create_node/RoombaSensorState"; }
    public java.lang.String getMD5(){ return "5b882750c248d5a78cb6fd2c82580add"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
