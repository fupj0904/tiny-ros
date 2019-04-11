package com.roslib.bond;

import java.lang.*;

public class Status implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String id;
    public java.lang.String instance_id;
    public boolean active;
    public float heartbeat_timeout;
    public float heartbeat_period;

    public Status() {
        this.header = new com.roslib.std_msgs.Header();
        this.id = "";
        this.instance_id = "";
        this.active = false;
        this.heartbeat_timeout = 0;
        this.heartbeat_period = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_id = this.id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_id; k++) {
            outbuffer[offset + k] = (byte)((this.id.getBytes())[k] & 0xFF);
        }
        offset += length_id;
        int length_instance_id = this.instance_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_instance_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_instance_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_instance_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_instance_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_instance_id; k++) {
            outbuffer[offset + k] = (byte)((this.instance_id.getBytes())[k] & 0xFF);
        }
        offset += length_instance_id;
        outbuffer[offset] = (byte)((active ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int bits_heartbeat_timeout = Float.floatToRawIntBits(heartbeat_timeout);
        outbuffer[offset + 0] = (byte)((bits_heartbeat_timeout >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_heartbeat_timeout >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_heartbeat_timeout >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_heartbeat_timeout >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_heartbeat_period = Float.floatToRawIntBits(heartbeat_period);
        outbuffer[offset + 0] = (byte)((bits_heartbeat_period >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_heartbeat_period >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_heartbeat_period >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_heartbeat_period >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_id = new byte[length_id];
        for(int k= 0; k< length_id; k++){
            bytes_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.id = new java.lang.String(bytes_id);
        offset += length_id;
        int length_instance_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_instance_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_instance_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_instance_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_instance_id = new byte[length_instance_id];
        for(int k= 0; k< length_instance_id; k++){
            bytes_instance_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.instance_id = new java.lang.String(bytes_instance_id);
        offset += length_instance_id;
        this.active = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int bits_heartbeat_timeout = 0;
        bits_heartbeat_timeout |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_heartbeat_timeout |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_heartbeat_timeout |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_heartbeat_timeout |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.heartbeat_timeout = Float.intBitsToFloat(bits_heartbeat_timeout);
        offset += 4;
        int bits_heartbeat_period = 0;
        bits_heartbeat_period |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_heartbeat_period |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_heartbeat_period |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_heartbeat_period |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.heartbeat_period = Float.intBitsToFloat(bits_heartbeat_period);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_id = this.id.getBytes().length;
        length += 4;
        length += length_id;
        int length_instance_id = this.instance_id.getBytes().length;
        length += 4;
        length += length_instance_id;
        length += 1;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "bond/Status"; }
    public java.lang.String getMD5(){ return "090f3f4408d0ead15cd000c6e56ba0e6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
