package com.roslib.rocon_app_manager_msgs;

import java.lang.*;

public class ErrorCodes implements com.roslib.ros.Msg {
    public static final byte SUCCESS = (byte)( 0);
    public static final byte UNKNOWN = (byte)( 1);
    public static final byte MULTI_RAPP_NOT_SUPPORTED = (byte)( 10);
    public static final byte RAPP_IS_NOT_RUNNING = (byte)( 20);
    public static final byte RAPP_IS_NOT_AVAILABLE = (byte)( 21);
    public static final byte LOCAL_INVITATIONS_ONLY = (byte)( 30);
    public static final byte NO_LOCAL_GATEWAY = (byte)( 31);
    public static final byte ALREADY_REMOTE_CONTROLLED = (byte)( 32);
    public static final byte NOT_CURRENT_REMOTE_CONTROLLER = (byte)( 33);
    public static final byte INVITING_CONTROLLER_NOT_WHITELISTED = (byte)( 34);
    public static final byte INVITING_CONTROLLER_BLACKLISTED = (byte)( 35);
    public static final byte CLIENT_CONNECTION_DISRUPTED = (byte)( 36);

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

    public java.lang.String getType(){ return "rocon_app_manager_msgs/ErrorCodes"; }
    public java.lang.String getMD5(){ return "95e86aa88b99a17e5eaee9b0f7487d6d"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
