package com.roslib.yocs_msgs;

import java.lang.*;

public class TableList implements com.roslib.ros.Msg {
    public com.roslib.yocs_msgs.Table[] tables;

    public TableList() {
        this.tables = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_tables = this.tables != null ? this.tables.length : 0;
        outbuffer[offset + 0] = (byte)((length_tables >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_tables >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_tables >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_tables >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_tables; i++){
        offset = this.tables[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_tables = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_tables |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_tables |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_tables |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_tables > 0) {
            this.tables = new com.roslib.yocs_msgs.Table[length_tables];
        }
        for (int i = 0; i < length_tables; i++){
        offset = this.tables[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_tables = this.tables != null ? this.tables.length : 0;
        for (int i = 0; i < length_tables; i++) {
        length += this.tables[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "yocs_msgs/TableList"; }
    public java.lang.String getMD5(){ return "976a67cb0c98f7e905d758d5c83f3da5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
