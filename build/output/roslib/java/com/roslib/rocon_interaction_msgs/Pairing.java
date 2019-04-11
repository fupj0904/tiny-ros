package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class Pairing implements com.roslib.ros.Msg {
    public java.lang.String rapp;
    public com.roslib.rocon_std_msgs.Remapping[] remappings;
    public com.roslib.rocon_std_msgs.KeyValue[] parameters;

    public Pairing() {
        this.rapp = "";
        this.remappings = null;
        this.parameters = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_rapp = this.rapp.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_rapp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rapp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rapp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rapp >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_rapp; k++) {
            outbuffer[offset + k] = (byte)((this.rapp.getBytes())[k] & 0xFF);
        }
        offset += length_rapp;
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        outbuffer[offset + 0] = (byte)((length_remappings >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_remappings >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_remappings >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_remappings >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_remappings; i++){
        offset = this.remappings[i].serialize(outbuffer, offset);
        }
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        outbuffer[offset + 0] = (byte)((length_parameters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_parameters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_parameters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_parameters >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_rapp = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rapp |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rapp |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rapp |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_rapp = new byte[length_rapp];
        for(int k= 0; k< length_rapp; k++){
            bytes_rapp[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.rapp = new java.lang.String(bytes_rapp);
        offset += length_rapp;
        int length_remappings = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_remappings |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_remappings |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_remappings |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_remappings > 0) {
            this.remappings = new com.roslib.rocon_std_msgs.Remapping[length_remappings];
        }
        for (int i = 0; i < length_remappings; i++){
        offset = this.remappings[i].deserialize(inbuffer, offset);
        }
        int length_parameters = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_parameters |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_parameters |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_parameters |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_parameters > 0) {
            this.parameters = new com.roslib.rocon_std_msgs.KeyValue[length_parameters];
        }
        for (int i = 0; i < length_parameters; i++){
        offset = this.parameters[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_rapp = this.rapp.getBytes().length;
        length += 4;
        length += length_rapp;
        length += 4;
        int length_remappings = this.remappings != null ? this.remappings.length : 0;
        for (int i = 0; i < length_remappings; i++) {
        length += this.remappings[i].serializedLength();
        }
        length += 4;
        int length_parameters = this.parameters != null ? this.parameters.length : 0;
        for (int i = 0; i < length_parameters; i++) {
        length += this.parameters[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/Pairing"; }
    public java.lang.String getMD5(){ return "66d4a33d1731a2ece5a6decfbf0588e0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
