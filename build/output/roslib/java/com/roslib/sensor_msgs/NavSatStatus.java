package com.roslib.sensor_msgs;

import java.lang.*;

public class NavSatStatus implements com.roslib.ros.Msg {
    public byte status;
    public int service;
    public static final byte STATUS_NO_FIX = (byte)(  -1        );
    public static final byte STATUS_FIX = (byte)(      0        );
    public static final byte STATUS_SBAS_FIX = (byte)( 1        );
    public static final byte STATUS_GBAS_FIX = (byte)( 2        );
    public static final int SERVICE_GPS = (int)(     1);
    public static final int SERVICE_GLONASS = (int)( 2);
    public static final int SERVICE_COMPASS = (int)( 4      );
    public static final int SERVICE_GALILEO = (int)( 8);

    public NavSatStatus() {
        this.status = 0;
        this.service = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.status >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.service >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.service >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.status   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.service   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.service |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/NavSatStatus"; }
    public java.lang.String getMD5(){ return "85ed59cf80532c1c15a2cf735d06279b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
