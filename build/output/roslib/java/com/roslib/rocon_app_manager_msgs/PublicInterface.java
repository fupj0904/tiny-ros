package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class PublicInterface implements com.roslib.ros.Msg {
    public java.lang.String connection_type;
    public java.lang.String data_type;
    public java.lang.String name;

    public PublicInterface() {
        this.connection_type = "";
        this.data_type = "";
        this.name = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_connection_type = this.connection_type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_connection_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_connection_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_connection_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_connection_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_connection_type; k++) {
            outbuffer[offset + k] = (byte)((this.connection_type.getBytes())[k] & 0xFF);
        }
        offset += length_connection_type;
        int length_data_type = this.data_type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_data_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_data_type; k++) {
            outbuffer[offset + k] = (byte)((this.data_type.getBytes())[k] & 0xFF);
        }
        offset += length_data_type;
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
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_connection_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_connection_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_connection_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_connection_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_connection_type = new byte[length_connection_type];
        for(int k= 0; k< length_connection_type; k++){
            bytes_connection_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.connection_type = new java.lang.String(bytes_connection_type);
        offset += length_connection_type;
        int length_data_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_data_type = new byte[length_data_type];
        for(int k= 0; k< length_data_type; k++){
            bytes_data_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.data_type = new java.lang.String(bytes_data_type);
        offset += length_data_type;
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
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_connection_type = this.connection_type.getBytes().length;
        length += 4;
        length += length_connection_type;
        int length_data_type = this.data_type.getBytes().length;
        length += 4;
        length += length_data_type;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        return length;
    }

    public java.lang.String getType(){ return "rocon_app_manager_msgs/PublicInterface"; }
    public java.lang.String getMD5(){ return "940cf5c2feab0cc1d67a32f00080f68a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
