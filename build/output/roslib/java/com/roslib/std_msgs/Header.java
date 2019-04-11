package com.roslib.std_msgs;

import java.lang.*;

public class Header implements com.roslib.ros.Msg {
    public long seq;
    public com.roslib.ros.Time stamp;
    public java.lang.String frame_id;

    public Header() {
        this.seq = 0;
        this.stamp = new com.roslib.ros.Time();
        this.frame_id = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.seq >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.seq >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.seq >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.seq >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_frame_id = this.frame_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_frame_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_frame_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_frame_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_frame_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_frame_id; k++) {
            outbuffer[offset + k] = (byte)((this.frame_id.getBytes())[k] & 0xFF);
        }
        offset += length_frame_id;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.seq   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.seq |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.seq |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.seq |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_frame_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_frame_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_frame_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_frame_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_frame_id = new byte[length_frame_id];
        for(int k= 0; k< length_frame_id; k++){
            bytes_frame_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.frame_id = new java.lang.String(bytes_frame_id);
        offset += length_frame_id;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        int length_frame_id = this.frame_id.getBytes().length;
        length += 4;
        length += length_frame_id;
        return length;
    }

    public java.lang.String getType(){ return "std_msgs/Header"; }
    public java.lang.String getMD5(){ return "d33440e88be7b5b8255fc61ebbca06ad"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
