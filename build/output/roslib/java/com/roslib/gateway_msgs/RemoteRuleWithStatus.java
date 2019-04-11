package com.roslib.gateway_msgs;

import java.lang.*;

public class RemoteRuleWithStatus implements com.roslib.ros.Msg {
    public com.roslib.gateway_msgs.RemoteRule remote_rule;
    public java.lang.String status;
    public static final java.lang.String UNKNOWN = (java.lang.String)("unknown");
    public static final java.lang.String PENDING = (java.lang.String)("pending");
    public static final java.lang.String ACCEPTED = (java.lang.String)("accepted");
    public static final java.lang.String BLOCKED = (java.lang.String)("blocked");
    public static final java.lang.String RESEND = (java.lang.String)("resend");

    public RemoteRuleWithStatus() {
        this.remote_rule = new com.roslib.gateway_msgs.RemoteRule();
        this.status = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.remote_rule.serialize(outbuffer, offset);
        int length_status = this.status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status; k++) {
            outbuffer[offset + k] = (byte)((this.status.getBytes())[k] & 0xFF);
        }
        offset += length_status;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.remote_rule.deserialize(inbuffer, offset);
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status = new byte[length_status];
        for(int k= 0; k< length_status; k++){
            bytes_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status = new java.lang.String(bytes_status);
        offset += length_status;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.remote_rule.serializedLength();
        int length_status = this.status.getBytes().length;
        length += 4;
        length += length_status;
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/RemoteRuleWithStatus"; }
    public java.lang.String getMD5(){ return "be38b90ec405347e8023380d371c6b18"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
