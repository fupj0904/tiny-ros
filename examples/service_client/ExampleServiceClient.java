package examples.service_client;

import com.roslib.ros.NodeHandle;
import com.roslib.ros.ServiceClient;
import com.roslib.tinyros_hello.Test;

public class ExampleServiceClient {

    public static void main(String[] args) throws InterruptedException {

        NodeHandle nh = new NodeHandle();

        while (!nh.initNode("127.0.0.1")) {
            System.out.println("initNode failed.");
            Thread.sleep(500);
        }

        ServiceClient<Test.TestRequest, Test.TestResponse> client = new ServiceClient<Test.TestRequest, Test.TestResponse>(
                "test_srv", new Test().new TestRequest(), new Test().new TestResponse());

        nh.serviceClient(client);

        while(nh.ok()) {
            nh.spinOnce();
            if (client.negotiated()) {
                Test.TestRequest req = new Test().new TestRequest();
                Test.TestResponse resp = new Test().new TestResponse();

                if (client.call(req, resp, 5)) {
                    System.out.println("service responsed with \"" + resp.output + "\"");
                } else {
                    System.out.println("Service call failed.");
                }
            }

            Thread.sleep(500);
        }

    }

}
