package com.roslib.controller_manager_msgs;

import java.lang.*;

public class ControllersStatistics implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public com.roslib.controller_manager_msgs.ControllerStatistics[] controller;

    public ControllersStatistics() {
        this.header = new com.roslib.std_msgs.Header();
        this.controller = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_controller = this.controller != null ? this.controller.length : 0;
        outbuffer[offset + 0] = (byte)((length_controller >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_controller >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_controller >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_controller >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_controller; i++){
        offset = this.controller[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_controller = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_controller |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_controller |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_controller |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_controller > 0) {
            this.controller = new com.roslib.controller_manager_msgs.ControllerStatistics[length_controller];
        }
        for (int i = 0; i < length_controller; i++){
        offset = this.controller[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_controller = this.controller != null ? this.controller.length : 0;
        for (int i = 0; i < length_controller; i++) {
        length += this.controller[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "controller_manager_msgs/ControllersStatistics"; }
    public java.lang.String getMD5(){ return "ed2fe34fa7d912390d881858b53643e6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
