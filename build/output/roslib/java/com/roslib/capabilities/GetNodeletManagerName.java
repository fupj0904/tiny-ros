package com.roslib.capabilities;

import java.lang.*;

public class GetNodeletManagerName {

public static final java.lang.String GETNODELETMANAGERNAME = "capabilities/GetNodeletManagerName";

public class GetNodeletManagerNameRequest implements com.roslib.ros.Msg {
    private long __id__;

    public GetNodeletManagerNameRequest() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return GETNODELETMANAGERNAME; }
    public java.lang.String getMD5(){ return "317fdbbe1436624965701bb6948b1b14"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetNodeletManagerNameResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String nodelet_manager_name;

    public GetNodeletManagerNameResponse() {
        this.nodelet_manager_name = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_nodelet_manager_name = this.nodelet_manager_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_nodelet_manager_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_nodelet_manager_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_nodelet_manager_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_nodelet_manager_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_nodelet_manager_name; k++) {
            outbuffer[offset + k] = (byte)((this.nodelet_manager_name.getBytes())[k] & 0xFF);
        }
        offset += length_nodelet_manager_name;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_nodelet_manager_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_nodelet_manager_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_nodelet_manager_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_nodelet_manager_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_nodelet_manager_name = new byte[length_nodelet_manager_name];
        for(int k= 0; k< length_nodelet_manager_name; k++){
            bytes_nodelet_manager_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.nodelet_manager_name = new java.lang.String(bytes_nodelet_manager_name);
        offset += length_nodelet_manager_name;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_nodelet_manager_name = this.nodelet_manager_name.getBytes().length;
        length += 4;
        length += length_nodelet_manager_name;
        return length;
    }

    public java.lang.String getType() { return GETNODELETMANAGERNAME; }
    public java.lang.String getMD5(){ return "2725db78e3dc9e920e47884af42f59e3"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
