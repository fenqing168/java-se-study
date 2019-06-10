package cn.fenqing168.factory.factory.method;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Provider provider = new EmailFactory();
        provider.provider().send("测试");
    }

}
