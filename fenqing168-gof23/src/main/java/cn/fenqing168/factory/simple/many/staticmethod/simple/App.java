package cn.fenqing168.factory.simple.many.staticmethod.simple;



/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        TransmitterFactory.getEmail().send("你好");
        TransmitterFactory.getSms().send("你好");
    }

}
