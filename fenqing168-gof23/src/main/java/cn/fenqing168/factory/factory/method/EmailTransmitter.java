package cn.fenqing168.factory.factory.method;


/**
 * 邮箱发送
 * @author fenqing
 */
public class EmailTransmitter implements Transmitter{
    @Override
    public void send(String message) {
        System.out.println("发送邮箱信息：" + message);
    }
}
