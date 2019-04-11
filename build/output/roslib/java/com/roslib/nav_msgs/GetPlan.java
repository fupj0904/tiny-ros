package com.roslib.nav_msgs;

import java.lang.*;

public class GetPlan {

public static final java.lang.String GETPLAN = "nav_msgs/GetPlan";

public class GetPlanRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.geometry_msgs.PoseStamped start;
    public com.roslib.geometry_msgs.PoseStamped goal;
    public float tolerance;

    public GetPlanRequest() {
        this.start = new com.roslib.geometry_msgs.PoseStamped();
        this.goal = new com.roslib.geometry_msgs.PoseStamped();
        this.tolerance = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.start.serialize(outbuffer, offset);
        offset = this.goal.serialize(outbuffer, offset);
        int bits_tolerance = Float.floatToRawIntBits(tolerance);
        outbuffer[offset + 0] = (byte)((bits_tolerance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_tolerance >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_tolerance >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_tolerance >> (8 * 3)) & 0xFF);
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
        offset = this.start.deserialize(inbuffer, offset);
        offset = this.goal.deserialize(inbuffer, offset);
        int bits_tolerance = 0;
        bits_tolerance |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_tolerance |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_tolerance |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_tolerance |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.tolerance = Float.intBitsToFloat(bits_tolerance);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.start.serializedLength();
        length += this.goal.serializedLength();
        length += 4;
        return length;
    }

    public java.lang.String getType() { return GETPLAN; }
    public java.lang.String getMD5(){ return "557d5ea947f7761284cf7abef1cd7227"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetPlanResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.nav_msgs.Path plan;

    public GetPlanResponse() {
        this.plan = new com.roslib.nav_msgs.Path();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.plan.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.plan.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.plan.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETPLAN; }
    public java.lang.String getMD5(){ return "67c62b8c931eabfe35c88aed4b8f1258"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
