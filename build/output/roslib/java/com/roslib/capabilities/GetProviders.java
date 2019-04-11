package com.roslib.capabilities;

import java.lang.*;

public class GetProviders {

public static final java.lang.String GETPROVIDERS = "capabilities/GetProviders";

public class GetProvidersRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String interface_;
    public boolean include_semantic;

    public GetProvidersRequest() {
        this.interface_ = "";
        this.include_semantic = false;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_interface_ = this.interface_.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_interface_ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_interface_ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_interface_ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_interface_ >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_interface_; k++) {
            outbuffer[offset + k] = (byte)((this.interface_.getBytes())[k] & 0xFF);
        }
        offset += length_interface_;
        outbuffer[offset] = (byte)((include_semantic ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_interface_ = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_interface_ |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_interface_ |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_interface_ |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_interface_ = new byte[length_interface_];
        for(int k= 0; k< length_interface_; k++){
            bytes_interface_[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.interface_ = new java.lang.String(bytes_interface_);
        offset += length_interface_;
        this.include_semantic = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_interface_ = this.interface_.getBytes().length;
        length += 4;
        length += length_interface_;
        length += 1;
        return length;
    }

    public java.lang.String getType() { return GETPROVIDERS; }
    public java.lang.String getMD5(){ return "776d3aefe60104ff302d0ec99fca8b7c"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class GetProvidersResponse implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] providers;
    public java.lang.String default_provider;

    public GetProvidersResponse() {
        this.providers = null;
        this.default_provider = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_providers = this.providers != null ? this.providers.length : 0;
        outbuffer[offset + 0] = (byte)((length_providers >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_providers >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_providers >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_providers >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_providers; i++){
        int length_providersi = this.providers[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_providersi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_providersi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_providersi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_providersi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_providersi; k++) {
            outbuffer[offset + k] = (byte)((this.providers[i].getBytes())[k] & 0xFF);
        }
        offset += length_providersi;
        }
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
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_providers = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_providers |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_providers |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_providers |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_providers > 0) {
            this.providers = new java.lang.String[length_providers];
        }
        for (int i = 0; i < length_providers; i++){
        int length_providersi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_providersi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_providersi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_providersi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_providersi = new byte[length_providersi];
        for(int k= 0; k< length_providersi; k++){
            bytes_providersi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.providers[i] = new java.lang.String(bytes_providersi);
        offset += length_providersi;
        }
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
        length += 4;
        int length_providers = this.providers != null ? this.providers.length : 0;
        for (int i = 0; i < length_providers; i++) {
        int length_providersi = this.providers[i].getBytes().length;
        length += 4;
        length += length_providersi;
        }
        int length_default_provider = this.default_provider.getBytes().length;
        length += 4;
        length += length_default_provider;
        return length;
    }

    public java.lang.String getType() { return GETPROVIDERS; }
    public java.lang.String getMD5(){ return "1efa11d6e190e4a9db0c7613e5c8f91a"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
