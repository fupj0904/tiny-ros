package com.roslib.actionlib;

import java.lang.*;

public class TestRequestGoal implements com.roslib.ros.Msg {
    public int terminate_status;
    public boolean ignore_cancel;
    public java.lang.String result_text;
    public int the_result;
    public boolean is_simple_client;
    public com.roslib.ros.Duration delay_accept;
    public com.roslib.ros.Duration delay_terminate;
    public com.roslib.ros.Duration pause_status;
    public static final int TERMINATE_SUCCESS = (int)( 0);
    public static final int TERMINATE_ABORTED = (int)( 1);
    public static final int TERMINATE_REJECTED = (int)( 2);
    public static final int TERMINATE_LOSE = (int)( 3);
    public static final int TERMINATE_DROP = (int)( 4);
    public static final int TERMINATE_EXCEPTION = (int)( 5);

    public TestRequestGoal() {
        this.terminate_status = 0;
        this.ignore_cancel = false;
        this.result_text = "";
        this.the_result = 0;
        this.is_simple_client = false;
        this.delay_accept = new com.roslib.ros.Duration();
        this.delay_terminate = new com.roslib.ros.Duration();
        this.pause_status = new com.roslib.ros.Duration();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.terminate_status >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.terminate_status >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.terminate_status >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.terminate_status >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((ignore_cancel ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        int length_result_text = this.result_text.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_result_text >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_result_text >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_result_text >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_result_text >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_result_text; k++) {
            outbuffer[offset + k] = (byte)((this.result_text.getBytes())[k] & 0xFF);
        }
        offset += length_result_text;
        outbuffer[offset + 0] = (byte)((this.the_result >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.the_result >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.the_result >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.the_result >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((is_simple_client ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.delay_accept.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.delay_accept.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.delay_accept.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.delay_accept.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.delay_accept.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.delay_accept.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.delay_accept.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.delay_accept.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.delay_terminate.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.delay_terminate.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.delay_terminate.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.delay_terminate.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.delay_terminate.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.delay_terminate.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.delay_terminate.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.delay_terminate.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.pause_status.sec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.pause_status.sec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.pause_status.sec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.pause_status.sec >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.pause_status.nsec >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.pause_status.nsec >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.pause_status.nsec >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.pause_status.nsec >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.terminate_status   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.terminate_status |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.terminate_status |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.terminate_status |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.ignore_cancel = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        int length_result_text = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_result_text |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_result_text |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_result_text |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_result_text = new byte[length_result_text];
        for(int k= 0; k< length_result_text; k++){
            bytes_result_text[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.result_text = new java.lang.String(bytes_result_text);
        offset += length_result_text;
        this.the_result   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.the_result |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.the_result |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.the_result |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.is_simple_client = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.delay_accept.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.delay_accept.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.delay_accept.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.delay_accept.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.delay_accept.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.delay_accept.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.delay_accept.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.delay_accept.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.delay_terminate.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.delay_terminate.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.delay_terminate.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.delay_terminate.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.delay_terminate.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.delay_terminate.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.delay_terminate.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.delay_terminate.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.pause_status.sec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.pause_status.sec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.pause_status.sec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.pause_status.sec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.pause_status.nsec   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.pause_status.nsec |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.pause_status.nsec |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.pause_status.nsec |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        length += 1;
        int length_result_text = this.result_text.getBytes().length;
        length += 4;
        length += length_result_text;
        length += 4;
        length += 1;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "actionlib/TestRequestGoal"; }
    public java.lang.String getMD5(){ return "0876e35618a8d359190105395327d83f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
