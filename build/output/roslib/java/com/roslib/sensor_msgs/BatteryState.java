package com.roslib.sensor_msgs;

import java.lang.*;

public class BatteryState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float voltage;
    public float current;
    public float charge;
    public float capacity;
    public float design_capacity;
    public float percentage;
    public int power_supply_status;
    public int power_supply_health;
    public int power_supply_technology;
    public boolean present;
    public float[] cell_voltage;
    public java.lang.String location;
    public java.lang.String serial_number;
    public static final int POWER_SUPPLY_STATUS_UNKNOWN = (int)( 0);
    public static final int POWER_SUPPLY_STATUS_CHARGING = (int)( 1);
    public static final int POWER_SUPPLY_STATUS_DISCHARGING = (int)( 2);
    public static final int POWER_SUPPLY_STATUS_NOT_CHARGING = (int)( 3);
    public static final int POWER_SUPPLY_STATUS_FULL = (int)( 4);
    public static final int POWER_SUPPLY_HEALTH_UNKNOWN = (int)( 0);
    public static final int POWER_SUPPLY_HEALTH_GOOD = (int)( 1);
    public static final int POWER_SUPPLY_HEALTH_OVERHEAT = (int)( 2);
    public static final int POWER_SUPPLY_HEALTH_DEAD = (int)( 3);
    public static final int POWER_SUPPLY_HEALTH_OVERVOLTAGE = (int)( 4);
    public static final int POWER_SUPPLY_HEALTH_UNSPEC_FAILURE = (int)( 5);
    public static final int POWER_SUPPLY_HEALTH_COLD = (int)( 6);
    public static final int POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE = (int)( 7);
    public static final int POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE = (int)( 8);
    public static final int POWER_SUPPLY_TECHNOLOGY_UNKNOWN = (int)( 0);
    public static final int POWER_SUPPLY_TECHNOLOGY_NIMH = (int)( 1);
    public static final int POWER_SUPPLY_TECHNOLOGY_LION = (int)( 2);
    public static final int POWER_SUPPLY_TECHNOLOGY_LIPO = (int)( 3);
    public static final int POWER_SUPPLY_TECHNOLOGY_LIFE = (int)( 4);
    public static final int POWER_SUPPLY_TECHNOLOGY_NICD = (int)( 5);
    public static final int POWER_SUPPLY_TECHNOLOGY_LIMN = (int)( 6);

    public BatteryState() {
        this.header = new com.roslib.std_msgs.Header();
        this.voltage = 0;
        this.current = 0;
        this.charge = 0;
        this.capacity = 0;
        this.design_capacity = 0;
        this.percentage = 0;
        this.power_supply_status = 0;
        this.power_supply_health = 0;
        this.power_supply_technology = 0;
        this.present = false;
        this.cell_voltage = null;
        this.location = "";
        this.serial_number = "";
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
        int bits_current = Float.floatToRawIntBits(current);
        outbuffer[offset + 0] = (byte)((bits_current >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_current >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_current >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_current >> (8 * 3)) & 0xFF);
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
        int bits_percentage = Float.floatToRawIntBits(percentage);
        outbuffer[offset + 0] = (byte)((bits_percentage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_percentage >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_percentage >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_percentage >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.power_supply_status >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.power_supply_health >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.power_supply_technology >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((present ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_cell_voltage = this.cell_voltage != null ? this.cell_voltage.length : 0;
        outbuffer[offset + 0] = (byte)((length_cell_voltage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_cell_voltage >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_cell_voltage >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_cell_voltage >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_cell_voltage; i++){
        int bits_cell_voltagei = Float.floatToRawIntBits(cell_voltage[i]);
        outbuffer[offset + 0] = (byte)((bits_cell_voltagei >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_cell_voltagei >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_cell_voltagei >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_cell_voltagei >> (8 * 3)) & 0xFF);
        offset += 4;
        }
        int length_location = this.location.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_location >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_location >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_location >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_location >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_location; k++) {
            outbuffer[offset + k] = (byte)((this.location.getBytes())[k] & 0xFF);
        }
        offset += length_location;
        int length_serial_number = this.serial_number.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_serial_number >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_serial_number >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_serial_number >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_serial_number >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_serial_number; k++) {
            outbuffer[offset + k] = (byte)((this.serial_number.getBytes())[k] & 0xFF);
        }
        offset += length_serial_number;
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
        int bits_current = 0;
        bits_current |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_current |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_current |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_current |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.current = Float.intBitsToFloat(bits_current);
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
        int bits_percentage = 0;
        bits_percentage |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_percentage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_percentage |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_percentage |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.percentage = Float.intBitsToFloat(bits_percentage);
        offset += 4;
        this.power_supply_status   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.power_supply_health   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.power_supply_technology   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.present = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_cell_voltage = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_cell_voltage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_cell_voltage |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_cell_voltage |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_cell_voltage > 0) {
            this.cell_voltage = new float[length_cell_voltage];
        }
        for (int i = 0; i < length_cell_voltage; i++){
        int bits_cell_voltagei = 0;
        bits_cell_voltagei |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_cell_voltagei |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_cell_voltagei |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_cell_voltagei |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.cell_voltage[i] = Float.intBitsToFloat(bits_cell_voltagei);
        offset += 4;
        }
        int length_location = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_location |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_location |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_location |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_location = new byte[length_location];
        for(int k= 0; k< length_location; k++){
            bytes_location[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.location = new java.lang.String(bytes_location);
        offset += length_location;
        int length_serial_number = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_serial_number |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_serial_number |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_serial_number |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_serial_number = new byte[length_serial_number];
        for(int k= 0; k< length_serial_number; k++){
            bytes_serial_number[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.serial_number = new java.lang.String(bytes_serial_number);
        offset += length_serial_number;
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
        length += 1;
        length += 1;
        length += 4;
        int length_cell_voltage = this.cell_voltage != null ? this.cell_voltage.length : 0;
        for (int i = 0; i < length_cell_voltage; i++) {
        length += 4;
        }
        int length_location = this.location.getBytes().length;
        length += 4;
        length += length_location;
        int length_serial_number = this.serial_number.getBytes().length;
        length += 4;
        length += length_serial_number;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/BatteryState"; }
    public java.lang.String getMD5(){ return "715c4769cacd76e4b679cc3ea4c347b4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
