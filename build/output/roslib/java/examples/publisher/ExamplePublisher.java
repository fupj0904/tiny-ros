package examples.publisher;

import com.roslib.ros.NodeHandle;
import com.roslib.ros.Publisher;
import com.roslib.tinyros_hello.TinyrosHello;

public class ExamplePublisher {

    public static void main(String[] args) throws InterruptedException {
        NodeHandle nh = new NodeHandle();

        while (!nh.initNode("127.0.0.1")) {
            System.out.println("Java: initNode failed.");
            Thread.sleep(500);
        }

        TinyrosHello msg = new TinyrosHello();
        Publisher<TinyrosHello> pub = new Publisher<>("tinyros_hello", msg);

        nh.advertise(pub);

        while(nh.ok()) {
            if (pub.negotiated()) {
                msg.hello = "Hello, tiny-ros ^_^";
                pub.publish(msg);
            }
            
            nh.spinOnce();
            Thread.sleep(500);
        }
    }
}
