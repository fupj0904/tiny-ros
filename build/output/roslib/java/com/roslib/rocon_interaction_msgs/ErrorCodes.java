package com.roslib.rocon_interaction_msgs;

import java.lang.*;

public class ErrorCodes implements com.roslib.ros.Msg {
    public static final byte SUCCESS = (byte)( 0);
    public static final byte INTERACTION_UNAVAILABLE = (byte)( 20    );
    public static final byte INTERACTION_QUOTA_REACHED = (byte)( 21  );
    public static final byte START_PAIRED_RAPP_FAILED = (byte)( 31   );
    public static final byte ALREADY_PAIRING = (byte)( 32   );
    public static final java.lang.String MSG_INTERACTION_UNAVAILABLE = (java.lang.String)(" This role-app pair is not available for use.");
    public static final java.lang.String MSG_INTERACTION_QUOTA_REACHED = (java.lang.String)(" More connections of this type not permitted.");
    public static final java.lang.String MSG_START_PAIRED_RAPP_FAILED = (java.lang.String)(" Failed to start the paired rapp.");
    public static final java.lang.String MSG_ALREADY_PAIRING = (java.lang.String)(" Already pairing, cannot start another pairing.");

    public ErrorCodes() {
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType(){ return "rocon_interaction_msgs/ErrorCodes"; }
    public java.lang.String getMD5(){ return "6141bbe9c576f5ac2ad0e0be325172cd"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
