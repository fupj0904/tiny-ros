package com.roslib.gateway_msgs;

import java.lang.*;

public class RemoteGatewayInfo {

public static final java.lang.String REMOTEGATEWAYINFO = "gateway_msgs/RemoteGatewayInfo";

public class RemoteGatewayInfoRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String[] gateways;

    public RemoteGatewayInfoRequest() {
        this.gateways = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_gateways = this.gateways != null ? this.gateways.length : 0;
        outbuffer[offset + 0] = (byte)((length_gateways >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_gateways >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_gateways >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_gateways >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_gateways; i++){
        int length_gatewaysi = this.gateways[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_gatewaysi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_gatewaysi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_gatewaysi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_gatewaysi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_gatewaysi; k++) {
            outbuffer[offset + k] = (byte)((this.gateways[i].getBytes())[k] & 0xFF);
        }
        offset += length_gatewaysi;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_gateways = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_gateways |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_gateways |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_gateways |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_gateways > 0) {
            this.gateways = new java.lang.String[length_gateways];
        }
        for (int i = 0; i < length_gateways; i++){
        int length_gatewaysi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_gatewaysi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_gatewaysi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_gatewaysi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_gatewaysi = new byte[length_gatewaysi];
        for(int k= 0; k< length_gatewaysi; k++){
            bytes_gatewaysi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.gateways[i] = new java.lang.String(bytes_gatewaysi);
        offset += length_gatewaysi;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_gateways = this.gateways != null ? this.gateways.length : 0;
        for (int i = 0; i < length_gateways; i++) {
        int length_gatewaysi = this.gateways[i].getBytes().length;
        length += 4;
        length += length_gatewaysi;
        }
        return length;
    }

    public java.lang.String getType() { return REMOTEGATEWAYINFO; }
    public java.lang.String getMD5(){ return "e4daaae2f80b4b2c9dfce849ea79d49f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class RemoteGatewayInfoResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.gateway_msgs.RemoteGateway[] gateways;

    public RemoteGatewayInfoResponse() {
        this.gateways = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_gateways = this.gateways != null ? this.gateways.length : 0;
        outbuffer[offset + 0] = (byte)((length_gateways >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_gateways >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_gateways >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_gateways >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_gateways; i++){
        offset = this.gateways[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_gateways = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_gateways |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_gateways |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_gateways |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_gateways > 0) {
            this.gateways = new com.roslib.gateway_msgs.RemoteGateway[length_gateways];
        }
        for (int i = 0; i < length_gateways; i++){
        offset = this.gateways[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_gateways = this.gateways != null ? this.gateways.length : 0;
        for (int i = 0; i < length_gateways; i++) {
        length += this.gateways[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return REMOTEGATEWAYINFO; }
    public java.lang.String getMD5(){ return "e6c0026f98b41412ab013427f3105885"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
