package com.roslib.gazebo_msgs;

import java.lang.*;

public class ContactsState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.gazebo_msgs.ContactState[] states;

    public ContactsState() {
        this.header = new com.roslib.std_msgs.Header();
        this.states = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_states = this.states != null ? this.states.length : 0;
        outbuffer[offset + 0] = (byte)((length_states >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_states >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_states >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_states >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_states; i++){
        offset = this.states[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_states = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_states |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_states |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_states |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_states > 0) {
            this.states = new com.roslib.gazebo_msgs.ContactState[length_states];
        }
        for (int i = 0; i < length_states; i++){
        offset = this.states[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_states = this.states != null ? this.states.length : 0;
        for (int i = 0; i < length_states; i++) {
        length += this.states[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/ContactsState"; }
    public java.lang.String getMD5(){ return "d19cd2a086cbd43da4252eb8d5cc64f5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
