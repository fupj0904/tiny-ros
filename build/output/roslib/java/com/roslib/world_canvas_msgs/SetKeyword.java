package com.roslib.world_canvas_msgs;

import java.lang.*;

public class SetKeyword {

public static final java.lang.String SETKEYWORD = "world_canvas_msgs/SetKeyword";

public class SetKeywordRequest implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.uuid_msgs.UniqueID id;
    public java.lang.String keyword;
    public int action;
    public static final int ADD = (int)( 1);
    public static final int DEL = (int)( 2);

    public SetKeywordRequest() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.keyword = "";
        this.action = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        offset = this.id.serialize(outbuffer, offset);
        int length_keyword = this.keyword.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_keyword >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_keyword >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_keyword >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_keyword >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_keyword; k++) {
            outbuffer[offset + k] = (byte)((this.keyword.getBytes())[k] & 0xFF);
        }
        offset += length_keyword;
        outbuffer[offset + 0] = (byte)((this.action >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        offset = this.id.deserialize(inbuffer, offset);
        int length_keyword = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_keyword |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_keyword |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_keyword |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_keyword = new byte[length_keyword];
        for(int k= 0; k< length_keyword; k++){
            bytes_keyword[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.keyword = new java.lang.String(bytes_keyword);
        offset += length_keyword;
        this.action   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.id.serializedLength();
        int length_keyword = this.keyword.getBytes().length;
        length += 4;
        length += length_keyword;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return SETKEYWORD; }
    public java.lang.String getMD5(){ return "d75c53b4a52762e1130a14c1c632dede"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetKeywordResponse implements com.roslib.ros.Msg {
    private long __id__;
    public boolean result;
    public java.lang.String message;

    public SetKeywordResponse() {
        this.result = false;
        this.message = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((result ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_message = this.message.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message; k++) {
            outbuffer[offset + k] = (byte)((this.message.getBytes())[k] & 0xFF);
        }
        offset += length_message;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.result = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_message = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message = new byte[length_message];
        for(int k= 0; k< length_message; k++){
            bytes_message[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message = new java.lang.String(bytes_message);
        offset += length_message;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_message = this.message.getBytes().length;
        length += 4;
        length += length_message;
        return length;
    }

    public java.lang.String getType() { return SETKEYWORD; }
    public java.lang.String getMD5(){ return "9e01f56b03a74239307a9b631b242ddc"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
