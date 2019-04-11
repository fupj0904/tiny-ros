package com.roslib.yocs_msgs;

import java.lang.*;

public class NavigationControlStatus implements com.roslib.ros.Msg {
    public byte status;
    public java.lang.String status_desc;
    public static final byte ERROR = (byte)( -1);
    public static final byte IDLING = (byte)( 0);
    public static final byte RUNNING = (byte)( 1);
    public static final byte PAUSED = (byte)( 2);
    public static final byte COMPLETED = (byte)( 3);
    public static final byte CANCELLED = (byte)( 4);

    public NavigationControlStatus() {
        this.status = 0;
        this.status_desc = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.status >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_status_desc = this.status_desc.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_status_desc >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_status_desc >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_status_desc >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_status_desc >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_status_desc; k++) {
            outbuffer[offset + k] = (byte)((this.status_desc.getBytes())[k] & 0xFF);
        }
        offset += length_status_desc;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.status   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_status_desc = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_status_desc |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_status_desc |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_status_desc |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_status_desc = new byte[length_status_desc];
        for(int k= 0; k< length_status_desc; k++){
            bytes_status_desc[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.status_desc = new java.lang.String(bytes_status_desc);
        offset += length_status_desc;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_status_desc = this.status_desc.getBytes().length;
        length += 4;
        length += length_status_desc;
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/NavigationControlStatus"; }
    public java.lang.String getMD5(){ return "14e94356f38866d8796d46946c7d28a6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
