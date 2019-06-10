package cn.fenqing168.factory.simple.general;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        TransmitterFactory transmitterFactory = new TransmitterFactory();
        transmitterFactory.getTransmitter(TransmitterFactory.TYPE_EMAIL).send("你好");
    }

}
