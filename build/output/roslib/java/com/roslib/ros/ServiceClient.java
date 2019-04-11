package com.roslib.ros;

import com.roslib.tinyros_msgs.TopicInfo;

public class ServiceClient<MReq extends Msg, MRes extends Msg> extends SubscriberT {
    public MReq req;
    public MRes resp;
    public MRes ret;
    public boolean waiting;
    public Publisher pub;

    public ServiceClient(java.lang.String topic_name, MReq req, MRes resp) {
        this.resp = resp;
        this.req = req;
        this.topic_ = topic_name;
        this.pub = new Publisher(this.topic_, req);
        this.pub.endpoint_ = TopicInfo.ID_SERVICE_CLIENT + TopicInfo.ID_PUBLISHER;
        this.waiting = true;
    }

    public boolean call(MReq request, MRes response, int durationSec) {
        double time = Time.now().toSec();
        double duration = (double)(durationSec * 1.0);
        if (!this.pub.nh_.ok()) {
            return false;
        }
        this.ret = response;
        this.waiting = true;
        if (this.pub.publish(request) <= 0) {
            return false;
        }
        while (this.waiting) {
            double now = Time.now().toSec();
            if (!pub.nh_.ok() || ((now - time) > duration)) {
                return false;
            }
            pub.nh_.spinOnce();
        }
        return true;
    }

    // these refer to the subscriber
    public void callback(byte[] data) {
        this.ret.deserialize(data, 0);
        this.waiting = false;
    }

    public java.lang.String getMsgType() {
        return this.resp.getType();
    }

    public java.lang.String getMsgMD5() {
        return this.resp.getMD5();
    }
    public int getEndpointType() {
        return TopicInfo.ID_SERVICE_CLIENT + TopicInfo.ID_SUBSCRIBER;
    }

    public boolean negotiated() {
        return (this.negotiated_ && this.pub.negotiated_); 
    }
}
