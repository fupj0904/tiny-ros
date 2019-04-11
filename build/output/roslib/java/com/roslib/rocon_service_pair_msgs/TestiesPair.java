package com.roslib.rocon_service_pair_msgs;

import java.lang.*;

public class TestiesPair implements com.roslib.ros.Msg {
    public com.roslib.rocon_service_pair_msgs.TestiesPairRequest pair_request;
    public com.roslib.rocon_service_pair_msgs.TestiesPairResponse pair_response;

    public TestiesPair() {
        this.pair_request = new com.roslib.rocon_service_pair_msgs.TestiesPairRequest();
        this.pair_response = new com.roslib.rocon_service_pair_msgs.TestiesPairResponse();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.pair_request.serialize(outbuffer, offset);
        offset = this.pair_response.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.pair_request.deserialize(inbuffer, offset);
        offset = this.pair_response.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.pair_request.serializedLength();
        length += this.pair_response.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "rocon_service_pair_msgs/TestiesPair"; }
    public java.lang.String getMD5(){ return "76799fadca37dee3fcca7f92f094bec4"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
