package com.roslib.sensor_msgs;

import java.lang.*;

public class TimeReference implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.ros.Time time_ref;
    public java.lang.String source;

    public TimeReference() {
        this.header = new com.roslib.std_msgs.Header();
        this.time_ref = new com.roslib.ros.Time();
        this.source = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.time_ref.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_ref.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_ref.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_ref.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.time_ref.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_ref.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_ref.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_ref.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_source = this.source.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_source >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_source >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_source >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_source >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_source; k++) {
            outbuffer[offset + k] = (byte)((this.source.getBytes())[k] & 0xFF);
        }
        offset += length_source;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.time_ref.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_ref.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_ref.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_ref.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.time_ref.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_ref.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_ref.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_ref.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_source = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_source |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_source |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_source |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_source = new byte[length_source];
        for(int k= 0; k< length_source; k++){
            bytes_source[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.source = new java.lang.String(bytes_source);
        offset += length_source;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        int length_source = this.source.getBytes().length;
        length += 4;
        length += length_source;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/TimeReference"; }
    public java.lang.String getMD5(){ return "8e1576e01de57cd0d55758112f0e84ec"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
