package com.roslib.theora_image_transport;

import java.lang.*;

public class Packet implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int[] data;
    public int b_o_s;
    public int e_o_s;
    public long granulepos;
    public long packetno;

    public Packet() {
        this.header = new com.roslib.std_msgs.Header();
        this.data = null;
        this.b_o_s = 0;
        this.e_o_s = 0;
        this.granulepos = 0;
        this.packetno = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_data = this.data != null ? this.data.length : 0;
        outbuffer[offset + 0] = (byte)((length_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_data; i++){
        outbuffer[offset + 0] = (byte)((this.data[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        outbuffer[offset + 0] = (byte)((this.b_o_s >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.b_o_s >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.b_o_s >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.b_o_s >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.e_o_s >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.e_o_s >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.e_o_s >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.e_o_s >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.granulepos >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.granulepos >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.granulepos >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.granulepos >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.granulepos >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.granulepos >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.granulepos >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.granulepos >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset + 0] = (byte)((this.packetno >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.packetno >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.packetno >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.packetno >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.packetno >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.packetno >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.packetno >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.packetno >> (8 * 7)) & 0xFF);
        offset += 8;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_data > 0) {
            this.data = new int[length_data];
        }
        for (int i = 0; i < length_data; i++){
        this.data[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        this.b_o_s   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.b_o_s |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.b_o_s |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.b_o_s |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.e_o_s   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.e_o_s |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.e_o_s |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.e_o_s |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.granulepos   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.granulepos |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.granulepos |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.granulepos |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.granulepos |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.granulepos |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.granulepos |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.granulepos |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        this.packetno   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.packetno |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.packetno |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.packetno |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.packetno |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.packetno |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.packetno |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.packetno |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_data = this.data != null ? this.data.length : 0;
        for (int i = 0; i < length_data; i++) {
        length += 1;
        }
        length += 4;
        length += 4;
        length += 8;
        length += 8;
        return length;
    }

    public java.lang.String getType(){ return "theora_image_transport/Packet"; }
    public java.lang.String getMD5(){ return "7c864d9f936fbda707bbc26423006cb3"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
