package com.roslib.ros;

import com.roslib.tinyros_msgs.TopicInfo;

public class ServiceServer<MReq extends Msg, MRes extends Msg> extends SubscriberT {
    public MReq req;
    public MRes resp;
    public Publisher pub;

    private CallbackSrvT cb_;

    public ServiceServer(java.lang.String topic_name, CallbackSrvT cb, MReq req, MRes resp) {
        this.topic_ = topic_name;
        this.cb_ = cb;
        this.req = req;
        this.resp = resp;
        this.pub = new Publisher(this.topic_, resp);
        this.pub.endpoint_ = TopicInfo.ID_SERVICE_SERVER + TopicInfo.ID_PUBLISHER;
    }

    // these refer to the subscriber
    public void callback(byte[] data) {
        this.req.deserialize(data, 0);
        this.cb_.callback(this.req, this.resp);
        this.resp.setID(this.req.getID());
        this.pub.publish(this.resp);
    }

    public java.lang.String getMsgType() {
        return this.req.getType();
    }

    public java.lang.String getMsgMD5() {
        return this.req.getMD5();
    }

    public int getEndpointType() {
        return TopicInfo.ID_SERVICE_SERVER + TopicInfo.ID_SUBSCRIBER;
    }

    public boolean negotiated() {
        return (this.negotiated_ && this.pub.negotiated_); 
    }
}
