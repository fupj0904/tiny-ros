package com.roslib.sensor_msgs;

import java.lang.*;

public class PointField implements com.roslib.ros.Msg {
    public java.lang.String name;
    public long offset;
    public int datatype;
    public long count;
    public static final int INT8 = (int)( 1);
    public static final int UINT8 = (int)( 2);
    public static final int INT16 = (int)( 3);
    public static final int UINT16 = (int)( 4);
    public static final int INT32 = (int)( 5);
    public static final int UINT32 = (int)( 6);
    public static final int FLOAT32 = (int)( 7);
    public static final int FLOAT64 = (int)( 8);

    public PointField() {
        this.name = "";
        this.offset = 0;
        this.datatype = 0;
        this.count = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        outbuffer[offset + 0] = (byte)((this.offset >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.offset >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.offset >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.offset >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.datatype >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.count >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.count >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.count >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.count >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        this.offset   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.offset |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.offset |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.offset |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.datatype   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.count   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.count |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.count |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.count |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 4;
        length += 1;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/PointField"; }
    public java.lang.String getMD5(){ return "039974f05fdf0470d9dc865fd01dcc3e"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
