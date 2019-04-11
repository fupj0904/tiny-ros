package com.roslib.tf2_msgs;

import java.lang.*;

public class TF2Error implements com.roslib.ros.Msg {
    public int error;
    public java.lang.String error_string;
    public static final int NO_ERROR = (int)( 0);
    public static final int LOOKUP_ERROR = (int)( 1);
    public static final int CONNECTIVITY_ERROR = (int)( 2);
    public static final int EXTRAPOLATION_ERROR = (int)( 3);
    public static final int INVALID_ARGUMENT_ERROR = (int)( 4);
    public static final int TIMEOUT_ERROR = (int)( 5);
    public static final int TRANSFORM_ERROR = (int)( 6);

    public TF2Error() {
        this.error = 0;
        this.error_string = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.error >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_error_string = this.error_string.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_error_string >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_error_string >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_error_string >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_error_string >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_error_string; k++) {
            outbuffer[offset + k] = (byte)((this.error_string.getBytes())[k] & 0xFF);
        }
        offset += length_error_string;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.error   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_error_string = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_error_string |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_error_string |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_error_string |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_error_string = new byte[length_error_string];
        for(int k= 0; k< length_error_string; k++){
            bytes_error_string[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.error_string = new java.lang.String(bytes_error_string);
        offset += length_error_string;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        int length_error_string = this.error_string.getBytes().length;
        length += 4;
        length += length_error_string;
        return length;
    }

    public java.lang.String getType(){ return "tf2_msgs/TF2Error"; }
    public java.lang.String getMD5(){ return "ed32adf5a372962d977aea0e5630d1d6"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
