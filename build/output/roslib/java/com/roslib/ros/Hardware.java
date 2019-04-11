package com.roslib.ros;

import java.net.Socket;

public class Hardware {
    private final int DEFAULT_PORTNUM = 11411;
    private java.net.Socket client_;
    private java.lang.String port_name_;
    private java.io.OutputStream os_;
    private java.io.InputStream is_;
    private boolean connected_;

    public Hardware() {
        this.port_name_ = "";
        this.client_ = null;
        this.os_ = null;
        this.is_ = null;
        this.connected_ = false;
    }

    public boolean init(java.lang.String portName) {
        try {
            this.port_name_ = portName;
            this.client_ = new Socket(portName, DEFAULT_PORTNUM);
            this.os_ = this.client_.getOutputStream();
            this.is_ = this.client_.getInputStream();
            this.connected_ = true;
        }catch(java.lang.Exception e){
            e.printStackTrace();
            this.close();
        }
        return this.connected_;
    }

    public int read() {
        int data = -1;
        if (this.connected_) {
            try {
                if (this.is_.available() > 0) {
                    data = this.is_.read();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                this.close();
            }
        }
        return data;
    }

    public boolean write(byte[] data, int length) {
        if (this.connected_) {
            try {
                this.os_.write(data, 0, length);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                this.close();
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public long time () {
        return java.lang.System.currentTimeMillis();
    }

    public boolean connected()  {
        return this.connected_;
    }

    public void close()  {
        try {
            this.connected_ = false;
            this.port_name_ = "";
            if (this.os_ != null) {
                this.os_.close();
                this.os_ = null;
            }
            if (this.is_ != null) {
                this.is_.close();
                this.is_ = null;
            }
            if (this.client_ != null) {
                this.client_.close();
                this.client_ = null;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
