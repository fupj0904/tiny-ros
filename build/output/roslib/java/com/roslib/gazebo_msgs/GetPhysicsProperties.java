package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetPhysicsProperties {

public static final java.lang.String GETPHYSICSPROPERTIES = "gazebo_msgs/GetPhysicsProperties";

public class GetPhysicsPropertiesRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetPhysicsPropertiesRequest() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return GETPHYSICSPROPERTIES; }
    public java.lang.String getMD5(){ return "cba4b83a6824644ef787d2ac8bb7aa60"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetPhysicsPropertiesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public double time_step;
    public boolean pause;
    public double max_update_rate;
    public com.roslib.geometry_msgs.Vector3 gravity;
    public com.roslib.gazebo_msgs.ODEPhysics ode_config;
    public boolean success;
    public java.lang.String status_message;

    public GetPhysicsPropertiesResponse() {
        this.time_step = 0;
        this.pause = false;
        this.max_update_rate = 0;
        this.gravity = new com.roslib.geometry_msgs.Vector3();
        this.ode_config = new com.roslib.gazebo_msgs.ODEPhysics();
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
        long bits_time_step = Double.doubleToRawLongBits(this.time_step);
        outbuffer[offset + 0] = (byte)((bits_time_step >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_time_step >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_time_step >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_time_step >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_time_step >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_time_step >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_time_step >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_time_step >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset] = (byte)((pause ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        long bits_max_update_rate = Double.doubleToRawLongBits(this.max_update_rate);
        outbuffer[offset + 0] = (byte)((bits_max_update_rate >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_update_rate >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_update_rate >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_update_rate >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_max_update_rate >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_max_update_rate >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_max_update_rate >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_max_update_rate >> (8 * 7)) & 0xFF);
        offset += 8;
        offset = this.gravity.serialize(outbuffer, offset);
        offset = this.ode_config.serialize(outbuffer, offset);
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
        long bits_time_step = 0;
        bits_time_step |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_time_step |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_time_step |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_time_step |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_time_step |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_time_step |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_time_step |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_time_step |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.time_step = Double.longBitsToDouble(bits_time_step);
        offset += 8;
        this.pause = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        long bits_max_update_rate = 0;
        bits_max_update_rate |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_update_rate |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_update_rate |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_update_rate |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_max_update_rate |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_max_update_rate |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_max_update_rate |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_max_update_rate |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.max_update_rate = Double.longBitsToDouble(bits_max_update_rate);
        offset += 8;
        offset = this.gravity.deserialize(inbuffer, offset);
        offset = this.ode_config.deserialize(inbuffer, offset);
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
        length += 8;
        length += 1;
        length += 8;
        length += this.gravity.serializedLength();
        length += this.ode_config.serializedLength();
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETPHYSICSPROPERTIES; }
    public java.lang.String getMD5(){ return "8f17f751935ff418006bf6b24982cb08"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
