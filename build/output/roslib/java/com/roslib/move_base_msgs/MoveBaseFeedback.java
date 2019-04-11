package com.roslib.move_base_msgs;

import java.lang.*;

public class MoveBaseFeedback implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.PoseStamped base_position;

    public MoveBaseFeedback() {
        this.base_position = new com.roslib.geometry_msgs.PoseStamped();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.base_position.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.base_position.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.base_position.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "move_base_msgs/MoveBaseFeedback"; }
    public java.lang.String getMD5(){ return "fea577775b72c43bc1f34b61e0fa592a"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
