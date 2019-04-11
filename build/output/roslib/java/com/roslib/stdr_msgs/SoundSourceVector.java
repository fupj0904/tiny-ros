package com.roslib.stdr_msgs;

import java.lang.*;

public class SoundSourceVector implements com.roslib.ros.Msg {
    public com.roslib.stdr_msgs.SoundSource[] sound_sources;

    public SoundSourceVector() {
        this.sound_sources = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_sound_sources = this.sound_sources != null ? this.sound_sources.length : 0;
        outbuffer[offset + 0] = (byte)((length_sound_sources >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_sound_sources >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_sound_sources >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_sound_sources >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_sound_sources; i++){
        offset = this.sound_sources[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_sound_sources = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_sound_sources |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_sound_sources |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_sound_sources |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_sound_sources > 0) {
            this.sound_sources = new com.roslib.stdr_msgs.SoundSource[length_sound_sources];
        }
        for (int i = 0; i < length_sound_sources; i++){
        offset = this.sound_sources[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_sound_sources = this.sound_sources != null ? this.sound_sources.length : 0;
        for (int i = 0; i < length_sound_sources; i++) {
        length += this.sound_sources[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/SoundSourceVector"; }
    public java.lang.String getMD5(){ return "f0c6aa16237e8bbdbf375a143adc4aa9"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
