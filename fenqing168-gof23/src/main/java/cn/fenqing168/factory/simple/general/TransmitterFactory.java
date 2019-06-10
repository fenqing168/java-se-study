package cn.fenqing168.factory.simple.general;

/**
 * @author fenqing
 */
public class TransmitterFactory {

    public static final String TYPE_EMAIL = "email", TYPE_SMS = "sms";

    public Transmitter getTransmitter(String type) {
        if (TYPE_EMAIL.equals(type)) {
            return new EmailTransmitter();
        } else if (TYPE_SMS.equals(type)) {
            return new SmsTransmitter();
        } else {
            return null;
        }
    }

}
