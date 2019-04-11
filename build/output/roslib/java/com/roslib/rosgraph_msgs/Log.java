package com.roslib.rosgraph_msgs;

import java.lang.*;

public class Log implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public byte level;
    public java.lang.String name;
    public java.lang.String msg;
    public java.lang.String file;
    public java.lang.String function;
    public long line;
    public java.lang.String[] topics;
    public static final byte DEBUG = (byte)(1 );
    public static final byte INFO = (byte)(2  );
    public static final byte WARN = (byte)(4  );
    public static final byte ERROR = (byte)(8 );
    public static final byte FATAL = (byte)(16 );

    public Log() {
        this.header = new com.roslib.std_msgs.Header();
        this.level = 0;
        this.name = "";
        this.msg = "";
        this.file = "";
        this.function = "";
        this.line = 0;
        this.topics = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.level >> (8 * 0)) & 0xFF);
        offset += 1;
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
        int length_msg = this.msg.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_msg >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_msg >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_msg >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_msg >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_msg; k++) {
            outbuffer[offset + k] = (byte)((this.msg.getBytes())[k] & 0xFF);
        }
        offset += length_msg;
        int length_file = this.file.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_file >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_file >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_file >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_file >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_file; k++) {
            outbuffer[offset + k] = (byte)((this.file.getBytes())[k] & 0xFF);
        }
        offset += length_file;
        int length_function = this.function.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_function >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_function >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_function >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_function >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_function; k++) {
            outbuffer[offset + k] = (byte)((this.function.getBytes())[k] & 0xFF);
        }
        offset += length_function;
        outbuffer[offset + 0] = (byte)((this.line >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.line >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.line >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.line >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        outbuffer[offset + 0] = (byte)((length_topics >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topics >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topics >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topics >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_topics; i++){
        int length_topicsi = this.topics[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_topicsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topicsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topicsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topicsi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_topicsi; k++) {
            outbuffer[offset + k] = (byte)((this.topics[i].getBytes())[k] & 0xFF);
        }
        offset += length_topicsi;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.level   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
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
        int length_msg = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_msg |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_msg |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_msg |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_msg = new byte[length_msg];
        for(int k= 0; k< length_msg; k++){
            bytes_msg[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.msg = new java.lang.String(bytes_msg);
        offset += length_msg;
        int length_file = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_file |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_file |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_file |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_file = new byte[length_file];
        for(int k= 0; k< length_file; k++){
            bytes_file[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.file = new java.lang.String(bytes_file);
        offset += length_file;
        int length_function = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_function |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_function |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_function |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_function = new byte[length_function];
        for(int k= 0; k< length_function; k++){
            bytes_function[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.function = new java.lang.String(bytes_function);
        offset += length_function;
        this.line   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.line |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.line |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.line |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_topics = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topics |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topics |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topics |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_topics > 0) {
            this.topics = new java.lang.String[length_topics];
        }
        for (int i = 0; i < length_topics; i++){
        int length_topicsi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topicsi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topicsi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topicsi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_topicsi = new byte[length_topicsi];
        for(int k= 0; k< length_topicsi; k++){
            bytes_topicsi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.topics[i] = new java.lang.String(bytes_topicsi);
        offset += length_topicsi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 1;
        int length_name = this.name.getBytes().length;
        length += 4;
        length += length_name;
        int length_msg = this.msg.getBytes().length;
        length += 4;
        length += length_msg;
        int length_file = this.file.getBytes().length;
        length += 4;
        length += length_file;
        int length_function = this.function.getBytes().length;
        length += 4;
        length += length_function;
        length += 4;
        length += 4;
        int length_topics = this.topics != null ? this.topics.length : 0;
        for (int i = 0; i < length_topics; i++) {
        int length_topicsi = this.topics[i].getBytes().length;
        length += 4;
        length += length_topicsi;
        }
        return length;
    }

    public java.lang.String getType(){ return "rosgraph_msgs/Log"; }
    public java.lang.String getMD5(){ return "2de9daf47e984009074d74dbdd492d49"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
