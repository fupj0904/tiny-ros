package com.roslib.kobuki_msgs;

import java.lang.*;

public class KeyboardInput implements com.roslib.ros.Msg {
    public int pressedKey;
    public static final int KeyCode_Right = (int)( 67     );
    public static final int KeyCode_Left = (int)( 68     );
    public static final int KeyCode_Up = (int)( 65     );
    public static final int KeyCode_Down = (int)( 66     );
    public static final int KeyCode_Space = (int)( 32     );
    public static final int KeyCode_Enable = (int)( 101    );
    public static final int KeyCode_Disable = (int)( 100    );

    public KeyboardInput() {
        this.pressedKey = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset + 0] = (byte)((this.pressedKey >> (8 * 0)) & 0xFF);
        offset += 1;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.pressedKey   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        return length;
    }

    public java.lang.String getType(){ return "kobuki_msgs/KeyboardInput"; }
    public java.lang.String getMD5(){ return "e22c2cdd6ee5c1c81fc41b356dc26c93"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
