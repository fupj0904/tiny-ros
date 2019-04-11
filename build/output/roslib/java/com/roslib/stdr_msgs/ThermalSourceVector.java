package com.roslib.stdr_msgs;

import java.lang.*;

public class ThermalSourceVector implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.ThermalSource[] thermal_sources;

    public ThermalSourceVector() {
        this.thermal_sources = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_thermal_sources = this.thermal_sources != null ? this.thermal_sources.length : 0;
        outbuffer[offset + 0] = (byte)((length_thermal_sources >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_thermal_sources >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_thermal_sources >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_thermal_sources >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_thermal_sources; i++){
        offset = this.thermal_sources[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_thermal_sources = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_thermal_sources |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_thermal_sources |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_thermal_sources |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_thermal_sources > 0) {
            this.thermal_sources = new com.roslib.stdr_msgs.ThermalSource[length_thermal_sources];
        }
        for (int i = 0; i < length_thermal_sources; i++){
        offset = this.thermal_sources[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_thermal_sources = this.thermal_sources != null ? this.thermal_sources.length : 0;
        for (int i = 0; i < length_thermal_sources; i++) {
        length += this.thermal_sources[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/ThermalSourceVector"; }
    public java.lang.String getMD5(){ return "62d3dc562fc3796eebccc9ce826f7018"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
