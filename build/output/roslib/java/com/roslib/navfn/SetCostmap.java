package com.roslib.navfn;

import java.lang.*;

public class SetCostmap {

public static final java.lang.String SETCOSTMAP = "navfn/SetCostmap";

public class SetCostmapRequest implements com.roslib.ros.Msg {
    private long __id__;
    public int[] costs;
    public int height;
    public int width;

    public SetCostmapRequest() {
        this.costs = null;
        this.height = 0;
        this.width = 0;
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_costs = this.costs != null ? this.costs.length : 0;
        outbuffer[offset + 0] = (byte)((length_costs >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_costs >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_costs >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_costs >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_costs; i++){
        outbuffer[offset + 0] = (byte)((this.costs[i] >> (8 * 0)) & 0xFF);
        offset += 1;
        }
        outbuffer[offset + 0] = (byte)((this.height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.height >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.width >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        int length_costs = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_costs |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_costs |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_costs |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_costs > 0) {
            this.costs = new int[length_costs];
        }
        for (int i = 0; i < length_costs; i++){
        this.costs[i]   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        }
        this.height   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.height |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.width   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.width |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_costs = this.costs != null ? this.costs.length : 0;
        for (int i = 0; i < length_costs; i++) {
        length += 1;
        }
        length += 2;
        length += 2;
        return length;
    }

    public java.lang.String getType() { return SETCOSTMAP; }
    public java.lang.String getMD5(){ return "39ff3735e4e7fa4c9273275c91eb2a1b"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

public class SetCostmapResponse implements com.roslib.ros.Msg {
    private long __id__;

    public SetCostmapResponse() {
        this.__id__ = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType() { return SETCOSTMAP; }
    public java.lang.String getMD5(){ return "d786def3c771d99baaa04d66a86e5eeb"; }
    public long getID() { return this.__id__; }
    public void setID(long id) { this.__id__ = id; }
}

}
