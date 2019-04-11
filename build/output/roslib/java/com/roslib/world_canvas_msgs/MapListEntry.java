package com.roslib.world_canvas_msgs;

import java.lang.*;

public class MapListEntry implements com.roslib.ros.Msg {
    public java.lang.String name;
    public java.lang.String session_id;
    public long date;
    public java.lang.String map_id;

    public MapListEntry() {
        this.name = "";
        this.session_id = "";
        this.date = 0;
        this.map_id = "";
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
        int length_session_id = this.session_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_session_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_session_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_session_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_session_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_session_id; k++) {
            outbuffer[offset + k] = (byte)((this.session_id.getBytes())[k] & 0xFF);
        }
        offset += length_session_id;
        outbuffer[offset + 0] = (byte)((this.date >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.date >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.date >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.date >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.date >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.date >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.date >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.date >> (8 * 7)) & 0xFF);
        offset += 8;
        int length_map_id = this.map_id.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_map_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_map_id >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_map_id >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_map_id >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_map_id; k++) {
            outbuffer[offset + k] = (byte)((this.map_id.getBytes())[k] & 0xFF);
        }
        offset += length_map_id;
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
        int length_session_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_session_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_session_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_session_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_session_id = new byte[length_session_id];
        for(int k= 0; k< length_session_id; k++){
            bytes_session_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.session_id = new java.lang.String(bytes_session_id);
        offset += length_session_id;
        this.date   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.date |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.date |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.date |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.date |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.date |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.date |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.date |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        int length_map_id = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_map_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_map_id |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_map_id |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_map_id = new byte[length_map_id];
        for(int k= 0; k< length_map_id; k++){
            bytes_map_id[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.map_id = new java.lang.String(bytes_map_id);
        offset += length_map_id;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_session_id = this.session_id.getBytes().length;
        length += 4;
        length += length_session_id;
        length += 8;
        int length_map_id = this.map_id.getBytes().length;
        length += 4;
        length += length_map_id;
        return length;
    }

    public java.lang.String getType(){ return "world_canvas_msgs/MapListEntry"; }
    public java.lang.String getMD5(){ return "0a3fc0aa981d58051656d09c30ad5a7c"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
