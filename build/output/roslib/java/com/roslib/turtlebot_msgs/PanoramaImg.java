package com.roslib.turtlebot_msgs;

import java.lang.*;

public class PanoramaImg implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String pano_id;
    public double latitude;
    public double longitude;
    public double heading;
    public java.lang.String geo_tag;
    public com.roslib.sensor_msgs.Image image;

    public PanoramaImg() {
        this.header = new com.roslib.std_msgs.Header();
        this.pano_id = "";
        this.latitude = 0;
        this.longitude = 0;
        this.heading = 0;
        this.geo_tag = "";
        this.image = new com.roslib.sensor_msgs.Image();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_pano_id = this.pano_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_pano_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_pano_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_pano_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_pano_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_pano_id; k++) {
            outbuffer[offset + k] = (byte)((this.pano_id.getBytes())[k] & 0xFF);
        }
        offset += length_pano_id;
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
        long bits_heading = Double.doubleToRawLongBits(this.heading);
        outbuffer[offset + 0] = (byte)((bits_heading >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_heading >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_heading >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_heading >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_heading >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_heading >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_heading >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_heading >> (8 * 7)) & 0xFF);
        offset += 8;
        int length_geo_tag = this.geo_tag.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_geo_tag >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_geo_tag >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_geo_tag >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_geo_tag >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_geo_tag; k++) {
            outbuffer[offset + k] = (byte)((this.geo_tag.getBytes())[k] & 0xFF);
        }
        offset += length_geo_tag;
        offset = this.image.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_pano_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_pano_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_pano_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_pano_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_pano_id = new byte[length_pano_id];
        for(int k= 0; k< length_pano_id; k++){
            bytes_pano_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.pano_id = new java.lang.String(bytes_pano_id);
        offset += length_pano_id;
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
        long bits_heading = 0;
        bits_heading |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_heading |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_heading |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_heading |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_heading |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_heading |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_heading |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_heading |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.heading = Double.longBitsToDouble(bits_heading);
        offset += 8;
        int length_geo_tag = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_geo_tag |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_geo_tag |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_geo_tag |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_geo_tag = new byte[length_geo_tag];
        for(int k= 0; k< length_geo_tag; k++){
            bytes_geo_tag[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.geo_tag = new java.lang.String(bytes_geo_tag);
        offset += length_geo_tag;
        offset = this.image.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_pano_id = this.pano_id.getBytes().length;
        length += 4;
        length += length_pano_id;
        length += 8;
        length += 8;
        length += 8;
        int length_geo_tag = this.geo_tag.getBytes().length;
        length += 4;
        length += length_geo_tag;
        length += this.image.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "turtlebot_msgs/PanoramaImg"; }
    public java.lang.String getMD5(){ return "5beebd1944cfcdb0455f1dea20503df9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
