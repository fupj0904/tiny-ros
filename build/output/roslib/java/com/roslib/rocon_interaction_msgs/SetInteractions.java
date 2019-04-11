package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class SetInteractions {

public static final java.lang.String SETINTERACTIONS = "rocon_interaction_msgs/SetInteractions";

public class SetInteractionsRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.rocon_interaction_msgs.Interaction[] interactions;
    public boolean load;

    public SetInteractionsRequest() {
        this.interactions = null;
        this.load = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_interactions = this.interactions != null ? this.interactions.length : 0;
        outbuffer[offset + 0] = (byte)((length_interactions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_interactions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_interactions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_interactions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_interactions; i++){
        offset = this.interactions[i].serialize(outbuffer, offset);
        }
        outbuffer[offset] = (byte)((load ? 0x01 : 0x00) & 0xFF);
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
        int length_interactions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_interactions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_interactions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_interactions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_interactions > 0) {
            this.interactions = new com.roslib.rocon_interaction_msgs.Interaction[length_interactions];
        }
        for (int i = 0; i < length_interactions; i++){
        offset = this.interactions[i].deserialize(inbuffer, offset);
        }
        this.load = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_interactions = this.interactions != null ? this.interactions.length : 0;
        for (int i = 0; i < length_interactions; i++) {
        length += this.interactions[i].serializedLength();
        }
        length += 1;
        return length;
    }

    public java.lang.String getType() { return SETINTERACTIONS; }
    public java.lang.String getMD5(){ return "31c5c620a9bc4d1cf22f043327b6b438"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetInteractionsResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;

    public SetInteractionsResponse() {
        this.result = false;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return SETINTERACTIONS; }
    public java.lang.String getMD5(){ return "4e5ea2c172539456b0cc8467c24d46af"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
