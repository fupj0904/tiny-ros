package com.roslib.rocon_std_msgs;

import java.lang.*;

public class StringsPairRequest implements com.roslib.ros.Msg {
    public com.roslib.uuid_msgs.UniqueID id;
    public com.roslib.rocon_std_msgs.StringsRequest request;

    public StringsPairRequest() {
        this.id = new com.roslib.uuid_msgs.UniqueID();
        this.request = new com.roslib.rocon_std_msgs.StringsRequest();
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

    public java.lang.String getType(){ return "rocon_std_msgs/StringsPairRequest"; }
    public java.lang.String getMD5(){ return "69347b7f5d549a616ebcd39e77284ff0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
