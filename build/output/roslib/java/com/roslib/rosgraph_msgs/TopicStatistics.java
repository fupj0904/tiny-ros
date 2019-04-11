package com.roslib.rosgraph_msgs;

import java.lang.*;

public class TopicStatistics implements com.roslib.ros.Msg {
    public java.lang.String topic;
    public java.lang.String node_pub;
    public java.lang.String node_sub;
    public com.roslib.ros.Time window_start;
    public com.roslib.ros.Time window_stop;
    public int delivered_msgs;
    public int dropped_msgs;
    public int traffic;
    public com.roslib.ros.Duration period_mean;
    public com.roslib.ros.Duration period_stddev;
    public com.roslib.ros.Duration period_max;
    public com.roslib.ros.Duration stamp_age_mean;
    public com.roslib.ros.Duration stamp_age_stddev;
    public com.roslib.ros.Duration stamp_age_max;

    public TopicStatistics() {
        this.topic = "";
        this.node_pub = "";
        this.node_sub = "";
        this.window_start = new com.roslib.ros.Time();
        this.window_stop = new com.roslib.ros.Time();
        this.delivered_msgs = 0;
        this.dropped_msgs = 0;
        this.traffic = 0;
        this.period_mean = new com.roslib.ros.Duration();
        this.period_stddev = new com.roslib.ros.Duration();
        this.period_max = new com.roslib.ros.Duration();
        this.stamp_age_mean = new com.roslib.ros.Duration();
        this.stamp_age_stddev = new com.roslib.ros.Duration();
        this.stamp_age_max = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_topic = this.topic.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_topic >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topic >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topic >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topic >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_topic; k++) {
            outbuffer[offset + k] = (byte)((this.topic.getBytes())[k] & 0xFF);
        }
        offset += length_topic;
        int length_node_pub = this.node_pub.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_node_pub >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_node_pub >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_node_pub >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_node_pub >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_node_pub; k++) {
            outbuffer[offset + k] = (byte)((this.node_pub.getBytes())[k] & 0xFF);
        }
        offset += length_node_pub;
        int length_node_sub = this.node_sub.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_node_sub >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_node_sub >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_node_sub >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_node_sub >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_node_sub; k++) {
            outbuffer[offset + k] = (byte)((this.node_sub.getBytes())[k] & 0xFF);
        }
        offset += length_node_sub;
        outbuffer[offset + 0] = (byte)((this.window_start.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.window_start.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.window_start.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.window_start.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.window_start.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.window_start.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.window_start.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.window_start.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.window_stop.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.window_stop.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.window_stop.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.window_stop.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.window_stop.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.window_stop.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.window_stop.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.window_stop.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.delivered_msgs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.delivered_msgs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.delivered_msgs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.delivered_msgs >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.dropped_msgs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.dropped_msgs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.dropped_msgs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.dropped_msgs >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.traffic >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.traffic >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.traffic >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.traffic >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_mean.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_mean.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_mean.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_mean.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_mean.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_mean.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_mean.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_mean.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_stddev.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_stddev.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_stddev.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_stddev.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_stddev.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_stddev.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_stddev.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_stddev.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_max.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_max.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_max.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_max.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.period_max.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.period_max.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.period_max.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.period_max.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_mean.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_mean.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_mean.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_mean.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_mean.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_mean.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_mean.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_mean.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_stddev.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_stddev.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_stddev.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_stddev.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_stddev.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_stddev.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_stddev.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_stddev.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_max.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_max.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_max.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_max.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp_age_max.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp_age_max.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp_age_max.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp_age_max.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_topic = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topic |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topic |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topic |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_topic = new byte[length_topic];
        for(int k= 0; k< length_topic; k++){
            bytes_topic[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.topic = new java.lang.String(bytes_topic);
        offset += length_topic;
        int length_node_pub = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_node_pub |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_node_pub |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_node_pub |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_node_pub = new byte[length_node_pub];
        for(int k= 0; k< length_node_pub; k++){
            bytes_node_pub[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.node_pub = new java.lang.String(bytes_node_pub);
        offset += length_node_pub;
        int length_node_sub = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_node_sub |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_node_sub |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_node_sub |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_node_sub = new byte[length_node_sub];
        for(int k= 0; k< length_node_sub; k++){
            bytes_node_sub[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.node_sub = new java.lang.String(bytes_node_sub);
        offset += length_node_sub;
        this.window_start.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.window_start.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.window_start.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.window_start.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.window_start.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.window_start.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.window_start.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.window_start.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.window_stop.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.window_stop.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.window_stop.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.window_stop.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.window_stop.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.window_stop.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.window_stop.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.window_stop.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.delivered_msgs   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.delivered_msgs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.delivered_msgs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.delivered_msgs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.dropped_msgs   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.dropped_msgs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.dropped_msgs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.dropped_msgs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.traffic   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.traffic |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.traffic |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.traffic |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_mean.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_mean.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_mean.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_mean.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_mean.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_mean.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_mean.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_mean.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_stddev.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_stddev.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_stddev.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_stddev.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_stddev.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_stddev.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_stddev.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_stddev.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_max.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_max.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_max.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_max.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.period_max.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.period_max.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.period_max.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.period_max.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_mean.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_mean.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_mean.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_mean.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_mean.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_mean.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_mean.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_mean.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_stddev.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_stddev.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_stddev.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_stddev.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_stddev.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_stddev.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_stddev.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_stddev.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_max.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_max.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_max.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_max.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp_age_max.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp_age_max.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp_age_max.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp_age_max.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_topic = this.topic.getBytes().length;
        length += 4;
        length += length_topic;
        int length_node_pub = this.node_pub.getBytes().length;
        length += 4;
        length += length_node_pub;
        int length_node_sub = this.node_sub.getBytes().length;
        length += 4;
        length += length_node_sub;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
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

    public java.lang.String getType(){ return "rosgraph_msgs/TopicStatistics"; }
    public java.lang.String getMD5(){ return "8b30d3f22284a3bee7679b7194bd38a3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
