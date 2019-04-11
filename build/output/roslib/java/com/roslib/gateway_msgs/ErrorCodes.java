package com.roslib.gateway_msgs;

import java.lang.*;

public class ErrorCodes implements com.roslib.ros.Msg {
    public static final byte SUCCESS = (byte)( 0);
    public static final byte NO_HUB_CONNECTION = (byte)( 1);
    public static final byte HUB_CONNECTION_ALREADY_EXISTS = (byte)( 11);
    public static final byte HUB_CONNECTION_UNRESOLVABLE = (byte)( 12);
    public static final byte HUB_CONNECTION_BLACKLISTED = (byte)( 13);
    public static final byte HUB_CONNECTION_FAILED = (byte)( 14);
    public static final byte HUB_CONNECTION_NOT_IN_NONEMPTY_WHITELIST = (byte)( 15);
    public static final byte HUB_NAME_NOT_FOUND = (byte)( 16);
    public static final byte HUB_CONNECTION_LOST = (byte)( 17);
    public static final byte HUB_UNKNOWN_ERROR = (byte)( 19);
    public static final byte FLIP_RULE_ALREADY_EXISTS = (byte)( 22);
    public static final byte FLIP_PATTERN_ALREDY_EXISTS = (byte)( 23);
    public static final byte FLIP_REMOTE_GATEWAY_FIREWALLING = (byte)( 24);
    public static final byte ADVERTISEMENT_EXISTS = (byte)( 31);
    public static final byte ADVERTISEMENT_NOT_FOUND = (byte)( 32);
    public static final byte UNKNOWN_ADVERTISEMENT_ERROR = (byte)( 39);
    public static final byte PULL_RULE_ALREADY_EXISTS = (byte)( 41);
    public static final byte REMOTE_GATEWAY_NOT_VISIBLE = (byte)( 51);
    public static final byte REMOTE_GATEWAY_SELF_IS_NOT = (byte)( 52);
    public static final byte REMOTE_GATEWAY_TARGET_HAS_MULTIPLE_MATCHES = (byte)( 53);

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

    public java.lang.String getType(){ return "gateway_msgs/ErrorCodes"; }
    public java.lang.String getMD5(){ return "3112c9518da886007417bfadadd3a6f1"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
