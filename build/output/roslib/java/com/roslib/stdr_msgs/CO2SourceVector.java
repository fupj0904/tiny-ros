package com.roslib.stdr_msgs;

import java.lang.*;

public class CO2SourceVector implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.CO2Source[] co2_sources;

    public CO2SourceVector() {
        this.co2_sources = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_co2_sources = this.co2_sources != null ? this.co2_sources.length : 0;
        outbuffer[offset + 0] = (byte)((length_co2_sources >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_co2_sources >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_co2_sources >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_co2_sources >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_co2_sources; i++){
        offset = this.co2_sources[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_co2_sources = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_co2_sources |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_co2_sources |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_co2_sources |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_co2_sources > 0) {
            this.co2_sources = new com.roslib.stdr_msgs.CO2Source[length_co2_sources];
        }
        for (int i = 0; i < length_co2_sources; i++){
        offset = this.co2_sources[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_co2_sources = this.co2_sources != null ? this.co2_sources.length : 0;
        for (int i = 0; i < length_co2_sources; i++) {
        length += this.co2_sources[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/CO2SourceVector"; }
    public java.lang.String getMD5(){ return "269b5cd358666110939cca907b08bde3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
