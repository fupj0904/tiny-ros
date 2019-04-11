package com.roslib.dynamic_reconfigure;

import java.lang.*;

public class GroupState implements com.roslib.ros.Msg {
    public java.lang.String name;
    public boolean state;
    public int id;
    public int parent;

    public GroupState() {
        this.name = "";
        this.state = false;
        this.id = 0;
        this.parent = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_name = this.name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_name; k++) {
            outbuffer[offset + k] = (byte)((this.name.getBytes())[k] & 0xFF);
        }
        offset += length_name;
        outbuffer[offset] = (byte)((state ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.id >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.parent >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.parent >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.parent >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.parent >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_name = new byte[length_name];
        for(int k= 0; k< length_name; k++){
            bytes_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.name = new java.lang.String(bytes_name);
        offset += length_name;
        this.state = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.parent   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.parent |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.parent |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.parent |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        length += 1;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "dynamic_reconfigure/GroupState"; }
    public java.lang.String getMD5(){ return "384d9e13a21d386ecb058e78db859fbb"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
