package cn.fenqing168.factory.simple.many.staticmethod.simple;

import cn.fenqing168.factory.simple.general.EmailTransmitter;
import cn.fenqing168.factory.simple.general.Transmitter;

/**
 * @author fenqing
 */
public class TransmitterFactory {

    public static final String TYPE_EMAIL = "email", TYPE_SMS = "sms";

    public static Transmitter getEmail() {
        return new EmailTransmitter();
    }

    public static Transmitter getSms() {
        return new SmsTransmitter();
    }

}
