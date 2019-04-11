package com.roslib.controller_manager_msgs;

import java.lang.*;

public class ControllerStatistics implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String type;
    public com.roslib.ros.Time timestamp;
    public boolean running;
    public com.roslib.ros.Duration max_time;
    public com.roslib.ros.Duration mean_time;
    public com.roslib.ros.Duration variance_time;
    public int num_control_loop_overruns;
    public com.roslib.ros.Time time_last_control_loop_overrun;

    public ControllerStatistics() {
        this.name = "";
        this.type = "";
        this.timestamp = new com.roslib.ros.Time();
        this.running = false;
        this.max_time = new com.roslib.ros.Duration();
        this.mean_time = new com.roslib.ros.Duration();
        this.variance_time = new com.roslib.ros.Duration();
        this.num_control_loop_overruns = 0;
        this.time_last_control_loop_overrun = new com.roslib.ros.Time();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
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
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        outbuffer[offset + 0] = (byte)((this.timestamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timestamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timestamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timestamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timestamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((running ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.max_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.max_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.max_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.max_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.max_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.max_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.max_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.max_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.mean_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.mean_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.mean_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.mean_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.mean_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.mean_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.mean_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.mean_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.variance_time.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.variance_time.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.variance_time.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.variance_time.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.variance_time.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.variance_time.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.variance_time.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.variance_time.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.num_control_loop_overruns >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.num_control_loop_overruns >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.num_control_loop_overruns >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.num_control_loop_overruns >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time_last_control_loop_overrun.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_last_control_loop_overrun.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_last_control_loop_overrun.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_last_control_loop_overrun.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time_last_control_loop_overrun.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_last_control_loop_overrun.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_last_control_loop_overrun.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_last_control_loop_overrun.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
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
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        this.timestamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timestamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timestamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timestamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timestamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.running = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.max_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.max_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.max_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.max_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.max_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.max_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.max_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.max_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.mean_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.mean_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.mean_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.mean_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.mean_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.mean_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.mean_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.mean_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.variance_time.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.variance_time.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.variance_time.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.variance_time.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.variance_time.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.variance_time.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.variance_time.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.variance_time.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.num_control_loop_overruns   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.num_control_loop_overruns |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.num_control_loop_overruns |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.num_control_loop_overruns |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time_last_control_loop_overrun.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_last_control_loop_overrun.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_last_control_loop_overrun.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_last_control_loop_overrun.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time_last_control_loop_overrun.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_last_control_loop_overrun.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_last_control_loop_overrun.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_last_control_loop_overrun.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        length += 4;
        length += 4;
        length += 1;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "controller_manager_msgs/ControllerStatistics"; }
    public java.lang.String getMD5(){ return "9674317bbd364786e998d89f464e430e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
