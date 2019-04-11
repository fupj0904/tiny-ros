package com.roslib.turtlebot_msgs;

import java.lang.*;

public class TakePanorama {

public static final java.lang.String TAKEPANORAMA = "turtlebot_msgs/TakePanorama";

public class TakePanoramaRequest implements com.roslib.ros.Msg {
    private long __id__;
    public int mode;
    public float pano_angle;
    public float snap_interval;
    public float rot_vel;
    public static final int SNAPANDROTATE = (int)(0);
    public static final int CONTINUOUS = (int)(1);
    public static final int STOP = (int)(2);

    public TakePanoramaRequest() {
        this.mode = 0;
        this.pano_angle = 0;
        this.snap_interval = 0;
        this.rot_vel = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.mode >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_pano_angle = Float.floatToRawIntBits(pano_angle);
        outbuffer[offset + 0] = (byte)((bits_pano_angle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_pano_angle >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_pano_angle >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_pano_angle >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_snap_interval = Float.floatToRawIntBits(snap_interval);
        outbuffer[offset + 0] = (byte)((bits_snap_interval >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_snap_interval >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_snap_interval >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_snap_interval >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_rot_vel = Float.floatToRawIntBits(rot_vel);
        outbuffer[offset + 0] = (byte)((bits_rot_vel >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_rot_vel >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_rot_vel >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_rot_vel >> (8 * 3)) & 0xFF);
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
        this.mode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_pano_angle = 0;
        bits_pano_angle |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_pano_angle |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_pano_angle |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_pano_angle |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.pano_angle = Float.intBitsToFloat(bits_pano_angle);
        offset += 4;
        int bits_snap_interval = 0;
        bits_snap_interval |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_snap_interval |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_snap_interval |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_snap_interval |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.snap_interval = Float.intBitsToFloat(bits_snap_interval);
        offset += 4;
        int bits_rot_vel = 0;
        bits_rot_vel |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_rot_vel |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_rot_vel |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_rot_vel |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.rot_vel = Float.intBitsToFloat(bits_rot_vel);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return TAKEPANORAMA; }
    public java.lang.String getMD5(){ return "ba7a4ec9789671ab2188353e3b116fa7"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class TakePanoramaResponse implements com.roslib.ros.Msg {
    private long __id__;
    public int status;
    public static final int STARTED = (int)(0);
    public static final int IN_PROGRESS = (int)(1);
    public static final int STOPPED = (int)(2);

    public TakePanoramaResponse() {
        this.status = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.status >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.status   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return TAKEPANORAMA; }
    public java.lang.String getMD5(){ return "a9f91f3015c52b7c2a6bc80426bdcb5d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
