package com.roslib.polled_camera;

import java.lang.*;

public class GetPolledImage {

public static final java.lang.String GETPOLLEDIMAGE = "polled_camera/GetPolledImage";

public class GetPolledImageRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String response_namespace;
    public com.roslib.ros.Duration timeout;
    public long binning_x;
    public long binning_y;
    public com.roslib.sensor_msgs.RegionOfInterest roi;

    public GetPolledImageRequest() {
        this.response_namespace = "";
        this.timeout = new com.roslib.ros.Duration();
        this.binning_x = 0;
        this.binning_y = 0;
        this.roi = new com.roslib.sensor_msgs.RegionOfInterest();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_response_namespace = this.response_namespace.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_response_namespace >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_response_namespace >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_response_namespace >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_response_namespace >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_response_namespace; k++) {
            outbuffer[offset + k] = (byte)((this.response_namespace.getBytes())[k] & 0xFF);
        }
        offset += length_response_namespace;
        outbuffer[offset + 0] = (byte)((this.timeout.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timeout.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timeout.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timeout.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.timeout.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.timeout.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.timeout.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.timeout.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.binning_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.binning_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.binning_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.binning_x >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.binning_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.binning_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.binning_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.binning_y >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.roi.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_response_namespace = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_response_namespace |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_response_namespace |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_response_namespace |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_response_namespace = new byte[length_response_namespace];
        for(int k= 0; k< length_response_namespace; k++){
            bytes_response_namespace[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.response_namespace = new java.lang.String(bytes_response_namespace);
        offset += length_response_namespace;
        this.timeout.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timeout.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timeout.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timeout.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.timeout.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.timeout.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.timeout.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.timeout.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.binning_x   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.binning_x |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.binning_x |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.binning_x |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.binning_y   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.binning_y |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.binning_y |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.binning_y |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.roi.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_response_namespace = this.response_namespace.getBytes().length;
        length += 4;
        length += length_response_namespace;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += this.roi.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETPOLLEDIMAGE; }
    public java.lang.String getMD5(){ return "d4c3ff7357090136ba977537e020d98c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetPolledImageResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status_message;
    public com.roslib.ros.Time stamp;

    public GetPolledImageResponse() {
        this.success = false;
        this.status_message = "";
        this.stamp = new com.roslib.ros.Time();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((success ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_status_message = this.status_message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_message; k++) {
            outbuffer[offset + k] = (byte)((this.status_message.getBytes())[k] & 0xFF);
        }
        offset += length_status_message;
        outbuffer[offset + 0] = (byte)((this.stamp.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.stamp.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.stamp.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.stamp.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.stamp.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.success = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_status_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_message = new byte[length_status_message];
        for(int k= 0; k< length_status_message; k++){
            bytes_status_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_message = new java.lang.String(bytes_status_message);
        offset += length_status_message;
        this.stamp.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.stamp.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.stamp.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.stamp.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.stamp.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return GETPOLLEDIMAGE; }
    public java.lang.String getMD5(){ return "cd78a140725fe42d7e5304785530f0f5"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
