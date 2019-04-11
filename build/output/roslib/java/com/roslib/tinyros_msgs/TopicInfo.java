package com.roslib.tinyros_msgs;

import java.lang.*;

public class TopicInfo implements com.roslib.ros.Msg {
    public int topic_id;
    public java.lang.String topic_name;
    public java.lang.String message_type;
    public java.lang.String md5sum;
    public int buffer_size;
    public boolean negotiated;
    public static final int ID_PUBLISHER = (int)(0);
    public static final int ID_SUBSCRIBER = (int)(1);
    public static final int ID_SERVICE_SERVER = (int)(2);
    public static final int ID_SERVICE_CLIENT = (int)(4);
    public static final int ID_ROSTOPIC_REQUEST = (int)(6);
    public static final int ID_ROSSERVICE_REQUEST = (int)(7);
    public static final int ID_LOG = (int)(8);
    public static final int ID_TIME = (int)(9);
    public static final int ID_NEGOTIATED = (int)(10);

    public TopicInfo() {
        this.topic_id = 0;
        this.topic_name = "";
        this.message_type = "";
        this.md5sum = "";
        this.buffer_size = 0;
        this.negotiated = false;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.topic_id >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.topic_id >> (8 * 1)) & 0xFF);
        offset += 2;
        int length_topic_name = this.topic_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_topic_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_topic_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_topic_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_topic_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_topic_name; k++) {
            outbuffer[offset + k] = (byte)((this.topic_name.getBytes())[k] & 0xFF);
        }
        offset += length_topic_name;
        int length_message_type = this.message_type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_message_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_message_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_message_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_message_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_message_type; k++) {
            outbuffer[offset + k] = (byte)((this.message_type.getBytes())[k] & 0xFF);
        }
        offset += length_message_type;
        int length_md5sum = this.md5sum.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_md5sum >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_md5sum >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_md5sum >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_md5sum >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_md5sum; k++) {
            outbuffer[offset + k] = (byte)((this.md5sum.getBytes())[k] & 0xFF);
        }
        offset += length_md5sum;
        outbuffer[offset + 0] = (byte)((this.buffer_size >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.buffer_size >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.buffer_size >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.buffer_size >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((negotiated ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.topic_id   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.topic_id |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        int length_topic_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_topic_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_topic_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_topic_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_topic_name = new byte[length_topic_name];
        for(int k= 0; k< length_topic_name; k++){
            bytes_topic_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.topic_name = new java.lang.String(bytes_topic_name);
        offset += length_topic_name;
        int length_message_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_message_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_message_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_message_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_message_type = new byte[length_message_type];
        for(int k= 0; k< length_message_type; k++){
            bytes_message_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.message_type = new java.lang.String(bytes_message_type);
        offset += length_message_type;
        int length_md5sum = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_md5sum |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_md5sum |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_md5sum |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_md5sum = new byte[length_md5sum];
        for(int k= 0; k< length_md5sum; k++){
            bytes_md5sum[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.md5sum = new java.lang.String(bytes_md5sum);
        offset += length_md5sum;
        this.buffer_size   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.buffer_size |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.buffer_size |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.buffer_size |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.negotiated = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 2;
        int length_topic_name = this.topic_name.getBytes().length;
        length += 4;
        length += length_topic_name;
        int length_message_type = this.message_type.getBytes().length;
        length += 4;
        length += length_message_type;
        int length_md5sum = this.md5sum.getBytes().length;
        length += 4;
        length += length_md5sum;
        length += 4;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "tinyros_msgs/TopicInfo"; }
    public java.lang.String getMD5(){ return "a67d0ceb3e53d38be7128f6a74ba77ca"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
