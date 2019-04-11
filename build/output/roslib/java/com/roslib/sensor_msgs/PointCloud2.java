package com.roslib.sensor_msgs;

import java.lang.*;

public class PointCloud2 implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public long height;
    public long width;
    public com.roslib.sensor_msgs.PointField[] fields;
    public boolean is_bigendian;
    public long point_step;
    public long row_step;
    public int[] data;
    public boolean is_dense;

    public PointCloud2() {
        this.header = new com.roslib.std_msgs.Header();
        this.height = 0;
        this.width = 0;
        this.fields = null;
        this.is_bigendian = false;
        this.point_step = 0;
        this.row_step = 0;
        this.data = null;
        this.is_dense = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.height >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.width >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_fields = this.fields != null ? this.fields.length : 0;
        outbuffer[offset + 0] = (byte)((length_fields >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_fields >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_fields >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_fields >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_fields; i++){
        offset = this.fields[i].serialize(outbuffer, offset);
        }
        outbuffer[offset] = (byte)((is_bigendian ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.point_step >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.point_step >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.point_step >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.point_step >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.row_step >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.row_step >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.row_step >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.row_step >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        outbuffer[offset] = (byte)((is_dense ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.height   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.width   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_fields = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_fields |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_fields |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_fields |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_fields > 0) {
            this.fields = new com.roslib.sensor_msgs.PointField[length_fields];
        }
        for (int i = 0; i < length_fields; i++){
        offset = this.fields[i].deserialize(inbuffer, offset);
        }
        this.is_bigendian = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.point_step   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.point_step |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.point_step |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.point_step |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.row_step   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.row_step |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.row_step |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.row_step |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new int[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        this.is_dense = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        int length_fields = this.fields != null ? this.fields.length : 0;
        for (int i = 0; i < length_fields; i++) {
        length += this.fields[i].serializedLength();
        }
        length += 1;
        length += 4;
        length += 4;
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "sensor_msgs/PointCloud2"; }
    public java.lang.String getMD5(){ return "6aa926339b282463281af40546b3b3cf"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
