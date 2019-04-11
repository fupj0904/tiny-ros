package com.roslib.zeroconf_msgs;

import java.lang.*;

public class ListPublishedServices {

public static final java.lang.String LISTPUBLISHEDSERVICES = "zeroconf_msgs/ListPublishedServices";

public class ListPublishedServicesRequest implements com.roslib.ros.Msg {
    private long __id__;
    public java.lang.String service_type;

    public ListPublishedServicesRequest() {
        this.service_type = "";
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_service_type = this.service_type.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_service_type >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_service_type >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_service_type >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_service_type >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_service_type; k++) {
            outbuffer[offset + k] = (byte)((this.service_type.getBytes())[k] & 0xFF);
        }
        offset += length_service_type;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_service_type = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_service_type |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_service_type |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_service_type |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_service_type = new byte[length_service_type];
        for(int k= 0; k< length_service_type; k++){
            bytes_service_type[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.service_type = new java.lang.String(bytes_service_type);
        offset += length_service_type;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        int length_service_type = this.service_type.getBytes().length;
        length += 4;
        length += length_service_type;
        return length;
    }

    public java.lang.String getType() { return LISTPUBLISHEDSERVICES; }
    public java.lang.String getMD5(){ return "dc1324d9596ca463663ef8ee90be575f"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class ListPublishedServicesResponse implements com.roslib.ros.Msg {
    private long __id__;
    public com.roslib.zeroconf_msgs.PublishedService[] services;

    public ListPublishedServicesResponse() {
        this.services = null;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_services = this.services != null ? this.services.length : 0;
        outbuffer[offset + 0] = (byte)((length_services >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_services >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_services >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_services >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_services; i++){
        offset = this.services[i].serialize(outbuffer, offset);
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
        int length_services = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_services |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_services |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_services |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_services > 0) {
            this.services = new com.roslib.zeroconf_msgs.PublishedService[length_services];
        }
        for (int i = 0; i < length_services; i++){
        offset = this.services[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_services = this.services != null ? this.services.length : 0;
        for (int i = 0; i < length_services; i++) {
        length += this.services[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType() { return LISTPUBLISHEDSERVICES; }
    public java.lang.String getMD5(){ return "f576e08a45614367dfa84391e12eb377"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
