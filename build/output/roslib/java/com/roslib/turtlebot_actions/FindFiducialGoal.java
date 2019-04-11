package com.roslib.turtlebot_actions;

import java.lang.*;

public class FindFiducialGoal implements com.roslib.ros.Msg {
    public java.lang.String camera_name;
    public int pattern_width;
    public int pattern_height;
    public float pattern_size;
    public int pattern_type;
    public static final int CHESSBOARD = (int)( 1);
    public static final int CIRCLES_GRID = (int)( 2);
    public static final int ASYMMETRIC_CIRCLES_GRID = (int)(3);

    public FindFiducialGoal() {
        this.camera_name = "";
        this.pattern_width = 0;
        this.pattern_height = 0;
        this.pattern_size = 0;
        this.pattern_type = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_camera_name = this.camera_name.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_camera_name >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_camera_name >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_camera_name >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_camera_name >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_camera_name; k++) {
            outbuffer[offset + k] = (byte)((this.camera_name.getBytes())[k] & 0xFF);
        }
        offset += length_camera_name;
        outbuffer[offset + 0] = (byte)((this.pattern_width >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.pattern_height >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_pattern_size = Float.floatToRawIntBits(pattern_size);
        outbuffer[offset + 0] = (byte)((bits_pattern_size >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_pattern_size >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_pattern_size >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_pattern_size >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.pattern_type >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_camera_name = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_camera_name |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_camera_name |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_camera_name |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_camera_name = new byte[length_camera_name];
        for(int k= 0; k< length_camera_name; k++){
            bytes_camera_name[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.camera_name = new java.lang.String(bytes_camera_name);
        offset += length_camera_name;
        this.pattern_width   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.pattern_height   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_pattern_size = 0;
        bits_pattern_size |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_pattern_size |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_pattern_size |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_pattern_size |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.pattern_size = Float.intBitsToFloat(bits_pattern_size);
        offset += 4;
        this.pattern_type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_camera_name = this.camera_name.getBytes().length;
        length += 4;
        length += length_camera_name;
        length += 1;
        length += 1;
        length += 4;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "turtlebot_actions/FindFiducialGoal"; }
    public java.lang.String getMD5(){ return "7956e2ad4c2c2c9a3a37a9eb830dd5b3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
