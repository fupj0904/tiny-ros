package com.roslib.gateway_msgs;

import java.lang.*;

public class RemoteRule implements com.roslib.ros.Msg {
    public java.lang.String gateway;
    public com.roslib.gateway_msgs.Rule rule;

    public RemoteRule() {
        this.gateway = "";
        this.rule = new com.roslib.gateway_msgs.Rule();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_gateway = this.gateway.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_gateway >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_gateway >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_gateway >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_gateway >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_gateway; k++) {
            outbuffer[offset + k] = (byte)((this.gateway.getBytes())[k] & 0xFF);
        }
        offset += length_gateway;
        offset = this.rule.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_gateway = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_gateway |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_gateway |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_gateway |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_gateway = new byte[length_gateway];
        for(int k= 0; k< length_gateway; k++){
            bytes_gateway[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.gateway = new java.lang.String(bytes_gateway);
        offset += length_gateway;
        offset = this.rule.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_gateway = this.gateway.getBytes().length;
        length += 4;
        length += length_gateway;
        length += this.rule.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/RemoteRule"; }
    public java.lang.String getMD5(){ return "86b3f462f139850bf236f922e501190c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
