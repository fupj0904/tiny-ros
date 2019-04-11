package com.roslib.ros;

import com.roslib.tinyros_msgs.TopicInfo;
import com.roslib.tinyros_msgs.Log;

public class NodeHandle {
    private static final int MAX_SUBSCRIBERS = 100;
    private static final int MAX_PUBLISHERS = 100;
    private static final int INPUT_SIZE = 65*1024;
    private static final int OUTPUT_SIZE = 65*1024;

    private static final int SPIN_OK = 0;
    private static final int SPIN_ERR = -1;
    private static final int SPIN_TIMEOUT = -2;

    private static final int MODE_FIRST_FF = 0;

    private static final int MODE_PROTOCOL_VER   = 1;
    private static final int PROTOCOL_VER        = 0xb9;
    private static final int MODE_SIZE_L         = 2;
    private static final int MODE_SIZE_L1        = 3;
    private static final int MODE_SIZE_H         = 4;
    private static final int MODE_SIZE_H1        = 5;
    private static final int MODE_SIZE_CHECKSUM  = 6;    // checksum for msg size received from size L and H
    private static final int MODE_TOPIC_L        = 7;    // waiting for topic id
    private static final int MODE_TOPIC_H        = 8;
    private static final int MODE_MESSAGE        = 9;
    private static final int MODE_MSG_CHECKSUM   = 10;    // checksum for msg and topic id
    
    private static final int TIMEOUT_MSG   = 50;    // 50 milliseconds to recieve all of message data
    private static final int TIMEOUT_SPIN  = 1000;  // 1000 milliseconds to spin timeout

    private Hardware hardware_;

    /* time used for syncing */
    private long rt_time;

    /* used for computing current time */
    private long sec_offset;
    private long nsec_offset;

    /* Spinonce maximum work timeout */
    private long spin_timeout_;


    //State machine variables for spinOnce
    private int mode_;
    private int bytes_;
    private int topic_;
    private int index_;
    private int checksum_;

    /* used for syncing the time */
    private long last_sync_receive_time;
    private long last_msg_timeout_time;


    private boolean topic_list_recieved;
    private java.lang.String topic_list;

    private boolean service_list_recieved;
    private java.lang.String service_list;


    private byte[] message_in = new byte[INPUT_SIZE];
    private byte[] message_out = new byte[OUTPUT_SIZE];


    private Publisher[] publishers = new Publisher[MAX_PUBLISHERS];
    private SubscriberT[] subscribers = new SubscriberT[MAX_SUBSCRIBERS];

    public NodeHandle() {
        for (int i = 0; i < MAX_PUBLISHERS; i++) {
            publishers[i] = null;
        }

        for (int i = 0; i < MAX_SUBSCRIBERS; i++) {
            subscribers[i] = null;
        }

        for (int i = 0; i < INPUT_SIZE; i++) {
            message_in[i] = 0;
        }

        for (int i = 0; i < OUTPUT_SIZE; i++) {
            message_out[i] = 0;
        }

        spin_timeout_ = TIMEOUT_SPIN;
        
        last_sync_receive_time = 0;

        service_list = topic_list = "";

        hardware_ = new Hardware();
    }

    public Hardware getHardware() {
        return hardware_;
    }

    /* Start a named port, which may be network server IP, initialize buffers */
    public boolean initNode(java.lang.String portName) {
        mode_ = 0;
        bytes_ = 0;
        index_ = 0;
        topic_ = 0;
        return hardware_.init(portName);
    }


    /**
     * @brief Sets the maximum time in millisconds that spinOnce() can work.
     * This will not effect the processing of the buffer, as spinOnce processes
     * one byte at a time. It simply sets the maximum time that one call can
     * process for. You can choose to clear the buffer if that is beneficial if
     * SPIN_TIMEOUT is returned from spinOnce().
     * @param timeout The timeout in milliseconds that spinOnce will function.
     */
    public void setSpinTimeout(long timeout) {
        spin_timeout_ = timeout;
    }

