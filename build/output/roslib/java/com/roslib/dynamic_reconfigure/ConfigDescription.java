package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class ConfigDescription implements com.roslib.ros.Msg {
    public com.roslib.dynamic_reconfigure.Group[] groups;
    public com.roslib.dynamic_reconfigure.Config max;
    public com.roslib.dynamic_reconfigure.Config min;
    public com.roslib.dynamic_reconfigure.Config dflt;

    public ConfigDescription() {
        this.groups = null;
        this.max = new com.roslib.dynamic_reconfigure.Config();
        this.min = new com.roslib.dynamic_reconfigure.Config();
        this.dflt = new com.roslib.dynamic_reconfigure.Config();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_groups = this.groups != null ? this.groups.length : 0;
        outbuffer[offset + 0] = (byte)((length_groups >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_groups >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_groups >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_groups >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_groups; i++){
        offset = this.groups[i].serialize(outbuffer, offset);
        }
        offset = this.max.serialize(outbuffer, offset);
        offset = this.min.serialize(outbuffer, offset);
        offset = this.dflt.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_groups = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_groups |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_groups |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_groups |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_groups > 0) {
            this.groups = new com.roslib.dynamic_reconfigure.Group[length_groups];
        }
        for (int i = 0; i < length_groups; i++){
        offset = this.groups[i].deserialize(inbuffer, offset);
        }
        offset = this.max.deserialize(inbuffer, offset);
        offset = this.min.deserialize(inbuffer, offset);
        offset = this.dflt.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_groups = this.groups != null ? this.groups.length : 0;
        for (int i = 0; i < length_groups; i++) {
        length += this.groups[i].serializedLength();
        }
        length += this.max.serializedLength();
        length += this.min.serializedLength();
        length += this.dflt.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/ConfigDescription"; }
    public java.lang.String getMD5(){ return "8e921ed846343308ac6e034e9d2d8902"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
