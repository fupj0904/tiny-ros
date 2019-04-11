package com.roslib.rocon_service_pair_msgs;

import java.lang.*;

public class TestiesPairResponse implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.rocon_service_pair_msgs.TestiesResponse response;

    public TestiesPairResponse() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.response = new com.roslib.rocon_service_pair_msgs.TestiesResponse();
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

    public java.lang.String getType(){ return "rocon_service_pair_msgs/TestiesPairResponse"; }
    public java.lang.String getMD5(){ return "b5a5ff0122f8fe4629962124b40d6212"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