    /* This function goes in your loop() function, it handles
     *  serial input and callbacks for subscribers.
     */
    public int spinOnce() {
        if (!hardware_.connected()) {
            return SPIN_ERR;
        }

        /* restart if timed out */
        long c_time = hardware_.time();

        /* reset if message has timed out */
        if (mode_ != MODE_FIRST_FF) {
            if (c_time > last_msg_timeout_time) {
                mode_ = MODE_FIRST_FF;
            }
        }

        /* while available buffer, read data */
        while (true) {
            // If a timeout has been specified, check how long spinOnce has been running.
            if (spin_timeout_ > 0) {
                // If the maximum processing timeout has been exceeded, exit with error.
                // The next spinOnce can continue where it left off, or optionally
                // based on the application in use, the hardware buffer could be flushed
                // and start fresh.
                if ((hardware_.time() - c_time) > spin_timeout_) {
                    // Exit the spin, processing timeout exceeded.
                    return SPIN_TIMEOUT;
                }
            }

            int data = hardware_.read();
            
            if (data < 0) {
                break;
            }

            checksum_ += data;
            
            if (mode_ == MODE_MESSAGE) { /* message data being recieved */
                message_in[index_++] = (byte)(data & 0xFF);
                bytes_--;
                if (bytes_ == 0) { /* is message complete? if so, checksum */
                    mode_ = MODE_MSG_CHECKSUM;
                }
            } else if (mode_ == MODE_FIRST_FF) {
                if (data == 0xff) {
                    mode_++;
                    last_msg_timeout_time = c_time + TIMEOUT_MSG;
                }
            } else if (mode_ == MODE_PROTOCOL_VER) {
                if (data == PROTOCOL_VER) {
                    mode_++;
                } else {
                    mode_ = MODE_FIRST_FF;
                }
            } else if (mode_ == MODE_SIZE_L) { /* bottom half of message size */
                bytes_ = data;
                index_ = 0;
                mode_++;
                checksum_ = data;
            } else if (mode_ == MODE_SIZE_L1) {
                bytes_ += data << 8;
                mode_++;
            } else if (mode_ == MODE_SIZE_H) {     /* top half of message size */
                bytes_ += data << 16;
                mode_++;
            } else if (mode_ == MODE_SIZE_H1) {
                bytes_ += data << 24;
                mode_++;
            } else if (mode_ == MODE_SIZE_CHECKSUM) {
                if ((checksum_ % 256) == 255) {
                    mode_++;
                } else {
                    mode_ = MODE_FIRST_FF; /* Abandon the frame if the msg len is wrong */
                }
            } else if (mode_ == MODE_TOPIC_L) {  /* bottom half of topic id */
                topic_ = data;
                mode_++;
                checksum_ = data;               /* first byte included in checksum */
            } else if (mode_ == MODE_TOPIC_H) {/* top half of topic id */
                topic_ += data << 8;
                mode_ = MODE_MESSAGE;
                if (bytes_ == 0) {
                    mode_ = MODE_MSG_CHECKSUM;
                }
            } else if (mode_ == MODE_MSG_CHECKSUM) {   /* do checksum */
                mode_ = MODE_FIRST_FF;
                if ((checksum_ % 256) == 255)
                {
                    if (topic_ == TopicInfo.ID_PUBLISHER) {
                        requestSyncTime();
                        negotiateTopics();
                    } else if (topic_ == TopicInfo.ID_ROSTOPIC_REQUEST) {
                        com.roslib.std_msgs.String msg = new com.roslib.std_msgs.String();
                        msg.deserialize(message_in, 0);
                        topic_list = msg.data;
                        topic_list_recieved = true;
                    } else if (topic_ == TopicInfo.ID_ROSSERVICE_REQUEST) {
                        com.roslib.std_msgs.String msg = new com.roslib.std_msgs.String();
                        msg.deserialize(message_in, 0);
                        service_list = msg.data;
                        service_list_recieved = true;
                    } else if (topic_ == TopicInfo.ID_TIME) {
                        syncTime(message_in);
                    } else if (topic_ == TopicInfo.ID_NEGOTIATED) {
                        TopicInfo ti = new TopicInfo();
                        ti.deserialize(message_in, 0);
                        for (int i = 0; i < MAX_PUBLISHERS; i++) {
                            if (publishers[i] != null && publishers[i].id_ == ti.topic_id) {
                                publishers[i].negotiated_ = ti.negotiated;
                            }
                        }
                        for (int i = 0; i < MAX_SUBSCRIBERS; i++) {
                            if (subscribers[i] != null && subscribers[i].id_ == ti.topic_id) {
                                subscribers[i].negotiated_ = ti.negotiated;
                            }
                        }
                    } else {
                        if (subscribers[topic_ - 100] != null) {
                            subscribers[topic_ - 100].callback(message_in);
                        }
                    }
                }
            }
        }

        return SPIN_OK;
    }


