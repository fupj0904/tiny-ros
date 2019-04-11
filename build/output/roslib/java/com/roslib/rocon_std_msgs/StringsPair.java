package com.roslib.rocon_std_msgs;

import java.lang.*;

public class StringsPair implements com.roslib.ros.Msg {
    public com.roslib.rocon_std_msgs.StringsPairRequest pair_request;
    public com.roslib.rocon_std_msgs.StringsPairResponse pair_response;

    public StringsPair() {
        this.pair_request = new com.roslib.rocon_std_msgs.StringsPairRequest();
        this.pair_response = new com.roslib.rocon_std_msgs.StringsPairResponse();
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

    public java.lang.String getType(){ return "rocon_std_msgs/StringsPair"; }
    public java.lang.String getMD5(){ return "363ccecaa2660e1d243bb6444bbc0d87"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
