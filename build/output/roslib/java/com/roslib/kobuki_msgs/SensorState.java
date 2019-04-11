package com.roslib.kobuki_msgs;

import java.lang.*;

public class SensorState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int time_stamp;
    public int bumper;
    public int wheel_drop;
    public int cliff;
    public int left_encoder;
    public int right_encoder;
    public byte left_pwm;
    public byte right_pwm;
    public int buttons;
    public int charger;
    public int battery;
    public int[] bottom;
    public int[] current;
    public int over_current;
    public int digital_input;
    public int[] analog_input;
    public static final int BUMPER_RIGHT = (int)( 1);
    public static final int BUMPER_CENTRE = (int)( 2);
    public static final int BUMPER_LEFT = (int)( 4);
    public static final int WHEEL_DROP_RIGHT = (int)( 1);
    public static final int WHEEL_DROP_LEFT = (int)( 2);
    public static final int CLIFF_RIGHT = (int)( 1);
    public static final int CLIFF_CENTRE = (int)( 2);
    public static final int CLIFF_LEFT = (int)( 4);
    public static final int BUTTON0 = (int)( 1);
    public static final int BUTTON1 = (int)( 2);
    public static final int BUTTON2 = (int)( 4);
    public static final int DISCHARGING = (int)( 0);
    public static final int DOCKING_CHARGED = (int)( 2);
    public static final int DOCKING_CHARGING = (int)( 6);
    public static final int ADAPTER_CHARGED = (int)( 18);
    public static final int ADAPTER_CHARGING = (int)( 22);
    public static final int OVER_CURRENT_LEFT_WHEEL = (int)( 1);
    public static final int OVER_CURRENT_RIGHT_WHEEL = (int)( 2);
    public static final int OVER_CURRENT_BOTH_WHEELS = (int)( 3);
    public static final int DIGITAL_INPUT0 = (int)( 1);
    public static final int DIGITAL_INPUT1 = (int)( 2);
    public static final int DIGITAL_INPUT2 = (int)( 4);
    public static final int DIGITAL_INPUT3 = (int)( 8);
    public static final int DB25_TEST_BOARD_CONNECTED = (int)( 64);

    public SensorState() {
        this.header = new com.roslib.std_msgs.Header();
        this.time_stamp = 0;
        this.bumper = 0;
        this.wheel_drop = 0;
        this.cliff = 0;
        this.left_encoder = 0;
        this.right_encoder = 0;
        this.left_pwm = 0;
        this.right_pwm = 0;
        this.buttons = 0;
        this.charger = 0;
        this.battery = 0;
        this.bottom = null;
        this.current = null;
        this.over_current = 0;
        this.digital_input = 0;
        this.analog_input = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.time_stamp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_stamp >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.bumper >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.wheel_drop >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.cliff >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.left_encoder >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.left_encoder >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.right_encoder >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.right_encoder >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.left_pwm >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.right_pwm >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.buttons >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.charger >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.battery >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_bottom = this.bottom != null ? this.bottom.length : 0;
        outbuffer[offset + 0] = (byte)((length_bottom >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_bottom >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_bottom >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_bottom >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_bottom; i++){
        outbuffer[offset + 0] = (byte)((this.bottom[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.bottom[i] >> (8 * 1)) & 0xFF);
        offset += 2;
        }
        int length_current = this.current != null ? this.current.length : 0;
        outbuffer[offset + 0] = (byte)((length_current >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_current >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_current >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_current >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_current; i++){
        outbuffer[offset + 0] = (byte)((this.current[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        outbuffer[offset + 0] = (byte)((this.over_current >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.digital_input >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.digital_input >> (8 * 1)) & 0xFF);
        offset += 2;
        int length_analog_input = this.analog_input != null ? this.analog_input.length : 0;
        outbuffer[offset + 0] = (byte)((length_analog_input >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_analog_input >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_analog_input >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_analog_input >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_analog_input; i++){
        outbuffer[offset + 0] = (byte)((this.analog_input[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.analog_input[i] >> (8 * 1)) & 0xFF);
        offset += 2;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.time_stamp   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_stamp |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.bumper   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.wheel_drop   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.cliff   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.left_encoder   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.left_encoder |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.right_encoder   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.right_encoder |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.left_pwm   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.right_pwm   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.buttons   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.charger   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.battery   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_bottom = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_bottom |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_bottom |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_bottom |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_bottom > 0) {
            this.bottom = new int[length_bottom];
        }
        for (int i = 0; i < length_bottom; i++){
        this.bottom[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.bottom[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        }
        int length_current = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_current |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_current |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_current |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_current > 0) {
            this.current = new int[length_current];
        }
        for (int i = 0; i < length_current; i++){
        this.current[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        this.over_current   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.digital_input   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.digital_input |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        int length_analog_input = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_analog_input |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_analog_input |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_analog_input |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_analog_input > 0) {
            this.analog_input = new int[length_analog_input];
        }
        for (int i = 0; i < length_analog_input; i++){
        this.analog_input[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.analog_input[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 2;
        length += 1;
        length += 1;
        length += 1;
        length += 2;
        length += 2;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 4;
        int length_bottom = this.bottom != null ? this.bottom.length : 0;
        for (int i = 0; i < length_bottom; i++) {
        length += 2;
        }
        length += 4;
        int length_current = this.current != null ? this.current.length : 0;
        for (int i = 0; i < length_current; i++) {
        length += 1;
        }
        length += 1;
        length += 2;
        length += 4;
        int length_analog_input = this.analog_input != null ? this.analog_input.length : 0;
        for (int i = 0; i < length_analog_input; i++) {
        length += 2;
        }
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/SensorState"; }
    public java.lang.String getMD5(){ return "40f0ff84fa9c76e5f7b2f88121da23c6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
