/*
 * File      : Msg.java
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-11-27     Pinkie.Fu    initial version
 */
package com.roslib.ros;

import  java.lang.*;

/* Base Message Type */
public interface Msg {
    public int serialize(byte[] outbuffer, int start);
    public int deserialize(byte[] data, int start);
    public int serializedLength();
    public java.lang.String getType();
    public java.lang.String getMD5();
    public long getID();
    public void setID(long id);
}
