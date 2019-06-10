package cn.fenqing168.factory.factory.method;

/**
 * @author fenqing
 */
public class SmsFcatory implements Provider {
    @Override
    public Transmitter provider() {
        return new SmsTransmitter();
    }
}
