package examples.subscriber;

import com.roslib.ros.CallbackSubT;
import com.roslib.ros.Msg;
import com.roslib.ros.NodeHandle;
import com.roslib.ros.Subscriber;
import com.roslib.tinyros_hello.TinyrosHello;

public class ExampleSubscriber {

    public static void main(String[] args) throws InterruptedException {

        NodeHandle nh = new NodeHandle();

        while (!nh.initNode("127.0.0.1")) {
            System.out.println("initNode failed.");
            Thread.sleep(500);
        }

        nh.subscribe(new Subscriber<TinyrosHello>("tinyros_hello", new CallbackSubT() {
            @Override
            public void callback(Msg msg) {
                TinyrosHello m = (TinyrosHello)msg;
                System.out.println(m.hello);
            }
        }, new TinyrosHello()));

        while(nh.ok()) {
            nh.spinOnce();
            Thread.sleep(500);
        }
    }

}
