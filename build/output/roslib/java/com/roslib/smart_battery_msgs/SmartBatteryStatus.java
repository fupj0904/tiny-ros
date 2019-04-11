package com.roslib.smart_battery_msgs;

import java.lang.*;

public class SmartBatteryStatus implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float voltage;
    public float rate;
    public float charge;
    public float capacity;
    public float design_capacity;
    public int percentage;
    public int charge_state;
    public boolean present;
    public static final int DISCHARGING = (int)( 0);
    public static final int CHARGING = (int)( 1);
    public static final int CHARGED = (int)( 2);

    public SmartBatteryStatus() {
        this.header = new com.roslib.std_msgs.Header();
        this.voltage = 0;
        this.rate = 0;
        this.charge = 0;
        this.capacity = 0;
        this.design_capacity = 0;
        this.percentage = 0;
        this.charge_state = 0;
        this.present = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int bits_voltage = Float.floatToRawIntBits(voltage);
        outbuffer[offset + 0] = (byte)((bits_voltage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_voltage >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_voltage >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_voltage >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_rate = Float.floatToRawIntBits(rate);
        outbuffer[offset + 0] = (byte)((bits_rate >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_rate >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_rate >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_rate >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_charge = Float.floatToRawIntBits(charge);
        outbuffer[offset + 0] = (byte)((bits_charge >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_charge >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_charge >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_charge >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_capacity = Float.floatToRawIntBits(capacity);
        outbuffer[offset + 0] = (byte)((bits_capacity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_capacity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_capacity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_capacity >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_design_capacity = Float.floatToRawIntBits(design_capacity);
        outbuffer[offset + 0] = (byte)((bits_design_capacity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_design_capacity >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_design_capacity >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_design_capacity >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.percentage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.percentage >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.percentage >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.percentage >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.charge_state >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((present ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int bits_voltage = 0;
        bits_voltage |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_voltage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_voltage |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_voltage |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.voltage = Float.intBitsToFloat(bits_voltage);
        offset += 4;
        int bits_rate = 0;
        bits_rate |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_rate |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_rate |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_rate |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.rate = Float.intBitsToFloat(bits_rate);
        offset += 4;
        int bits_charge = 0;
        bits_charge |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_charge |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_charge |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_charge |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.charge = Float.intBitsToFloat(bits_charge);
        offset += 4;
        int bits_capacity = 0;
        bits_capacity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_capacity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_capacity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_capacity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.capacity = Float.intBitsToFloat(bits_capacity);
        offset += 4;
        int bits_design_capacity = 0;
        bits_design_capacity |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_design_capacity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_design_capacity |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_design_capacity |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.design_capacity = Float.intBitsToFloat(bits_design_capacity);
        offset += 4;
        this.percentage   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.percentage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.percentage |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.percentage |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.charge_state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.present = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 1;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "smart_battery_msgs/SmartBatteryStatus"; }
    public java.lang.String getMD5(){ return "ce1e834f6764072468b9cba91e16840b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
