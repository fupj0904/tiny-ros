package com.roslib.create_node;

import java.lang.*;

public class BatteryState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public byte temperature;
    public int charge;
    public int capacity;

    public BatteryState() {
        this.header = new com.roslib.std_msgs.Header();
        this.temperature = 0;
        this.charge = 0;
        this.capacity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.temperature >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.charge >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.charge >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.capacity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.capacity >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.temperature   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.charge   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.charge |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.capacity   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.capacity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 1;
        length += 2;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "create_node/BatteryState"; }
    public java.lang.String getMD5(){ return "bc2b40a2856a8b0548f1d04a669097b1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
