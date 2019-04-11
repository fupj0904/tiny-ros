package com.roslib.diagnostic_msgs;

import java.lang.*;

public class DiagnosticArray implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.diagnostic_msgs.DiagnosticStatus[] status;

    public DiagnosticArray() {
        this.header = new com.roslib.std_msgs.Header();
        this.status = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_status = this.status != null ? this.status.length : 0;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_status; i++){
        offset = this.status[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_status > 0) {
            this.status = new com.roslib.diagnostic_msgs.DiagnosticStatus[length_status];
        }
        for (int i = 0; i < length_status; i++){
        offset = this.status[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_status = this.status != null ? this.status.length : 0;
        for (int i = 0; i < length_status; i++) {
        length += this.status[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "diagnostic_msgs/DiagnosticArray"; }
    public java.lang.String getMD5(){ return "79a87210f85eb6afbd600eb2ba49dd85"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
