package cn.fenqing168.factory.factory.method;

/**
 * @author fenqing
 */
public class EmailFactory implements Provider {
    @Override
    public Transmitter provider() {
        return new EmailTransmitter();
    }
}
