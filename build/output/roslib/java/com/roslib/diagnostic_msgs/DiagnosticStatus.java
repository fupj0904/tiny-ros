package com.roslib.diagnostic_msgs;

import java.lang.*;

public class DiagnosticStatus implements com.roslib.ros.Msg {
    public byte level;
    public java.lang.String name;
    public java.lang.String message;
    public java.lang.String hardware_id;
    public com.roslib.diagnostic_msgs.KeyValue[] values;
    public static final byte OK = (byte)(0);
    public static final byte WARN = (byte)(1);
    public static final byte ERROR = (byte)(2);
    public static final byte STALE = (byte)(3);

    public DiagnosticStatus() {
        this.level = 0;
        this.name = "";
        this.message = "";
        this.hardware_id = "";
        this.values = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.level >> (8 * 0)) & 0xFF);
        offset += 1;
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
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
        int length_hardware_id = this.hardware_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hardware_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hardware_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hardware_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hardware_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hardware_id; k++) {
            outbuffer[offset + k] = (byte)((this.hardware_id.getBytes())[k] & 0xFF);
        }
        offset += length_hardware_id;
        int length_values = this.values != null ? this.values.length : 0;
        outbuffer[offset + 0] = (byte)((length_values >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_values >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_values >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_values >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_values; i++){
        offset = this.values[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.level   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
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
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        int length_hardware_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hardware_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hardware_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hardware_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hardware_id = new byte[length_hardware_id];
        for(int k= 0; k< length_hardware_id; k++){
            bytes_hardware_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hardware_id = new java.lang.String(bytes_hardware_id);
        offset += length_hardware_id;
        int length_values = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_values |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_values |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_values |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_values > 0) {
            this.values = new com.roslib.diagnostic_msgs.KeyValue[length_values];
        }
        for (int i = 0; i < length_values; i++){
        offset = this.values[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        int length_hardware_id = this.hardware_id.getBytes().length;
        length += 4;
        length += length_hardware_id;
        length += 4;
        int length_values = this.values != null ? this.values.length : 0;
        for (int i = 0; i < length_values; i++) {
        length += this.values[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "diagnostic_msgs/DiagnosticStatus"; }
    public java.lang.String getMD5(){ return "9ec892d2145f478061efd60bb1762361"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
