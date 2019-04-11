package com.roslib.shape_msgs;

import java.lang.*;

public class SolidPrimitive implements com.roslib.ros.Msg {
    public int type;
    public double[] dimensions;
    public static final int BOX = (int)(1);
    public static final int SPHERE = (int)(2);
    public static final int CYLINDER = (int)(3);
    public static final int CONE = (int)(4);
    public static final int BOX_X = (int)(0);
    public static final int BOX_Y = (int)(1);
    public static final int BOX_Z = (int)(2);
    public static final int SPHERE_RADIUS = (int)(0);
    public static final int CYLINDER_HEIGHT = (int)(0);
    public static final int CYLINDER_RADIUS = (int)(1);
    public static final int CONE_HEIGHT = (int)(0);
    public static final int CONE_RADIUS = (int)(1);

    public SolidPrimitive() {
        this.type = 0;
        this.dimensions = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.type >> (8 * 0)) & 0xFF);
        offset += 1;
        int length_dimensions = this.dimensions != null ? this.dimensions.length : 0;
        outbuffer[offset + 0] = (byte)((length_dimensions >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_dimensions >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_dimensions >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_dimensions >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_dimensions; i++){
        long bits_dimensionsi = Double.doubleToRawLongBits(this.dimensions[i]);
        outbuffer[offset + 0] = (byte)((bits_dimensionsi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_dimensionsi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_dimensionsi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_dimensionsi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_dimensionsi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_dimensionsi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_dimensionsi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_dimensionsi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.type   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int length_dimensions = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_dimensions |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_dimensions |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_dimensions |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_dimensions > 0) {
            this.dimensions = new double[length_dimensions];
        }
        for (int i = 0; i < length_dimensions; i++){
        long bits_dimensionsi = 0;
        bits_dimensionsi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_dimensionsi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_dimensionsi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_dimensionsi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_dimensionsi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_dimensionsi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_dimensionsi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_dimensionsi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.dimensions[i] = Double.longBitsToDouble(bits_dimensionsi);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        int length_dimensions = this.dimensions != null ? this.dimensions.length : 0;
        for (int i = 0; i < length_dimensions; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "shape_msgs/SolidPrimitive"; }
    public java.lang.String getMD5(){ return "f40805922065416be24909fd8fd751b5"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
