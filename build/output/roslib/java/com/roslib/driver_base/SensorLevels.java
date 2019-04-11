package com.roslib.driver_base;

import java.lang.*;

public class SensorLevels implements com.roslib.ros.Msg {
    public static final byte RECONFIGURE_CLOSE = (byte)( 3  );
    public static final byte RECONFIGURE_STOP = (byte)( 1  );
    public static final byte RECONFIGURE_RUNNING = (byte)( 0 );

    public SensorLevels() {
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        return length;
    }

    public java.lang.String getType(){ return "driver_base/SensorLevels"; }
    public java.lang.String getMD5(){ return "62eed9ccc8f00903b6e0afff4b884c86"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
