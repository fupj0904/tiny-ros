package com.roslib.tinyros_hello;

import java.lang.*;

public class TinyrosHello implements com.roslib.ros.Msg {
    public java.lang.String hello;

    public TinyrosHello() {
        this.hello = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_hello = this.hello.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_hello >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hello >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hello >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hello >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_hello; k++) {
            outbuffer[offset + k] = (byte)((this.hello.getBytes())[k] & 0xFF);
        }
        offset += length_hello;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_hello = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hello |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hello |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hello |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_hello = new byte[length_hello];
        for(int k= 0; k< length_hello; k++){
            bytes_hello[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.hello = new java.lang.String(bytes_hello);
        offset += length_hello;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_hello = this.hello.getBytes().length;
        length += 4;
        length += length_hello;
        return length;
    }

    public java.lang.String getType(){ return "tinyros_hello/TinyrosHello"; }
    public java.lang.String getMD5(){ return "0c68e66a217802ad0c9f648b7a69d090"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
