package cn.fenqing168.factory.simple.general;

/**
 * 短信
 * @author fenqing
 */
public class SmsTransmitter implements Transmitter{
    @Override
    public void send(String message) {
        System.out.println("短信发送信息：" + message);
    }
}
