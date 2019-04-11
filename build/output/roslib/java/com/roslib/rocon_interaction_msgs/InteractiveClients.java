package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class InteractiveClients implements com.roslib.ros.Msg {
    public com.roslib.rocon_interaction_msgs.InteractiveClient[] idle_clients;
    public com.roslib.rocon_interaction_msgs.InteractiveClient[] running_clients;

    public InteractiveClients() {
        this.idle_clients = null;
        this.running_clients = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_idle_clients = this.idle_clients != null ? this.idle_clients.length : 0;
        outbuffer[offset + 0] = (byte)((length_idle_clients >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_idle_clients >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_idle_clients >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_idle_clients >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_idle_clients; i++){
        offset = this.idle_clients[i].serialize(outbuffer, offset);
        }
        int length_running_clients = this.running_clients != null ? this.running_clients.length : 0;
        outbuffer[offset + 0] = (byte)((length_running_clients >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_clients >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_clients >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_clients >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_running_clients; i++){
        offset = this.running_clients[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_idle_clients = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_idle_clients |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_idle_clients |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_idle_clients |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_idle_clients > 0) {
            this.idle_clients = new com.roslib.rocon_interaction_msgs.InteractiveClient[length_idle_clients];
        }
        for (int i = 0; i < length_idle_clients; i++){
        offset = this.idle_clients[i].deserialize(inbuffer, offset);
        }
        int length_running_clients = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_clients |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_clients |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_clients |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_running_clients > 0) {
            this.running_clients = new com.roslib.rocon_interaction_msgs.InteractiveClient[length_running_clients];
        }
        for (int i = 0; i < length_running_clients; i++){
        offset = this.running_clients[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_idle_clients = this.idle_clients != null ? this.idle_clients.length : 0;
        for (int i = 0; i < length_idle_clients; i++) {
        length += this.idle_clients[i].serializedLength();
        }
        length += 4;
        int length_running_clients = this.running_clients != null ? this.running_clients.length : 0;
        for (int i = 0; i < length_running_clients; i++) {
        length += this.running_clients[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/InteractiveClients"; }
    public java.lang.String getMD5(){ return "87e97fced7b73d49725f8247b73304b8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
