package com.roslib.tf2_msgs;

import java.lang.*;

public class TFMessage implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.TransformStamped[] transforms;

    public TFMessage() {
        this.transforms = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        outbuffer[offset + 0] = (byte)((length_transforms >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_transforms >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_transforms >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_transforms >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_transforms; i++){
        offset = this.transforms[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_transforms = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_transforms |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_transforms |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_transforms |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_transforms > 0) {
            this.transforms = new com.roslib.geometry_msgs.TransformStamped[length_transforms];
        }
        for (int i = 0; i < length_transforms; i++){
        offset = this.transforms[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_transforms = this.transforms != null ? this.transforms.length : 0;
        for (int i = 0; i < length_transforms; i++) {
        length += this.transforms[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "tf2_msgs/TFMessage"; }
    public java.lang.String getMD5(){ return "cb93cfe6a141f8d8af7cc34997ec99fe"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
