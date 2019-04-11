package com.roslib.kobuki_msgs;

import java.lang.*;

public class ScanAngle implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public double scan_angle;

    public ScanAngle() {
        this.header = new com.roslib.std_msgs.Header();
        this.scan_angle = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        long bits_scan_angle = Double.doubleToRawLongBits(this.scan_angle);
        outbuffer[offset + 0] = (byte)((bits_scan_angle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_scan_angle >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_scan_angle >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_scan_angle >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_scan_angle >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_scan_angle >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_scan_angle >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_scan_angle >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        long bits_scan_angle = 0;
        bits_scan_angle |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_scan_angle |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_scan_angle |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_scan_angle |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_scan_angle |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_scan_angle |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_scan_angle |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_scan_angle |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.scan_angle = Double.longBitsToDouble(bits_scan_angle);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/ScanAngle"; }
    public java.lang.String getMD5(){ return "77c116346aab228a2ebcb10190c45c40"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
