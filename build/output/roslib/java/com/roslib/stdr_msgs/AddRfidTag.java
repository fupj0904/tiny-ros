package com.roslib.stdr_msgs;

import java.lang.*;

public class AddRfidTag {

public static final java.lang.String ADDRFIDTAG = "stdr_msgs/AddRfidTag";

public class AddRfidTagRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.stdr_msgs.RfidTag newTag;

    public AddRfidTagRequest() {
        this.newTag = new com.roslib.stdr_msgs.RfidTag();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.newTag.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.newTag.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.newTag.serializedLength();
        return length;
    }

    public java.lang.String getType() { return ADDRFIDTAG; }
    public java.lang.String getMD5(){ return "a0bc7a986d0ff31da3b75dcd05d85f4f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class AddRfidTagResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean success;
    public java.lang.String message;

    public AddRfidTagResponse() {
        this.success = false;
        this.message = "";
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
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
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
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return ADDRFIDTAG; }
    public java.lang.String getMD5(){ return "358159a7512a5db80426a9e114fdf34b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
