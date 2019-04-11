package com.roslib.rocon_service_pair_msgs;

import java.lang.*;

public class TestiesPairRequest implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.rocon_service_pair_msgs.TestiesRequest request;

    public TestiesPairRequest() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.request = new com.roslib.rocon_service_pair_msgs.TestiesRequest();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.id.serialize(outbuffer, offset);
        offset = this.request.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.id.deserialize(inbuffer, offset);
        offset = this.request.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.id.serializedLength();
        length += this.request.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "rocon_service_pair_msgs/TestiesPairRequest"; }
    public java.lang.String getMD5(){ return "f0fb04aa02c89d04a18a2ee8f9bb5070"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