    /* Are we connected to the PC? */
    public boolean ok() {
        return hardware_.connected();
    }


    /********************************************************************
     * Time functions
     */
    public void requestSyncTime() {
        com.roslib.std_msgs.Time t = new com.roslib.std_msgs.Time();
        publish(TopicInfo.ID_TIME, t);
        rt_time = hardware_.time();
    }

    public void syncTime(byte[] data) {
        com.roslib.std_msgs.Time t = new com.roslib.std_msgs.Time();
        long offset = hardware_.time() - rt_time;

        t.deserialize(data, 0);
        t.data.sec += offset / 1000;
        t.data.nsec += (offset % 1000) * 1000000;

        this.setNow(t.data);
        last_sync_receive_time = hardware_.time();
    }

    public com.roslib.ros.Time now() {
        long ms = hardware_.time();
        com.roslib.ros.Time current_time = new com.roslib.ros.Time();
        current_time.sec = ms / 1000 + sec_offset;
        current_time.nsec = (ms % 1000) * 1000000 + nsec_offset;
        com.roslib.ros.Time.normalizeSecNSec(current_time);
        return current_time;
    }

    public void setNow(com.roslib.ros.Time new_now) {
        long ms = hardware_.time();
        sec_offset = new_now.sec - ms / 1000 - 1;
        nsec_offset = new_now.nsec - (ms % 1000) * 1000000 + 1000000000;

        com.roslib.ros.Time time = com.roslib.ros.Time.normalizeSecNSec(sec_offset, nsec_offset);
        sec_offset = time.sec;
        nsec_offset = time.nsec;
    }

    /********************************************************************
     * Topic Management
     */

    /* Register a new publisher */
    public boolean advertise(Publisher p) {
        for (int i = 0; i < MAX_PUBLISHERS; i++) {
            if (publishers[i] == null) { // empty slot
                publishers[i] = p;
                p.id_ = i + 100 + MAX_SUBSCRIBERS;
                p.nh_ = this;
                return true;
            }
        }
        return false;
    }

    /* Register a new subscriber */
    public boolean subscribe(SubscriberT s) {
        for (int i = 0; i < MAX_SUBSCRIBERS; i++) {
            if (subscribers[i] == null) { // empty slot
                subscribers[i] = s;
                s.id_ = i + 100;
                return true;
            }
        }
        return false;
    }

