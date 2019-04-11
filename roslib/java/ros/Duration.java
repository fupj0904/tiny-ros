/*
 * File      : Duration.java
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-11-27     Pinkie.Fu    initial version
 */
package com.roslib.ros;

import  java.lang.*;

public class Duration {
    public long sec;
    public long nsec;

    public Duration() {
        this.sec = 0;
        this.nsec = 0;
    }

    public Duration(long secs, long nsecs) {
        this.sec = secs;
        this.nsec = nsecs;
        normalize();
    }

    public double toSec() {
        return (double)sec + 1e-9 * (double)nsec;
    }

    void fromSec(double t) {
        sec = (int) Math.floor(t);
        nsec = (int) Math.round((t - sec) * 1e9);
    }

    public Duration add(Duration d) {
        return new Duration(sec + d.sec, nsec + d.nsec);
    }

    public Duration subtract(Duration d) {
        return new Duration(sec - d.sec, nsec - d.nsec);
    }

    public void normalize() {
        while (nsec < 0) {
            nsec += 1000000000;
            sec -= 1;
        }
        while (nsec >= 1000000000) {
            nsec -= 1000000000;
            sec += 1;
        }
    }
}
