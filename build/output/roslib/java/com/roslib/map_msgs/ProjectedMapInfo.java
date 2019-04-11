package com.roslib.map_msgs;

import java.lang.*;

public class ProjectedMapInfo implements com.roslib.ros.Msg {
    public java.lang.String frame_id;
    public double x;
    public double y;
    public double width;
    public double height;
    public double min_z;
    public double max_z;

    public ProjectedMapInfo() {
        this.frame_id = "";
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.min_z = 0;
        this.max_z = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_frame_id = this.frame_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_frame_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_frame_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_frame_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_frame_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_frame_id; k++) {
            outbuffer[offset + k] = (byte)((this.frame_id.getBytes())[k] & 0xFF);
        }
        offset += length_frame_id;
        long bits_x = Double.doubleToRawLongBits(this.x);
        outbuffer[offset + 0] = (byte)((bits_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_x >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_x >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_x >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_x >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_x >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_y = Double.doubleToRawLongBits(this.y);
        outbuffer[offset + 0] = (byte)((bits_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_y >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_y >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_y >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_y >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_y >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_width = Double.doubleToRawLongBits(this.width);
        outbuffer[offset + 0] = (byte)((bits_width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_width >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_width >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_width >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_width >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_width >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_height = Double.doubleToRawLongBits(this.height);
        outbuffer[offset + 0] = (byte)((bits_height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_height >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_height >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_height >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_height >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_height >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_min_z = Double.doubleToRawLongBits(this.min_z);
        outbuffer[offset + 0] = (byte)((bits_min_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_min_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_min_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_min_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_min_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_min_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_min_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_min_z >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_max_z = Double.doubleToRawLongBits(this.max_z);
        outbuffer[offset + 0] = (byte)((bits_max_z >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_max_z >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_max_z >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_max_z >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_max_z >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_max_z >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_max_z >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_max_z >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_frame_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_frame_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_frame_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_frame_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_frame_id = new byte[length_frame_id];
        for(int k= 0; k< length_frame_id; k++){
            bytes_frame_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.frame_id = new java.lang.String(bytes_frame_id);
        offset += length_frame_id;
        long bits_x = 0;
        bits_x |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_x |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_x |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_x |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_x |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.x = Double.longBitsToDouble(bits_x);
        offset += 8;
        long bits_y = 0;
        bits_y |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_y |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_y |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_y |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_y |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.y = Double.longBitsToDouble(bits_y);
        offset += 8;
        long bits_width = 0;
        bits_width |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_width |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_width |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_width |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_width |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_width |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_width |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_width |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.width = Double.longBitsToDouble(bits_width);
        offset += 8;
        long bits_height = 0;
        bits_height |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_height |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_height |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_height |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_height |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_height |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_height |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_height |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.height = Double.longBitsToDouble(bits_height);
        offset += 8;
        long bits_min_z = 0;
        bits_min_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_min_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_min_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_min_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_min_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_min_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_min_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_min_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.min_z = Double.longBitsToDouble(bits_min_z);
        offset += 8;
        long bits_max_z = 0;
        bits_max_z |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_max_z |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_max_z |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_max_z |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_max_z |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_max_z |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_max_z |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_max_z |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.max_z = Double.longBitsToDouble(bits_max_z);
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_frame_id = this.frame_id.getBytes().length;
        length += 4;
        length += length_frame_id;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "map_msgs/ProjectedMapInfo"; }
    public java.lang.String getMD5(){ return "f661365637fb759e63cb5d179a4461e1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
