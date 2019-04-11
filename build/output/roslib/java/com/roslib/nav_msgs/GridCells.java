package com.roslib.nav_msgs;

import java.lang.*;

public class GridCells implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public float cell_width;
    public float cell_height;
    public com.roslib.geometry_msgs.Point[] cells;

    public GridCells() {
        this.header = new com.roslib.std_msgs.Header();
        this.cell_width = 0;
        this.cell_height = 0;
        this.cells = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int bits_cell_width = Float.floatToRawIntBits(cell_width);
        outbuffer[offset + 0] = (byte)((bits_cell_width >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_cell_width >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_cell_width >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_cell_width >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_cell_height = Float.floatToRawIntBits(cell_height);
        outbuffer[offset + 0] = (byte)((bits_cell_height >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_cell_height >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_cell_height >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_cell_height >> (8 * 3)) & 0xFF);
        offset += 4;
        int length_cells = this.cells != null ? this.cells.length : 0;
        outbuffer[offset + 0] = (byte)((length_cells >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_cells >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_cells >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_cells >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_cells; i++){
        offset = this.cells[i].serialize(outbuffer, offset);
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int bits_cell_width = 0;
        bits_cell_width |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_cell_width |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_cell_width |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_cell_width |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.cell_width = Float.intBitsToFloat(bits_cell_width);
        offset += 4;
        int bits_cell_height = 0;
        bits_cell_height |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_cell_height |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_cell_height |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_cell_height |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.cell_height = Float.intBitsToFloat(bits_cell_height);
        offset += 4;
        int length_cells = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_cells |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_cells |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_cells |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_cells > 0) {
            this.cells = new com.roslib.geometry_msgs.Point[length_cells];
        }
        for (int i = 0; i < length_cells; i++){
        offset = this.cells[i].deserialize(inbuffer, offset);
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        length += 4;
        length += 4;
        int length_cells = this.cells != null ? this.cells.length : 0;
        for (int i = 0; i < length_cells; i++) {
        length += this.cells[i].serializedLength();
        }
        return length;
    }

    public java.lang.String getType(){ return "nav_msgs/GridCells"; }
    public java.lang.String getMD5(){ return "13ce9063aaf922c39d3a2207d3926427"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
