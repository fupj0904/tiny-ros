package com.roslib.stdr_msgs;

import java.lang.*;

public class RfidTagVector implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.RfidTag[] rfid_tags;

    public RfidTagVector() {
        this.rfid_tags = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_rfid_tags = this.rfid_tags != null ? this.rfid_tags.length : 0;
        outbuffer[offset + 0] = (byte)((length_rfid_tags >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfid_tags >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfid_tags >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfid_tags >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rfid_tags; i++){
        offset = this.rfid_tags[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_rfid_tags = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfid_tags |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfid_tags |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfid_tags |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rfid_tags > 0) {
            this.rfid_tags = new com.roslib.stdr_msgs.RfidTag[length_rfid_tags];
        }
        for (int i = 0; i < length_rfid_tags; i++){
        offset = this.rfid_tags[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_rfid_tags = this.rfid_tags != null ? this.rfid_tags.length : 0;
        for (int i = 0; i < length_rfid_tags; i++) {
        length += this.rfid_tags[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RfidTagVector"; }
    public java.lang.String getMD5(){ return "12c1a90d34622ce8d91d1dde0eb54c84"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
