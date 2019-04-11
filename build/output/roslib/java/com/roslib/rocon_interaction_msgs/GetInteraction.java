package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class GetInteraction {

public static final java.lang.String GETINTERACTION = "rocon_interaction_msgs/GetInteraction";

public class GetInteractionRequest implements com.roslib.ros.Msg {
    private long __id__;
    public int hash;

    public GetInteractionRequest() {
        this.hash = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.hash >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.hash >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.hash >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.hash >> (8 * 3)) & 0xFF);
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
        this.hash   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.hash |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.hash |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.hash |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        return length;
    }

    public java.lang.String getType() { return GETINTERACTION; }
    public java.lang.String getMD5(){ return "f536c833b744f98914afa0aeff205fd8"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetInteractionResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public com.roslib.rocon_interaction_msgs.Interaction interaction;

    public GetInteractionResponse() {
        this.result = false;
        this.interaction = new com.roslib.rocon_interaction_msgs.Interaction();
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((result ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        offset = this.interaction.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.result = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        offset = this.interaction.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += this.interaction.serializedLength();
        return length;
    }

    public java.lang.String getType() { return GETINTERACTION; }
    public java.lang.String getMD5(){ return "4bdce34f38c9a664cd82e5a544eb41b8"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
