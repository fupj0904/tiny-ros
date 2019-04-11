package com.roslib.rocon_std_msgs;

import java.lang.*;

public class StringArray implements com.roslib.ros.Msg {
    public java.lang.String[] strings;

    public StringArray() {
        this.strings = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_strings = this.strings != null ? this.strings.length : 0;
        outbuffer[offset + 0] = (byte)((length_strings >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_strings >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_strings >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_strings >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_strings; i++){
        int length_stringsi = this.strings[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_stringsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_stringsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_stringsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_stringsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_stringsi; k++) {
            outbuffer[offset + k] = (byte)((this.strings[i].getBytes())[k] & 0xFF);
        }
        offset += length_stringsi;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_strings = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_strings |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_strings |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_strings |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_strings > 0) {
            this.strings = new java.lang.String[length_strings];
        }
        for (int i = 0; i < length_strings; i++){
        int length_stringsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_stringsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_stringsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_stringsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_stringsi = new byte[length_stringsi];
        for(int k= 0; k< length_stringsi; k++){
            bytes_stringsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.strings[i] = new java.lang.String(bytes_stringsi);
        offset += length_stringsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_strings = this.strings != null ? this.strings.length : 0;
        for (int i = 0; i < length_strings; i++) {
        int length_stringsi = this.strings[i].getBytes().length;
        length += 4;
        length += length_stringsi;
        }
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/StringArray"; }
    public java.lang.String getMD5(){ return "ad3938ae4ae12f1e7c47605764496f93"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
