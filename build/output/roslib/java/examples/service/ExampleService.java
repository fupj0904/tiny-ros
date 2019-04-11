package examples.service;

import com.roslib.ros.CallbackSrvT;
import com.roslib.ros.Msg;
import com.roslib.ros.NodeHandle;
import com.roslib.ros.ServiceServer;
import com.roslib.tinyros_hello.Test;

public class ExampleService {

    public static void main(String[] args) throws InterruptedException {
        NodeHandle nh = new NodeHandle();
        while (!nh.initNode("127.0.0.1")) {
            System.out.println("Java: initNode failed.");
            Thread.sleep(500);
        }

        nh.advertiseService(new ServiceServer<Test.TestRequest, Test.TestResponse>("test_srv", new CallbackSrvT() {
            @Override
            public void callback(Msg req, Msg res) {
                ((Test.TestResponse)res).output = "Hello, tiny-ros ^_^";
            }
        }, new Test().new TestRequest(), new Test().new TestResponse()));

        while(nh.ok()) {
            nh.spinOnce();
            Thread.sleep(500);
        }

    }

}
