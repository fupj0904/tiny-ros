package com.roslib.turtlesim;

import java.lang.*;

public class Spawn {

public static final java.lang.String SPAWN = "turtlesim/Spawn";

public class SpawnRequest implements com.roslib.ros.Msg {
    private long __id__;
    public float x;
    public float y;
    public float theta;
    public java.lang.String name;

    public SpawnRequest() {
        this.x = 0;
        this.y = 0;
        this.theta = 0;
        this.name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_x = Float.floatToRawIntBits(x);
        outbuffer[offset + 0] = (byte)((bits_x >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_x >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_x >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_x >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_y = Float.floatToRawIntBits(y);
        outbuffer[offset + 0] = (byte)((bits_y >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_y >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_y >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_y >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_theta = Float.floatToRawIntBits(theta);
        outbuffer[offset + 0] = (byte)((bits_theta >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_theta >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_theta >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_theta >> (8 * 3)) & 0xFF);
        offset += 4;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int bits_x = 0;
        bits_x |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_x |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_x |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_x |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.x = Float.intBitsToFloat(bits_x);
        offset += 4;
        int bits_y = 0;
        bits_y |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_y |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_y |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_y |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.y = Float.intBitsToFloat(bits_y);
        offset += 4;
        int bits_theta = 0;
        bits_theta |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_theta |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_theta |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_theta |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.theta = Float.intBitsToFloat(bits_theta);
        offset += 4;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 4;
        length += 4;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        return length;
    }

    public java.lang.String getType() { return SPAWN; }
    public java.lang.String getMD5(){ return "cdbd84afeb2148d5ed32030243692276"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SpawnResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String name;

    public SpawnResponse() {
        this.name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        return length;
    }

    public java.lang.String getType() { return SPAWN; }
    public java.lang.String getMD5(){ return "3289d961edda2c4f1c2315114d7dbde2"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
