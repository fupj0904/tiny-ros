package com.roslib.tinyros_hello;

import java.lang.*;

public class Test {

public static final java.lang.String TEST = "tinyros_hello/Test";

public class TestRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String input;

    public TestRequest() {
        this.input = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_input = this.input.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_input >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_input >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_input >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_input >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_input; k++) {
            outbuffer[offset + k] = (byte)((this.input.getBytes())[k] & 0xFF);
        }
        offset += length_input;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_input = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_input |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_input |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_input |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_input = new byte[length_input];
        for(int k= 0; k< length_input; k++){
            bytes_input[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.input = new java.lang.String(bytes_input);
        offset += length_input;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_input = this.input.getBytes().length;
        length += 4;
        length += length_input;
        return length;
    }

    public java.lang.String getType() { return TEST; }
    public java.lang.String getMD5(){ return "26ee7a44335f1f7b55a5a7490460807d"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class TestResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String output;

    public TestResponse() {
        this.output = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_output = this.output.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_output >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_output >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_output >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_output >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_output; k++) {
            outbuffer[offset + k] = (byte)((this.output.getBytes())[k] & 0xFF);
        }
        offset += length_output;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_output = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_output |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_output |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_output |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_output = new byte[length_output];
        for(int k= 0; k< length_output; k++){
            bytes_output[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.output = new java.lang.String(bytes_output);
        offset += length_output;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_output = this.output.getBytes().length;
        length += 4;
        length += length_output;
        return length;
    }

    public java.lang.String getType() { return TEST; }
    public java.lang.String getMD5(){ return "e2f6296e6ea9df7406f4fac9fb52d44b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
