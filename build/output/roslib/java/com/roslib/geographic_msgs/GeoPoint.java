package com.roslib.geographic_msgs;

import java.lang.*;

public class GeoPoint implements com.roslib.ros.Msg {
    public double latitude;
    public double longitude;
    public double altitude;

    public GeoPoint() {
        this.latitude = 0;
        this.longitude = 0;
        this.altitude = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        long bits_latitude = Double.doubleToRawLongBits(this.latitude);
        outbuffer[offset + 0] = (byte)((bits_latitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_latitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_latitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_latitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_latitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_latitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_latitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_latitude >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_longitude = Double.doubleToRawLongBits(this.longitude);
        outbuffer[offset + 0] = (byte)((bits_longitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_longitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_longitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_longitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_longitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_longitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_longitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_longitude >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_altitude = Double.doubleToRawLongBits(this.altitude);
        outbuffer[offset + 0] = (byte)((bits_altitude >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_altitude >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_altitude >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_altitude >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_altitude >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_altitude >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_altitude >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_altitude >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        long bits_latitude = 0;
        bits_latitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_latitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_latitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_latitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_latitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_latitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_latitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_latitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.latitude = Double.longBitsToDouble(bits_latitude);
        offset += 8;
        long bits_longitude = 0;
        bits_longitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_longitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_longitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_longitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_longitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_longitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_longitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_longitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.longitude = Double.longBitsToDouble(bits_longitude);
        offset += 8;
        long bits_altitude = 0;
        bits_altitude |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_altitude |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_altitude |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_altitude |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_altitude |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_altitude |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_altitude |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_altitude |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.altitude = Double.longBitsToDouble(bits_altitude);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "geographic_msgs/GeoPoint"; }
    public java.lang.String getMD5(){ return "f8a213ae20b1912bf2ba0b2b18b4532d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
