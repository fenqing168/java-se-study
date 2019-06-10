package cn.fenqing168.factory.simple.many.staticmethod.simple;

import cn.fenqing168.factory.simple.general.Transmitter;

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
