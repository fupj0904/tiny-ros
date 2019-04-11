package com.roslib.gazebo_msgs;

import java.lang.*;

public class GetLinkState {

public static final java.lang.String GETLINKSTATE = "gazebo_msgs/GetLinkState";

public class GetLinkStateRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String link_name;
    public java.lang.String reference_frame;

    public GetLinkStateRequest() {
        this.link_name = "";
        this.reference_frame = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_link_name = this.link_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_link_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_link_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_link_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_link_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_link_name; k++) {
            outbuffer[offset + k] = (byte)((this.link_name.getBytes())[k] & 0xFF);
        }
        offset += length_link_name;
        int length_reference_frame = this.reference_frame.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_reference_frame >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_reference_frame >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_reference_frame >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_reference_frame >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_reference_frame; k++) {
            outbuffer[offset + k] = (byte)((this.reference_frame.getBytes())[k] & 0xFF);
        }
        offset += length_reference_frame;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_link_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_link_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_link_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_link_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_link_name = new byte[length_link_name];
        for(int k= 0; k< length_link_name; k++){
            bytes_link_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.link_name = new java.lang.String(bytes_link_name);
        offset += length_link_name;
        int length_reference_frame = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_reference_frame |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_reference_frame |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_reference_frame |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_reference_frame = new byte[length_reference_frame];
        for(int k= 0; k< length_reference_frame; k++){
            bytes_reference_frame[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.reference_frame = new java.lang.String(bytes_reference_frame);
        offset += length_reference_frame;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_link_name = this.link_name.getBytes().length;
        length += 4;
        length += length_link_name;
        int length_reference_frame = this.reference_frame.getBytes().length;
        length += 4;
        length += length_reference_frame;
        return length;
    }

    public java.lang.String getType() { return GETLINKSTATE; }
    public java.lang.String getMD5(){ return "b9de4ed1795bda93c873763a2e55e76b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetLinkStateResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.gazebo_msgs.LinkState link_state;
    public boolean success;
    public java.lang.String status_message;

    public GetLinkStateResponse() {
        this.link_state = new com.roslib.gazebo_msgs.LinkState();
        this.success = false;
        this.status_message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.link_state.serialize(outbuffer, offset);
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.link_state.deserialize(inbuffer, offset);
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.link_state.serializedLength();
        length += 1;
        int length_status_message = this.status_message.getBytes().length;
        length += 4;
        length += length_status_message;
        return length;
    }

    public java.lang.String getType() { return GETLINKSTATE; }
    public java.lang.String getMD5(){ return "4d4305d53d97f8edc3b3ce04bcb94ed0"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
