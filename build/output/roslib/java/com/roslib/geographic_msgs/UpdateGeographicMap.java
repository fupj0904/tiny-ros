package com.roslib.geographic_msgs;

import java.lang.*;

public class UpdateGeographicMap {

public static final java.lang.String UPDATEGEOGRAPHICMAP = "geographic_msgs/UpdateGeographicMap";

public class UpdateGeographicMapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.geographic_msgs.GeographicMapChanges updates;

    public UpdateGeographicMapRequest() {
        this.updates = new com.roslib.geographic_msgs.GeographicMapChanges();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.updates.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.updates.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.updates.serializedLength();
        return length;
    }

    public java.lang.String getType() { return UPDATEGEOGRAPHICMAP; }
    public java.lang.String getMD5(){ return "785047bdd2cc17900e39042da1c7f62e"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class UpdateGeographicMapResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String status;

    public UpdateGeographicMapResponse() {
        this.success = false;
        this.status = "";
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
        int length_status = this.status.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status; k++) {
            outbuffer[offset + k] = (byte)((this.status.getBytes())[k] & 0xFF);
        }
        offset += length_status;
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
        int length_status = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status = new byte[length_status];
        for(int k= 0; k< length_status; k++){
            bytes_status[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status = new java.lang.String(bytes_status);
        offset += length_status;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status = this.status.getBytes().length;
        length += 4;
        length += length_status;
        return length;
    }

    public java.lang.String getType() { return UPDATEGEOGRAPHICMAP; }
    public java.lang.String getMD5(){ return "657d5fbc7e1c660b4048df3820ede8c2"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
