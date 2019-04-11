package com.roslib.capabilities;

import java.lang.*;

public class CapabilitySpec implements com.roslib.ros.Msg {
    public java.lang.String package_;
    public java.lang.String type;
    public java.lang.String content;
    public java.lang.String default_provider;

    public CapabilitySpec() {
        this.package_ = "";
        this.type = "";
        this.content = "";
        this.default_provider = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_package_ = this.package_.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_package_ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_package_ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_package_ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_package_ >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_package_; k++) {
            outbuffer[offset + k] = (byte)((this.package_.getBytes())[k] & 0xFF);
        }
        offset += length_package_;
        int length_type = this.type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_type; k++) {
            outbuffer[offset + k] = (byte)((this.type.getBytes())[k] & 0xFF);
        }
        offset += length_type;
        int length_content = this.content.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_content >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_content >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_content >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_content >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_content; k++) {
            outbuffer[offset + k] = (byte)((this.content.getBytes())[k] & 0xFF);
        }
        offset += length_content;
        int length_default_provider = this.default_provider.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_default_provider >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_default_provider >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_default_provider >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_default_provider >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_default_provider; k++) {
            outbuffer[offset + k] = (byte)((this.default_provider.getBytes())[k] & 0xFF);
        }
        offset += length_default_provider;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_package_ = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_package_ |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_package_ |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_package_ |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_package_ = new byte[length_package_];
        for(int k= 0; k< length_package_; k++){
            bytes_package_[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.package_ = new java.lang.String(bytes_package_);
        offset += length_package_;
        int length_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_type = new byte[length_type];
        for(int k= 0; k< length_type; k++){
            bytes_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.type = new java.lang.String(bytes_type);
        offset += length_type;
        int length_content = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_content |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_content |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_content |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_content = new byte[length_content];
        for(int k= 0; k< length_content; k++){
            bytes_content[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.content = new java.lang.String(bytes_content);
        offset += length_content;
        int length_default_provider = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_default_provider |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_default_provider |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_default_provider |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_default_provider = new byte[length_default_provider];
        for(int k= 0; k< length_default_provider; k++){
            bytes_default_provider[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.default_provider = new java.lang.String(bytes_default_provider);
        offset += length_default_provider;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_package_ = this.package_.getBytes().length;
        length += 4;
        length += length_package_;
        int length_type = this.type.getBytes().length;
        length += 4;
        length += length_type;
        int length_content = this.content.getBytes().length;
        length += 4;
        length += length_content;
        int length_default_provider = this.default_provider.getBytes().length;
        length += 4;
        length += length_default_provider;
        return length;
    }

    public java.lang.String getType(){ return "capabilities/CapabilitySpec"; }
    public java.lang.String getMD5(){ return "ac825adf655bbbe4215bdd4e534ec0f8"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