    /* Register a new Service Server */
    public boolean advertiseService(ServiceServer srv) {
        for (int i = 0; i < MAX_SUBSCRIBERS; i++) {
            if (subscribers[i] == null) { // empty slot
                subscribers[i] = srv;
                srv.id_ = i + 100;
                for (int j = 0; j < MAX_PUBLISHERS; j++) {
                    if (publishers[j] == null) { // empty slot
                        publishers[j] = srv.pub;
                        srv.pub.id_ = srv.id_;
                        srv.pub.nh_ = this;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* Register a new Service Client */
    public boolean serviceClient(ServiceClient srv) {
        for (int i = 0; i < MAX_SUBSCRIBERS; i++) {
            if (subscribers[i] == null) {// empty slot
                subscribers[i] = srv;
                srv.id_ = i + 100;
                for (int j = 0; j < MAX_PUBLISHERS; j++) {
                    if (publishers[j] == null) { // empty slot
                        publishers[j] = srv.pub;
                        srv.pub.id_ = srv.id_;
                        srv.pub.nh_ = this;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void negotiateTopics()  {
        int i;
        TopicInfo ti = new TopicInfo();
        for (i = 0; i < MAX_PUBLISHERS; i++) {
            if (publishers[i] != null) { // non-empty slot
                ti.topic_id = publishers[i].id_;
                ti.topic_name = publishers[i].topic_;
                ti.message_type = publishers[i].msg_.getType();
                ti.md5sum = publishers[i].msg_.getMD5();
                ti.buffer_size = OUTPUT_SIZE;
                publish(publishers[i].getEndpointType(), ti);
            }
        }

        for (i = 0; i < MAX_SUBSCRIBERS; i++) {
            if (subscribers[i] != null) { // non-empty slot
                ti.topic_id = subscribers[i].id_;
                ti.topic_name = subscribers[i].topic_;
                ti.message_type = subscribers[i].getMsgType();
                ti.md5sum = subscribers[i].getMsgMD5();
                ti.buffer_size = INPUT_SIZE;
                publish(subscribers[i].getEndpointType(), ti);
            }
        }
    }


    public int publish(int id, com.roslib.ros.Msg msg) {
        /* serialize message */
        int l = msg.serialize(message_out, 9);

        /* setup the header */
        message_out[0] = (byte) 0xff;
        message_out[1] = (byte)(PROTOCOL_VER & 0xFF);
        message_out[2] = (byte)((l >> 0 ) & 0xFF);
        message_out[3] = (byte)((l >> 8 ) & 0xFF);
        message_out[4] = (byte)((l >> 16) & 0xFF);
        message_out[5] = (byte)((l >> 24) & 0xFF);
        message_out[6] = (byte)((255 - ((message_out[2] + message_out[3] + message_out[4] + message_out[5]) % 256)) & 0xFF);
        message_out[7] = (byte)(id & 0xFF);
        message_out[8] = (byte)((id >> 8) & 0xFF);

        /* calculate checksum */
        int chk = 0;
        for (int i = 7; i < l + 9; i++) {
            chk += message_out[i];
        }

        l += 9;

        message_out[l++] = (byte)((255 - (chk % 256)) & 0xFF);

        if (l <= OUTPUT_SIZE) {
            if (hardware_.write(message_out, l)) {
                return l;
            } else {
                logerror("Message send failed.");
                return -1;
            }
        } else {
            logerror("Message from device dropped: message larger than buffer.");
            return -1;
        }
    }

    public void logdebug(java.lang.String msg) { log(Log.ROSDEBUG, msg); }
    public void loginfo(java.lang.String msg) { log(Log.ROSINFO, msg); }
    public void logwarn(java.lang.String msg) { log(Log.ROSWARN, msg); }
    public void logerror(java.lang.String msg) { log(Log.ROSERROR, msg); }
    public void logfatal(java.lang.String msg) { log(Log.ROSFATAL, msg);}


    public java.lang.String getTopicList(int timeout) {
        com.roslib.std_msgs.String msg = new com.roslib.std_msgs.String();
        publish(TopicInfo.ID_ROSTOPIC_REQUEST, msg);
        long end_time = hardware_.time() + timeout;
        topic_list_recieved = false;
        while (!topic_list_recieved) {
            spinOnce();
            if (hardware_.time() > end_time) {
                return "Failed to get getTopicList: timeout expired";
            }
        }
        return topic_list;
    }

    public java.lang.String getServiceList(int timeout) {
        com.roslib.std_msgs.String msg = new com.roslib.std_msgs.String();
        publish(TopicInfo.ID_ROSSERVICE_REQUEST, msg);
        long end_time = hardware_.time() + timeout;
        service_list_recieved = false;
        while (!service_list_recieved)  {
            spinOnce();
            if (hardware_.time() > end_time) {
                return "Failed to get getServiceList: timeout expired";
            }
        }
        return service_list;
    }

    public void close() {
        this.hardware_.close();
    }

    private void log(int level, java.lang.String msg) {
        if (hardware_.connected()) {
            Log l = new Log();
            l.level = level;
            l.msg = msg;
            publish(TopicInfo.ID_LOG, l);
        }
    }
}
