package com.roslib.actionlib_msgs;

import java.lang.*;

public class GoalStatus implements com.roslib.ros.Msg {
    public com.roslib.actionlib_msgs.GoalID goal_id;
    public int status;
    public java.lang.String text;
    public static final int PENDING = (int)( 0   );
    public static final int ACTIVE = (int)( 1   );
    public static final int PREEMPTED = (int)( 2   );
    public static final int SUCCEEDED = (int)( 3   );
    public static final int ABORTED = (int)( 4   );
    public static final int REJECTED = (int)( 5   );
    public static final int PREEMPTING = (int)( 6   );
    public static final int RECALLING = (int)( 7   );
    public static final int RECALLED = (int)( 8   );
    public static final int LOST = (int)( 9   );

    public GoalStatus() {
        this.goal_id = new com.roslib.actionlib_msgs.GoalID();
        this.status = 0;
        this.text = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.goal_id.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.status >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_text = this.text.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_text >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_text >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_text >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_text >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_text; k++) {
            outbuffer[offset + k] = (byte)((this.text.getBytes())[k] & 0xFF);
        }
        offset += length_text;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.goal_id.deserialize(inbuffer, offset);
        this.status   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_text = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_text |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_text |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_text |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_text = new byte[length_text];
        for(int k= 0; k< length_text; k++){
            bytes_text[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.text = new java.lang.String(bytes_text);
        offset += length_text;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.goal_id.serializedLength();
        length += 1;
        int length_text = this.text.getBytes().length;
        length += 4;
        length += length_text;
        return length;
    }

    public java.lang.String getType(){ return "actionlib_msgs/GoalStatus"; }
    public java.lang.String getMD5(){ return "086be35ea957e692de83fc3477e4ef0b"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
