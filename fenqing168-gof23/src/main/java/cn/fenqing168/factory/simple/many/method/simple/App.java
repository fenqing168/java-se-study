package cn.fenqing168.factory.simple.many.method.simple;


/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        TransmitterFactory transmitterFactory = new TransmitterFactory();
        transmitterFactory.getEmail().send("你好");
        transmitterFactory.getSms().send("你好");
    }

}
