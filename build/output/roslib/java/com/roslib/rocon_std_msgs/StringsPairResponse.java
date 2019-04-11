package com.roslib.rocon_std_msgs;

import java.lang.*;

public class StringsPairResponse implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.rocon_std_msgs.StringsResponse response;

    public StringsPairResponse() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.response = new com.roslib.rocon_std_msgs.StringsResponse();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.id.serialize(outbuffer, offset);
        offset = this.response.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.id.deserialize(inbuffer, offset);
        offset = this.response.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.id.serializedLength();
        length += this.response.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "rocon_std_msgs/StringsPairResponse"; }
    public java.lang.String getMD5(){ return "82e9f6cf40a20b618c59de6b6ddaec21"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
