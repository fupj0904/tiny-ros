package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class GetRappList {

public static final java.lang.String GETRAPPLIST = "rocon_app_manager_msgs/GetRappList";

public class GetRappListRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetRappListRequest() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return GETRAPPLIST; }
    public java.lang.String getMD5(){ return "9933e8dcf74be74cd59e6c847f225e5a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetRappListResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.rocon_app_manager_msgs.Rapp[] available_rapps;
    public com.roslib.rocon_app_manager_msgs.Rapp[] running_rapps;

    public GetRappListResponse() {
        this.available_rapps = null;
        this.running_rapps = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_available_rapps = this.available_rapps != null ? this.available_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_available_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_available_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_available_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_available_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_available_rapps; i++){
        offset = this.available_rapps[i].serialize(outbuffer, offset);
        }
        int length_running_rapps = this.running_rapps != null ? this.running_rapps.length : 0;
        outbuffer[offset + 0] = (byte)((length_running_rapps >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_rapps >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_rapps >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_rapps >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_running_rapps; i++){
        offset = this.running_rapps[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_available_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_available_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_available_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_available_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_available_rapps > 0) {
            this.available_rapps = new com.roslib.rocon_app_manager_msgs.Rapp[length_available_rapps];
        }
        for (int i = 0; i < length_available_rapps; i++){
        offset = this.available_rapps[i].deserialize(inbuffer, offset);
        }
        int length_running_rapps = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_rapps |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_rapps |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_rapps |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_running_rapps > 0) {
            this.running_rapps = new com.roslib.rocon_app_manager_msgs.Rapp[length_running_rapps];
        }
        for (int i = 0; i < length_running_rapps; i++){
        offset = this.running_rapps[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_available_rapps = this.available_rapps != null ? this.available_rapps.length : 0;
        for (int i = 0; i < length_available_rapps; i++) {
        length += this.available_rapps[i].serializedLength();
        }
        length += 4;
        int length_running_rapps = this.running_rapps != null ? this.running_rapps.length : 0;
        for (int i = 0; i < length_running_rapps; i++) {
        length += this.running_rapps[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return GETRAPPLIST; }
    public java.lang.String getMD5(){ return "208979676739fe1dc4af34e2caaaec6b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
