package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class RemoconStatus implements com.roslib.ros.Msg {
    public com.roslib.rocon_std_msgs.PlatformInfo platform_info;
    public java.lang.String uuid;
    public int[] running_interactions;
    public java.lang.String version;

    public RemoconStatus() {
        this.platform_info = new com.roslib.rocon_std_msgs.PlatformInfo();
        this.uuid = "";
        this.running_interactions = null;
        this.version = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.platform_info.serialize(outbuffer, offset);
        int length_uuid = this.uuid.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_uuid >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_uuid >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_uuid >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_uuid >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_uuid; k++) {
            outbuffer[offset + k] = (byte)((this.uuid.getBytes())[k] & 0xFF);
        }
        offset += length_uuid;
        int length_running_interactions = this.running_interactions != null ? this.running_interactions.length : 0;
        outbuffer[offset + 0] = (byte)((length_running_interactions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_running_interactions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_running_interactions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_running_interactions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_running_interactions; i++){
        outbuffer[offset + 0] = (byte)((this.running_interactions[i] >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.running_interactions[i] >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.running_interactions[i] >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.running_interactions[i] >> (8 * 3)) & 0xFF);
        offset += 4;
        }
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
        offset = this.platform_info.deserialize(inbuffer, offset);
        int length_uuid = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_uuid |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_uuid |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_uuid |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_uuid = new byte[length_uuid];
        for(int k= 0; k< length_uuid; k++){
            bytes_uuid[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.uuid = new java.lang.String(bytes_uuid);
        offset += length_uuid;
        int length_running_interactions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_running_interactions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_running_interactions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_running_interactions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_running_interactions > 0) {
            this.running_interactions = new int[length_running_interactions];
        }
        for (int i = 0; i < length_running_interactions; i++){
        this.running_interactions[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.running_interactions[i] |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.running_interactions[i] |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.running_interactions[i] |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        }
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
        length += this.platform_info.serializedLength();
        int length_uuid = this.uuid.getBytes().length;
        length += 4;
        length += length_uuid;
        length += 4;
        int length_running_interactions = this.running_interactions != null ? this.running_interactions.length : 0;
        for (int i = 0; i < length_running_interactions; i++) {
        length += 4;
        }
        int length_version = this.version.getBytes().length;
        length += 4;
        length += length_version;
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/RemoconStatus"; }
    public java.lang.String getMD5(){ return "ffe7ba0b58c6c7d12958ff4fb55dbad9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
