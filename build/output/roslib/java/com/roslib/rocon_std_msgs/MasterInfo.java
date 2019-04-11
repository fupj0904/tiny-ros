package com.roslib.rocon_std_msgs;

import java.lang.*;

public class MasterInfo implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String description;
    public com.roslib.rocon_std_msgs.Icon icon;
    public java.lang.String version;

    public MasterInfo() {
        this.name = "";
        this.description = "";
        this.icon = new com.roslib.rocon_std_msgs.Icon();
        this.version = "";
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
        int length_description = this.description.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_description >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_description >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_description >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_description >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_description; k++) {
            outbuffer[offset + k] = (byte)((this.description.getBytes())[k] & 0xFF);
        }
        offset += length_description;
        offset = this.icon.serialize(outbuffer, offset);
        int length_version = this.version.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_version >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_version >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_version >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_version >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_version; k++) {
            outbuffer[offset + k] = (byte)((this.version.getBytes())[k] & 0xFF);
        }
        offset += length_version;
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
        int length_description = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_description |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_description |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_description |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_description = new byte[length_description];
        for(int k= 0; k< length_description; k++){
            bytes_description[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.description = new java.lang.String(bytes_description);
        offset += length_description;
        offset = this.icon.deserialize(inbuffer, offset);
        int length_version = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_version |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_version |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_version |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_version = new byte[length_version];
        for(int k= 0; k< length_version; k++){
            bytes_version[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.version = new java.lang.String(bytes_version);
        offset += length_version;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_description = this.description.getBytes().length;
        length += 4;
        length += length_description;
        length += this.icon.serializedLength();
        int length_version = this.version.getBytes().length;
        length += 4;
        length += length_version;
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/MasterInfo"; }
    public java.lang.String getMD5(){ return "59d8fcc20e5d91dff9061e42f027ac4a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
